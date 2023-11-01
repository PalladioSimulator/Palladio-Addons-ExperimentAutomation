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
 * @generated
 */
public class ExperimentsFactoryImpl extends EFactoryImpl implements ExperimentsFactory {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ExperimentsFactory init() {
		try {
			ExperimentsFactory theExperimentsFactory = (ExperimentsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExperimentsPackage.eNS_URI);
			if (theExperimentsFactory != null) {
				return theExperimentsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExperimentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExperimentsPackage.EXPERIMENT_REPOSITORY:
			return createExperimentRepository();
		case ExperimentsPackage.EXPERIMENT:
			return createExperiment();
		case ExperimentsPackage.VARIATION:
			return createVariation();
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER:
			return createPolynomialValueProvider();
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER:
			return createExponentialValueProvider();
		case ExperimentsPackage.SET_VALUE_PROVIDER:
			return createSetValueProvider();
		case ExperimentsPackage.PLACKET_BURMAN_DESIGN:
			return createPlacketBurmanDesign();
		case ExperimentsPackage.FULL_FACTORIAL_DESIGN:
			return createFullFactorialDesign();
		case ExperimentsPackage.FRACTIONAL_FACTORIAL_DESIGN:
			return createFractionalFactorialDesign();
		case ExperimentsPackage.ONE_FACTOR_AT_ATIME:
			return createOneFactorAtATime();
		case ExperimentsPackage.SIMULATION_DURATION_MEASUREMENT:
			return createSimulationDurationMeasurement();
		case ExperimentsPackage.PROFILING_MEASUREMENT:
			return createProfilingMeasurement();
		case ExperimentsPackage.JMX_MEASUREMENT:
			return createJMXMeasurement();
		case ExperimentsPackage.LINEAR_VALUE_PROVIDER:
			return createLinearValueProvider();
		case ExperimentsPackage.OBJECT_MODIFICATION:
			return createObjectModification();
		case ExperimentsPackage.INITIAL_MODEL:
			return createInitialModel();
		case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER:
			return createReconfigurationRulesFolder();
		case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER:
			return createNestedIntervalsDoubleValueProvider();
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER:
			return createNestedIntervalsLongValueProvider();
		case ExperimentsPackage.SCHEDULING_POLICY2_DELAY_MODIFICATION:
			return createSchedulingPolicy2DelayModification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentRepository createExperimentRepository() {
		ExperimentRepositoryImpl experimentRepository = new ExperimentRepositoryImpl();
		return experimentRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variation createVariation() {
		VariationImpl variation = new VariationImpl();
		return variation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolynomialValueProvider createPolynomialValueProvider() {
		PolynomialValueProviderImpl polynomialValueProvider = new PolynomialValueProviderImpl();
		return polynomialValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialValueProvider createExponentialValueProvider() {
		ExponentialValueProviderImpl exponentialValueProvider = new ExponentialValueProviderImpl();
		return exponentialValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetValueProvider createSetValueProvider() {
		SetValueProviderImpl setValueProvider = new SetValueProviderImpl();
		return setValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacketBurmanDesign createPlacketBurmanDesign() {
		PlacketBurmanDesignImpl placketBurmanDesign = new PlacketBurmanDesignImpl();
		return placketBurmanDesign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullFactorialDesign createFullFactorialDesign() {
		FullFactorialDesignImpl fullFactorialDesign = new FullFactorialDesignImpl();
		return fullFactorialDesign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FractionalFactorialDesign createFractionalFactorialDesign() {
		FractionalFactorialDesignImpl fractionalFactorialDesign = new FractionalFactorialDesignImpl();
		return fractionalFactorialDesign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneFactorAtATime createOneFactorAtATime() {
		OneFactorAtATimeImpl oneFactorAtATime = new OneFactorAtATimeImpl();
		return oneFactorAtATime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulationDurationMeasurement createSimulationDurationMeasurement() {
		SimulationDurationMeasurementImpl simulationDurationMeasurement = new SimulationDurationMeasurementImpl();
		return simulationDurationMeasurement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfilingMeasurement createProfilingMeasurement() {
		ProfilingMeasurementImpl profilingMeasurement = new ProfilingMeasurementImpl();
		return profilingMeasurement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JMXMeasurement createJMXMeasurement() {
		JMXMeasurementImpl jmxMeasurement = new JMXMeasurementImpl();
		return jmxMeasurement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearValueProvider createLinearValueProvider() {
		LinearValueProviderImpl linearValueProvider = new LinearValueProviderImpl();
		return linearValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectModification createObjectModification() {
		ObjectModificationImpl objectModification = new ObjectModificationImpl();
		return objectModification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialModel createInitialModel() {
		InitialModelImpl initialModel = new InitialModelImpl();
		return initialModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigurationRulesFolder createReconfigurationRulesFolder() {
		ReconfigurationRulesFolderImpl reconfigurationRulesFolder = new ReconfigurationRulesFolderImpl();
		return reconfigurationRulesFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedIntervalsDoubleValueProvider createNestedIntervalsDoubleValueProvider() {
		NestedIntervalsDoubleValueProviderImpl nestedIntervalsDoubleValueProvider = new NestedIntervalsDoubleValueProviderImpl();
		return nestedIntervalsDoubleValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedIntervalsLongValueProvider createNestedIntervalsLongValueProvider() {
		NestedIntervalsLongValueProviderImpl nestedIntervalsLongValueProvider = new NestedIntervalsLongValueProviderImpl();
		return nestedIntervalsLongValueProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingPolicy2DelayModification createSchedulingPolicy2DelayModification() {
		SchedulingPolicy2DelayModificationImpl schedulingPolicy2DelayModification = new SchedulingPolicy2DelayModificationImpl();
		return schedulingPolicy2DelayModification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentsPackage getExperimentsPackage() {
		return (ExperimentsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExperimentsPackage getPackage() {
		return ExperimentsPackage.eINSTANCE;
	}

} // ExperimentsFactoryImpl
