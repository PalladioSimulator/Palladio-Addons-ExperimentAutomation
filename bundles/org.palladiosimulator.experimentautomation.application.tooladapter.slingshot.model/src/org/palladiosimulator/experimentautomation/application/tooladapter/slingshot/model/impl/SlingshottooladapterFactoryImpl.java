/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlingshottooladapterFactoryImpl extends EFactoryImpl implements SlingshottooladapterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SlingshottooladapterFactory init() {
		try {
			SlingshottooladapterFactory theSlingshottooladapterFactory = (SlingshottooladapterFactory)EPackage.Registry.INSTANCE.getEFactory(SlingshottooladapterPackage.eNS_URI);
			if (theSlingshottooladapterFactory != null) {
				return theSlingshottooladapterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SlingshottooladapterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlingshottooladapterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SlingshottooladapterPackage.SLINGSHOT_CONFIGURATION: return createSlingshotConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlingshotConfiguration createSlingshotConfiguration() {
		SlingshotConfigurationImpl slingshotConfiguration = new SlingshotConfigurationImpl();
		return slingshotConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlingshottooladapterPackage getSlingshottooladapterPackage() {
		return (SlingshottooladapterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SlingshottooladapterPackage getPackage() {
		return SlingshottooladapterPackage.eINSTANCE;
	}

} //SlingshottooladapterFactoryImpl
