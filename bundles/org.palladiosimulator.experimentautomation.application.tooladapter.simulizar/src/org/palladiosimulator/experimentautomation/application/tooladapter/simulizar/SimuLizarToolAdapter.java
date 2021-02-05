package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.palladiosimulator.analyzer.workflow.ConstantsContainer;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.jobs.CheckForSLOViolationsJob;
import org.palladiosimulator.experimentautomation.application.jobs.CopyPartitionJob;
import org.palladiosimulator.experimentautomation.application.jobs.LogExperimentInformationJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationConfigFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationWorkflowConfigurationFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimuLizarConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSimuLizarModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.BlackboardAwareJobProxy;

/**
 * @author Sebastian Lehrig
 */
public class SimuLizarToolAdapter implements IToolAdapter {

    private static final String SIMULATOR_ID_SIMULIZAR = "de.uka.ipd.sdq.codegen.simucontroller.simulizar";

    /**
     * {@inheritDoc}
     */
    @Override
    public RunAnalysisJob createRunAnalysisJob(final Experiment experiment, final ToolConfiguration toolConfig,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        final SimuLizarConfiguration simuLizarToolConfig = (SimuLizarConfiguration) toolConfig;
        final Map<String, Object> configMap = AbstractSimulationConfigFactory.createConfigMap(experiment,
                simuLizarToolConfig, SIMULATOR_ID_SIMULIZAR, variationFactorTuples);
        final SimuComConfig simuComConfig = createSimuComConfig(configMap);
        final SimuLizarWorkflowConfiguration workflowConfig = createSimuLizarWorkflowConfiguration(simuComConfig,
                experiment.getInitialModel()
                    .getReconfigurationRules());
        workflowConfig.getAttributes().putAll(configMap);

        final RunAnalysisJob result = new RunAnalysisJob();
        result.setConfiguration(configMap);
        result.addJob(new LogExperimentInformationJob(experiment, simuComConfig, variationFactorTuples, repetition));

        // Save the state of the varied model before starting the simulation in order to be able to
        // revert the changes of runtime adaptations
        result.addJob(new CopyPartitionJob(ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID,
                LoadSimuLizarModelsIntoBlackboardJob.PCM_MODELS_ANALYZED_PARTITION_ID));
        result.addJob(
                new BlackboardAwareJobProxy<>("Run SimuLizar", () -> new StartSimuLizarInterpreterJob(workflowConfig)));
        if (experiment.getInitialModel()
            .getServiceLevelObjectives() != null) {
            result.addJob(new CheckForSLOViolationsJob(result, experiment.getInitialModel()
                .getServiceLevelObjectives(), simuLizarToolConfig.getDatasource(), simuComConfig.getNameBase(),
                    simuComConfig.getVariationId()));
        }
        // Restore the state of the blackboard to get rid of changes made by runtime adaptations
        result.addJob(new CopyPartitionJob(LoadSimuLizarModelsIntoBlackboardJob.PCM_MODELS_ANALYZED_PARTITION_ID,
                ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasSupportFor(final ToolConfiguration configuration) {
        return SimulizartooladapterPackage.eINSTANCE.getSimuLizarConfiguration()
            .isInstance(configuration);
    }

    private SimuComConfig createSimuComConfig(final Map<String, Object> configMap) {
        configMap.put(SimuComConfig.SIMULATE_LINKING_RESOURCES, false);
        configMap.put(SimuComConfig.SIMULATE_FAILURES, false);

        return new SimuComConfig(configMap, false);
    }

    private SimuLizarWorkflowConfiguration createSimuLizarWorkflowConfiguration(final SimuComConfig simuComConfig,
            final ReconfigurationRulesFolder reconfigurationRulesFolder) {
        final SimuLizarWorkflowConfiguration workflowConfig = new SimuLizarWorkflowConfiguration(
                new HashMap<String, Object>());
        AbstractSimulationWorkflowConfigurationFactory.fillWorkflowConfiguration(workflowConfig);
        workflowConfig.setSimuComConfiguration(simuComConfig);

        if (reconfigurationRulesFolder == null) {
            workflowConfig.setReconfigurationRulesFolder("");
        } else {
            workflowConfig.setReconfigurationRulesFolder(reconfigurationRulesFolder.getFolderUri());
        }

        return workflowConfig;
    }
}
