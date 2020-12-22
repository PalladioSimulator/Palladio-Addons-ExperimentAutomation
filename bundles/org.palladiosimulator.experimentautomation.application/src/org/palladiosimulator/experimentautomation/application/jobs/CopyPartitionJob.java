package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.commons.emfutils.EMFCopyHelper;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Copies the contents of a given partition to another blackboard partition.
 * 
 * @author Matthias Becker, Sebastian Lehrig
 */
public class CopyPartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(CopyPartitionJob.class);

    private final String sourcePartition;
    private final String targetPartition;

    public CopyPartitionJob(final String sourcePartition, final String targetPartition) {
        super(false);

        this.sourcePartition = sourcePartition;
        this.targetPartition = targetPartition;
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        LOGGER.info("Copy resource set from " + this.sourcePartition + " to " + this.targetPartition);
        this.getBlackboard().removePartition(this.targetPartition);

        final PCMResourceSetPartition newPartition = new PCMResourceSetPartition();
        final ResourceSetPartition orginalPCMModelPartition = this.getBlackboard().getPartition(this.sourcePartition);
        final List<EObject> modelCopy = EMFCopyHelper.deepCopyToEObjectList(orginalPCMModelPartition.getResourceSet());
        for (int i = 0; i < modelCopy.size(); i++) {
            final Resource resource = newPartition.getResourceSet().createResource(URI.createFileURI("/temp" + i));
            resource.getContents().add(modelCopy.get(i));
        }

        this.getBlackboard().addPartition(this.targetPartition, newPartition);

    }
    


    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "Clone Partition Contents";
    }
}
