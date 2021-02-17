/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Nested Intervals Double
 * Value Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsDoubleValueProviderImpl#getMaxValue
 * <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedIntervalsDoubleValueProviderImpl extends ValueProviderImpl
        implements NestedIntervalsDoubleValueProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
    protected static final double MIN_VALUE_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final double MAX_VALUE_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NestedIntervalsDoubleValueProviderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMinValue() {
        return (Double) this.eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinValue(final double newMinValue) {
        this.eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE, newMinValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMaxValue() {
        return (Double) this.eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxValue(final double newMaxValue) {
        this.eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE, newMaxValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE:
            return this.getMinValue();
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE:
            return this.getMaxValue();
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
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE:
            this.setMinValue((Double) newValue);
            return;
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE:
            this.setMaxValue((Double) newValue);
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
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE:
            this.setMinValue(MIN_VALUE_EDEFAULT);
            return;
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE:
            this.setMaxValue(MAX_VALUE_EDEFAULT);
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
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE:
            return this.getMinValue() != MIN_VALUE_EDEFAULT;
        case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE:
            return this.getMaxValue() != MAX_VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // NestedIntervalsDoubleValueProviderImpl
