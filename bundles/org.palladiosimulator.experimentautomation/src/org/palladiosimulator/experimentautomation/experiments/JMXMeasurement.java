/**
 */
package org.palladiosimulator.experimentautomation.experiments;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>JMX Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement#getPollingPeriod
 * <em>Polling Period</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getJMXMeasurement()
 * @model
 * @generated
 */
public interface JMXMeasurement extends ResponseMeasurement {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Returns the value of the '<em><b>Polling Period</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Polling Period</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Polling Period</em>' attribute.
     * @see #setPollingPeriod(Integer)
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getJMXMeasurement_PollingPeriod()
     * @model required="true" ordered="false"
     * @generated
     */
    Integer getPollingPeriod();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement#getPollingPeriod
     * <em>Polling Period</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Polling Period</em>' attribute.
     * @see #getPollingPeriod()
     * @generated
     */
    void setPollingPeriod(Integer value);

} // JMXMeasurement
