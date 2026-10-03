package org.palladiosimulator.experimentautomation.application.jobs;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Removes a blackboard partition and replaces it with an empty
 * {@link PCMResourceSetPartition} so subsequent loads start clean.
 */
public class RemovePartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(RemovePartitionJob.class);

    private final String targetPartition;

    public RemovePartitionJob(final String partitionId) {
        super(false);
        this.targetPartition = partitionId;
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        LOGGER.info("Remove partition from the blackboard: " + targetPartition);
        this.getBlackboard().removePartition(this.targetPartition);
        this.getBlackboard().addPartition(this.targetPartition, new PCMResourceSetPartition());
    }

    @Override
    public String getName() {
        return "Remove Partition Contents";
    }
}
