# Agent context — Experiment Automation Product

## Purpose

`releng/org.palladiosimulator.experimentautomation.product/` builds a
standalone Eclipse RCP product of the Palladio Experiment Automation,
bundling the headless experiment application with all dependencies
(PCM, SimuLizar, SimuCom, SSJ simulation engine, EDP2, etc.) into
platform-specific archives with native launchers.

Not part of the regular reactor (`releng/pom.xml`).  Built manually via
`-f ...product/pom.xml`.

## Key files

- `product.product` – Eclipse product definition (`useFeatures="true"`,
  `includeLaunchers="true"`, application
  `org.palladiosimulator.experimentautomation.application`)
- `pom.xml` – `eclipse-repository` packaging, delegates to
  `tycho-p2-director-plugin` for materialize + archive

## Build order

1. `mvn clean package -DskipTests` (root) → produces updatesite at
   `releng/...updatesite/target/repository`
2. `mvn clean verify -f releng/...product/pom.xml` → materialises product

The product POM references these p2 repositories:

| Repo | ID | Purpose |
|---|---|---|
| Local updatesite | `local-updatesite` | `file://` to the built EA updatesite |
| Eclipse 2023-03 | `eclipse-2023-03` | Equinox executable feature (native launchers) |
| AbstractSimEngine (nightly) | `abstractsimengine` | SSJ + abstractsimengine features/plugins |
| Third-party wrapper (nightly) | `thirdparty-wrapper` | DESMO-J, Apache Commons Math, etc. |
| Third-party library (nightly) | `thirdparty-library` | `ca.umontreal.iro.simul.ssj` (SSJ math lib) |

## Product contents

Included features (in order):

- `org.palladiosimulator.pcm.feature` – PCM core (models, resources → pathmap)
- `org.palladiosimulator.thirdpartywrapper.feature` – DESMO-J, JFreeChart, etc.
- `ca.umontreal.iro.ssj.feature` – SSJ stochastic simulation library
- `de.uka.ipd.sdq.simulation.abstractsimengine.feature` – abstract simulation API
- `org.palladiosimulator.simulation.abstractsimengine.ssj.feature` – SSJ engine impl
- `org.palladiosimulator.experimentautomation.application.feature` – main app
- `...application.tooladapter.simulizar.feature` – SimuLizar adapter
- `...application.tooladapter.simucom.feature` – SimuCom adapter

All transitive dependencies (EMF, Equinox, workflow engine) are resolved
from the target platform.

## Status (2026-06-25)

- **Build**: verified – all 5 platform archives produced (~175 MB each)
- **SSJ engine**: included and resolved (no more NPE in engine init)
- **Headless run**: verified via macOS aarch64 product – exit code 0
- **Example**: `SimpleVariation.experiments` works (from espresso examples)

## Known issues

- **Henshin interpreter**: warning about missing
  `org.eclipse.emf.henshin.interpreter` (non-fatal, from SimuLizar
  reconfiguration).
- **log4j warnings**: missing appenders – harmless, does not affect execution.

## Related

- `releng/org.palladiosimulator.experimentautomation.updatesite/` –
  produces the p2 repository that this product consumes
- `releng/org.palladiosimulator.experimentautomation.targetplatform/` –
  Eclipse target definition resolving upstream Palladio repos
