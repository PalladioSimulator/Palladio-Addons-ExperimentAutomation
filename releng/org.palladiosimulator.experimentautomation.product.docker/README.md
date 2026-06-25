# Experiment Automation – Docker-Image

Dieses Image baut **Palladio Experiment Automation** als standalone Eclipse-RCP-Product inklusive aller Abhängigkeiten (SimuLizar, SimuCom, SSJ-Simulation-Engine, ArchitecturalTemplates) und stellt es als ausführbares Docker-Image bereit.

Zwei Repositories werden aus dem Quellcode gebaut, da die benötigten Fixes noch nicht in den nightly p2-Repos liegen:

- [Palladio-Addon-ArchitecturalTemplates](https://github.com/PalladioSimulator/Palladio-Addon-ArchitecturalTemplates) – UI-Constants-Fix und Tycho-Bump
- [Palladio-Addons-ExperimentAutomation](https://github.com/PalladioSimulator/Palladio-Addons-ExperimentAutomation) – Product-Module und Tycho-Bump (Branch `product-module`)

## Voraussetzungen

- Docker mit `--platform linux/amd64` Support
- Auf Apple Silicon (M1/M2/M3): QEMU binfmt einmalig installieren

```bash
docker run --privileged --rm tonistiigi/binfmt --install amd64
```

## Bauen

```bash
docker build \
  --platform linux/amd64 \
  -t experiment-automation:latest \
  -f releng/org.palladiosimulator.experimentautomation.product.docker/Dockerfile \
  .
```

Der Build dauert ca. 6–8 Minuten (kein Maven-Cache, Download aller Abhängigkeiten).  
Der AT-Build kann mit `--build-arg MAVEN_VERSION=<version>` auf eine andere Maven-Version umgestellt werden.

## Ausführen

### Ein Experiment ausführen

Das `.experiments`-File und alle referenzierten Modelle müssen per Bind-Mount eingebunden werden, sodass relative Pfade im Experiment-File korrekt aufgelöst werden können.

Beispiel mit dem Espresso-Beispielmodell:

```bash
docker run --rm --platform linux/amd64 \
  -v /pfad/zu/espresso/model/:/experiments:ro \
  -v /pfad/zu/workspace-data:/data \
  experiment-automation:latest \
  /experiments/Experiments/SimpleVariation.experiments
```

- `/experiments` – beliebiger Mount-Point; das Experiment-File und seine Modelle müssen hier liegen  
- `/data` – Eclipse-Workspace (Logs, Ergebnisse); wird automatisch erstellt

Exit-Code `0` bedeutet erfolgreiche Durchführung. Bei Fehlern:

```bash
cat /pfad/zu/workspace-data/.metadata/.log
```

### Console-Log aktivieren

Standardmäßig wird nur das Nötigste auf der Konsole ausgegeben (EDP2-/log4j-Warnungen).  
Mit der Umgebungsvariable `EA_CONSOLE_LOG=true` wird das vollständige Eclipse-Log ausgegeben:

```bash
docker run --rm --platform linux/amd64 \
  -v /pfad/zu/espresso/model/:/experiments:ro \
  -e EA_CONSOLE_LOG=true \
  experiment-automation:latest \
  /experiments/Experiments/SimpleVariation.experiments
```

### Image als ausführbares Kommando

```bash
alias ea-docker='docker run --rm --platform linux/amd64 \
  -v "$(pwd)/experiments:/experiments:ro" \
  -v "$(pwd)/ea-data:/data" \
  experiment-automation:latest'

ea-docker /experiments/setup/mein-experiment.experiments
```

## Ausgabe

Bei Erfolg erscheint auf der Konsole:

```
EDP2-Warnung (Neukonfiguration, einmalig)
log4j-Warnung (kein log4j.properties, harmlos)
EXIT_CODE=0
```

Das Workspace-Verzeichnis unter `/data` enthält `.metadata/.log` mit detaillierten Informationen.

## Technische Details

- **Basis-Image**: `eclipse-temurin:21-jre-jammy` (Ubuntu 22.04, OpenJDK 21, ~170 MB Product)
- **Xvfb**: Notwendig, da das RCP-Product UI-Plugins (Xtext, Eclipse-IDE) bindet, die auch im Headless-Modus SWT/GTK initialisieren
- **3-Stage-Build**:
  1. `at-builder` – ArchitecturalTemplates aus Source + p2-Update-Site
  2. `ea-builder` – ExperimentAutomation + Product-Build
  3. `runtime` – Runtime-Image mit GTK3, Xvfb und dem Product-Tarball
- **SSJ-Simulation-Engine** (`ca.umontreal.iro.simul.ssj`) ist im Product enthalten

## Bekannte Probleme

- **Erster Build ist langsam**: Kein Maven-Cache. Wer häufig baut, kann ein Volume mounten: `--mount type=volume,src=maven-repo,dst=/root/.m2`
- **Kein Internet = kein Build**: p2-Repos, GitHub, Maven Central werden benötigt
- **QEMU-Emulation**: Auf ARM ~2× langsamer als native AMD64
- **AT-Branches müssen konfliktfrei sein**: Die beiden gemergten Branches (`bump-tycho-to-4.0.13`, `fix/extract-ui-constants-to-separate-class`) überschneiden sich derzeit nicht
