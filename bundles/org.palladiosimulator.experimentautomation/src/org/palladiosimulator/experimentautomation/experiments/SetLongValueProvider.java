/**
 * Palladiosimulator.org 2008-2017
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Long Value Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getSetLongValueProvider()
 * @model
 * @generated
 */
public interface SetLongValueProvider extends ValueProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getSetLongValueProvider_Values()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

} // SetLongValueProvider
