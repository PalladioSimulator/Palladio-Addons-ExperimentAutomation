package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot;

import java.util.List;
import java.util.Map;

import org.palladiosimulator.analyzer.slingshot.workflow.SimulationLauncher;
import org.palladiosimulator.analyzer.slingshot.workflow.SimulationWorkflowConfiguration;
import org.palladiosimulator.analyzer.slingshot.workflow.WorkflowConfigurationModule;
import org.palladiosimulator.analyzer.slingshot.workflow.jobs.SimulationJob;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;
import org.palladiosimulator.analyzer.workflow.jobs.LoadModelIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.jobs.CheckForSLOViolationsJob;
import org.palladiosimulator.experimentautomation.application.jobs.CopyPartitionJob;
import org.palladiosimulator.experimentautomation.application.jobs.LogExperimentInformationJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationConfigFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshotConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
//%import org.palladiosimulator.simulizar.launcher.jobs.LoadSimuLizarModelsIntoBlackboardJob;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.BlackboardAwareJobProxy;

/**
 * 
 * @author florimentklinaku
 *
 */
public class SlingshotToolAdapter implements IToolAdapter {

	private final String SLINGSHOT_ID = "org.palladiosimulator.slingshot";
	@Override
	public RunAnalysisJob createRunAnalysisJob(Experiment experiment, ToolConfiguration toolConfiguration,
			List<VariationFactorTuple> variationFactorTuples, int repetition) {
	    final SlingshotConfiguration slingshotConfiguration = (SlingshotConfiguration) toolConfiguration;
	    
        final Map<String, Object> configMap = AbstractSimulationConfigFactory.createConfigMap(experiment,
        		slingshotConfiguration, SLINGSHOT_ID, variationFactorTuples);
        
        final SimuComConfig simuComConfig = createSimuComConfig(configMap);
//        final SimulationWorkflowConfiguration workflowCnfg = createSlingshotWorkflowConfig(simuComConfig,
//        		 experiment.getInitialModel()
//        		);
        
//		WorkflowConfigurationModule.simuComConfigProvider.set(simuComConfig); part of the simulation job

        final RunAnalysisJob result = new RunAnalysisJob();
        result.setConfiguration(configMap);
        result.addJob(new LogExperimentInformationJob(experiment, simuComConfig, variationFactorTuples, repetition));

        // Save the state of the varied model before starting the simulation in order to be able to
        // revert the changes of runtime adaptations
        result.addJob(new CopyPartitionJob(ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID,
        		ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION));

        result.addJob(
                new BlackboardAwareJobProxy<>("Run Slingshot", () -> new SimulationJob(simuComConfig)));
        if (experiment.getInitialModel()
            .getServiceLevelObjectives() != null) {
            result.addJob(new CheckForSLOViolationsJob(result, experiment.getInitialModel()
                .getServiceLevelObjectives(), slingshotConfiguration.getDatasource(), simuComConfig.getNameBase(),
                    simuComConfig.getVariationId()));
        }
        // restore the state
        result.addJob(new CopyPartitionJob(ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION,
                ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID));

        return result;
	}

//	private SimulationWorkflowConfiguration createSlingshotWorkflowConfig(SimuComConfig simuComConfig,
//			InitialModel initialModel) {
//			SimulationWorkflowConfiguration cnfSlingshot = new SimulationWorkflowConfiguration(simuComConfig);
//			
//			cnfSlingshot.setUsageModelFile(initialModel.getUsageModel().eResource().getURI().toString());
//			List<String> allocFiles = List.of(initialModel.getAllocation().eResource().getURI().toString());
//			cnfSlingshot.setAllocationFiles(allocFiles);
//			cnfSlingshot.addOtherModelFile(initialModel.getMonitorRepository().eResource().getURI().toString());
//			cnfSlingshot.addOtherModelFile(initialModel.getScalingDefinitions().eResource().getURI().toString());
//			cnfSlingshot.addOtherModelFile(initialModel.getSpdSemanticConfiguration().eResource().getURI().toString());
//			return cnfSlingshot;
//	}

	@Override
	public boolean hasSupportFor(ToolConfiguration toolConfiguration) {
		return SlingshottooladapterPackage.eINSTANCE.getSlingshotConfiguration().isInstance(toolConfiguration);
	} 
	
	private SimuComConfig createSimuComConfig(final Map<String, Object> configMap) {
        configMap.put(SimuComConfig.SIMULATE_LINKING_RESOURCES, false);
        return new SimuComConfig(configMap, false);
    }

}
