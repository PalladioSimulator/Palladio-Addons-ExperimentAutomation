/**
 */
package org.palladiosimulator.experimentautomation.variation.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class VariationXMLProcessor extends XMLProcessor {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public VariationXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        VariationPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the VariationResourceFactoryImpl factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new VariationResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new VariationResourceFactoryImpl());
        }
        return this.registrations;
    }

} // VariationXMLProcessor
