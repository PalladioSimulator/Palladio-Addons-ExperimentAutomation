/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!--
 * end-user-doc -->
 *
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.util.SimucomtooladapterResourceImpl
 * @generated
 */
public class SimucomtooladapterResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SimucomtooladapterResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Resource createResource(final URI uri) {
        final Resource result = new SimucomtooladapterResourceImpl(uri);
        return result;
    }

} // SimucomtooladapterResourceFactoryImpl
