/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage
 * @generated
 */
public interface SimucomtooladapterFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SimucomtooladapterFactory eINSTANCE = org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.impl.SimucomtooladapterFactoryImpl
        .init();

    /**
     * Returns a new object of class '<em>Simu Com Configuration</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Simu Com Configuration</em>'.
     * @generated
     */
    SimuComConfiguration createSimuComConfiguration();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    SimucomtooladapterPackage getSimucomtooladapterPackage();

} // SimucomtooladapterFactory
