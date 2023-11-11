/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set Value Provider</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.SetValueProviderImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetValueProviderImpl extends ValueProviderImpl implements SetValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The default value of the '{@link #getValues() <em>Values</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetValueProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.SET_VALUE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValues() {
		return (String) eDynamicGet(ExperimentsPackage.SET_VALUE_PROVIDER__VALUES,
				ExperimentsPackage.Literals.SET_VALUE_PROVIDER__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValues(String newValues) {
		eDynamicSet(ExperimentsPackage.SET_VALUE_PROVIDER__VALUES,
				ExperimentsPackage.Literals.SET_VALUE_PROVIDER__VALUES, newValues);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.SET_VALUE_PROVIDER__VALUES:
			return getValues();
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
		case ExperimentsPackage.SET_VALUE_PROVIDER__VALUES:
			setValues((String) newValue);
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
		case ExperimentsPackage.SET_VALUE_PROVIDER__VALUES:
			setValues(VALUES_EDEFAULT);
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
		case ExperimentsPackage.SET_VALUE_PROVIDER__VALUES:
			return VALUES_EDEFAULT == null ? getValues() != null : !VALUES_EDEFAULT.equals(getValues());
		}
		return super.eIsSet(featureID);
	}

} // SetValueProviderImpl
