/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Polynomial Value
 * Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.PolynomialValueProviderImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolynomialValueProviderImpl extends ValueProviderImpl implements PolynomialValueProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPONENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PolynomialValueProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.POLYNOMIAL_VALUE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExponent() {
		return (Double) eDynamicGet(ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT,
				ExperimentsPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__EXPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponent(double newExponent) {
		eDynamicSet(ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT,
				ExperimentsPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__EXPONENT, newExponent);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFactor() {
		return (Double) eDynamicGet(ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR,
				ExperimentsPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__FACTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactor(double newFactor) {
		eDynamicSet(ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR,
				ExperimentsPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__FACTOR, newFactor);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
			return getExponent();
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
			return getFactor();
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
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
			setExponent((Double) newValue);
			return;
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
			setFactor((Double) newValue);
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
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
			setExponent(EXPONENT_EDEFAULT);
			return;
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
			setFactor(FACTOR_EDEFAULT);
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
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
			return getExponent() != EXPONENT_EDEFAULT;
		case ExperimentsPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
			return getFactor() != FACTOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // PolynomialValueProviderImpl
