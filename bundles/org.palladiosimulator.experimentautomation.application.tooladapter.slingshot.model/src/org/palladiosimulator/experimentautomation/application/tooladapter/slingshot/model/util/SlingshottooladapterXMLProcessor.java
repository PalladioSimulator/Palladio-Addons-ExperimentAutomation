/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SlingshottooladapterXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlingshottooladapterXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SlingshottooladapterPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SlingshottooladapterResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SlingshottooladapterResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SlingshottooladapterResourceFactoryImpl());
		}
		return registrations;
	}

} //SlingshottooladapterXMLProcessor
