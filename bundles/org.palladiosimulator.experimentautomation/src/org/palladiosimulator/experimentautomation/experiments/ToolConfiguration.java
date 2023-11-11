/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tool Configuration</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getToolConfiguration()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ToolConfiguration extends CDOObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getToolConfiguration_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ToolConfiguration
