/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Abstract Simulation
 * Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getStopConditions
 * <em>Stop Conditions</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getRandomNumberGeneratorSeed
 * <em>Random Number Generator Seed</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#isSimulateLinkingResources
 * <em>Simulate Linking Resources</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#isSimulateFailures
 * <em>Simulate Failures</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getDatasource
 * <em>Datasource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSimulationConfigurationImpl extends ToolConfigurationImpl
        implements AbstractSimulationConfiguration {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * The default value of the '{@link #isSimulateLinkingResources() <em>Simulate Linking
     * Resources</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSimulateLinkingResources()
     * @generated
     * @ordered
     */
    protected static final boolean SIMULATE_LINKING_RESOURCES_EDEFAULT = false;

    /**
     * The default value of the '{@link #isSimulateFailures() <em>Simulate Failures</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSimulateFailures()
     * @generated
     * @ordered
     */
    protected static final boolean SIMULATE_FAILURES_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AbstractSimulationConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<StopCondition> getStopConditions() {
        return (EList<StopCondition>) this.eDynamicGet(
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RandomNumberGeneratorSeed getRandomNumberGeneratorSeed() {
        return (RandomNumberGeneratorSeed) this.eDynamicGet(
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRandomNumberGeneratorSeed(
            final RandomNumberGeneratorSeed newRandomNumberGeneratorSeed, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRandomNumberGeneratorSeed,
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRandomNumberGeneratorSeed(final RandomNumberGeneratorSeed newRandomNumberGeneratorSeed) {
        this.eDynamicSet(AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                newRandomNumberGeneratorSeed);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSimulateLinkingResources() {
        return (Boolean) this.eDynamicGet(
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSimulateLinkingResources(final boolean newSimulateLinkingResources) {
        this.eDynamicSet(AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES,
                newSimulateLinkingResources);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSimulateFailures() {
        return (Boolean) this.eDynamicGet(
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSimulateFailures(final boolean newSimulateFailures) {
        this.eDynamicSet(AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES,
                newSimulateFailures);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDP2Datasource getDatasource() {
        return (EDP2Datasource) this.eDynamicGet(
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDatasource(final EDP2Datasource newDatasource, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newDatasource,
                AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDatasource(final EDP2Datasource newDatasource) {
        this.eDynamicSet(AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE,
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, newDatasource);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
            return ((InternalEList<?>) this.getStopConditions()).basicRemove(otherEnd, msgs);
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
            return this.basicSetRandomNumberGeneratorSeed(null, msgs);
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            return this.basicSetDatasource(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
            return this.getStopConditions();
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
            return this.getRandomNumberGeneratorSeed();
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
            return this.isSimulateLinkingResources();
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            return this.isSimulateFailures();
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            return this.getDatasource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
            this.getStopConditions()
                .clear();
            this.getStopConditions()
                .addAll((Collection<? extends StopCondition>) newValue);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
            this.setRandomNumberGeneratorSeed((RandomNumberGeneratorSeed) newValue);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
            this.setSimulateLinkingResources((Boolean) newValue);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            this.setSimulateFailures((Boolean) newValue);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            this.setDatasource((EDP2Datasource) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
            this.getStopConditions()
                .clear();
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
            this.setRandomNumberGeneratorSeed((RandomNumberGeneratorSeed) null);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
            this.setSimulateLinkingResources(SIMULATE_LINKING_RESOURCES_EDEFAULT);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            this.setSimulateFailures(SIMULATE_FAILURES_EDEFAULT);
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            this.setDatasource((EDP2Datasource) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
            return !this.getStopConditions()
                .isEmpty();
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
            return this.getRandomNumberGeneratorSeed() != null;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
            return this.isSimulateLinkingResources() != SIMULATE_LINKING_RESOURCES_EDEFAULT;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            return this.isSimulateFailures() != SIMULATE_FAILURES_EDEFAULT;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            return this.getDatasource() != null;
        }
        return super.eIsSet(featureID);
    }

} // AbstractSimulationConfigurationImpl
