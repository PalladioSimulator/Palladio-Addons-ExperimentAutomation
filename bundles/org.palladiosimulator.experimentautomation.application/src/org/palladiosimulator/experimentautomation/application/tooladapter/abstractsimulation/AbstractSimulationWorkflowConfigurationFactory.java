package org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation;

import org.palladiosimulator.analyzer.workflow.core.ConstantsContainer;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.AbstractSimulationWorkflowConfiguration;

/**
 * @author Sebastian Lehrig
 */
public class AbstractSimulationWorkflowConfigurationFactory {

    private static final String DEFAULT_CONNECTOR_FEATURE_CONFIG = "pathmap://PCM_MODELS/ConnectorConfig.featureconfig";

    public static void fillWorkflowConfiguration(final AbstractSimulationWorkflowConfiguration workflowConfig) {

        /***************************************************/
        /** General ****************************************/
        /***************************************************/
        /** Kind of workflow run */
        workflowConfig.setDebug(false);
        workflowConfig.setInteractive(false); // TODO
        workflowConfig.setCodeGenerationAdvicesFile(CodeGenerationAdvice.SIMULATION);

        /***************************************************/
        /** Architecture Model(s) Tab **********************/
        /***************************************************/
        // loaded to blackboard; no need to specify here!

        /***************************************************/
        /** Analysis Configuration Tab *********************/
        /***************************************************/
        /** Location of temporary data */
        workflowConfig.getAttributes().put(ConstantsContainer.TEMPORARY_DATA_LOCATION,
                ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION);
        workflowConfig.setStoragePluginID(ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION);
        workflowConfig.setOverwriteWithoutAsking(true); // TODO ensure that no folders can be
                                                        // deleted accidentally

        /** Temporary Data */
        workflowConfig.setDeleteTemporaryDataAfterAnalysis(true); // TODO

        /** Accuracy influence analysis */
        workflowConfig.setAccuracyInfluenceAnalysisEnabled(false);

        /** Sensitivity Analysis Parameters */
        workflowConfig.setSensitivityAnalysisEnabled(false); // TODO Sensitivity analysis should be
                                                             // replaced by Experiment Automation

        /***************************************************/
        /** Feature Settings Tab ***************************/
        /***************************************************/
        /** PCM2EJB Feature Configuration File */
        workflowConfig.setFeatureConfigFile(DEFAULT_CONNECTOR_FEATURE_CONFIG);
    }

}
