/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Sim Time Stop
 * Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.SimTimeStopConditionImpl#getSimulationTime
 * <em>Simulation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimTimeStopConditionImpl extends StopConditionImpl implements SimTimeStopCondition {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";
    /**
     * The default value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSimulationTime()
     * @generated
     * @ordered
     */
    protected static final int SIMULATION_TIME_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SimTimeStopConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AbstractsimulationPackage.Literals.SIM_TIME_STOP_CONDITION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getSimulationTime() {
        return (Integer) this.eDynamicGet(AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME,
                AbstractsimulationPackage.Literals.SIM_TIME_STOP_CONDITION__SIMULATION_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSimulationTime(final int newSimulationTime) {
        this.eDynamicSet(AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME,
                AbstractsimulationPackage.Literals.SIM_TIME_STOP_CONDITION__SIMULATION_TIME, newSimulationTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME:
            return this.getSimulationTime();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME:
            this.setSimulationTime((Integer) newValue);
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
        case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME:
            this.setSimulationTime(SIMULATION_TIME_EDEFAULT);
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
        case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION__SIMULATION_TIME:
            return this.getSimulationTime() != SIMULATION_TIME_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // SimTimeStopConditionImpl
