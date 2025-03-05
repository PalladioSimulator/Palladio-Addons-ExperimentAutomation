package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.blackboard.Blackboard;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvto.QVTOTransformationJob;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvto.QVTOTransformationJobConfiguration;

/**
 * Workflow job to transform all scheduling policies to Delay.
 * 
 * @author Sebastian Lehrig
 */
public class SchedulingPolicy2DelayModificationJob extends AbstractWorkflowExtensionJob<Blackboard<?>> {

    /** Path to the qvto transformation script */
    private static final String TRANSFORMATION_SCRIPT = "platform:/plugin/org.palladiosimulator.experimentautomation.application/transformations/SchedulingPolicy2Delay.qvto";

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

        // get the models to work with
        final ModelLocation[] modelLocations = getRequiredModels();
        if (modelLocations == null && logger.isEnabledFor(Level.ERROR)) {
            throw new RuntimeException("Failed to load models from blackboard");
        }

        // build file paths for trace and transformation files
        final URI scriptFileURI = URI.createURI(TRANSFORMATION_SCRIPT);

        // configure the QVTO Job
        final QVTOTransformationJobConfiguration qvtoConfig = new QVTOTransformationJobConfiguration();
        qvtoConfig.setInoutModels(modelLocations);
        qvtoConfig.setScriptFileURI(scriptFileURI);
        qvtoConfig.setOptions(new HashMap<String, Object>());

        // create and add the qvto job
        final QVTOTransformationJob job = new QVTOTransformationJob(qvtoConfig);
        job.setBlackboard((MDSDBlackboard) getBlackboard());

        // execute transformation job
        try {
            job.execute(new NullProgressMonitor());
        } catch (JobFailedException e) {
            if (logger.isEnabledFor(Level.ERROR)) {
                logger.error("Failed to perform SchedulingPolicy2Delay Transformation: " + e.getMessage());
            }
            if (logger.isEnabledFor(Level.INFO)) {
                logger.info("Trying to continue SchedulingPolicy2Delay processing even though an internal failure occured");
            }
        }

        // save the modified model
        /*
         * final SavePartitionToDiskJob savePartitionJob = new SavePartitionToDiskJob(
         * LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
         * savePartitionJob.setBlackboard((MDSDBlackboard) getMyBlackboard());
         * savePartitionJob.execute(monitor);
         */
    }

    /**
     * Builds the location objects out of the blackboards PCM model partition.
     * 
     * @return The prepared model locations for the PCM models.
     */
    private ModelLocation[] getRequiredModels() {
        // prepare the models required for the transformation
        ModelLocation allocationModelLocation = null;
        ModelLocation systemModelLocation = null;
        ModelLocation repositoryModelLocation = null;
        ModelLocation palladioResourcetypesModelLocation = null;

        // find the models in the blackboard
        final String pcmModelPartitionId = LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID;
        final ResourceSetPartition partition = ((MDSDBlackboard) this.getBlackboard())
                .getPartition(pcmModelPartitionId);
        partition.resolveAllProxies();
        for (Resource r : partition.getResourceSet().getResources()) {
            final URI modelURI = r.getURI();
            final String fileExtension = modelURI.fileExtension();

            if (fileExtension.equals("allocation")) {
                allocationModelLocation = new ModelLocation(pcmModelPartitionId, modelURI);
            }

            if (fileExtension.equals("system")) {
                systemModelLocation = new ModelLocation(pcmModelPartitionId, modelURI);
            }

            if (fileExtension.equals("repository") && repositoryModelLocation == null
                    && !modelURI.toString().startsWith("pathmap://")
                    && !modelURI.toString().contains("PrimitiveTypes.repository")) {
                repositoryModelLocation = new ModelLocation(pcmModelPartitionId, modelURI);
            }

            if (fileExtension.equals("resourcetype")) {
                palladioResourcetypesModelLocation = new ModelLocation(pcmModelPartitionId, modelURI);
            }
        }

        // Build the model location list
        ArrayList<ModelLocation> modelLocations = new ArrayList<ModelLocation>();
        modelLocations.add(allocationModelLocation);
        modelLocations.add(systemModelLocation);
        modelLocations.add(repositoryModelLocation);
        modelLocations.add(palladioResourcetypesModelLocation);

        return modelLocations.toArray(new ModelLocation[] {});
    }

    @Override
    public String getName() {
        return "Add SchedulingPolicy2Delay transformation job";
    }

}
