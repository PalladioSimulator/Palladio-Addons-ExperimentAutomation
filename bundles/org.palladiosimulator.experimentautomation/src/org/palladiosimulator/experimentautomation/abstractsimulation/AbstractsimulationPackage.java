/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

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
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractsimulationPackage extends EPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "abstractsimulation";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ExperimentAutomation/AbstractSimulation/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "ExperimentAutomation.Experiments.AbstractSimulation";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    AbstractsimulationPackage eINSTANCE = org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl
        .init();

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl
     * <em>Abstract Simulation Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getAbstractSimulationConfiguration()
     * @generated
     */
    int ABSTRACT_SIMULATION_CONFIGURATION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__NAME = ExperimentsPackage.TOOL_CONFIGURATION__NAME;

    /**
     * The feature id for the '<em><b>Stop Conditions</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Random Number Generator Seed</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT
            + 1;

    /**
     * The feature id for the '<em><b>Simulate Linking Resources</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT
            + 2;

    /**
     * The feature id for the '<em><b>Simulate Failures</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Datasource</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Abstract Simulation Configuration</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_SIMULATION_CONFIGURATION_FEATURE_COUNT = ExperimentsPackage.TOOL_CONFIGURATION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.RandomNumberGeneratorSeedImpl
     * <em>Random Number Generator Seed</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.RandomNumberGeneratorSeedImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getRandomNumberGeneratorSeed()
     * @generated
     */
    int RANDOM_NUMBER_GENERATOR_SEED = 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.MemoryDatasourceImpl
     * <em>Memory Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.MemoryDatasourceImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getMemoryDatasource()
     * @generated
     */
    int MEMORY_DATASOURCE = 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl
     * <em>File Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getFileDatasource()
     * @generated
     */
    int FILE_DATASOURCE = 4;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.StopConditionImpl
     * <em>Stop Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.StopConditionImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getStopCondition()
     * @generated
     */
    int STOP_CONDITION = 7;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.MeasurementCountStopConditionImpl
     * <em>Measurement Count Stop Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.MeasurementCountStopConditionImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getMeasurementCountStopCondition()
     * @generated
     */
    int MEASUREMENT_COUNT_STOP_CONDITION = 5;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.SimTimeStopConditionImpl
     * <em>Sim Time Stop Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.SimTimeStopConditionImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getSimTimeStopCondition()
     * @generated
     */
    int SIM_TIME_STOP_CONDITION = 6;

    /**
     * The feature id for the '<em><b>Seed0</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED0 = 0;

    /**
     * The feature id for the '<em><b>Seed1</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED1 = 1;

    /**
     * The feature id for the '<em><b>Seed2</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED2 = 2;

    /**
     * The feature id for the '<em><b>Seed3</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED3 = 3;

    /**
     * The feature id for the '<em><b>Seed4</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED4 = 4;

    /**
     * The feature id for the '<em><b>Seed5</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED__SEED5 = 5;

    /**
     * The number of structural features of the '<em>Random Number Generator Seed</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_NUMBER_GENERATOR_SEED_FEATURE_COUNT = 6;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.EDP2DatasourceImpl
     * <em>EDP2 Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.EDP2DatasourceImpl
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getEDP2Datasource()
     * @generated
     */
    int EDP2_DATASOURCE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EDP2_DATASOURCE__ID = 0;

    /**
     * The number of structural features of the '<em>EDP2 Datasource</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EDP2_DATASOURCE_FEATURE_COUNT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEMORY_DATASOURCE__ID = EDP2_DATASOURCE__ID;

    /**
     * The number of structural features of the '<em>Memory Datasource</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEMORY_DATASOURCE_FEATURE_COUNT = EDP2_DATASOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FILE_DATASOURCE__ID = EDP2_DATASOURCE__ID;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FILE_DATASOURCE__LOCATION = EDP2_DATASOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Export Option</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FILE_DATASOURCE__EXPORT_OPTION = EDP2_DATASOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>File Datasource</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FILE_DATASOURCE_FEATURE_COUNT = EDP2_DATASOURCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Stop Condition</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STOP_CONDITION_FEATURE_COUNT = 0;

    /**
     * The feature id for the '<em><b>Measurement Count</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT = STOP_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Measurement Count Stop Condition</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_COUNT_STOP_CONDITION_FEATURE_COUNT = STOP_CONDITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Simulation Time</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIM_TIME_STOP_CONDITION__SIMULATION_TIME = STOP_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Sim Time Stop Condition</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIM_TIME_STOP_CONDITION_FEATURE_COUNT = STOP_CONDITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption <em>Export
     * Option</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getExportOption()
     * @generated
     */
    int EXPORT_OPTION = 8;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration
     * <em>Abstract Simulation Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Abstract Simulation Configuration</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration
     * @generated
     */
    EClass getAbstractSimulationConfiguration();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getStopConditions
     * <em>Stop Conditions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Stop Conditions</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getStopConditions()
     * @see #getAbstractSimulationConfiguration()
     * @generated
     */
    EReference getAbstractSimulationConfiguration_StopConditions();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getRandomNumberGeneratorSeed
     * <em>Random Number Generator Seed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Random Number Generator
     *         Seed</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getRandomNumberGeneratorSeed()
     * @see #getAbstractSimulationConfiguration()
     * @generated
     */
    EReference getAbstractSimulationConfiguration_RandomNumberGeneratorSeed();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateLinkingResources
     * <em>Simulate Linking Resources</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Simulate Linking Resources</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateLinkingResources()
     * @see #getAbstractSimulationConfiguration()
     * @generated
     */
    EAttribute getAbstractSimulationConfiguration_SimulateLinkingResources();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateFailures
     * <em>Simulate Failures</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Simulate Failures</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#isSimulateFailures()
     * @see #getAbstractSimulationConfiguration()
     * @generated
     */
    EAttribute getAbstractSimulationConfiguration_SimulateFailures();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getDatasource
     * <em>Datasource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Datasource</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration#getDatasource()
     * @see #getAbstractSimulationConfiguration()
     * @generated
     */
    EReference getAbstractSimulationConfiguration_Datasource();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed
     * <em>Random Number Generator Seed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Random Number Generator Seed</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed
     * @generated
     */
    EClass getRandomNumberGeneratorSeed();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed0
     * <em>Seed0</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed0</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed0()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed0();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed1
     * <em>Seed1</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed1</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed1()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed1();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed2
     * <em>Seed2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed2</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed2()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed2();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed3
     * <em>Seed3</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed3</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed3()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed3();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed4
     * <em>Seed4</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed4</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed4()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed4();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed5
     * <em>Seed5</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Seed5</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed#getSeed5()
     * @see #getRandomNumberGeneratorSeed()
     * @generated
     */
    EAttribute getRandomNumberGeneratorSeed_Seed5();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource <em>EDP2
     * Datasource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>EDP2 Datasource</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource
     * @generated
     */
    EClass getEDP2Datasource();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource#getId()
     * @see #getEDP2Datasource()
     * @generated
     */
    EAttribute getEDP2Datasource_Id();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource
     * <em>Memory Datasource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Memory Datasource</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource
     * @generated
     */
    EClass getMemoryDatasource();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource <em>File
     * Datasource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>File Datasource</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource
     * @generated
     */
    EClass getFileDatasource();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getLocation
     * <em>Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getLocation()
     * @see #getFileDatasource()
     * @generated
     */
    EAttribute getFileDatasource_Location();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getExportOption
     * <em>Export Option</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Export Option</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource#getExportOption()
     * @see #getFileDatasource()
     * @generated
     */
    EAttribute getFileDatasource_ExportOption();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition
     * <em>Measurement Count Stop Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Measurement Count Stop Condition</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition
     * @generated
     */
    EClass getMeasurementCountStopCondition();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition#getMeasurementCount
     * <em>Measurement Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Measurement Count</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition#getMeasurementCount()
     * @see #getMeasurementCountStopCondition()
     * @generated
     */
    EAttribute getMeasurementCountStopCondition_MeasurementCount();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition
     * <em>Sim Time Stop Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Sim Time Stop Condition</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition
     * @generated
     */
    EClass getSimTimeStopCondition();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition#getSimulationTime
     * <em>Simulation Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Simulation Time</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition#getSimulationTime()
     * @see #getSimTimeStopCondition()
     * @generated
     */
    EAttribute getSimTimeStopCondition_SimulationTime();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition <em>Stop
     * Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Stop Condition</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition
     * @generated
     */
    EClass getStopCondition();

    /**
     * Returns the meta object for enum
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption <em>Export
     * Option</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Export Option</em>'.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
     * @generated
     */
    EEnum getExportOption();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AbstractsimulationFactory getAbstractsimulationFactory();

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
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl
         * <em>Abstract Simulation Configuration</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getAbstractSimulationConfiguration()
         * @generated
         */
        EClass ABSTRACT_SIMULATION_CONFIGURATION = eINSTANCE.getAbstractSimulationConfiguration();

        /**
         * The meta object literal for the '<em><b>Stop Conditions</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS = eINSTANCE
            .getAbstractSimulationConfiguration_StopConditions();

        /**
         * The meta object literal for the '<em><b>Random Number Generator Seed</b></em>'
         * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED = eINSTANCE
            .getAbstractSimulationConfiguration_RandomNumberGeneratorSeed();

        /**
         * The meta object literal for the '<em><b>Simulate Linking Resources</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES = eINSTANCE
            .getAbstractSimulationConfiguration_SimulateLinkingResources();

        /**
         * The meta object literal for the '<em><b>Simulate Failures</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES = eINSTANCE
            .getAbstractSimulationConfiguration_SimulateFailures();

        /**
         * The meta object literal for the '<em><b>Datasource</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE = eINSTANCE
            .getAbstractSimulationConfiguration_Datasource();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.RandomNumberGeneratorSeedImpl
         * <em>Random Number Generator Seed</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.RandomNumberGeneratorSeedImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getRandomNumberGeneratorSeed()
         * @generated
         */
        EClass RANDOM_NUMBER_GENERATOR_SEED = eINSTANCE.getRandomNumberGeneratorSeed();

        /**
         * The meta object literal for the '<em><b>Seed0</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED0 = eINSTANCE.getRandomNumberGeneratorSeed_Seed0();

        /**
         * The meta object literal for the '<em><b>Seed1</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED1 = eINSTANCE.getRandomNumberGeneratorSeed_Seed1();

        /**
         * The meta object literal for the '<em><b>Seed2</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED2 = eINSTANCE.getRandomNumberGeneratorSeed_Seed2();

        /**
         * The meta object literal for the '<em><b>Seed3</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED3 = eINSTANCE.getRandomNumberGeneratorSeed_Seed3();

        /**
         * The meta object literal for the '<em><b>Seed4</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED4 = eINSTANCE.getRandomNumberGeneratorSeed_Seed4();

        /**
         * The meta object literal for the '<em><b>Seed5</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_NUMBER_GENERATOR_SEED__SEED5 = eINSTANCE.getRandomNumberGeneratorSeed_Seed5();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.EDP2DatasourceImpl
         * <em>EDP2 Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.EDP2DatasourceImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getEDP2Datasource()
         * @generated
         */
        EClass EDP2_DATASOURCE = eINSTANCE.getEDP2Datasource();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EDP2_DATASOURCE__ID = eINSTANCE.getEDP2Datasource_Id();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.MemoryDatasourceImpl
         * <em>Memory Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.MemoryDatasourceImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getMemoryDatasource()
         * @generated
         */
        EClass MEMORY_DATASOURCE = eINSTANCE.getMemoryDatasource();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl
         * <em>File Datasource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getFileDatasource()
         * @generated
         */
        EClass FILE_DATASOURCE = eINSTANCE.getFileDatasource();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FILE_DATASOURCE__LOCATION = eINSTANCE.getFileDatasource_Location();

        /**
         * The meta object literal for the '<em><b>Export Option</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FILE_DATASOURCE__EXPORT_OPTION = eINSTANCE.getFileDatasource_ExportOption();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.MeasurementCountStopConditionImpl
         * <em>Measurement Count Stop Condition</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.MeasurementCountStopConditionImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getMeasurementCountStopCondition()
         * @generated
         */
        EClass MEASUREMENT_COUNT_STOP_CONDITION = eINSTANCE.getMeasurementCountStopCondition();

        /**
         * The meta object literal for the '<em><b>Measurement Count</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT = eINSTANCE
            .getMeasurementCountStopCondition_MeasurementCount();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.SimTimeStopConditionImpl
         * <em>Sim Time Stop Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.SimTimeStopConditionImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getSimTimeStopCondition()
         * @generated
         */
        EClass SIM_TIME_STOP_CONDITION = eINSTANCE.getSimTimeStopCondition();

        /**
         * The meta object literal for the '<em><b>Simulation Time</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SIM_TIME_STOP_CONDITION__SIMULATION_TIME = eINSTANCE.getSimTimeStopCondition_SimulationTime();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.StopConditionImpl
         * <em>Stop Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.StopConditionImpl
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getStopCondition()
         * @generated
         */
        EClass STOP_CONDITION = eINSTANCE.getStopCondition();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
         * <em>Export Option</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption
         * @see org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl#getExportOption()
         * @generated
         */
        EEnum EXPORT_OPTION = eINSTANCE.getExportOption();

    }

} // AbstractsimulationPackage
