package org.palladiosimulator.experimentautomation.application.jobs;

import java.io.File;
import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.edp2.batchexport.BatchExporter;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.repository.local.LocalDirectoryRepositoryHelper;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimuLizarConfigurationImpl;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.IValueProviderStrategy;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.ValueProviderFactory;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.palladiosimulator.experimentautomation.experiments.util.ExperimentsSwitch;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * This job computes all variation variants that should be executed in an experiment run.
 * Furthermore, it adds vary and run experiment jobs for each considered variant.
 * 
 * @author Sebastian Lehrig
 */
public class ComputeVariantsAndAddExperimentJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    /**
     * Default Constructor.
     * 
     * @param experiment
     *            the experiment to be conducted.
     * @param simulationConfiguration
     *            the given analysis tool, e.g., SimuCom.
     */
    public ComputeVariantsAndAddExperimentJob(final Experiment experiment,
            final AbstractSimulationConfiguration simulationConfiguration) {
        super(false);

        // Note: Calling recursive method
        this.computeVariantsAndAddJob(experiment, simulationConfiguration, experiment.getVariations(),
                new ArrayList<VariationFactorTuple>());
    }

    /**
     * TODO There should really be an explanation here describing variations vs. variants! I guess,
     * Philipp has some clue? [Lehrig]
     * 
     * Recursive call, each time reducing variations by 1. Initially, variants and
     * currentFactorLevels are empty. Seems to be something statistical done here like trying out
     * each pair-wise combination... Related to
     * http://en.wikipedia.org/wiki/Fractional_factorial_design ?
     * 
     * @param experiment
     *            the experiment to be conducted.
     * @param simulationConfiguration
     *            the given analysis tool, e.g., SimuCom.
     * @param variations
     *            the given variations to be considered.
     * @param variationFactorTuples
     *            the variants of the given variations as well as the concrete values to be used for
     *            a given variation.
     */
    private void computeVariantsAndAddJob(final Experiment experiment,
            final AbstractSimulationConfiguration simulationConfiguration, final List<Variation> variations,
            final List<VariationFactorTuple> variationFactorTuples) {
        if (variations.isEmpty()) {
            final List<VariationFactorTuple> variationsAndFactorsCopy = new ArrayList<VariationFactorTuple>();
            variationsAndFactorsCopy.addAll(variationFactorTuples);

            this.add(new VaryJob(variationsAndFactorsCopy));
            this.add(new RepeatExperimentJob(experiment, simulationConfiguration, variationsAndFactorsCopy));
        } else {
            // obtain variation description
            final List<Variation> copy = new ArrayList<Variation>();
            copy.addAll(variations);
            final Variation variation = copy.remove(0);

            new ExperimentsSwitch<Void>() {
            	@Override
            	public Void caseLinearValueProvider(org.palladiosimulator.experimentautomation.experiments.LinearValueProvider object) {
            		final IValueProviderStrategy<Double> valueProvider = ValueProviderFactory
                            .createDoubleValueProvider(object);
            		
            		for (long i = (long) variation.getMinValue(); i < (long) variation.getMaxValue(); i++) {
            			VariationFactorTuple variationFactorTuple = new VariationFactorTuple<Long>(variation, i);
            			List<VariationFactorTuple> singletonList = Collections.singletonList(variationFactorTuple);
						ComputeVariantsAndAddExperimentJob.this.add(new VaryJob(singletonList));
						ComputeVariantsAndAddExperimentJob.this.add(new RepeatExperimentJob(experiment, simulationConfiguration, singletonList));
            		}
            		
            		ComputeVariantsAndAddExperimentJob.this.add(new IJob() {
						
						@Override
						public String getName() {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
							SimuLizarConfigurationImpl sci = ((SimuLizarConfigurationImpl) experiment.getToolConfiguration().get(0));
							FileDatasource o = (FileDatasource) sci.getDatasource();
							Repository repository = RepositoryManager.getRepositoryFromUUID(sci.getDatasource().getId());
							String edp2target = System.getProperty("edp2target");
							BatchExporter.batchExport(repository, edp2target);
						}
						
						@Override
						public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
							// TODO Auto-generated method stub
							
						}
					});
            		
            		return null;
            	};

                @Override
                public Void caseNestedIntervalsLongValueProvider(
                        org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider object) {
                    // obtain long value provider
                    final IValueProviderStrategy<Long> valueProvider = ValueProviderFactory
                            .createLongValueProvider(object);

                    long factorLevel = 0;
                    int iteration = 0;
                    while (factorLevel <= (long) variation.getMaxValue() && iteration < variation.getMaxVariations()) {
                        factorLevel = valueProvider.valueAtPosition(iteration);
                        if (factorLevel == -1) {
                            break;
                        }

                        if (factorLevel >= (long) variation.getMinValue()
                                && factorLevel <= (long) variation.getMaxValue()) {
                            variationFactorTuples.add(new VariationFactorTuple<Long>(variation, factorLevel));
                            ComputeVariantsAndAddExperimentJob.this.computeVariantsAndAddJob(experiment,
                                    simulationConfiguration, copy, variationFactorTuples);
                            variationFactorTuples.remove(variationFactorTuples.size() - 1);
                        }

                        iteration++;
                    }
                    return null;
                };

                @Override
                public Void caseNestedIntervalsDoubleValueProvider(
                        org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider object) {
                    // obtain double value provider
                    final IValueProviderStrategy<Double> valueProvider = ValueProviderFactory
                            .createDoubleValueProvider(object);

                    Double factorLevel = 0.0;
                    int iteration = 0;
                    while (factorLevel <= variation.getMaxValue() && iteration < variation.getMaxVariations()) {
                        factorLevel = valueProvider.valueAtPosition(iteration);
                        if (factorLevel == -1.0) {
                            break;
                        }

                        if (factorLevel >= variation.getMinValue() && factorLevel <= variation.getMaxValue()) {
                            variationFactorTuples.add(new VariationFactorTuple<Double>(variation, factorLevel));
                            ComputeVariantsAndAddExperimentJob.this.computeVariantsAndAddJob(experiment,
                                    simulationConfiguration, copy, variationFactorTuples);
                            variationFactorTuples.remove(variationFactorTuples.size() - 1);
                        }

                        iteration++;
                    }
                    return null;
                };

            }.doSwitch(variation.getValueProvider());
        }
    }
}
