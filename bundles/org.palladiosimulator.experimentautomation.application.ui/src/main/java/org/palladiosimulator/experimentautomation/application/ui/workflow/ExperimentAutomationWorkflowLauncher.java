package org.palladiosimulator.experimentautomation.application.ui.workflow;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.experimentautomation.application.config.ExperimentAutomationConfiguration;
import org.palladiosimulator.experimentautomation.application.jobs.RunExperimentAutomationJob;

import de.uka.ipd.sdq.codegen.simucontroller.debug.IDebugListener;
import de.uka.ipd.sdq.codegen.simucontroller.debug.SimulationDebugListener;
import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.WorkflowExceptionHandler;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.core.AbstractWorkflowBasedMDSDLaunchConfigurationDelegate;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflow;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflowExceptionHandler;

public class ExperimentAutomationWorkflowLauncher
        extends AbstractWorkflowBasedMDSDLaunchConfigurationDelegate<ExperimentAutomationConfiguration> {

    @Override
    protected BlackboardBasedWorkflow<MDSDBlackboard> createWorkflow(
            final ExperimentAutomationConfiguration workflowConfiguration, final IProgressMonitor monitor,
            final ILaunch launch) throws CoreException {
        return new UIBasedWorkflow<>(this.createWorkflowJob(workflowConfiguration, launch), monitor,
                this.createExceptionHandler(workflowConfiguration.isInteractive()), this.createBlackboard());
    }

    @Override
    protected WorkflowExceptionHandler createExceptionHandler(boolean interactive) {
        return new UIBasedWorkflowExceptionHandler(!interactive);
    }

    /*
     * (non-Javadoc)
     * 
     * @seede.uka.ipd.sdq.codegen.runconfig.LaunchConfigurationDelegate#
     * creataAttributesGetMethods(org.eclipse.debug.core.ILaunchConfiguration)
     */
    @Override
    protected ExperimentAutomationConfiguration deriveConfiguration(final ILaunchConfiguration configuration,
            final String mode) throws CoreException {
        final ExperimentAutomationConfiguration config = new ExperimentAutomationConfiguration();

        final AbstractWorkflowConfigurationBuilder builder = new ExperimentAutomationLaunchConfigurationBasedConfigBuilder(
                configuration, mode);
        builder.fillConfiguration(config);

        return config;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<LoggerAppenderStruct> setupLogging(final Level logLevel) throws CoreException {
        List<LoggerAppenderStruct> loggerList = new ArrayList<>(super.setupLogging(logLevel));
        loggerList.add(setupLogger("org.palladiosimulator.experimentautomation", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        // TODO This code is tool-dependent. Should be realized by extenders for logger
        // configurations.
        loggerList.add(setupLogger("org.palladiosimulator.architecturaltemplates", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        // TODO This code is tool-dependent. Should be realized by extenders for logger
        // configurations.
        loggerList.add(setupLogger("de.uka.ipd.sdq.workflow.mdsd.emf.qvtr", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));
        loggerList.add(setupLogger("de.uka.ipd.sdq.statistics", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));
        loggerList.add(setupLogger("de.uka.ipd.sdq.codegen", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));
        loggerList.add(setupLogger("de.uka.ipd.sdq.simucomframework", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));
        loggerList.add(setupLogger("org.palladiosimulator.simulizar.interpreter", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        return loggerList;
    }

    /*
     * (non-Javadoc)
     * 
     * @seede.uka.ipd.sdq.codegen.runconfig.LaunchConfigurationDelegate# createRunCompositeJob
     * (de.uka.ipd.sdq.codegen.runconfig.AttributesGetMethods)
     */
    @Override
    protected IJob createWorkflowJob(final ExperimentAutomationConfiguration config, final ILaunch launch)
            throws CoreException {
        IDebugListener listener = null;

        if (config.isDebug()) {
            listener = new SimulationDebugListener(launch);
        }

        return new RunExperimentAutomationJob(config, listener);
    }

}
