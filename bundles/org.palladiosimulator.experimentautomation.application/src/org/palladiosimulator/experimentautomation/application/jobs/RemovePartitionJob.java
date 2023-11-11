/**
 * 
 */
package org.palladiosimulator.experimentautomation.application.jobs;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * @author florimentklinaku
 *
 */
public class RemovePartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {
	
    private static final Logger LOGGER = Logger.getLogger(RemovePartitionJob.class);
	private String targetPartition;


	public RemovePartitionJob(String defaultPcmInstancePartitionId) {
		super(false);
		this.targetPartition = defaultPcmInstancePartitionId;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		 LOGGER.info("Remove partition from the blackboard" + targetPartition);
	     this.getBlackboard().removePartition(this.targetPartition);
	     

	     final PCMResourceSetPartition newPartition = new PCMResourceSetPartition();
	    
	     this.getBlackboard().addPartition(this.targetPartition, newPartition);
		
	}
	
	/**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "Remove Partition Contents";
    }
	
	

}
