package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.simulizar.SimuLizarPlatform;
import org.palladiosimulator.simulizar.di.modules.stateless.mdsd.MDSDBlackboardProvidingModule;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class StartSimuLizarInterpreterJob extends AbstractBlackboardInteractingJob<MDSDBlackboard> {

    private final SimuLizarWorkflowConfiguration workflowConfiguration;
    
    private IJob runtimeJob;
    
    public StartSimuLizarInterpreterJob(SimuLizarWorkflowConfiguration workflowConfiguration) {
        this.workflowConfiguration = workflowConfiguration;
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var rootComponentFactory = SimuLizarPlatform.getPlatformComponent()
            .analysisFactory();
        var rootComponent = rootComponentFactory.create(workflowConfiguration,
                rootComponentFactory.defaultComponentFactoriesModule(),
                rootComponentFactory.defaultExtensionComponentsModule(),
                new MDSDBlackboardProvidingModule(getBlackboard()));
        var runtimeComponent = rootComponent.runtimeComponentFactory()
            .create();
        runtimeJob = runtimeComponent.runtimeJob();
        runtimeJob.execute(monitor);
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        runtimeJob.cleanup(monitor);
    }

    @Override
    public String getName() {
        return runtimeJob.getName();
    }

}
