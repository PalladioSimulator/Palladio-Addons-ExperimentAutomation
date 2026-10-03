package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot;

import java.util.List;
import java.util.Map;

import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationJob;
import org.palladiosimulator.analyzer.workflow.core.ConstantsContainer;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.jobs.CheckForSLOViolationsJob;
import org.palladiosimulator.experimentautomation.application.jobs.LoadModelsIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.application.jobs.LogExperimentInformationJob;
import org.palladiosimulator.experimentautomation.application.jobs.RemovePartitionJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationConfigFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshotConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

import de.uka.ipd.sdq.simucomframework.core.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.BlackboardAwareJobProxy;

/**
 * Experiment Automation tool adapter for Slingshot.
 * <p>
 * Models are expected to already reside in the default PCM blackboard partition.
 * After a run, the partition is cleared and reloaded so SPD runtime mutations do
 * not leak into the next variation or repetition.
 */
public class SlingshotToolAdapter implements IToolAdapter {

    private static final String SLINGSHOT_ID = "org.palladiosimulator.slingshot";

    @Override
    public RunAnalysisJob createRunAnalysisJob(final Experiment experiment, final ToolConfiguration toolConfiguration,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        final SlingshotConfiguration slingshotConfiguration = (SlingshotConfiguration) toolConfiguration;

        final Map<String, Object> configMap = AbstractSimulationConfigFactory.createConfigMap(experiment,
                slingshotConfiguration, SLINGSHOT_ID, variationFactorTuples);

        final SimuComConfig simuComConfig = createSimuComConfig(configMap);

        final RunAnalysisJob result = new RunAnalysisJob();
        result.setConfiguration(configMap);
        result.addJob(new LogExperimentInformationJob(experiment, simuComConfig, variationFactorTuples, repetition));

        // Skip SimulationRootJob: EA already loaded models into the blackboard.
        result.addJob(new BlackboardAwareJobProxy<>("Run Slingshot", () -> new SimulationJob(simuComConfig)));

        if (experiment.getInitialModel().getServiceLevelObjectives() != null) {
            result.addJob(new CheckForSLOViolationsJob(result, experiment.getInitialModel().getServiceLevelObjectives(),
                    slingshotConfiguration.getDatasource(), simuComConfig.getNameBase(),
                    simuComConfig.getVariationId()));
        }

        // Drop SPD/runtime mutations, then reload the (already varied) initial models.
        result.addJob(new RemovePartitionJob(ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID));
        result.addJob(new LoadModelsIntoBlackboardJob(experiment.getInitialModel(), true));

        return result;
    }

    @Override
    public boolean hasSupportFor(final ToolConfiguration toolConfiguration) {
        return SlingshottooladapterPackage.eINSTANCE.getSlingshotConfiguration().isInstance(toolConfiguration);
    }

    private SimuComConfig createSimuComConfig(final Map<String, Object> configMap) {
        configMap.put(SimuComConfig.SIMULATE_LINKING_RESOURCES, false);
        return new SimuComConfig(configMap, false);
    }
}
