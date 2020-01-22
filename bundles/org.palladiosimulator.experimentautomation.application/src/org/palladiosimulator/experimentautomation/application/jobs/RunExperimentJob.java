package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.List;
import org.palladiosimulator.edp2.batchexport.BatchExporter;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.tooladapter.AnalysisToolFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.experiments.Experiment;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Runs a given, completely specified experiment out of an experiment run series.
 * 
 * @author Sebastian Lehrig
 */
public class RunExperimentJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    /**
     * Default Constructor.
     * 
     * @param experiment
     *            The experiment to be conducted.
     * @param simulationConfiguration
     *            The given analysis tool, e.g., SimuCom.
     * @param variationFactorTuples
     *            the variations and according value factors.
     * @param repetition
     *            Gives the current number of repetitions for this exact experiment; for statistical
     *            significance. Note that repetition>1 makes only sense for non-fixed random seeds.
     */
    public RunExperimentJob(final Experiment experiment, final AbstractSimulationConfiguration simulationConfiguration,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        super(false);

        final IToolAdapter analysisTool = AnalysisToolFactory.createToolAdapater(simulationConfiguration);
        final RunAnalysisJob runAnalysisJob = analysisTool.createRunAnalysisJob(experiment, simulationConfiguration,
                variationFactorTuples, repetition);

        this.add(runAnalysisJob);
        this.add(new AddDynamicVariationJob(runAnalysisJob, analysisTool, experiment, simulationConfiguration,
                variationFactorTuples, repetition));

        if (FileDatasource.class.isAssignableFrom(simulationConfiguration.getDatasource().getClass())) {
            FileDatasource source = (FileDatasource)simulationConfiguration.getDatasource();
            if (source.getExportOption().equals(ExportOption.CSV)) {
            	this.add(new BatchExporterJob(source));
            }
        }
    }
}
