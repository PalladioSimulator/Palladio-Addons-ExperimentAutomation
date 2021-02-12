/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimuLizarConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SimulizartooladapterFactoryImpl extends EFactoryImpl implements SimulizartooladapterFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SimulizartooladapterFactory init() {
        try {
            final SimulizartooladapterFactory theSimulizartooladapterFactory = (SimulizartooladapterFactory) EPackage.Registry.INSTANCE
                .getEFactory(SimulizartooladapterPackage.eNS_URI);
            if (theSimulizartooladapterFactory != null) {
                return theSimulizartooladapterFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SimulizartooladapterFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SimulizartooladapterFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SimulizartooladapterPackage.SIMU_LIZAR_CONFIGURATION:
            return this.createSimuLizarConfiguration();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimuLizarConfiguration createSimuLizarConfiguration() {
        final SimuLizarConfigurationImpl simuLizarConfiguration = new SimuLizarConfigurationImpl();
        return simuLizarConfiguration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimulizartooladapterPackage getSimulizartooladapterPackage() {
        return (SimulizartooladapterPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SimulizartooladapterPackage getPackage() {
        return SimulizartooladapterPackage.eINSTANCE;
    }

} // SimulizartooladapterFactoryImpl
