package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Loads all needed source PCM models into the PCM blackboard partition. Uses the initial model of
 * Experiment Automation to receive the referred PCM models. These PCM models may be uncompleted,
 * i.e., no AT completion was executed yet. Therefore, such models require stereotypes that
 * reference AT models. These AT models can be used to execute AT completions.
 * 
 * @author Sebastian Lehrig
 */
public class LoadModelsIntoBlackboardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(LoadModelsIntoBlackboardJob.class);

    public static final String PCM_MODELS_ORIGINAL_PARTITION_ID = "org.palladiosimulator.pcmmodels.original.partition";

    private final InitialModel initialModel;

    /** Allows to deactivate model loading, e.g., when models are already in a blackboard. */
    private final boolean loadDefaultPcmModels;

    public LoadModelsIntoBlackboardJob(final InitialModel initialModel, final boolean loadModels) {
        super(false);
        this.initialModel = initialModel;
        this.loadDefaultPcmModels = loadModels;
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        // Load the PCM models
        final List<EObject> pcmModels = new ArrayList<EObject>();
        if (this.loadDefaultPcmModels) {
            pcmModels.add(this.initialModel.getRepository());
            pcmModels.add(this.initialModel.getSystem());
            pcmModels.add(this.initialModel.getResourceEnvironment());
            pcmModels.add(this.initialModel.getAllocation());
            pcmModels.add(this.initialModel.getUsageModel());
            pcmModels.add(this.initialModel.getMiddlewareRepository());
            pcmModels.add(this.initialModel.getEventMiddleWareRepository());
        }

        pcmModels.add(this.initialModel.getUsageEvolution());
        pcmModels.add(this.initialModel.getMonitorRepository());

        // load the PCM model into an original initial PCM model partition
        loadIntoBlackboard(PCM_MODELS_ORIGINAL_PARTITION_ID, pcmModels);

        // load the PCM model into the standard partition
        loadIntoBlackboard(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, pcmModels);
    }

    private void loadIntoBlackboard(final String partitionId, final List<EObject> eObjects) {
        final ResourceSetPartition partition = this.getBlackboard().getPartition(partitionId);
        if (LOGGER.isEnabledFor(Level.INFO)) {
            LOGGER.info("Loading models for partition " + partitionId);
        }
        for (final EObject eObject : eObjects) {
            loadIfExisting(partition, eObject);
        }
        partition.resolveAllProxies();
    }

    private static void loadIfExisting(final ResourceSetPartition resourceSetPartition, final EObject eObject) {
        if (eObject != null) {
            resourceSetPartition.loadModel(eObject.eResource().getURI());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "Perform AT PCM Model Load";
    }
}
