/**
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Exponential Value
 * Provider</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExponentialValueProvider()
 * @model
 * @generated
 */
public interface ExponentialValueProvider extends ValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(double)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExponentialValueProvider_Base()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getBase();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(double value);

} // ExponentialValueProvider
