package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.utils.EcoreHelper;
import org.palladiosimulator.experimentautomation.application.variation.IVariationStrategy;
import org.palladiosimulator.experimentautomation.application.variation.VariationStrategyFactory;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * This job varies the PCM models located in the MDSDBlackboard according to the given variations
 * and factor levels.
 * 
 * @author Sebastian Lehrig
 */
public class VaryJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private final List<VariationFactorTuple> variationFactorTuples;

    /**
     * Default Constructor.
     * 
     * @param variationFactorTuples
     *            the variations and according value factors.
     */
    public VaryJob(final List<VariationFactorTuple> variationFactorTuples) {
        super(false);

        this.variationFactorTuples = variationFactorTuples;
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        // modify the copied PCM model according to the variation descriptions; one by one
        for (final VariationFactorTuple variationAndFactor : variationFactorTuples) {
            this.executeVariation(variationAndFactor);
        }
    }

    private void executeVariation(final VariationFactorTuple variationAndFactor) {
        final ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(
                LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        final EObject variedObject = EcoreHelper.findModelElementById(pcmPartition.getResourceSet(), variationAndFactor
                .getVariation().getVariedObjectId());

        if (variedObject == null) {
            throw new RuntimeException("Unable to find model element with ID "
                    + variationAndFactor.getVariation().getVariedObjectId() + " in resource set");
        }

        final IVariationStrategy variationStrategy = VariationStrategyFactory.createStrategy(variationAndFactor
                .getVariation().getType());
        variationStrategy.setVariedObject(variedObject);
        variationStrategy.vary(variationAndFactor.getFactor());
    }
}
