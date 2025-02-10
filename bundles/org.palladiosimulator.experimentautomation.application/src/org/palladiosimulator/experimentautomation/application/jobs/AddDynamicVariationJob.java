package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.measure.Measure;
import jakarta.measure.quantity.Dimensionless;
import jakarta.measure.quantity.Duration;
import jakarta.measure.unit.SI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.application.VariationFactorTuple;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.AbstractNestedIntervalsValueProviderStrategy;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.IValueProviderStrategy;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.NestedIntervalsDoubleValueProviderStrategy;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.NestedIntervalsLongValueProviderStrategy;
import org.palladiosimulator.experimentautomation.application.variation.valueprovider.ValueProviderFactory;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.recorderframework.AbstractRecorder;
import org.palladiosimulator.recorderframework.config.AbstractRecorderConfiguration;
import org.palladiosimulator.recorderframework.config.IRecorderConfiguration;
import org.palladiosimulator.recorderframework.config.IRecorderConfigurationFactory;
import org.palladiosimulator.recorderframework.edp2.EDP2RawRecorder;
import org.palladiosimulator.recorderframework.edp2.config.EDP2ReportRecorderConfigurationFactory;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class AddDynamicVariationJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Double EPSILON = 0.00001;

    private static final MeasuringpointFactory MEASURING_POINT_FACTORY = MeasuringpointFactory.eINSTANCE;

    private final IToolAdapter toolAdapter;
    private final Experiment experiment;
    private final AbstractSimulationConfiguration simulationConfiguration;
    private final List<VariationFactorTuple> variationFactorTuples;
    private final int repetition;
    private final Map<VariationFactorTuple, AbstractNestedIntervalsValueProviderStrategy> tuples2nestedIntervals;

    /** Default repository where measuring points are attached to. */
    private static final MeasuringPointRepository MEASURING_POINT_REPOSITORY = MEASURING_POINT_FACTORY
            .createMeasuringPointRepository();

    private RunAnalysisJob runAnalysisJob;

    public AddDynamicVariationJob(final RunAnalysisJob runAnalysisJob, final IToolAdapter toolAdapter,
            final Experiment experiment, final AbstractSimulationConfiguration simulationConfiguration,
            final List<VariationFactorTuple> variationFactorTuples, final int repetition) {
        super(true);

        this.runAnalysisJob = runAnalysisJob;
        this.toolAdapter = toolAdapter;
        this.experiment = experiment;
        this.simulationConfiguration = simulationConfiguration;
        this.variationFactorTuples = variationFactorTuples;
        this.repetition = repetition;

        this.tuples2nestedIntervals = computeNestedIntervalsValueProviders();
    }

    private Map<VariationFactorTuple, AbstractNestedIntervalsValueProviderStrategy> computeNestedIntervalsValueProviders() {
        final Map<VariationFactorTuple, AbstractNestedIntervalsValueProviderStrategy> result;
        result = new HashMap<VariationFactorTuple, AbstractNestedIntervalsValueProviderStrategy>();

        for (final VariationFactorTuple variationFactorTuple : this.variationFactorTuples) {
            try {
                final IValueProviderStrategy<Long> valueProvider = ValueProviderFactory
                        .createLongValueProvider(variationFactorTuple.getVariation().getValueProvider());
                if (valueProvider instanceof NestedIntervalsLongValueProviderStrategy) {
                    final AbstractNestedIntervalsValueProviderStrategy nestedInterval = (NestedIntervalsLongValueProviderStrategy) valueProvider;
                    result.put(variationFactorTuple, nestedInterval);
                }
            } catch (RuntimeException e) {
                final IValueProviderStrategy<Double> valueProvider = ValueProviderFactory
                        .createDoubleValueProvider(variationFactorTuple.getVariation().getValueProvider());
                if (valueProvider instanceof NestedIntervalsDoubleValueProviderStrategy) {
                    final AbstractNestedIntervalsValueProviderStrategy nestedInterval = (NestedIntervalsDoubleValueProviderStrategy) valueProvider;
                    result.put(variationFactorTuple, nestedInterval);
                }
            }
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        if (this.tuples2nestedIntervals.size() > 0) {
            for (final VariationFactorTuple variationFactorTuple : this.tuples2nestedIntervals.keySet()) {
                final AbstractNestedIntervalsValueProviderStrategy nestedInterval = this.tuples2nestedIntervals
                        .get(variationFactorTuple);
                if (this.runAnalysisJob.sloWasViolated()) {
                    if (nestedInterval instanceof NestedIntervalsDoubleValueProviderStrategy) {
                        nestedInterval.setMax((Double) nestedInterval.valueAtPosition(0) - EPSILON);
                    } else if (nestedInterval instanceof NestedIntervalsLongValueProviderStrategy) {
                        nestedInterval.setMax((Long) nestedInterval.valueAtPosition(0) - 1L);
                    } else {
                        throw new RuntimeException("Unknown nested intervals provider strategy");
                    }
                } else {
                    nestedInterval.setMin(nestedInterval.valueAtPosition(0));
                }

                if (nestedInterval.isConverged()) {
                    this.tuples2nestedIntervals.remove(variationFactorTuple);

                    // Config
                    final Map<String, Object> recorderConfigurationMap = runAnalysisJob.getConfiguration();

                    // Measurement
                    final Measure<Double, Duration> pointInTimeMeasure = Measure.valueOf(0d, SI.SECOND);
                    final List<MeasuringValue> result = new ArrayList<MeasuringValue>(2);
                    result.add(new BasicMeasurement<Double, Duration>(pointInTimeMeasure,
                            MetricDescriptionConstants.POINT_IN_TIME_METRIC));

                    MeasuringValue resultMeasurement;
                    if (nestedInterval instanceof NestedIntervalsDoubleValueProviderStrategy) {
                        final Measure<Double, Duration> capacityMeasure = Measure.valueOf(
                                (Double) nestedInterval.valueAtPosition(0), SI.SECOND);
                        result.add(new BasicMeasurement<Double, Duration>(capacityMeasure,
                                MetricDescriptionConstants.INTER_ARRIVAL_TIME_CAPACITY));
                        resultMeasurement = new TupleMeasurement(result,
                                MetricDescriptionConstants.INTER_ARRIVAL_TIME_CAPACITY_TUPLE);
                        recorderConfigurationMap.put(AbstractRecorderConfiguration.RECORDER_ACCEPTED_METRIC,
                                MetricDescriptionConstants.INTER_ARRIVAL_TIME_CAPACITY_TUPLE);
                    } else if (nestedInterval instanceof NestedIntervalsLongValueProviderStrategy) {
                        final Measure<Long, Dimensionless> capacityMeasure = Measure.valueOf(
                                (Long) nestedInterval.valueAtPosition(0), Dimensionless.UNIT);
                        result.add(new BasicMeasurement<Long, Dimensionless>(capacityMeasure,
                                MetricDescriptionConstants.USER_CAPACITY));
                        resultMeasurement = new TupleMeasurement(result, MetricDescriptionConstants.USER_CAPACITY_TUPLE);
                        recorderConfigurationMap.put(AbstractRecorderConfiguration.RECORDER_ACCEPTED_METRIC,
                                MetricDescriptionConstants.USER_CAPACITY_TUPLE);
                    } else {
                        throw new RuntimeException("Unknown nested intervals provider strategy");
                    }

                    // FIXME Create a dedicated measuring point for capacity (maybe a combination of
                    // allocation and usage scenario? System alone is surely insufficient as we
                    // measure capacity for a concrete usage scenario and allocation...)

                    // Measuring Point
                    final StringMeasuringPoint capacityMeasuringPoint = MEASURING_POINT_FACTORY
                            .createStringMeasuringPoint();
                    capacityMeasuringPoint.setMeasuringPoint("System Capacity");
                    MEASURING_POINT_REPOSITORY.getMeasuringPoints().add(capacityMeasuringPoint);
                    capacityMeasuringPoint.setMeasuringPointRepository(MEASURING_POINT_REPOSITORY);

                    recorderConfigurationMap.put(AbstractRecorderConfiguration.MEASURING_POINT, capacityMeasuringPoint);

                    // AbstractRecorder
                    final IRecorderConfigurationFactory edp2ConfigFactory = new EDP2ReportRecorderConfigurationFactory();
                    edp2ConfigFactory.initialize(recorderConfigurationMap);
                    final IRecorderConfiguration recorderConfiguration = edp2ConfigFactory
                            .createRecorderConfiguration(recorderConfigurationMap);
                    final AbstractRecorder reportRecorder = new EDP2RawRecorder();

                    // Write data
                    reportRecorder.initialize(recorderConfiguration);
                    reportRecorder.writeData(resultMeasurement);
                    reportRecorder.flush();

                    // Finish
                    edp2ConfigFactory.finalizeRecorderConfigurationFactory();
                } else {
                    variationFactorTuple.setFactor(nestedInterval.valueAtPosition(0));
                }
            }

            if (this.tuples2nestedIntervals.size() > 0) {
                final IBlackboardInteractingJob<MDSDBlackboard> varyJob = new VaryJob(this.variationFactorTuples);
                varyJob.setBlackboard(this.getBlackboard());
                varyJob.execute(monitor);

                this.runAnalysisJob = this.toolAdapter.createRunAnalysisJob(this.experiment,
                        this.simulationConfiguration, this.variationFactorTuples, this.repetition);
                this.runAnalysisJob.setBlackboard(this.getBlackboard());
                this.runAnalysisJob.execute(monitor);

                this.execute(monitor);
            }
        }
    }
}
