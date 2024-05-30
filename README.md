# Palladio Experiment Automation
The Palladio Experiment Automation enables automatic execution of Palladio simulation runs. Allows to specify experiment runs for arbitrary solvers within a model; also supports experiment variations, e.g., for sensitivity analyses.

## Documentation
So far, the Palladio Bench requires user interaction to configure and launch a simulation run, both of which is done using the the SimuBench launch configuration type. While being sufficient for single simulation runs, larger simulation studies with plenty of similar but distinct runs are tedious to perform this way and the desire for automation arises. The Palladio Experiment Automation project aims a filling this gap.

### Features
* Simulates a specified PCM model with a given simulation configuration
* Simulates an experiment series referring to a specified PCM model which is automatically modified over the course of the experiment series. E.g. the population of a closed workload might be systematically increased.
* Comes with a configuration-metamodel whose instances describe which PCM model is to be used, what is the simulation configuration and how the PCM model is going to be modified over the course of the experiment series
* Runs headless, i.e. without a graphical user interface (GUI) present. This way, experiments can be launched from command line, but also in a graphical environment.

### Further information
Development of the Palladio Experiment Automation started in the course of a master's thesis. Please refer to the corresponding [thesis](http://sdqweb.ipd.kit.edu/publications/pdfs/merkle2011a.pdf)(pp. 65 ff.) for more information.

### Technical documentation
#### Technical overview
Palladio Experiment Automation...

* ...comprises a number of Eclipse plug-ins
* ...is an Eclipse Application, meaning that it extends the org.eclipse.core.runtime.applications extension point
* ...provides no graphical widgets or views, respectively - experiment series or single simulation runs are configured solely on the basis of a configuration model

#### Installation
##### Installation from Update Site
There is no release version yet. Currently, use the [(nightly) update site](https://sdqweb.ipd.kit.edu/eclipse/experimentautomation/nightly/).

##### Installation from GitHub
Use the GitHub repository to check out all plug-ins ("org.palladiosimulator.experimentautomation*").

#### Creating and Editing Configuration Models
1. Install Eclipse and Palladio with Experiment Automation feature enabled
1. Create a project (or use an existing one) - the project type (General, Java, ...) does not matter
1. Select File -> New... -> Other... -> Example EMF Model Creation Wizards -> Experiments Model
1. Name your model as desired (then hit Next), and choose "Experiment Repository" in the topmost drop-down field (hit Finish)
1. Copy the pcm.variation file into the folder where your .experiments file resides. The .variation file can be found in the `experimentautomation.application` project in the "model" subfolder. To use the variations, the file has to be loaded, using the "Load Resource..." entry of the context menu of the tree editor.
1. Start modelling as usual with generated EMF tree-editors. You can find a simple example in the project "org.palladiosimulator.experimentautomation.examples.espresso".

#### Running Experiments
1. Start the Palladio-Bench with Experiment Automation feature enabled
1. Create a PCM model to be simulated
1. Create a configuration model as described above - the configuration model indirectly references the afore-created PCM model
1. Select Run -> Run Configurations... and double click on Eclipse Application
1. Choose the newly created Eclipse launch configuration
1. Select "Run as application" and choose "org.palladiosimulator.experimentautomation.application"
1. Switch to the "Arguments" tab
1. In the field "Program arguments", provide an additional argument as shown in this example: `-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog D:\models\my.experiments`
1. This argument is the path to your configuration model (.experiments extension).
1. Hit Run and lean back
1. Once the experiments are finished, you will find all data in the recorder (e.g., EDP2 or SensorFramework) you configured
