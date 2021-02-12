/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Linear Value
 * Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl#getSummand
 * <em>Summand</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl#getFactor
 * <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearValueProviderImpl extends ValueProviderImpl implements LinearValueProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * The default value of the '{@link #getSummand() <em>Summand</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSummand()
     * @generated
     * @ordered
     */
    protected static final double SUMMAND_EDEFAULT = 0.0;

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
     *
     * @generated
     */
    protected LinearValueProviderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSummand() {
        return (Double) this.eDynamicGet(ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND,
                ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER__SUMMAND, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSummand(final double newSummand) {
        this.eDynamicSet(ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND,
                ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER__SUMMAND, newSummand);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getFactor() {
        return (Double) this.eDynamicGet(ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR,
                ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER__FACTOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFactor(final double newFactor) {
        this.eDynamicSet(ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR,
                ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER__FACTOR, newFactor);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
            return this.getSummand();
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
            return this.getFactor();
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
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
            this.setSummand((Double) newValue);
            return;
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
            this.setFactor((Double) newValue);
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
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
            this.setSummand(SUMMAND_EDEFAULT);
            return;
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
            this.setFactor(FACTOR_EDEFAULT);
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
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
            return this.getSummand() != SUMMAND_EDEFAULT;
        case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
            return this.getFactor() != FACTOR_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // LinearValueProviderImpl
