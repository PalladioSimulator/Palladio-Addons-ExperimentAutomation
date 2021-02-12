/**
 */
package org.palladiosimulator.experimentautomation.experiments.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ExperimentsXMLProcessor extends XMLProcessor {

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
    public ExperimentsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        ExperimentsPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the ExperimentsResourceFactoryImpl factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new ExperimentsResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new ExperimentsResourceFactoryImpl());
        }
        return this.registrations;
    }

} // ExperimentsXMLProcessor
