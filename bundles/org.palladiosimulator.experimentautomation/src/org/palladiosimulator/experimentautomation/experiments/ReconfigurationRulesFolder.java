/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Reconfiguration Rules
 * Folder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri <em>Folder Uri</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getReconfigurationRulesFolder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ReconfigurationRulesFolder extends CDOObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Folder Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Uri</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Uri</em>' attribute.
	 * @see #setFolderUri(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getReconfigurationRulesFolder_FolderUri()
	 * @model required="true"
	 * @generated
	 */
	String getFolderUri();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri <em>Folder Uri</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Uri</em>' attribute.
	 * @see #getFolderUri()
	 * @generated
	 */
	void setFolderUri(String value);

} // ReconfigurationRulesFolder
