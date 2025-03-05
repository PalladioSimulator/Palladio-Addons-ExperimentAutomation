package org.palladiosimulator.experimentautomation.application.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.application.utils.EcoreHelper;
import org.palladiosimulator.experimentautomation.application.variation.IVariationStrategy;
import org.palladiosimulator.experimentautomation.application.variation.VariationStrategyFactory;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class ObjectModificationJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private final ObjectModification objectModification;

    /**
     * Default Constructor.
     * 
     * @param objectModification
     *            the object modification to be applied.
     */
    public ObjectModificationJob(final ObjectModification objectModification) {
        super(false);

        this.objectModification = objectModification;
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(
                LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        final EObject modifiedObject = EcoreHelper.findModelElementById(pcmPartition.getResourceSet(),
                this.objectModification.getVariedObjectId());

        if (modifiedObject == null) {
            throw new RuntimeException("Unable to find model element with ID "
                    + this.objectModification.getVariedObjectId() + " in resource set");
        }

        if (this.objectModification.getType() == null) {
            final EStructuralFeature eStructuralFeature = modifiedObject.eClass().getEStructuralFeature(
                    this.objectModification.getName());
            modifiedObject.eSet(eStructuralFeature, this.objectModification.getValue());
        } else {
            final IVariationStrategy variationStrategy = VariationStrategyFactory
                    .createStrategy(this.objectModification.getType());
            variationStrategy.setVariedObject(modifiedObject);
            variationStrategy.vary(this.objectModification.getValue());
        }
    }

}
