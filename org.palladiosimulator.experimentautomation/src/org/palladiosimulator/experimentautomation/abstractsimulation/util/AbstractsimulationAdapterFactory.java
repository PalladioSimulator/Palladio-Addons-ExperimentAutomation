/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.PersistenceFramework;
import org.palladiosimulator.experimentautomation.abstractsimulation.ProbeSpecConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.SensorFramework;
import org.palladiosimulator.experimentautomation.abstractsimulation.SensorFrameworkDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage
 * @generated
 */
public class AbstractsimulationAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static AbstractsimulationPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AbstractsimulationAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = AbstractsimulationPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected AbstractsimulationSwitch<Adapter> modelSwitch = new AbstractsimulationSwitch<Adapter>() {
        @Override
        public Adapter caseAbstractSimulationConfiguration(AbstractSimulationConfiguration object) {
            return createAbstractSimulationConfigurationAdapter();
        }

        @Override
        public Adapter casePersistenceFramework(PersistenceFramework object) {
            return createPersistenceFrameworkAdapter();
        }

        @Override
        public Adapter caseRandomNumberGeneratorSeed(RandomNumberGeneratorSeed object) {
            return createRandomNumberGeneratorSeedAdapter();
        }

        @Override
        public Adapter caseProbeSpecConfiguration(ProbeSpecConfiguration object) {
            return createProbeSpecConfigurationAdapter();
        }

        @Override
        public Adapter caseSensorFramework(SensorFramework object) {
            return createSensorFrameworkAdapter();
        }

        @Override
        public Adapter caseSensorFrameworkDatasource(SensorFrameworkDatasource object) {
            return createSensorFrameworkDatasourceAdapter();
        }

        @Override
        public Adapter caseMemoryDatasource(MemoryDatasource object) {
            return createMemoryDatasourceAdapter();
        }

        @Override
        public Adapter caseFileDatasource(FileDatasource object) {
            return createFileDatasourceAdapter();
        }

        @Override
        public Adapter caseMeasurementCountStopCondition(MeasurementCountStopCondition object) {
            return createMeasurementCountStopConditionAdapter();
        }

        @Override
        public Adapter caseSimTimeStopCondition(SimTimeStopCondition object) {
            return createSimTimeStopConditionAdapter();
        }

        @Override
        public Adapter caseStopCondition(StopCondition object) {
            return createStopConditionAdapter();
        }

        @Override
        public Adapter caseEDP2(EDP2 object) {
            return createEDP2Adapter();
        }

        @Override
        public Adapter caseToolConfiguration(ToolConfiguration object) {
            return createToolConfigurationAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration
     * <em>Abstract Simulation Configuration</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration
     * @generated
     */
    public Adapter createAbstractSimulationConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.PersistenceFramework
     * <em>Persistence Framework</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.PersistenceFramework
     * @generated
     */
    public Adapter createPersistenceFrameworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed
     * <em>Random Number Generator Seed</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed
     * @generated
     */
    public Adapter createRandomNumberGeneratorSeedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.ProbeSpecConfiguration
     * <em>Probe Spec Configuration</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.ProbeSpecConfiguration
     * @generated
     */
    public Adapter createProbeSpecConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.SensorFramework
     * <em>Sensor Framework</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.SensorFramework
     * @generated
     */
    public Adapter createSensorFrameworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.SensorFrameworkDatasource
     * <em>Sensor Framework Datasource</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.SensorFrameworkDatasource
     * @generated
     */
    public Adapter createSensorFrameworkDatasourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource
     * <em>Memory Datasource</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource
     * @generated
     */
    public Adapter createMemoryDatasourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource
     * <em>File Datasource</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource
     * @generated
     */
    public Adapter createFileDatasourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition
     * <em>Measurement Count Stop Condition</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition
     * @generated
     */
    public Adapter createMeasurementCountStopConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition
     * <em>Sim Time Stop Condition</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition
     * @generated
     */
    public Adapter createSimTimeStopConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition
     * <em>Stop Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition
     * @generated
     */
    public Adapter createStopConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.abstractsimulation.EDP2 <em>EDP2</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.abstractsimulation.EDP2
     * @generated
     */
    public Adapter createEDP2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration
     * <em>Tool Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.experiments.ToolConfiguration
     * @generated
     */
    public Adapter createToolConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // AbstractsimulationAdapterFactory