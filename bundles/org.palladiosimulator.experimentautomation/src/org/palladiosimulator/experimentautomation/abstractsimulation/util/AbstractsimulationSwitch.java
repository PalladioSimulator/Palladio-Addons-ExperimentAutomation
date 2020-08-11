/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage
 * @generated
 */
public class AbstractsimulationSwitch<T> extends Switch<T> {

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
	protected static AbstractsimulationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsimulationSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractsimulationPackage.eINSTANCE;
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
		case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION: {
			AbstractSimulationConfiguration abstractSimulationConfiguration = (AbstractSimulationConfiguration) theEObject;
			T result = caseAbstractSimulationConfiguration(abstractSimulationConfiguration);
			if (result == null)
				result = caseToolConfiguration(abstractSimulationConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED: {
			RandomNumberGeneratorSeed randomNumberGeneratorSeed = (RandomNumberGeneratorSeed) theEObject;
			T result = caseRandomNumberGeneratorSeed(randomNumberGeneratorSeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.EDP2_DATASOURCE: {
			EDP2Datasource edp2Datasource = (EDP2Datasource) theEObject;
			T result = caseEDP2Datasource(edp2Datasource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.MEMORY_DATASOURCE: {
			MemoryDatasource memoryDatasource = (MemoryDatasource) theEObject;
			T result = caseMemoryDatasource(memoryDatasource);
			if (result == null)
				result = caseEDP2Datasource(memoryDatasource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.FILE_DATASOURCE: {
			FileDatasource fileDatasource = (FileDatasource) theEObject;
			T result = caseFileDatasource(fileDatasource);
			if (result == null)
				result = caseEDP2Datasource(fileDatasource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION: {
			MeasurementCountStopCondition measurementCountStopCondition = (MeasurementCountStopCondition) theEObject;
			T result = caseMeasurementCountStopCondition(measurementCountStopCondition);
			if (result == null)
				result = caseStopCondition(measurementCountStopCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION: {
			SimTimeStopCondition simTimeStopCondition = (SimTimeStopCondition) theEObject;
			T result = caseSimTimeStopCondition(simTimeStopCondition);
			if (result == null)
				result = caseStopCondition(simTimeStopCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsimulationPackage.STOP_CONDITION: {
			StopCondition stopCondition = (StopCondition) theEObject;
			T result = caseStopCondition(stopCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Simulation Configuration</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Simulation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSimulationConfiguration(AbstractSimulationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Number Generator Seed</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Number Generator Seed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomNumberGeneratorSeed(RandomNumberGeneratorSeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDP2 Datasource</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDP2 Datasource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDP2Datasource(EDP2Datasource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Datasource</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Datasource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryDatasource(MemoryDatasource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Datasource</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Datasource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDatasource(FileDatasource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Count Stop Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Count Stop Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementCountStopCondition(MeasurementCountStopCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Time Stop Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Time Stop Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimTimeStopCondition(SimTimeStopCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopCondition(StopCondition object) {
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

} // AbstractsimulationSwitch
