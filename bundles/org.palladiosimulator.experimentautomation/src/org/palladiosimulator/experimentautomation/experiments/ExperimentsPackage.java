/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentsPackage extends EPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "experiments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ExperimentAutomation/Experiments/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExperimentAutomation.Experiments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentsPackage eINSTANCE = org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentRepositoryImpl <em>Experiment Repository</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentRepositoryImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperimentRepository()
	 * @generated
	 */
	int EXPERIMENT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_REPOSITORY__EXPERIMENTS = 0;

	/**
	 * The number of structural features of the '<em>Experiment Repository</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 1;

	/**
	 * The feature id for the '<em><b>Variations</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__VARIATIONS = 0;

	/**
	 * The feature id for the '<em><b>Modifications</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__MODIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Tool Configuration</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__TOOL_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Stop Conditions</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__STOP_CONDITIONS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Experiment Design</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__EXPERIMENT_DESIGN = 7;

	/**
	 * The feature id for the '<em><b>Response Measurement</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__RESPONSE_MEASUREMENT = 8;

	/**
	 * The feature id for the '<em><b>Initial Model</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__INITIAL_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__REPETITIONS = 10;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl <em>Variation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getVariation()
	 * @generated
	 */
	int VARIATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value Provider</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VARIATION__VALUE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__MIN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__MAX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Max Variations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__MAX_VARIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Varied Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__VARIED_OBJECT_ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__NAME = 6;

	/**
	 * The number of structural features of the '<em>Variation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ValueProviderImpl <em>Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getValueProvider()
	 * @generated
	 */
	int VALUE_PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Value Provider</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl <em>Tool Configuration</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getToolConfiguration()
	 * @generated
	 */
	int TOOL_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONFIGURATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool Configuration</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TOOL_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentDesignImpl <em>Experiment Design</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentDesignImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperimentDesign()
	 * @generated
	 */
	int EXPERIMENT_DESIGN = 5;

	/**
	 * The number of structural features of the '<em>Experiment Design</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESIGN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ResponseMeasurementImpl <em>Response Measurement</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ResponseMeasurementImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getResponseMeasurement()
	 * @generated
	 */
	int RESPONSE_MEASUREMENT = 6;

	/**
	 * The number of structural features of the '<em>Response Measurement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MEASUREMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl <em>Polynomial Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getPolynomialValueProvider()
	 * @generated
	 */
	int POLYNOMIAL_VALUE_PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_VALUE_PROVIDER__EXPONENT = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_VALUE_PROVIDER__FACTOR = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polynomial Value Provider</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExponentialValueProviderImpl <em>Exponential Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExponentialValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExponentialValueProvider()
	 * @generated
	 */
	int EXPONENTIAL_VALUE_PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_VALUE_PROVIDER__BASE = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Value Provider</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.SetValueProviderImpl <em>Set Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.SetValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSetValueProvider()
	 * @generated
	 */
	int SET_VALUE_PROVIDER = 9;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_PROVIDER__VALUES = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Value Provider</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.PlacketBurmanDesignImpl <em>Placket Burman Design</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.PlacketBurmanDesignImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getPlacketBurmanDesign()
	 * @generated
	 */
	int PLACKET_BURMAN_DESIGN = 10;

	/**
	 * The number of structural features of the '<em>Placket Burman Design</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PLACKET_BURMAN_DESIGN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.FullFactorialDesignImpl <em>Full Factorial Design</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.FullFactorialDesignImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getFullFactorialDesign()
	 * @generated
	 */
	int FULL_FACTORIAL_DESIGN = 11;

	/**
	 * The number of structural features of the '<em>Full Factorial Design</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FULL_FACTORIAL_DESIGN_FEATURE_COUNT = EXPERIMENT_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.FractionalFactorialDesignImpl <em>Fractional Factorial Design</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.FractionalFactorialDesignImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getFractionalFactorialDesign()
	 * @generated
	 */
	int FRACTIONAL_FACTORIAL_DESIGN = 12;

	/**
	 * The number of structural features of the '<em>Fractional Factorial Design</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FRACTIONAL_FACTORIAL_DESIGN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.OneFactorAtATimeImpl <em>One Factor At ATime</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.OneFactorAtATimeImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getOneFactorAtATime()
	 * @generated
	 */
	int ONE_FACTOR_AT_ATIME = 13;

	/**
	 * The number of structural features of the '<em>One Factor At ATime</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ONE_FACTOR_AT_ATIME_FEATURE_COUNT = EXPERIMENT_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.palladiosimulator.experimentautomation.experiments.impl.SimulationDurationMeasurementImpl
	 * <em>Simulation Duration Measurement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.SimulationDurationMeasurementImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSimulationDurationMeasurement()
	 * @generated
	 */
	int SIMULATION_DURATION_MEASUREMENT = 14;

	/**
	 * The number of structural features of the '<em>Simulation Duration Measurement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_DURATION_MEASUREMENT_FEATURE_COUNT = RESPONSE_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ProfilingMeasurementImpl <em>Profiling Measurement</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ProfilingMeasurementImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getProfilingMeasurement()
	 * @generated
	 */
	int PROFILING_MEASUREMENT = 15;

	/**
	 * The number of structural features of the '<em>Profiling Measurement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILING_MEASUREMENT_FEATURE_COUNT = RESPONSE_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.JMXMeasurementImpl <em>JMX Measurement</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.JMXMeasurementImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getJMXMeasurement()
	 * @generated
	 */
	int JMX_MEASUREMENT = 16;

	/**
	 * The feature id for the '<em><b>Polling Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX_MEASUREMENT__POLLING_PERIOD = RESPONSE_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JMX Measurement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int JMX_MEASUREMENT_FEATURE_COUNT = RESPONSE_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl <em>Linear Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getLinearValueProvider()
	 * @generated
	 */
	int LINEAR_VALUE_PROVIDER = 17;

	/**
	 * The feature id for the '<em><b>Summand</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VALUE_PROVIDER__SUMMAND = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VALUE_PROVIDER__FACTOR = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Value Provider</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINEAR_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ModificationImpl <em>Modification</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ModificationImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getModification()
	 * @generated
	 */
	int MODIFICATION = 23;

	/**
	 * The number of structural features of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl <em>Object Modification</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getObjectModification()
	 * @generated
	 */
	int OBJECT_MODIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODIFICATION__TYPE = MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODIFICATION__NAME = MODIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Varied Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODIFICATION__VARIED_OBJECT_ID = MODIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODIFICATION__VALUE = MODIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Modification</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODIFICATION_FEATURE_COUNT = MODIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl <em>Initial Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getInitialModel()
	 * @generated
	 */
	int INITIAL_MODEL = 19;

	/**
	 * The feature id for the '<em><b>Usage Model</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__USAGE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__ALLOCATION = 1;

	/**
	 * The feature id for the '<em><b>Middleware Repository</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__MIDDLEWARE_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Event Middle Ware Repository</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rules</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__RECONFIGURATION_RULES = 4;

	/**
	 * The feature id for the '<em><b>Monitor Repository</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__MONITOR_REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Service Level Objectives</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES = 6;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__REPOSITORY = 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__RESOURCE_ENVIRONMENT = 9;

	/**
	 * The feature id for the '<em><b>Usage Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL__USAGE_EVOLUTION = 10;

	/**
	 * The number of structural features of the '<em>Initial Model</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ReconfigurationRulesFolderImpl <em>Reconfiguration Rules Folder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ReconfigurationRulesFolderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getReconfigurationRulesFolder()
	 * @generated
	 */
	int RECONFIGURATION_RULES_FOLDER = 20;

	/**
	 * The feature id for the '<em><b>Folder Uri</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULES_FOLDER__FOLDER_URI = 0;

	/**
	 * The number of structural features of the '<em>Reconfiguration Rules Folder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULES_FOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl <em>Nested Intervals Double Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getNestedIntervalsDoubleValueProvider()
	 * @generated
	 */
	int NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER = 21;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Intervals Double Value Provider</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl <em>Nested Intervals Long Value Provider</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getNestedIntervalsLongValueProvider()
	 * @generated
	 */
	int NESTED_INTERVALS_LONG_VALUE_PROVIDER = 22;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE = VALUE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE = VALUE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Intervals Long Value Provider</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERVALS_LONG_VALUE_PROVIDER_FEATURE_COUNT = VALUE_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.SchedulingPolicy2DelayModificationImpl <em>Scheduling Policy2 Delay Modification</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.SchedulingPolicy2DelayModificationImpl
	 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSchedulingPolicy2DelayModification()
	 * @generated
	 */
	int SCHEDULING_POLICY2_DELAY_MODIFICATION = 24;

	/**
	 * The number of structural features of the '<em>Scheduling Policy2 Delay Modification</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY2_DELAY_MODIFICATION_FEATURE_COUNT = MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository <em>Experiment Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Repository</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentRepository
	 * @generated
	 */
	EClass getExperimentRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiments</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentRepository#getExperiments()
	 * @see #getExperimentRepository()
	 * @generated
	 */
	EReference getExperimentRepository_Experiments();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getVariations <em>Variations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variations</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getVariations()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Variations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getModifications <em>Modifications</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifications</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getModifications()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Modifications();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getId()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getName()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getToolConfiguration <em>Tool Configuration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Configuration</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getToolConfiguration()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_ToolConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getStopConditions <em>Stop Conditions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop Conditions</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getStopConditions()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_StopConditions();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getDescription()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getExperimentDesign <em>Experiment Design</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment Design</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getExperimentDesign()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_ExperimentDesign();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getResponseMeasurement <em>Response Measurement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Measurement</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getResponseMeasurement()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_ResponseMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getInitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Model</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getInitialModel()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_InitialModel();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getRepetitions <em>Repetitions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetitions</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment#getRepetitions()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Repetitions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation
	 * @generated
	 */
	EClass getVariation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getType()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getValueProvider()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_ValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getMinValue()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getMaxValue()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getMaxVariations <em>Max Variations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Variations</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getMaxVariations()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_MaxVariations();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getVariedObjectId <em>Varied Object Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varied Object Id</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getVariedObjectId()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_VariedObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.Variation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation#getName()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ValueProvider
	 * @generated
	 */
	EClass getValueProvider();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration <em>Tool Configuration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Configuration</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ToolConfiguration
	 * @generated
	 */
	EClass getToolConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ToolConfiguration#getName()
	 * @see #getToolConfiguration()
	 * @generated
	 */
	EAttribute getToolConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ExperimentDesign <em>Experiment Design</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Design</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentDesign
	 * @generated
	 */
	EClass getExperimentDesign();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement <em>Response Measurement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Measurement</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement
	 * @generated
	 */
	EClass getResponseMeasurement();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider <em>Polynomial Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider
	 * @generated
	 */
	EClass getPolynomialValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getExponent()
	 * @see #getPolynomialValueProvider()
	 * @generated
	 */
	EAttribute getPolynomialValueProvider_Exponent();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getFactor()
	 * @see #getPolynomialValueProvider()
	 * @generated
	 */
	EAttribute getPolynomialValueProvider_Factor();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider <em>Exponential Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider
	 * @generated
	 */
	EClass getExponentialValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider#getBase()
	 * @see #getExponentialValueProvider()
	 * @generated
	 */
	EAttribute getExponentialValueProvider_Base();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider <em>Set Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.SetValueProvider
	 * @generated
	 */
	EClass getSetValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.SetValueProvider#getValues()
	 * @see #getSetValueProvider()
	 * @generated
	 */
	EAttribute getSetValueProvider_Values();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign <em>Placket Burman Design</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placket Burman Design</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign
	 * @generated
	 */
	EClass getPlacketBurmanDesign();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign <em>Full Factorial Design</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Factorial Design</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign
	 * @generated
	 */
	EClass getFullFactorialDesign();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign <em>Fractional Factorial Design</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fractional Factorial Design</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign
	 * @generated
	 */
	EClass getFractionalFactorialDesign();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime <em>One Factor At ATime</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Factor At ATime</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime
	 * @generated
	 */
	EClass getOneFactorAtATime();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement <em>Simulation Duration Measurement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Duration Measurement</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement
	 * @generated
	 */
	EClass getSimulationDurationMeasurement();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement <em>Profiling Measurement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profiling Measurement</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement
	 * @generated
	 */
	EClass getProfilingMeasurement();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement <em>JMX Measurement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMX Measurement</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.JMXMeasurement
	 * @generated
	 */
	EClass getJMXMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement#getPollingPeriod <em>Polling Period</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Period</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.JMXMeasurement#getPollingPeriod()
	 * @see #getJMXMeasurement()
	 * @generated
	 */
	EAttribute getJMXMeasurement_PollingPeriod();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider <em>Linear Value Provider</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.LinearValueProvider
	 * @generated
	 */
	EClass getLinearValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getSummand <em>Summand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summand</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getSummand()
	 * @see #getLinearValueProvider()
	 * @generated
	 */
	EAttribute getLinearValueProvider_Summand();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getFactor()
	 * @see #getLinearValueProvider()
	 * @generated
	 */
	EAttribute getLinearValueProvider_Factor();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification <em>Object Modification</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Modification</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification
	 * @generated
	 */
	EClass getObjectModification();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification#getType()
	 * @see #getObjectModification()
	 * @generated
	 */
	EReference getObjectModification_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification#getName()
	 * @see #getObjectModification()
	 * @generated
	 */
	EAttribute getObjectModification_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification#getVariedObjectId <em>Varied Object Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varied Object Id</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification#getVariedObjectId()
	 * @see #getObjectModification()
	 * @generated
	 */
	EAttribute getObjectModification_VariedObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification#getValue()
	 * @see #getObjectModification()
	 * @generated
	 */
	EAttribute getObjectModification_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Model</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel
	 * @generated
	 */
	EClass getInitialModel();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageModel <em>Usage Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Model</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageModel()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_UsageModel();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getAllocation()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_Allocation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMiddlewareRepository <em>Middleware Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Middleware Repository</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getMiddlewareRepository()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_MiddlewareRepository();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getEventMiddleWareRepository <em>Event Middle Ware Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Middle Ware Repository</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getEventMiddleWareRepository()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_EventMiddleWareRepository();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getReconfigurationRules <em>Reconfiguration Rules</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rules</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getReconfigurationRules()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_ReconfigurationRules();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMonitorRepository <em>Monitor Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitor Repository</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getMonitorRepository()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_MonitorRepository();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getServiceLevelObjectives <em>Service Level Objectives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level Objectives</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getServiceLevelObjectives()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_ServiceLevelObjectives();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getRepository()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_Repository();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getSystem()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_System();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Environment</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getResourceEnvironment()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_ResourceEnvironment();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageEvolution <em>Usage Evolution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Evolution</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageEvolution()
	 * @see #getInitialModel()
	 * @generated
	 */
	EReference getInitialModel_UsageEvolution();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder <em>Reconfiguration Rules Folder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Rules Folder</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder
	 * @generated
	 */
	EClass getReconfigurationRulesFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri <em>Folder Uri</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Uri</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri()
	 * @see #getReconfigurationRulesFolder()
	 * @generated
	 */
	EAttribute getReconfigurationRulesFolder_FolderUri();

	/**
	 * Returns the meta object for class '
	 * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider
	 * <em>Nested Intervals Double Value Provider</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Nested Intervals Double Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider
	 * @generated
	 */
	EClass getNestedIntervalsDoubleValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMinValue()
	 * @see #getNestedIntervalsDoubleValueProvider()
	 * @generated
	 */
	EAttribute getNestedIntervalsDoubleValueProvider_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMaxValue()
	 * @see #getNestedIntervalsDoubleValueProvider()
	 * @generated
	 */
	EAttribute getNestedIntervalsDoubleValueProvider_MaxValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider
	 * <em>Nested Intervals Long Value Provider</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Nested Intervals Long Value Provider</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider
	 * @generated
	 */
	EClass getNestedIntervalsLongValueProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider#getMinValue()
	 * @see #getNestedIntervalsLongValueProvider()
	 * @generated
	 */
	EAttribute getNestedIntervalsLongValueProvider_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider#getMaxValue()
	 * @see #getNestedIntervalsLongValueProvider()
	 * @generated
	 */
	EAttribute getNestedIntervalsLongValueProvider_MaxValue();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.experimentautomation.experiments.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.Modification
	 * @generated
	 */
	EClass getModification();

	/**
	 * Returns the meta object for class '
	 * {@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification
	 * <em>Scheduling Policy2 Delay Modification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Scheduling Policy2 Delay Modification</em>'.
	 * @see org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification
	 * @generated
	 */
	EClass getSchedulingPolicy2DelayModification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentsFactory getExperimentsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentRepositoryImpl <em>Experiment Repository</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentRepositoryImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperimentRepository()
		 * @generated
		 */
		EClass EXPERIMENT_REPOSITORY = eINSTANCE.getExperimentRepository();

		/**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_REPOSITORY__EXPERIMENTS = eINSTANCE.getExperimentRepository_Experiments();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Variations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__VARIATIONS = eINSTANCE.getExperiment_Variations();

		/**
		 * The meta object literal for the '<em><b>Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__MODIFICATIONS = eINSTANCE.getExperiment_Modifications();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EXPERIMENT__ID = eINSTANCE.getExperiment_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EXPERIMENT__NAME = eINSTANCE.getExperiment_Name();

		/**
		 * The meta object literal for the '<em><b>Tool Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__TOOL_CONFIGURATION = eINSTANCE.getExperiment_ToolConfiguration();

		/**
		 * The meta object literal for the '<em><b>Stop Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__STOP_CONDITIONS = eINSTANCE.getExperiment_StopConditions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EXPERIMENT__DESCRIPTION = eINSTANCE.getExperiment_Description();

		/**
		 * The meta object literal for the '<em><b>Experiment Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__EXPERIMENT_DESIGN = eINSTANCE.getExperiment_ExperimentDesign();

		/**
		 * The meta object literal for the '<em><b>Response Measurement</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__RESPONSE_MEASUREMENT = eINSTANCE.getExperiment_ResponseMeasurement();

		/**
		 * The meta object literal for the '<em><b>Initial Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__INITIAL_MODEL = eINSTANCE.getExperiment_InitialModel();

		/**
		 * The meta object literal for the '<em><b>Repetitions</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EXPERIMENT__REPETITIONS = eINSTANCE.getExperiment_Repetitions();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl <em>Variation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getVariation()
		 * @generated
		 */
		EClass VARIATION = eINSTANCE.getVariation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference VARIATION__TYPE = eINSTANCE.getVariation_Type();

		/**
		 * The meta object literal for the '<em><b>Value Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION__VALUE_PROVIDER = eINSTANCE.getVariation_ValueProvider();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute VARIATION__MIN_VALUE = eINSTANCE.getVariation_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute VARIATION__MAX_VALUE = eINSTANCE.getVariation_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Max Variations</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute VARIATION__MAX_VARIATIONS = eINSTANCE.getVariation_MaxVariations();

		/**
		 * The meta object literal for the '<em><b>Varied Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION__VARIED_OBJECT_ID = eINSTANCE.getVariation_VariedObjectId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute VARIATION__NAME = eINSTANCE.getVariation_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ValueProviderImpl <em>Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getValueProvider()
		 * @generated
		 */
		EClass VALUE_PROVIDER = eINSTANCE.getValueProvider();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl <em>Tool Configuration</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getToolConfiguration()
		 * @generated
		 */
		EClass TOOL_CONFIGURATION = eINSTANCE.getToolConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TOOL_CONFIGURATION__NAME = eINSTANCE.getToolConfiguration_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentDesignImpl <em>Experiment Design</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentDesignImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExperimentDesign()
		 * @generated
		 */
		EClass EXPERIMENT_DESIGN = eINSTANCE.getExperimentDesign();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ResponseMeasurementImpl <em>Response Measurement</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ResponseMeasurementImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getResponseMeasurement()
		 * @generated
		 */
		EClass RESPONSE_MEASUREMENT = eINSTANCE.getResponseMeasurement();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl <em>Polynomial Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getPolynomialValueProvider()
		 * @generated
		 */
		EClass POLYNOMIAL_VALUE_PROVIDER = eINSTANCE.getPolynomialValueProvider();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute POLYNOMIAL_VALUE_PROVIDER__EXPONENT = eINSTANCE.getPolynomialValueProvider_Exponent();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute POLYNOMIAL_VALUE_PROVIDER__FACTOR = eINSTANCE.getPolynomialValueProvider_Factor();

		/**
		 * The meta object literal for the '
		 * {@link org.palladiosimulator.experimentautomation.experiments.impl.ExponentialValueProviderImpl
		 * <em>Exponential Value Provider</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExponentialValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getExponentialValueProvider()
		 * @generated
		 */
		EClass EXPONENTIAL_VALUE_PROVIDER = eINSTANCE.getExponentialValueProvider();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EXPONENTIAL_VALUE_PROVIDER__BASE = eINSTANCE.getExponentialValueProvider_Base();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.SetValueProviderImpl <em>Set Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.SetValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSetValueProvider()
		 * @generated
		 */
		EClass SET_VALUE_PROVIDER = eINSTANCE.getSetValueProvider();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SET_VALUE_PROVIDER__VALUES = eINSTANCE.getSetValueProvider_Values();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.PlacketBurmanDesignImpl <em>Placket Burman Design</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.PlacketBurmanDesignImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getPlacketBurmanDesign()
		 * @generated
		 */
		EClass PLACKET_BURMAN_DESIGN = eINSTANCE.getPlacketBurmanDesign();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.FullFactorialDesignImpl <em>Full Factorial Design</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.FullFactorialDesignImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getFullFactorialDesign()
		 * @generated
		 */
		EClass FULL_FACTORIAL_DESIGN = eINSTANCE.getFullFactorialDesign();

		/**
		 * The meta object literal for the '
		 * {@link org.palladiosimulator.experimentautomation.experiments.impl.FractionalFactorialDesignImpl
		 * <em>Fractional Factorial Design</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.FractionalFactorialDesignImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getFractionalFactorialDesign()
		 * @generated
		 */
		EClass FRACTIONAL_FACTORIAL_DESIGN = eINSTANCE.getFractionalFactorialDesign();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.OneFactorAtATimeImpl <em>One Factor At ATime</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.OneFactorAtATimeImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getOneFactorAtATime()
		 * @generated
		 */
		EClass ONE_FACTOR_AT_ATIME = eINSTANCE.getOneFactorAtATime();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.SimulationDurationMeasurementImpl <em>Simulation Duration Measurement</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.SimulationDurationMeasurementImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSimulationDurationMeasurement()
		 * @generated
		 */
		EClass SIMULATION_DURATION_MEASUREMENT = eINSTANCE.getSimulationDurationMeasurement();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ProfilingMeasurementImpl <em>Profiling Measurement</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ProfilingMeasurementImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getProfilingMeasurement()
		 * @generated
		 */
		EClass PROFILING_MEASUREMENT = eINSTANCE.getProfilingMeasurement();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.JMXMeasurementImpl <em>JMX Measurement</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.JMXMeasurementImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getJMXMeasurement()
		 * @generated
		 */
		EClass JMX_MEASUREMENT = eINSTANCE.getJMXMeasurement();

		/**
		 * The meta object literal for the '<em><b>Polling Period</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute JMX_MEASUREMENT__POLLING_PERIOD = eINSTANCE.getJMXMeasurement_PollingPeriod();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl <em>Linear Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getLinearValueProvider()
		 * @generated
		 */
		EClass LINEAR_VALUE_PROVIDER = eINSTANCE.getLinearValueProvider();

		/**
		 * The meta object literal for the '<em><b>Summand</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LINEAR_VALUE_PROVIDER__SUMMAND = eINSTANCE.getLinearValueProvider_Summand();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LINEAR_VALUE_PROVIDER__FACTOR = eINSTANCE.getLinearValueProvider_Factor();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl <em>Object Modification</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getObjectModification()
		 * @generated
		 */
		EClass OBJECT_MODIFICATION = eINSTANCE.getObjectModification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OBJECT_MODIFICATION__TYPE = eINSTANCE.getObjectModification_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OBJECT_MODIFICATION__NAME = eINSTANCE.getObjectModification_Name();

		/**
		 * The meta object literal for the '<em><b>Varied Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MODIFICATION__VARIED_OBJECT_ID = eINSTANCE.getObjectModification_VariedObjectId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OBJECT_MODIFICATION__VALUE = eINSTANCE.getObjectModification_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl <em>Initial Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getInitialModel()
		 * @generated
		 */
		EClass INITIAL_MODEL = eINSTANCE.getInitialModel();

		/**
		 * The meta object literal for the '<em><b>Usage Model</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INITIAL_MODEL__USAGE_MODEL = eINSTANCE.getInitialModel_UsageModel();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INITIAL_MODEL__ALLOCATION = eINSTANCE.getInitialModel_Allocation();

		/**
		 * The meta object literal for the '<em><b>Middleware Repository</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__MIDDLEWARE_REPOSITORY = eINSTANCE.getInitialModel_MiddlewareRepository();

		/**
		 * The meta object literal for the '<em><b>Event Middle Ware Repository</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY = eINSTANCE.getInitialModel_EventMiddleWareRepository();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rules</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__RECONFIGURATION_RULES = eINSTANCE.getInitialModel_ReconfigurationRules();

		/**
		 * The meta object literal for the '<em><b>Monitor Repository</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__MONITOR_REPOSITORY = eINSTANCE.getInitialModel_MonitorRepository();

		/**
		 * The meta object literal for the '<em><b>Service Level Objectives</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES = eINSTANCE.getInitialModel_ServiceLevelObjectives();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INITIAL_MODEL__REPOSITORY = eINSTANCE.getInitialModel_Repository();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INITIAL_MODEL__SYSTEM = eINSTANCE.getInitialModel_System();

		/**
		 * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL__RESOURCE_ENVIRONMENT = eINSTANCE.getInitialModel_ResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Usage Evolution</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INITIAL_MODEL__USAGE_EVOLUTION = eINSTANCE.getInitialModel_UsageEvolution();

		/**
		 * The meta object literal for the '
		 * {@link org.palladiosimulator.experimentautomation.experiments.impl.ReconfigurationRulesFolderImpl
		 * <em>Reconfiguration Rules Folder</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ReconfigurationRulesFolderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getReconfigurationRulesFolder()
		 * @generated
		 */
		EClass RECONFIGURATION_RULES_FOLDER = eINSTANCE.getReconfigurationRulesFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Uri</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RECONFIGURATION_RULES_FOLDER__FOLDER_URI = eINSTANCE.getReconfigurationRulesFolder_FolderUri();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl <em>Nested Intervals Double Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getNestedIntervalsDoubleValueProvider()
		 * @generated
		 */
		EClass NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER = eINSTANCE.getNestedIntervalsDoubleValueProvider();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE = eINSTANCE
				.getNestedIntervalsDoubleValueProvider_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE = eINSTANCE
				.getNestedIntervalsDoubleValueProvider_MaxValue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl <em>Nested Intervals Long Value Provider</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getNestedIntervalsLongValueProvider()
		 * @generated
		 */
		EClass NESTED_INTERVALS_LONG_VALUE_PROVIDER = eINSTANCE.getNestedIntervalsLongValueProvider();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE = eINSTANCE
				.getNestedIntervalsLongValueProvider_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE = eINSTANCE
				.getNestedIntervalsLongValueProvider_MaxValue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.ModificationImpl <em>Modification</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ModificationImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getModification()
		 * @generated
		 */
		EClass MODIFICATION = eINSTANCE.getModification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.experimentautomation.experiments.impl.SchedulingPolicy2DelayModificationImpl <em>Scheduling Policy2 Delay Modification</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.SchedulingPolicy2DelayModificationImpl
		 * @see org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl#getSchedulingPolicy2DelayModification()
		 * @generated
		 */
		EClass SCHEDULING_POLICY2_DELAY_MODIFICATION = eINSTANCE.getSchedulingPolicy2DelayModification();

	}

} // ExperimentsPackage
