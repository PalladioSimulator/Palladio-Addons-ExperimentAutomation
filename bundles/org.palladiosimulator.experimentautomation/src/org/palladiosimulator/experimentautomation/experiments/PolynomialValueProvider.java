/**
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Polynomial Value
 * Provider</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getPolynomialValueProvider()
 * @model
 * @generated
 */
public interface PolynomialValueProvider extends ValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(double)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getPolynomialValueProvider_Exponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getExponent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(double value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getPolynomialValueProvider_Factor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

} // PolynomialValueProvider
