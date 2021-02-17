/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>File Datasource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getLocation
 * <em>Location</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getExportOption
 * <em>Export Option</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getFileDatasource()
 * @model
 * @generated
 */
public interface FileDatasource extends EDP2Datasource {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getFileDatasource_Location()
     * @model required="true" ordered="false"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getLocation
     * <em>Location</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Export Option</b></em>' attribute. The default value is
     * <code>"EDP2"</code>. The literals are from the enumeration
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Export Option</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Export Option</em>' attribute.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
     * @see #setExportOption(ExportOption)
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage#getFileDatasource_ExportOption()
     * @model default="EDP2"
     * @generated
     */
    ExportOption getExportOption();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getExportOption
     * <em>Export Option</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Export Option</em>' attribute.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
     * @see #getExportOption()
     * @generated
     */
    void setExportOption(ExportOption value);

} // FileDatasource
