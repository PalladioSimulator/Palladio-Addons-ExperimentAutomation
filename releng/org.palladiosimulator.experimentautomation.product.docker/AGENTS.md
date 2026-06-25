# Agent context — Experiment Automation Docker Build

## Purpose

`releng/org.palladiosimulator.experimentautomation.product.docker/` builds a
standalone Eclipse RCP product of the Palladio Experiment Automation inside
a Linux amd64 Docker container. Two GitHub repos are built from source:

- **Palladio-Addon-ArchitecturalTemplates** – because the UI constants fix
  (PR #31) and Tycho bump (PR #33) are not yet deployed to the nightly p2
  updatesite.
- **Palladio-Addons-ExperimentAutomation** – the product module itself
  (PR #39, includes Tycho bump + three critical bugfixes).

## Build architecture (3 stages)

```
┌─────────────────────────────────────────────────────┐
│ Stage 1: at-builder                                  │
│ eclipse-temurin:21-jdk-jammy                         │
│   Install Maven 3.9.16 + git                         │
│   git clone Palladio-Addon-ArchitecturalTemplates    │
│   Merge: bump-tycho-to-4.0.13 ← fix/extract-ui-...  │
│   mvn clean package -DskipTests                      │
│   → /build/at-repo/ (p2 updatesite)                  │
└──────────────────────┬──────────────────────────────┘
                       │ COPY --from=at-builder
                       ▼
┌─────────────────────────────────────────────────────┐
│ Stage 2: ea-builder                                  │
│ eclipse-temurin:21-jdk-jammy                         │
│   AT updatesite from stage 1 at /build/at-repo/      │
│   git clone -b ${EA_BRANCH} ExperimentAutomation     │
│   Inject local AT repo into product/pom.xml          │
│   mvn clean package -DskipTests                      │
│   mvn clean verify -f ...product/pom.xml             │
│   → /build/ea/releng/...product/target/products/     │
└──────────────────────┬──────────────────────────────┘
                       ▼
┌─────────────────────────────────────────────────────┐
│ Stage 3: runtime                                     │
│ eclipse-temurin:21-jre-jammy                         │
│   Install GTK3 + Xvfb                                │
│   Extract product tarball                            │
│   Strip eclipse.product from config.ini              │
│   Copy docker-entrypoint.sh                          │
│   → docker-entrypoint.sh starts Xvfb → runs Eclipse  │
└─────────────────────────────────────────────────────┘
```

## Key files

- `Dockerfile` – 3-stage multi-repo build
- `docker-entrypoint.sh` – starts Xvfb (SWT/GTK headless), runs Eclipse,
   propagates exit code; uses `/data` as workspace, `EA_CONSOLE_LOG` env var
- `pom.xml` – Maven module (pom-packaging, not built by Tycho)
- `.dockerignore` – ignores everything except `docker-entrypoint.sh` and
  `Dockerfile`
- `README.md` – Build- und Run-Anleitung (deutsch)
- `AGENTS.md` – this file

## Build

```bash
docker build \
  --platform linux/amd64 \
  -t experiment-automation:latest \
  -f releng/org.palladiosimulator.experimentautomation.product.docker/Dockerfile \
  .
```

Build context must be the repository root (`.`), not the docker directory.

## Build arguments

| Arg | Default | Description |
|---|---|---|
| `EA_BRANCH` | `product-module` | Branch of ExperimentAutomation to build |
| `MAVEN_VERSION` | `3.9.16` | Apache Maven version |
| `CACHEBUST` | `1` | Bump to force fresh git clone |

## Git branches referenced by the Docker build

| Repo | Remote ref | Purpose |
|---|---|---|
| Palladio-Addon-ArchitecturalTemplates | `origin/bump-tycho-to-4.0.13` | Tycho 2.7.5 → 4.0.13 |
| Palladio-Addon-ArchitecturalTemplates | `origin/fix/extract-ui-constants-to-separate-class` | UI constants fix (#31) |
| Palladio-Addons-ExperimentAutomation | `${EA_BRANCH}` (default `product-module`) | Product module + Tycho bump + bugfixes |

The two AT branches are merged inside the Dockerfile; no separate combined
branch is needed.

## Critical bugfixes on `product-module` branch

1. **`caseSetValueProvider` missing** – `ComputeVariantsAndAddExperimentJob` had
   no handler for `SetValueProvider` (used by the espresso example). `doSwitch`
   returned null → no variants created → simulation never ran (exit code 0 but
   no work done). Fixed by adding `caseSetValueProvider` with direct parsing.

2. **Stale datasource ID** – `EDP2DatasourceFactory.createOrOpenDatasource()`
   checked `datasource.getId() != null` and looked up the UUID via
   `RepositoryManager.getRepositoryFromUUID()`. When the experiment file
   contained a stale UUID from a previous session (or an empty-string ID),
   the lookup returned null → `createOrOpenDatasource` returned null → NPE at
   `getPersistenceRecorder()`. Fixed by falling through to create a fresh
   repository when the UUID lookup fails.

3. **Long vs Double for ClosedWorkloadVariation** – `SetValueProvider` values
   like `"1,3,4,5"` were always parsed as `Double` by
   `SetValueProviderStrategy`. `ClosedWorkloadVariation.vary()` expects `Long`,
   causing `ClassCastException`. Fixed: `caseSetValueProvider` detects
   integer-only values with `isAllIntegers()` and creates
   `VariationFactorTuple<Long>` when appropriate.

## Known issues

- **First build is slow**: Maven downloads all dependencies from scratch
  (no local cache). Expect ~8 minutes for AT + ~6 minutes for EA.
- **QEMU emulation on ARM**: building `--platform linux/amd64` on Apple
  Silicon requires QEMU binfmt and is ~2× slower than native.
- **No Maven cache volume**: each build starts from scratch. Add
  `--mount type=volume,src=maven-repo,dst=/root/.m2` for caching.
- **Network dependency**: build fails without internet access (p2 repos,
  GitHub, Maven Central).
- **AT merge must be conflict-free**: the two AT branches must not touch
  the same files. Currently they are disjoint.
- **log4j**: no appenders configured – log output goes to
  `/data/.metadata/.log` only.

## Status (2026-06-25)

- **Build verified**: Docker build on macOS (Apple Silicon, QEMU emulated
  linux/amd64) completed successfully.
- **Runtime verified**: headless experiment runs with exit code 0, all 4
  SetValueProvider variants executed.
- **Output**: `ExperimentAutomation-linux.gtk.x86_64.tar.gz` (~168 MB)
- **Contents verified**: SSJ engine bundled.
- **Configuration**: Workspace unter `/data` (bind-mount), Console-Log via
  `EA_CONSOLE_LOG=true`.
- **espresso example**: `SimpleVariation.experiments` runs to completion.

## Usage

```bash
docker run --rm --platform linux/amd64 \
  -v /host/path/to/experiments:/experiments:ro \
  -v /host/path/to/data:/data \
  experiment-automation:latest \
  /experiments/my-experiment.experiments
```

- `/data` – Eclipse-Workspace (Logs, Ergebnisse); via `-v` persistierbar
- `EA_CONSOLE_LOG=true` – aktiviert `-consoleLog` (Eclipse-Log auf stderr)

Exit code 0 means the simulation completed successfully. See
`/data/.metadata/.log` for details on errors.

## Runtime dependencies

- **Xvfb** (virtual framebuffer) — the product includes UI bundles (Xtext,
  Eclipse IDE) that cascade into SWT/GTK initialisation even in headless
  mode. Xvfb satisfies those dependencies.
- **libgtk-3-0** — required by SWT.
