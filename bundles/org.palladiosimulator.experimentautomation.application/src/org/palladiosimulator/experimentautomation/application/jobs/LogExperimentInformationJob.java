package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.experiments.Experiment;

import de.uka.ipd.sdq.simulation.core.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class LogExperimentInformationJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(LogExperimentInformationJob.class);

    private final Experiment experiment;
    private final AbstractSimulationConfig simulationConfig;
    private final List<VariationFactorTuple> variationFactorTuples;
    private final int repetition;

    public LogExperimentInformationJob(final Experiment experiment, final AbstractSimulationConfig simulationConfig,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        this.experiment = experiment;
        this.simulationConfig = simulationConfig;
        this.variationFactorTuples = variationFactorTuples;
        this.repetition = repetition;
    }

    /**
     * TODO How to enable logging? [Lehrig]
     * 
     * {@inheritDoc}
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n");
        stringBuilder.append("============= Experiment Automation: Experiment Run =============\n");

        stringBuilder.append("NAME: \"");
        stringBuilder.append(this.simulationConfig.getNameBase());
        stringBuilder.append("\"\n");

        for (final VariationFactorTuple variationFactorTuple : variationFactorTuples) {
            stringBuilder.append("VARIATION: ");
            stringBuilder.append(variationFactorTuple.getVariation().getName());
            stringBuilder.append("[");
            stringBuilder.append(variationFactorTuple.getFactor());
            stringBuilder.append("](");
            stringBuilder.append(variationFactorTuple.getVariation().getVariedObjectId());
            stringBuilder.append(")\n");
        }

        stringBuilder.append("REPETITION: ");
        stringBuilder.append(String.valueOf(this.repetition));
        stringBuilder.append(" of ");
        stringBuilder.append(String.valueOf(this.experiment.getRepetitions()));
        stringBuilder.append("\n");

        stringBuilder.append("SIMULATOR ID: \"");
        stringBuilder.append(this.simulationConfig.getSimulatorId());
        stringBuilder.append("\"\n");

        stringBuilder.append("RECORDER: \"");
        stringBuilder.append(this.simulationConfig.getRecorderName());
        stringBuilder.append("\"\n");


         LOGGER.info(stringBuilder.toString());
        super.execute(monitor);
    }
}
