/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Measurement Count Stop
 * Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.MeasurementCountStopConditionImpl#getMeasurementCount <em>Measurement Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementCountStopConditionImpl extends StopConditionImpl implements MeasurementCountStopCondition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The default value of the '{@link #getMeasurementCount() <em>Measurement Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMeasurementCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MEASUREMENT_COUNT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementCountStopConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsimulationPackage.Literals.MEASUREMENT_COUNT_STOP_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMeasurementCount() {
		return (Integer) eDynamicGet(AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT,
				AbstractsimulationPackage.Literals.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementCount(int newMeasurementCount) {
		eDynamicSet(AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT,
				AbstractsimulationPackage.Literals.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT,
				newMeasurementCount);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT:
			return getMeasurementCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT:
			setMeasurementCount((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT:
			setMeasurementCount(MEASUREMENT_COUNT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION__MEASUREMENT_COUNT:
			return getMeasurementCount() != MEASUREMENT_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // MeasurementCountStopConditionImpl
