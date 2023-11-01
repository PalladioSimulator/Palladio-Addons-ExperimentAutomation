/**
 */
package org.palladiosimulator.experimentautomation.experiments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentDesign;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.JMXMeasurement;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Modification;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;
import org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime;
import org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement;
import org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Variation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage
 * @generated
 */
public class ExperimentsSwitch<T> extends Switch<T> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExperimentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExperimentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExperimentsPackage.EXPERIMENT_REPOSITORY: {
			ExperimentRepository experimentRepository = (ExperimentRepository) theEObject;
			T result = caseExperimentRepository(experimentRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.EXPERIMENT: {
			Experiment experiment = (Experiment) theEObject;
			T result = caseExperiment(experiment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.VARIATION: {
			Variation variation = (Variation) theEObject;
			T result = caseVariation(variation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.VALUE_PROVIDER: {
			ValueProvider valueProvider = (ValueProvider) theEObject;
			T result = caseValueProvider(valueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.TOOL_CONFIGURATION: {
			ToolConfiguration toolConfiguration = (ToolConfiguration) theEObject;
			T result = caseToolConfiguration(toolConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.EXPERIMENT_DESIGN: {
			ExperimentDesign experimentDesign = (ExperimentDesign) theEObject;
			T result = caseExperimentDesign(experimentDesign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.RESPONSE_MEASUREMENT: {
			ResponseMeasurement responseMeasurement = (ResponseMeasurement) theEObject;
			T result = caseResponseMeasurement(responseMeasurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER: {
			PolynomialValueProvider polynomialValueProvider = (PolynomialValueProvider) theEObject;
			T result = casePolynomialValueProvider(polynomialValueProvider);
			if (result == null)
				result = caseValueProvider(polynomialValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER: {
			ExponentialValueProvider exponentialValueProvider = (ExponentialValueProvider) theEObject;
			T result = caseExponentialValueProvider(exponentialValueProvider);
			if (result == null)
				result = caseValueProvider(exponentialValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.SET_VALUE_PROVIDER: {
			SetValueProvider setValueProvider = (SetValueProvider) theEObject;
			T result = caseSetValueProvider(setValueProvider);
			if (result == null)
				result = caseValueProvider(setValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.PLACKET_BURMAN_DESIGN: {
			PlacketBurmanDesign placketBurmanDesign = (PlacketBurmanDesign) theEObject;
			T result = casePlacketBurmanDesign(placketBurmanDesign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.FULL_FACTORIAL_DESIGN: {
			FullFactorialDesign fullFactorialDesign = (FullFactorialDesign) theEObject;
			T result = caseFullFactorialDesign(fullFactorialDesign);
			if (result == null)
				result = caseExperimentDesign(fullFactorialDesign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.FRACTIONAL_FACTORIAL_DESIGN: {
			FractionalFactorialDesign fractionalFactorialDesign = (FractionalFactorialDesign) theEObject;
			T result = caseFractionalFactorialDesign(fractionalFactorialDesign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.ONE_FACTOR_AT_ATIME: {
			OneFactorAtATime oneFactorAtATime = (OneFactorAtATime) theEObject;
			T result = caseOneFactorAtATime(oneFactorAtATime);
			if (result == null)
				result = caseExperimentDesign(oneFactorAtATime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.SIMULATION_DURATION_MEASUREMENT: {
			SimulationDurationMeasurement simulationDurationMeasurement = (SimulationDurationMeasurement) theEObject;
			T result = caseSimulationDurationMeasurement(simulationDurationMeasurement);
			if (result == null)
				result = caseResponseMeasurement(simulationDurationMeasurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.PROFILING_MEASUREMENT: {
			ProfilingMeasurement profilingMeasurement = (ProfilingMeasurement) theEObject;
			T result = caseProfilingMeasurement(profilingMeasurement);
			if (result == null)
				result = caseResponseMeasurement(profilingMeasurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.JMX_MEASUREMENT: {
			JMXMeasurement jmxMeasurement = (JMXMeasurement) theEObject;
			T result = caseJMXMeasurement(jmxMeasurement);
			if (result == null)
				result = caseResponseMeasurement(jmxMeasurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.LINEAR_VALUE_PROVIDER: {
			LinearValueProvider linearValueProvider = (LinearValueProvider) theEObject;
			T result = caseLinearValueProvider(linearValueProvider);
			if (result == null)
				result = caseValueProvider(linearValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.OBJECT_MODIFICATION: {
			ObjectModification objectModification = (ObjectModification) theEObject;
			T result = caseObjectModification(objectModification);
			if (result == null)
				result = caseModification(objectModification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.INITIAL_MODEL: {
			InitialModel initialModel = (InitialModel) theEObject;
			T result = caseInitialModel(initialModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER: {
			ReconfigurationRulesFolder reconfigurationRulesFolder = (ReconfigurationRulesFolder) theEObject;
			T result = caseReconfigurationRulesFolder(reconfigurationRulesFolder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER: {
			NestedIntervalsDoubleValueProvider nestedIntervalsDoubleValueProvider = (NestedIntervalsDoubleValueProvider) theEObject;
			T result = caseNestedIntervalsDoubleValueProvider(nestedIntervalsDoubleValueProvider);
			if (result == null)
				result = caseValueProvider(nestedIntervalsDoubleValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER: {
			NestedIntervalsLongValueProvider nestedIntervalsLongValueProvider = (NestedIntervalsLongValueProvider) theEObject;
			T result = caseNestedIntervalsLongValueProvider(nestedIntervalsLongValueProvider);
			if (result == null)
				result = caseValueProvider(nestedIntervalsLongValueProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.MODIFICATION: {
			Modification modification = (Modification) theEObject;
			T result = caseModification(modification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentsPackage.SCHEDULING_POLICY2_DELAY_MODIFICATION: {
			SchedulingPolicy2DelayModification schedulingPolicy2DelayModification = (SchedulingPolicy2DelayModification) theEObject;
			T result = caseSchedulingPolicy2DelayModification(schedulingPolicy2DelayModification);
			if (result == null)
				result = caseModification(schedulingPolicy2DelayModification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Repository</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentRepository(ExperimentRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperiment(Experiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variation</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariation(Variation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProvider(ValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Configuration</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolConfiguration(ToolConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Design</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentDesign(ExperimentDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Measurement</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMeasurement(ResponseMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polynomial Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polynomial Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolynomialValueProvider(PolynomialValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentialValueProvider(ExponentialValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetValueProvider(SetValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placket Burman Design</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placket Burman Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacketBurmanDesign(PlacketBurmanDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Factorial Design</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Factorial Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullFactorialDesign(FullFactorialDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fractional Factorial Design</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fractional Factorial Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFractionalFactorialDesign(FractionalFactorialDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Factor At ATime</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Factor At ATime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneFactorAtATime(OneFactorAtATime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Duration Measurement</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Duration Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationDurationMeasurement(SimulationDurationMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profiling Measurement</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profiling Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfilingMeasurement(ProfilingMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMX Measurement</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMX Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMXMeasurement(JMXMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearValueProvider(LinearValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Modification</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectModification(ObjectModification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialModel(InitialModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Rules Folder</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Rules Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationRulesFolder(ReconfigurationRulesFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Intervals Double Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Intervals Double Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedIntervalsDoubleValueProvider(NestedIntervalsDoubleValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Intervals Long Value Provider</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Intervals Long Value Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedIntervalsLongValueProvider(NestedIntervalsLongValueProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModification(Modification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy2 Delay Modification</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Policy2 Delay Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingPolicy2DelayModification(SchedulingPolicy2DelayModification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // ExperimentsSwitch
