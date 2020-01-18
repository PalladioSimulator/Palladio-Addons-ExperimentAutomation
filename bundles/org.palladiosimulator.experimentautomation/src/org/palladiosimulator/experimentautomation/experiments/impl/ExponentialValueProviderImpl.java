/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Exponential Value
 * Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExponentialValueProviderImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialValueProviderImpl extends ValueProviderImpl implements ExponentialValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialValueProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.EXPONENTIAL_VALUE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBase() {
		return (Double) eDynamicGet(ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE,
				ExperimentsPackage.Literals.EXPONENTIAL_VALUE_PROVIDER__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(double newBase) {
		eDynamicSet(ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE,
				ExperimentsPackage.Literals.EXPONENTIAL_VALUE_PROVIDER__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE:
			return getBase();
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
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE:
			setBase((Double) newValue);
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
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE:
			setBase(BASE_EDEFAULT);
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
		case ExperimentsPackage.EXPONENTIAL_VALUE_PROVIDER__BASE:
			return getBase() != BASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ExponentialValueProviderImpl
