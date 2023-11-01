/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage
 * @generated
 */
public interface SlingshottooladapterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlingshottooladapterFactory eINSTANCE = org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.impl.SlingshottooladapterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Slingshot Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slingshot Configuration</em>'.
	 * @generated
	 */
	SlingshotConfiguration createSlingshotConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SlingshottooladapterPackage getSlingshottooladapterPackage();

} //SlingshottooladapterFactory
