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
import org.palladiosimulator.simulizar.SimuLizarPlatform;
import org.palladiosimulator.simulizar.di.component.core.SimuLizarRuntimeComponent;
import org.palladiosimulator.simulizar.di.modules.stateless.mdsd.MDSDBlackboardProvidingModule;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSimuLizarModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.JobProxy;

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

        final RunAnalysisJob result = new RunAnalysisJob();
        result.setConfiguration(configMap);
        result.addJob(new LogExperimentInformationJob(experiment, simuComConfig, variationFactorTuples, repetition));

        result.addJob(new CopyPartitionJob(LoadSimuLizarModelsIntoBlackboardJob.PCM_MODELS_ANALYZED_PARTITION_ID,
                ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID));
        result.addJob(new JobProxy(() -> {
            var rootComponentFactory = SimuLizarPlatform.getPlatformComponent().analysisFactory();
            var component = rootComponentFactory.create(workflowConfig, rootComponentFactory.defaultComponentFactoriesModule(),
                    rootComponentFactory.defaultExtensionComponentsModule(), new MDSDBlackboardProvidingModule(result.getBlackboard()));
            return ((SimuLizarRuntimeComponent) component).runtimeJob();
        }));
        if (experiment.getInitialModel()
            .getServiceLevelObjectives() != null) {
            result.addJob(new CheckForSLOViolationsJob(result, experiment.getInitialModel()
                .getServiceLevelObjectives(), simuLizarToolConfig.getDatasource(), simuComConfig.getNameBase(),
                    simuComConfig.getVariationId()));
        }
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
