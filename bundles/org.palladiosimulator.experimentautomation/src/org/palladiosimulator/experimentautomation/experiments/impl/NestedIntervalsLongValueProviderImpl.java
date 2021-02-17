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
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMaxValue
 * <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedIntervalsLongValueProviderImpl extends ValueProviderImpl
        implements NestedIntervalsLongValueProvider {

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
     *
     * @generated
     */
    protected NestedIntervalsLongValueProviderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public long getMinValue() {
        return (Long) this.eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinValue(final long newMinValue) {
        this.eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE, newMinValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public long getMaxValue() {
        return (Long) this.eDynamicGet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxValue(final long newMaxValue) {
        this.eDynamicSet(ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE,
                ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE, newMaxValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
            return this.getMinValue();
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
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
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
            this.setMinValue((Long) newValue);
            return;
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
            this.setMaxValue((Long) newValue);
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
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
            this.setMinValue(MIN_VALUE_EDEFAULT);
            return;
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
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
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
            return this.getMinValue() != MIN_VALUE_EDEFAULT;
        case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
            return this.getMaxValue() != MAX_VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // NestedIntervalsLongValueProviderImpl
