/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage
 * @generated
 */
public interface ExperimentsFactory extends EFactory {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentsFactory eINSTANCE = org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Experiment Repository</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Experiment Repository</em>'.
	 * @generated
	 */
	ExperimentRepository createExperimentRepository();

	/**
	 * Returns a new object of class '<em>Experiment</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Experiment</em>'.
	 * @generated
	 */
	Experiment createExperiment();

	/**
	 * Returns a new object of class '<em>Variation</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return a new object of class '<em>Variation</em>'.
	 * @generated
	 */
	Variation createVariation();

	/**
	 * Returns a new object of class '<em>Polynomial Value Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polynomial Value Provider</em>'.
	 * @generated
	 */
	PolynomialValueProvider createPolynomialValueProvider();

	/**
	 * Returns a new object of class '<em>Exponential Value Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Value Provider</em>'.
	 * @generated
	 */
	ExponentialValueProvider createExponentialValueProvider();

	/**
	 * Returns a new object of class '<em>Set Value Provider</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Set Value Provider</em>'.
	 * @generated
	 */
	SetValueProvider createSetValueProvider();

	/**
	 * Returns a new object of class '<em>Placket Burman Design</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Placket Burman Design</em>'.
	 * @generated
	 */
	PlacketBurmanDesign createPlacketBurmanDesign();

	/**
	 * Returns a new object of class '<em>Full Factorial Design</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Full Factorial Design</em>'.
	 * @generated
	 */
	FullFactorialDesign createFullFactorialDesign();

	/**
	 * Returns a new object of class '<em>Fractional Factorial Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fractional Factorial Design</em>'.
	 * @generated
	 */
	FractionalFactorialDesign createFractionalFactorialDesign();

	/**
	 * Returns a new object of class '<em>One Factor At ATime</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>One Factor At ATime</em>'.
	 * @generated
	 */
	OneFactorAtATime createOneFactorAtATime();

	/**
	 * Returns a new object of class '<em>Simulation Duration Measurement</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Duration Measurement</em>'.
	 * @generated
	 */
	SimulationDurationMeasurement createSimulationDurationMeasurement();

	/**
	 * Returns a new object of class '<em>Profiling Measurement</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Profiling Measurement</em>'.
	 * @generated
	 */
	ProfilingMeasurement createProfilingMeasurement();

	/**
	 * Returns a new object of class '<em>JMX Measurement</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>JMX Measurement</em>'.
	 * @generated
	 */
	JMXMeasurement createJMXMeasurement();

	/**
	 * Returns a new object of class '<em>Linear Value Provider</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Linear Value Provider</em>'.
	 * @generated
	 */
	LinearValueProvider createLinearValueProvider();

	/**
	 * Returns a new object of class '<em>Object Modification</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Object Modification</em>'.
	 * @generated
	 */
	ObjectModification createObjectModification();

	/**
	 * Returns a new object of class '<em>Initial Model</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Initial Model</em>'.
	 * @generated
	 */
	InitialModel createInitialModel();

	/**
	 * Returns a new object of class '<em>Reconfiguration Rules Folder</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Rules Folder</em>'.
	 * @generated
	 */
	ReconfigurationRulesFolder createReconfigurationRulesFolder();

	/**
	 * Returns a new object of class '<em>Nested Intervals Double Value Provider</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Nested Intervals Double Value Provider</em>'.
	 * @generated
	 */
	NestedIntervalsDoubleValueProvider createNestedIntervalsDoubleValueProvider();

	/**
	 * Returns a new object of class '<em>Nested Intervals Long Value Provider</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Nested Intervals Long Value Provider</em>'.
	 * @generated
	 */
	NestedIntervalsLongValueProvider createNestedIntervalsLongValueProvider();

	/**
	 * Returns a new object of class '<em>Scheduling Policy2 Delay Modification</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Scheduling Policy2 Delay Modification</em>'.
	 * @generated
	 */
	SchedulingPolicy2DelayModification createSchedulingPolicy2DelayModification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExperimentsPackage getExperimentsPackage();

} // ExperimentsFactory
