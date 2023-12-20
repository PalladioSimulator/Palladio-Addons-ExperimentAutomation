package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.List;

import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.experiments.Experiment;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Repeats the given experiment for a given tool and a given set of variations.
 * 
 * @author Sebastian Lehrig
 */
public class RepeatExperimentJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    /**
     * Default Constructor.
     * 
     * @param experiment
     *            the experiment to be conducted.
     * @param simulationConfiguration
     *            the given analysis tool, e.g., SimuCom.
     * @param variationFactorTuples
     *            the variations and according value factors.
     */
    public RepeatExperimentJob(final Experiment experiment, final AbstractSimulationConfiguration simulationConfiguration,
            final List<VariationFactorTuple> variationFactorTuples) {
        super(false);

        for (int repetition = 1; repetition <= experiment.getRepetitions(); repetition++) {
        	this.add(new VaryJob(variationFactorTuples));
            this.add(new RunExperimentJob(experiment, simulationConfiguration, variationFactorTuples, repetition));
        }
    }
}
