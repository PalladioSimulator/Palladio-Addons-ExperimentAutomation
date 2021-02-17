/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.JMXMeasurement;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;
import org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime;
import org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement;
import org.palladiosimulator.experimentautomation.experiments.Variation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ExperimentsFactoryImpl extends EFactoryImpl implements ExperimentsFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ExperimentsFactory init() {
        try {
            final ExperimentsFactory theExperimentsFactory = (ExperimentsFactory) EPackage.Registry.INSTANCE
                .getEFactory(ExperimentsPackage.eNS_URI);
            if (theExperimentsFactory != null) {
                return theExperimentsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExperimentsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ExperimentsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ExperimentsPackage.EXPERIMENT_REPOSITORY:
            return this.createExperimentRepository();
        case ExperimentsPackage.EXPERIMENT:
            return this.createExperiment();
        case ExperimentsPackage.VARIATION:
            return this.createVariation();
        case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER:
            return this.createPolynomialValueProvider();
        case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER:
            return this.createExponentialValueProvider();
        case ExperimentsPackage.SET_VALUE_PROVIDER:
            return this.createSetValueProvider();
        case ExperimentsPackage.PLACKET_BURMAN_DESIGN:
            return this.createPlacketBurmanDesign();
        case ExperimentsPackage.FULL_FACTORIAL_DESIGN:
            return this.createFullFactorialDesign();
        case ExperimentsPackage.FRACTIONAL_FACTORIAL_DESIGN:
            return this.createFractionalFactorialDesign();
        case ExperimentsPackage.ONE_FACTOR_AT_ATIME:
            return this.createOneFactorAtATime();
        case ExperimentsPackage.SIMULATION_DURATION_MEASUREMENT:
            return this.createSimulationDurationMeasurement();
        case ExperimentsPackage.PROFILING_MEASUREMENT:
            return this.createProfilingMeasurement();
        case ExperimentsPackage.JMX_MEASUREMENT:
            return this.createJMXMeasurement();
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER:
            return this.createLinearValueProvider();
        case ExperimentsPackage.OBJECT_MODIFICATION:
            return this.createObjectModification();
        case ExperimentsPackage.INITIAL_MODEL:
            return this.createInitialModel();
        case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER:
            return this.createReconfigurationRulesFolder();
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER:
            return this.createNestedIntervalsDoubleValueProvider();
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER:
            return this.createNestedIntervalsLongValueProvider();
        case ExperimentsPackage.SCHEDULING_POLICY2_DELAY_MODIFICATION:
            return this.createSchedulingPolicy2DelayModification();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentRepository createExperimentRepository() {
        final ExperimentRepositoryImpl experimentRepository = new ExperimentRepositoryImpl();
        return experimentRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Experiment createExperiment() {
        final ExperimentImpl experiment = new ExperimentImpl();
        return experiment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Variation createVariation() {
        final VariationImpl variation = new VariationImpl();
        return variation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PolynomialValueProvider createPolynomialValueProvider() {
        final PolynomialValueProviderImpl polynomialValueProvider = new PolynomialValueProviderImpl();
        return polynomialValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExponentialValueProvider createExponentialValueProvider() {
        final ExponentialValueProviderImpl exponentialValueProvider = new ExponentialValueProviderImpl();
        return exponentialValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SetValueProvider createSetValueProvider() {
        final SetValueProviderImpl setValueProvider = new SetValueProviderImpl();
        return setValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PlacketBurmanDesign createPlacketBurmanDesign() {
        final PlacketBurmanDesignImpl placketBurmanDesign = new PlacketBurmanDesignImpl();
        return placketBurmanDesign;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FullFactorialDesign createFullFactorialDesign() {
        final FullFactorialDesignImpl fullFactorialDesign = new FullFactorialDesignImpl();
        return fullFactorialDesign;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FractionalFactorialDesign createFractionalFactorialDesign() {
        final FractionalFactorialDesignImpl fractionalFactorialDesign = new FractionalFactorialDesignImpl();
        return fractionalFactorialDesign;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OneFactorAtATime createOneFactorAtATime() {
        final OneFactorAtATimeImpl oneFactorAtATime = new OneFactorAtATimeImpl();
        return oneFactorAtATime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimulationDurationMeasurement createSimulationDurationMeasurement() {
        final SimulationDurationMeasurementImpl simulationDurationMeasurement = new SimulationDurationMeasurementImpl();
        return simulationDurationMeasurement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProfilingMeasurement createProfilingMeasurement() {
        final ProfilingMeasurementImpl profilingMeasurement = new ProfilingMeasurementImpl();
        return profilingMeasurement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public JMXMeasurement createJMXMeasurement() {
        final JMXMeasurementImpl jmxMeasurement = new JMXMeasurementImpl();
        return jmxMeasurement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LinearValueProvider createLinearValueProvider() {
        final LinearValueProviderImpl linearValueProvider = new LinearValueProviderImpl();
        return linearValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ObjectModification createObjectModification() {
        final ObjectModificationImpl objectModification = new ObjectModificationImpl();
        return objectModification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InitialModel createInitialModel() {
        final InitialModelImpl initialModel = new InitialModelImpl();
        return initialModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReconfigurationRulesFolder createReconfigurationRulesFolder() {
        final ReconfigurationRulesFolderImpl reconfigurationRulesFolder = new ReconfigurationRulesFolderImpl();
        return reconfigurationRulesFolder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NestedIntervalsDoubleValueProvider createNestedIntervalsDoubleValueProvider() {
        final NestedIntervalsDoubleValueProviderImpl nestedIntervalsDoubleValueProvider = new NestedIntervalsDoubleValueProviderImpl();
        return nestedIntervalsDoubleValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NestedIntervalsLongValueProvider createNestedIntervalsLongValueProvider() {
        final NestedIntervalsLongValueProviderImpl nestedIntervalsLongValueProvider = new NestedIntervalsLongValueProviderImpl();
        return nestedIntervalsLongValueProvider;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SchedulingPolicy2DelayModification createSchedulingPolicy2DelayModification() {
        final SchedulingPolicy2DelayModificationImpl schedulingPolicy2DelayModification = new SchedulingPolicy2DelayModificationImpl();
        return schedulingPolicy2DelayModification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentsPackage getExperimentsPackage() {
        return (ExperimentsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExperimentsPackage getPackage() {
        return ExperimentsPackage.eINSTANCE;
    }

} // ExperimentsFactoryImpl
