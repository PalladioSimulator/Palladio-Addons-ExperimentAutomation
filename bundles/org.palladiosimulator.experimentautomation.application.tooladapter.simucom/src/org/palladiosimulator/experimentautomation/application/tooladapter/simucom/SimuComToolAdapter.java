package org.palladiosimulator.experimentautomation.application.tooladapter.simucom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.jobs.CheckForSLOViolationsJob;
import org.palladiosimulator.experimentautomation.application.jobs.LogExperimentInformationJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationConfigFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationWorkflowConfigurationFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimuComConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.core.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.simucomframework.core.SimuComConfig;

/**
 * @author Sebastian Lehrig
 */
public class SimuComToolAdapter implements IToolAdapter {

    private static final String SIMULATOR_ID_SIMUCOM = "de.uka.ipd.sdq.codegen.simucontroller.simucom";
    private static final Logger LOGGER = Logger.getLogger(SimuComToolAdapter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public RunAnalysisJob createRunAnalysisJob(final Experiment experiment, final ToolConfiguration toolConfig,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        final SimuComConfiguration simuComToolConfig = (SimuComConfiguration) toolConfig;
        final Map<String, Object> configMap = AbstractSimulationConfigFactory.createConfigMap(experiment,
                simuComToolConfig, SIMULATOR_ID_SIMUCOM, variationFactorTuples);
        final SimuComConfig simuComConfig = createSimuComConfig(configMap);
        final SimuComWorkflowConfiguration workflowConfig = createSimuComWorkflowConfiguration(simuComConfig);

        final RunAnalysisJob result = new RunAnalysisJob();
        result.setConfiguration(configMap);
        try {
            result.add(new LogExperimentInformationJob(experiment, simuComConfig, variationFactorTuples, repetition));
            result.add(new SimuComJob(workflowConfig, null, false));
            
            if (experiment.getInitialModel().getServiceLevelObjectives() != null) {
                result.addJob(new CheckForSLOViolationsJob(result,
                    experiment.getInitialModel().getServiceLevelObjectives(), simuComToolConfig.getDatasource(),
                    simuComConfig.getNameBase(), simuComConfig.getVariationId()));
            }
        } catch (CoreException e) {
            LOGGER.error("SimuCom execution failed: " + e);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasSupportFor(final ToolConfiguration configuration) {
        return SimucomtooladapterPackage.eINSTANCE.getSimuComConfiguration().isInstance(configuration);
    }

    private SimuComConfig createSimuComConfig(final Map<String, Object> configMap) {
        configMap.put(SimuComConfig.SIMULATE_LINKING_RESOURCES, false);
        return new SimuComConfig(configMap, false);
    }

    private SimuComWorkflowConfiguration createSimuComWorkflowConfiguration(final SimuComConfig simuComConfig) {
        final SimuComWorkflowConfiguration workflowConfig = new SimuComWorkflowConfiguration(
                new HashMap<String, Object>());

        AbstractSimulationWorkflowConfigurationFactory.fillWorkflowConfiguration(workflowConfig);
        workflowConfig.setSimuComConfiguration(simuComConfig);

        return workflowConfig;
    }
}
