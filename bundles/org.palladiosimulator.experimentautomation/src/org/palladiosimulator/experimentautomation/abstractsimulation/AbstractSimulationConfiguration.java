/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Abstract Simulation
 * Configuration</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getStopConditions <em>Stop Conditions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getRandomNumberGeneratorSeed <em>Random Number Generator Seed</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateLinkingResources <em>Simulate Linking Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateFailures <em>Simulate Failures</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSimulationConfiguration extends ToolConfiguration {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Stop Conditions</b></em>' containment reference list. The
	 * list contents are of type
	 * {@link org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Stop Conditions</em>' containment reference list.
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration_StopConditions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<StopCondition> getStopConditions();

	/**
	 * Returns the value of the '<em><b>Random Number Generator Seed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Number Generator Seed</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Number Generator Seed</em>' containment reference.
	 * @see #setRandomNumberGeneratorSeed(RandomNumberGeneratorSeed)
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration_RandomNumberGeneratorSeed()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	RandomNumberGeneratorSeed getRandomNumberGeneratorSeed();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getRandomNumberGeneratorSeed <em>Random Number Generator Seed</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Random Number Generator Seed</em>' containment reference.
	 * @see #getRandomNumberGeneratorSeed()
	 * @generated
	 */
	void setRandomNumberGeneratorSeed(RandomNumberGeneratorSeed value);

	/**
	 * Returns the value of the '<em><b>Simulate Linking Resources</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulate Linking Resources</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Simulate Linking Resources</em>' attribute.
	 * @see #setSimulateLinkingResources(boolean)
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration_SimulateLinkingResources()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSimulateLinkingResources();

	/**
	 * Sets the value of the '
	 * {@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateLinkingResources
	 * <em>Simulate Linking Resources</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Simulate Linking Resources</em>' attribute.
	 * @see #isSimulateLinkingResources()
	 * @generated
	 */
	void setSimulateLinkingResources(boolean value);

	/**
	 * Returns the value of the '<em><b>Simulate Failures</b></em>' attribute.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Simulate Failures</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulate Failures</em>' attribute.
	 * @see #setSimulateFailures(boolean)
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration_SimulateFailures()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSimulateFailures();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateFailures <em>Simulate Failures</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulate Failures</em>' attribute.
	 * @see #isSimulateFailures()
	 * @generated
	 */
	void setSimulateFailures(boolean value);

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Datasource</em>' containment reference.
	 * @see #setDatasource(EDP2Datasource)
	 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getAbstractSimulationConfiguration_Datasource()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EDP2Datasource getDatasource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getDatasource <em>Datasource</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' containment reference.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(EDP2Datasource value);

} // AbstractSimulationConfiguration
