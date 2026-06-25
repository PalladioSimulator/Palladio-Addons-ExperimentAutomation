# Agent context — Experiment Automation Docker Build

## Purpose

`releng/org.palladiosimulator.experimentautomation.product.docker/` builds a
standalone Eclipse RCP product of the Palladio Experiment Automation inside
a Linux amd64 Docker container. Two GitHub repos are built from source:

- **Palladio-Addon-ArchitecturalTemplates** – because the UI constants fix
  (PR #31) and Tycho bump (PR #33) are not yet deployed to the nightly p2
  updatesite.
- **Palladio-Addons-ExperimentAutomation** – the product module itself
  (PR #39, includes Tycho bump).

## Build architecture (3 stages)

```
┌─────────────────────────────────────────────────────┐
│ Stage 1: at-builder                                  │
│ eclipse-temurin:21-jdk-jammy                         │
│   Install Maven 3.9.9 + git                          │
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
│ Stage 3: artifact (scratch)                          │
│   COPY ExperimentAutomation-linux.gtk.x86_64.tar.gz  │
│   → /product/                                        │
└─────────────────────────────────────────────────────┘
```

## Key files

- `Dockerfile` – 3-stage multi-repo build
- `pom.xml` – Maven module (pom-packaging, not built by Tycho)
- `.dockerignore` – ignores everything (we use git clone)
- `AGENTS.md` – this file

## Build arguments

| Arg | Default | Description |
|---|---|---|
| `EA_BRANCH` | `product-module` | Branch of ExperimentAutomation to build |
| `MAVEN_VERSION` | `3.9.9` | Apache Maven version |

## Build & extract

```bash
# Build – requires linux/amd64 (native or via QEMU)
docker build \
  --platform linux/amd64 \
  --build-arg EA_BRANCH=product-module \
  --output type=local,dest=./target/docker-product \
  -f releng/org.palladiosimulator.experimentautomation.product.docker/Dockerfile \
  .

# Output
ls -lh target/docker-product/
# → ExperimentAutomation-linux.gtk.x86_64.tar.gz
```

On macOS (Apple Silicon), install QEMU binfmt support first:

```bash
docker run --privileged --rm tonistiigi/binfmt --install amd64
```

## Git branches referenced by the Docker build

| Repo | Remote ref | Purpose |
|---|---|---|
| Palladio-Addon-ArchitecturalTemplates | `origin/bump-tycho-to-4.0.13` | Tycho 2.7.5 → 4.0.13 |
| Palladio-Addon-ArchitecturalTemplates | `origin/fix/extract-ui-constants-to-separate-class` | UI constants fix (#31) |
| Palladio-Addons-ExperimentAutomation | `${EA_BRANCH}` (default `product-module`) | Product module + Tycho bump |

The two AT branches are merged inside the Dockerfile; no separate combined
branch is needed.

## Repositories referenced at build time

The Docker build has network access to:

- GitHub (git clone)
- Apache Maven (Maven download)
- Palladio nightly p2 repos (via Maven/Tycho – see target platform and
  product POM)
- Eclipse 2023-03 release repo (native launchers)

## Known issues

- **First build is slow**: Maven downloads all dependencies from scratch
  (no local cache). Expect 30+ minutes.
- **QEMU emulation on ARM**: building `--platform linux/amd64` on Apple
  Silicon requires QEMU binfmt and is ~2× slower than native.
- **No Maven cache volume**: each build starts from scratch. Add
  `--mount type=volume,src=maven-repo,dst=/root/.m2` for caching.
- **Network dependency**: build fails without internet access (p2 repos,
  GitHub, Maven Central).
- **AT merge must be conflict-free**: the two AT branches must not touch
  the same files. Currently they are disjoint.
