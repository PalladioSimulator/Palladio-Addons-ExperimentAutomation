/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterFactory
 * @model kind="package"
 * @generated
 */
public interface SimulizartooladapterPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ExperimentAutomation/ToolAdapter/SimuLizar/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "simulizartooladapter";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    SimulizartooladapterPackage eINSTANCE = org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterPackageImpl
        .init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimuLizarConfigurationImpl
     * <em>Simu Lizar Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimuLizarConfigurationImpl
     * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterPackageImpl#getSimuLizarConfiguration()
     * @generated
     */
    int SIMU_LIZAR_CONFIGURATION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__NAME = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__NAME;

    /**
     * The feature id for the '<em><b>Stop Conditions</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__STOP_CONDITIONS = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS;

    /**
     * The feature id for the '<em><b>Random Number Generator Seed</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED;

    /**
     * The feature id for the '<em><b>Simulate Linking Resources</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__SIMULATE_LINKING_RESOURCES = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES;

    /**
     * The feature id for the '<em><b>Simulate Failures</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__SIMULATE_FAILURES = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES;

    /**
     * The feature id for the '<em><b>Datasource</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION__DATASOURCE = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE;

    /**
     * The number of structural features of the '<em>Simu Lizar Configuration</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMU_LIZAR_CONFIGURATION_FEATURE_COUNT = AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION_FEATURE_COUNT
            + 0;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimuLizarConfiguration
     * <em>Simu Lizar Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Simu Lizar Configuration</em>'.
     * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimuLizarConfiguration
     * @generated
     */
    EClass getSimuLizarConfiguration();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SimulizartooladapterFactory getSimulizartooladapterFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimuLizarConfigurationImpl
         * <em>Simu Lizar Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimuLizarConfigurationImpl
         * @see org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterPackageImpl#getSimuLizarConfiguration()
         * @generated
         */
        EClass SIMU_LIZAR_CONFIGURATION = eINSTANCE.getSimuLizarConfiguration();

    }

} // SimulizartooladapterPackage
