/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimuComConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage
 * @generated
 */
public class SimucomtooladapterAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SimucomtooladapterPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SimucomtooladapterAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SimucomtooladapterPackage.eINSTANCE;
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
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SimucomtooladapterSwitch<Adapter> modelSwitch = new SimucomtooladapterSwitch<Adapter>() {
        @Override
        public Adapter caseSimuComConfiguration(final SimuComConfiguration object) {
            return SimucomtooladapterAdapterFactory.this.createSimuComConfigurationAdapter();
        }

        @Override
        public Adapter caseToolConfiguration(final ToolConfiguration object) {
            return SimucomtooladapterAdapterFactory.this.createToolConfigurationAdapter();
        }

        @Override
        public Adapter caseAbstractSimulationConfiguration(final AbstractSimulationConfiguration object) {
            return SimucomtooladapterAdapterFactory.this.createAbstractSimulationConfigurationAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return SimucomtooladapterAdapterFactory.this.createEObjectAdapter();
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
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimuComConfiguration
     * <em>Simu Com Configuration</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimuComConfiguration
     * @generated
     */
    public Adapter createSimuComConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration <em>Tool
     * Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.experimentautomation.experiments.ToolConfiguration
     * @generated
     */
    public Adapter createToolConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration
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
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SimucomtooladapterAdapterFactory
