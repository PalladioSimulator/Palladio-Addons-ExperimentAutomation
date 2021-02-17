/**
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Linear Value
 * Provider</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getSummand
 * <em>Summand</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getFactor
 * <em>Factor</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getLinearValueProvider()
 * @model
 * @generated
 */
public interface LinearValueProvider extends ValueProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Returns the value of the '<em><b>Summand</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Summand</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Summand</em>' attribute.
     * @see #setSummand(double)
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getLinearValueProvider_Summand()
     * @model required="true" ordered="false"
     * @generated
     */
    double getSummand();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getSummand
     * <em>Summand</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Summand</em>' attribute.
     * @see #getSummand()
     * @generated
     */
    void setSummand(double value);

    /**
     * Returns the value of the '<em><b>Factor</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factor</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Factor</em>' attribute.
     * @see #setFactor(double)
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getLinearValueProvider_Factor()
     * @model required="true" ordered="false"
     * @generated
     */
    double getFactor();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider#getFactor
     * <em>Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Factor</em>' attribute.
     * @see #getFactor()
     * @generated
     */
    void setFactor(double value);

} // LinearValueProvider
