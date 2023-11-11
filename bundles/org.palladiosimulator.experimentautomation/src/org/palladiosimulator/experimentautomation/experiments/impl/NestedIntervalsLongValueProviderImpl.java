/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Nested Intervals Long
 * Value Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedIntervalsLongValueProviderImpl extends ValueProviderImpl
		implements NestedIntervalsLongValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_VALUE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_VALUE_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedIntervalsLongValueProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMinValue() {
		return (Long) eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE,
				ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValue(long newMinValue) {
		eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE,
				ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE, newMinValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxValue() {
		return (Long) eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE,
				ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValue(long newMaxValue) {
		eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE,
				ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE, newMaxValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
			return getMinValue();
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
			return getMaxValue();
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
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
			setMinValue((Long) newValue);
			return;
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
			setMaxValue((Long) newValue);
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
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
			return;
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
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
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
			return getMinValue() != MIN_VALUE_EDEFAULT;
		case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
			return getMaxValue() != MAX_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // NestedIntervalsLongValueProviderImpl
