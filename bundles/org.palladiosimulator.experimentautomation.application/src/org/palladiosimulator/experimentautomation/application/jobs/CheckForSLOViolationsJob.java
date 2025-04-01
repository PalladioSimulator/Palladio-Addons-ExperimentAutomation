package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.application.tooladapter.RunAnalysisJob;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.palladiosimulator.servicelevelobjective.edp2.core.filters.SLOViolationEDP2DatasourceFilter;
import org.palladiosimulator.servicelevelobjective.edp2.core.filters.SLOViolationEDP2DatasourceFilterConfiguration;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * This jobs checks for SLO violations and calls
 * <code>this.runAnalysisJob.setSloWasViolated()</code> if it was violated at least once. Therefore,
 * such SLO-violating analysis runs are marked.
 * 
 * @author Sebastian Lehrig
 */
public class CheckForSLOViolationsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    /**
     * The job conducting an analysis and providing measurement results to the persistence
     * framework.
     */
    private final RunAnalysisJob runAnalysisJob;

    /** A set of SLOs to be checked for. */
    private final ServiceLevelObjectiveRepository serviceLevelObjectives;

    /** The experiment setting to be investigated for SLO violations. */
    private final ExperimentSetting experimentSetting;

    /**
     * Default constructor.
     * 
     * @param runAnalysisJob
     *            the job conducting an analysis and providing measurement results to the
     *            persistence framework.
     * @param serviceLevelObjectives
     *            a set of SLOs to be checked for.
     * @param edp2datasource
     *            the EDP2 persistence framework providing measurement data.
     * @param experimentGroupPurpose
     *            the unique name of an experiment run; used to identify the experiment group of the
     *            last analysis run.
     * @param experimentSettingDescription
     *            a unique identifier string for the experiment setting description to check SLOs
     *            for.
     */
    public CheckForSLOViolationsJob(final RunAnalysisJob runAnalysisJob,
            final ServiceLevelObjectiveRepository serviceLevelObjectives, final EDP2Datasource edp2datasource,
            final String experimentGroupPurpose, final String experimentSettingDescription) {
        this.runAnalysisJob = runAnalysisJob;
        this.serviceLevelObjectives = serviceLevelObjectives;

        final Repository repository = getEDP2Repository(edp2datasource.getId());
        final ExperimentGroup experimentGroup = getExperimentGroup(repository, experimentGroupPurpose);
        this.experimentSetting = getExperimentSetting(experimentGroup, experimentSettingDescription);
    }

    /**
     * Computes the number of SLO violations and marks <code>this.runAnalysisJob</code> if at least
     * one was detected.
     * 
     * {@inheritDoc}
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

        final long sloViolations = computeSloViolations();

        // TODO We are really intolerant against SLO violations. Instead, we may want that 99,99% of
        // all requests do not violate our SLO. This would require to extend the current SLO
        // metamodel. [Lehrig]
        if (sloViolations > 0) {
            this.runAnalysisJob.setSloWasViolated();
        }
    }

    /**
     * Computes the number of SLO violations.
     * 
     * @return the number of found SLO violations.
     */
    private long computeSloViolations() {
        final int lastExperiment = this.experimentSetting.getExperimentRuns()
            .size() - 1;
        final ExperimentRun experimentRun = this.experimentSetting.getExperimentRuns()
            .get(lastExperiment);

        long sloViolations = 0L;
        for (final ServiceLevelObjective serviceLevelObjective : this.serviceLevelObjectives
            .getServicelevelobjectives()) {
            final Measurement measurement = findMeasurement(experimentRun.getMeasurement(), serviceLevelObjective);
            final RawMeasurements rawMeasurements = measurement.getMeasurementRanges()
                .get(0)
                .getRawMeasurements();

            final Map<String, Object> properties = new HashMap<>(1);
            properties.put(SLOViolationEDP2DatasourceFilterConfiguration.SLO_KEY, serviceLevelObjective);

            final IDataSource dataSource = new Edp2DataTupleDataSource(rawMeasurements);
            final IDataStream<IMeasureProvider> measurements = dataSource.getDataStream();
            final long totalMeasurements = measurements.size();
            measurements.close();

            final SLOViolationEDP2DatasourceFilter sloFilter = new SLOViolationEDP2DatasourceFilter(dataSource);
            sloFilter.setProperties(properties);
            final IDataStream<MeasuringValue> dataStream = sloFilter.getDataStream();

            if (totalMeasurements > 0) {
                final double percentageOfViolations = ((double) dataStream.size()) / ((double) totalMeasurements);
                if (percentageOfViolations > 0.1) {
                    sloViolations++;
                }
            }

            dataStream.close();
        }

        return sloViolations;
    }

    /**
     * Finds the measurements referenced by the SLO in the given measurements lists. For
     * identification, this methods tries to match metric IDs and measuring point names.
     * 
     * @param measurementList
     *            the list of measurements to be investigated for a match.
     * @param serviceLevelObjective
     *            the SLO providing metric and measuring point for matching.
     * @return the found measurements object.
     * @throws RuntimeException
     *             if no measurements object can be found.
     */
    private Measurement findMeasurement(final List<Measurement> measurementList,
            final ServiceLevelObjective serviceLevelObjective) {
        for (final Measurement measurement : measurementList) {
            if (containsMetric(measurement.getMeasuringType()
                .getMetric(),
                    serviceLevelObjective.getMeasurementSpecification()
                        .getMetricDescription())) {
                final String measureMeasuringPoint = measurement.getMeasuringType()
                    .getMeasuringPoint()
                    .getStringRepresentation();
                final String sloMeasuringPoint = serviceLevelObjective.getMeasurementSpecification()
                    .getMonitor()
                    .getMeasuringPoint()
                    .getStringRepresentation();

                // TODO Comparing the name of Measuring points is not the best solution (as the name
                // is generally not unique). I see three options, all requiring some architectural
                // refactoring at several places: (1) Require that every measuring point is an URI
                // measuring point -- then, the URI could be used to uniquely identify the measuring
                // point; (2) just use 1 measuring point for the same entity at a time -- then two
                // equal measuring points objects literally point to the same entity. For the
                // latter, we should attach measuring points directly to PCM elements and make them
                // intrinsic part of such elements; (3) create a MeasuringPointUtility method for
                // generating a measuring points ID based on the type of measuring point; URI
                // measuring points should generate the same ID as dedicated PCM measuring points if
                // they reference the same entity. Options should be discussed if this becomes an
                // important issue. [Lehrig]
                if (measureMeasuringPoint.equals(sloMeasuringPoint)) {
                    return measurement;
                }
            }
        }
        throw new RuntimeException("Measurement for SLO \"" + serviceLevelObjective.getName()
                + "\" not found. MeasurementList has " + measurementList.size() + " elements.");
    }

    private boolean containsMetric(final MetricDescription metric, final MetricDescription metricToCheckFor) {
        if (metric == metricToCheckFor || metric.getId()
            .equals(metricToCheckFor.getId())) {
            return true;
        }

        if (metric instanceof MetricSetDescription) {
            for (final MetricDescription subMetric : ((MetricSetDescription) metric).getSubsumedMetrics()) {
                if (containsMetric(subMetric, metricToCheckFor)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns an experiment group object from the given repository, based on the experiment group
     * purpose member variable.
     * 
     * @param repository
     *            the repository containing the experiment group.
     * @param purpose
     *            the unique name of an experiment run; used to identify the experiment group of the
     *            last analysis run.
     * @return the experiment group of interest.
     */
    private ExperimentGroup getExperimentGroup(final Repository repository, final String purpose) {
        for (final ExperimentGroup experimentGroup : repository.getExperimentGroups()) {
            if (experimentGroup.getPurpose()
                .equals(purpose)) {
                return experimentGroup;
            }
        }

        throw new IllegalArgumentException("Could not find experiment group with purpose \"" + purpose + "\"");
    }

    /**
     * Returns the experiment setting from the given experiment group that is identified by the
     * unique experiment setting description string.
     * 
     * @param experimentGroup
     *            the experiment group to be investigated.
     * @param experimentSettingDescription
     *            the unique experiment setting description identifier.
     * @return the experiment setting whose description matches the given identifier string.
     */
    private ExperimentSetting getExperimentSetting(final ExperimentGroup experimentGroup,
            final String experimentSettingDescription) {
        for (final ExperimentSetting expSetting : experimentGroup.getExperimentSettings()) {
            if (expSetting.getDescription()
                .equals(experimentSettingDescription)) {
                return expSetting;
            }
        }

        throw new IllegalArgumentException(
                "Could not find experiment setting for variation \"" + experimentSettingDescription + "\"");
    }

    /**
     * Returns the EDP2 repository containing measurements from the last analysis run.
     * 
     * @param edp2datasourceID
     *            the EDP2 datasource ID to get measurements from.
     * @return the EDP2 repository.
     */
    private Repository getEDP2Repository(final String edp2datasourceID) {
        final Repository repository = RepositoryManager.getRepositoryFromUUID(edp2datasourceID);

        if (repository == null) {
            throw new RuntimeException("Could not determine datasource type. This should not have happened.");
        }

        try {
            MeasurementsUtility.ensureOpenRepository(repository);
        } catch (final DataNotAccessibleException e) {
            throw new RuntimeException("Could not open EDP2 repository");
        }

        return repository;
    }
}
