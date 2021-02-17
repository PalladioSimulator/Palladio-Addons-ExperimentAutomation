/**
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Nested Intervals Double
 * Value Provider</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMaxValue
 * <em>Max Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getNestedIntervalsDoubleValueProvider()
 * @model
 * @generated
 */
public interface NestedIntervalsDoubleValueProvider extends ValueProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Value</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #setMinValue(double)
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getNestedIntervalsDoubleValueProvider_MinValue()
     * @model required="true"
     * @generated
     */
    double getMinValue();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMinValue
     * <em>Min Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Min Value</em>' attribute.
     * @see #getMinValue()
     * @generated
     */
    void setMinValue(double value);

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(double)
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getNestedIntervalsDoubleValueProvider_MaxValue()
     * @model required="true"
     * @generated
     */
    double getMaxValue();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider#getMaxValue
     * <em>Max Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue(double value);

} // NestedIntervalsDoubleValueProvider
