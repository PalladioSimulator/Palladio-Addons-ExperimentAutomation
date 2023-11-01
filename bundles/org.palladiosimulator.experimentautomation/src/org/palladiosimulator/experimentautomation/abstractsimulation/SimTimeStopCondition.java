/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Sim Time Stop
 * Condition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition#getSimulationTime <em>Simulation Time</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getSimTimeStopCondition()
 * @model
 * @generated
 */
public interface SimTimeStopCondition extends StopCondition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(int)
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getSimTimeStopCondition_SimulationTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getSimulationTime();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(int value);

} // SimTimeStopCondition
