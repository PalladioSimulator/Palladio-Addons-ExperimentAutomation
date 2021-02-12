/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterPackage
 * @generated
 */
public interface SimulizartooladapterFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SimulizartooladapterFactory eINSTANCE = org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterFactoryImpl
        .init();

    /**
     * Returns a new object of class '<em>Simu Lizar Configuration</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Simu Lizar Configuration</em>'.
     * @generated
     */
    SimuLizarConfiguration createSimuLizarConfiguration();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    SimulizartooladapterPackage getSimulizartooladapterPackage();

} // SimulizartooladapterFactory
