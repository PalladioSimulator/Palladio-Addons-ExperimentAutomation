# Palladio Experiment Automation — Standalone Product

This module builds a standalone Eclipse RCP product of the Palladio Experiment
Automation.  The product bundles the experiment application plus all transitive
dependencies (PCM, SimuLizar, SimuCom, SSJ simulation engine, etc.) into a
self-contained directory with native launchers for all supported platforms.

## Requirements

- JDK 17+ (tested with JDK 21)
- Maven 3.8+
- Network access to the Palladio nightly p2 repositories (see `pom.xml`)

## Build

### 1. Build the main project (bundles, features, updatesite)

The product depends on the local updatesite.  Build it first:

```bash
mvn clean package -DskipTests
```

### 2. Build the product

```bash
mvn clean verify -f releng/org.palladiosimulator.experimentautomation.product/pom.xml
```

The product is materialised and archived for every platform in:

```
releng/org.palladiosimulator.experimentautomation.product/target/products/
```

Output per platform (~175 MB each):

| Platform | Archive |
|---|---|
| macOS x86\_64 | `ExperimentAutomation-macosx.cocoa.x86_64.tar.gz` / `.app` |
| macOS aarch64 | `ExperimentAutomation-macosx.cocoa.aarch64.tar.gz` / `.app` |
| Linux x86\_64 | `ExperimentAutomation-linux.gtk.x86_64.tar.gz` |
| Linux aarch64 | `ExperimentAutomation-linux.gtk.aarch64.tar.gz` |
| Windows x86\_64 | `ExperimentAutomation-win32.win32.x86_64.zip` |

The product is **not** part of the regular reactor build
(`releng/pom.xml`).  It must be built manually as shown above.

## Run

### Via native launcher (macOS example)

Use `-application` (not `-product`) to run headlessly:

```bash
./target/products/ExperimentAutomation/macosx/cocoa/aarch64/experiment-automation.app/Contents/MacOS/eclipse \
  -application org.palladiosimulator.experimentautomation.application \
  -data /tmp/ea-workspace \
  -consoleLog \
  /path/to/your/experiment.experiments
```

The `-consoleLog` flag is optional and enables Eclipse log output on stderr.

### Via `java -jar`

```bash
java -jar target/products/ExperimentAutomation/macosx/cocoa/aarch64/experiment-automation.app/Contents/Eclipse/plugins/org.eclipse.equinox.launcher_*.jar \
  -application org.palladiosimulator.experimentautomation.application \
  -data /tmp/ea-workspace \
  /path/to/your/experiment.experiments
```

### Example

The espresso example ships experiment models in the
`org.palladiosimulator.experimentautomation.examples.espresso` bundle:

```bash
/path/to/eclipse \
  -application org.palladiosimulator.experimentautomation.application \
  -data /tmp/ea-workspace \
  /path/to/repo/bundles/org.palladiosimulator.experimentautomation.examples.espresso/model/Experiments/SimpleVariation.experiments
```

### Arguments

| Argument | Description |
|---|---|
| `-application <id>` | Application ID (`org.palladiosimulator.experimentautomation.application`) |
| `-data <dir>` | Eclipse workspace directory (required; arbitrary temp dir is fine) |
| `-consoleLog` | Print Eclipse log to stderr (optional) |
| `<file.experiments>` | Path to the experiment repository model (`.experiments` extension) |

### Known Issues

- **log4j warnings**: missing appenders – harmless, does not affect execution.
  Simulation progress can be checked in `workspace/.metadata/.log`.
- **Product not found warning**: `Product org.palladiosimulator.experimentautomation.product
  could not be found.` is cosmetic when using `-application` – the headless
  application works correctly despite this message.
