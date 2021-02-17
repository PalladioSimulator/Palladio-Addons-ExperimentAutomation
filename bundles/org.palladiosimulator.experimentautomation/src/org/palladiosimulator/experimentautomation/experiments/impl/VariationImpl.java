/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.palladiosimulator.experimentautomation.variation.VariationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getValueProvider
 * <em>Value Provider</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMaxValue
 * <em>Max Value</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMaxVariations
 * <em>Max Variations</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getVariedObjectId
 * <em>Varied Object Id</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getName
 * <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariationImpl extends CDOObjectImpl implements Variation {

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
     * The default value of the '{@link #getMaxVariations() <em>Max Variations</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxVariations()
     * @generated
     * @ordered
     */
    protected static final long MAX_VARIATIONS_EDEFAULT = 0L;

    /**
     * The default value of the '{@link #getVariedObjectId() <em>Varied Object Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getVariedObjectId()
     * @generated
     * @ordered
     */
    protected static final String VARIED_OBJECT_ID_EDEFAULT = null;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected VariationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.VARIATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public VariationType getType() {
        return (VariationType) this.eDynamicGet(ExperimentsPackage.VARIATION__TYPE,
                ExperimentsPackage.Literals.VARIATION__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public VariationType basicGetType() {
        return (VariationType) this.eDynamicGet(ExperimentsPackage.VARIATION__TYPE,
                ExperimentsPackage.Literals.VARIATION__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setType(final VariationType newType) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__TYPE, ExperimentsPackage.Literals.VARIATION__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ValueProvider getValueProvider() {
        return (ValueProvider) this.eDynamicGet(ExperimentsPackage.VARIATION__VALUE_PROVIDER,
                ExperimentsPackage.Literals.VARIATION__VALUE_PROVIDER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetValueProvider(final ValueProvider newValueProvider, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newValueProvider, ExperimentsPackage.VARIATION__VALUE_PROVIDER,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValueProvider(final ValueProvider newValueProvider) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__VALUE_PROVIDER,
                ExperimentsPackage.Literals.VARIATION__VALUE_PROVIDER, newValueProvider);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMinValue() {
        return (Double) this.eDynamicGet(ExperimentsPackage.VARIATION__MIN_VALUE,
                ExperimentsPackage.Literals.VARIATION__MIN_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinValue(final double newMinValue) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__MIN_VALUE, ExperimentsPackage.Literals.VARIATION__MIN_VALUE,
                newMinValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMaxValue() {
        return (Double) this.eDynamicGet(ExperimentsPackage.VARIATION__MAX_VALUE,
                ExperimentsPackage.Literals.VARIATION__MAX_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxValue(final double newMaxValue) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__MAX_VALUE, ExperimentsPackage.Literals.VARIATION__MAX_VALUE,
                newMaxValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public long getMaxVariations() {
        return (Long) this.eDynamicGet(ExperimentsPackage.VARIATION__MAX_VARIATIONS,
                ExperimentsPackage.Literals.VARIATION__MAX_VARIATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxVariations(final long newMaxVariations) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__MAX_VARIATIONS,
                ExperimentsPackage.Literals.VARIATION__MAX_VARIATIONS, newMaxVariations);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getVariedObjectId() {
        return (String) this.eDynamicGet(ExperimentsPackage.VARIATION__VARIED_OBJECT_ID,
                ExperimentsPackage.Literals.VARIATION__VARIED_OBJECT_ID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVariedObjectId(final String newVariedObjectId) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__VARIED_OBJECT_ID,
                ExperimentsPackage.Literals.VARIATION__VARIED_OBJECT_ID, newVariedObjectId);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return (String) this.eDynamicGet(ExperimentsPackage.VARIATION__NAME,
                ExperimentsPackage.Literals.VARIATION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        this.eDynamicSet(ExperimentsPackage.VARIATION__NAME, ExperimentsPackage.Literals.VARIATION__NAME, newName);
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
        case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
            return this.basicSetValueProvider(null, msgs);
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
        case ExperimentsPackage.VARIATION__TYPE:
            if (resolve) {
                return this.getType();
            }
            return this.basicGetType();
        case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
            return this.getValueProvider();
        case ExperimentsPackage.VARIATION__MIN_VALUE:
            return this.getMinValue();
        case ExperimentsPackage.VARIATION__MAX_VALUE:
            return this.getMaxValue();
        case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
            return this.getMaxVariations();
        case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
            return this.getVariedObjectId();
        case ExperimentsPackage.VARIATION__NAME:
            return this.getName();
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
        case ExperimentsPackage.VARIATION__TYPE:
            this.setType((VariationType) newValue);
            return;
        case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
            this.setValueProvider((ValueProvider) newValue);
            return;
        case ExperimentsPackage.VARIATION__MIN_VALUE:
            this.setMinValue((Double) newValue);
            return;
        case ExperimentsPackage.VARIATION__MAX_VALUE:
            this.setMaxValue((Double) newValue);
            return;
        case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
            this.setMaxVariations((Long) newValue);
            return;
        case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
            this.setVariedObjectId((String) newValue);
            return;
        case ExperimentsPackage.VARIATION__NAME:
            this.setName((String) newValue);
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
        case ExperimentsPackage.VARIATION__TYPE:
            this.setType((VariationType) null);
            return;
        case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
            this.setValueProvider((ValueProvider) null);
            return;
        case ExperimentsPackage.VARIATION__MIN_VALUE:
            this.setMinValue(MIN_VALUE_EDEFAULT);
            return;
        case ExperimentsPackage.VARIATION__MAX_VALUE:
            this.setMaxValue(MAX_VALUE_EDEFAULT);
            return;
        case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
            this.setMaxVariations(MAX_VARIATIONS_EDEFAULT);
            return;
        case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
            this.setVariedObjectId(VARIED_OBJECT_ID_EDEFAULT);
            return;
        case ExperimentsPackage.VARIATION__NAME:
            this.setName(NAME_EDEFAULT);
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
        case ExperimentsPackage.VARIATION__TYPE:
            return this.basicGetType() != null;
        case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
            return this.getValueProvider() != null;
        case ExperimentsPackage.VARIATION__MIN_VALUE:
            return this.getMinValue() != MIN_VALUE_EDEFAULT;
        case ExperimentsPackage.VARIATION__MAX_VALUE:
            return this.getMaxValue() != MAX_VALUE_EDEFAULT;
        case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
            return this.getMaxVariations() != MAX_VARIATIONS_EDEFAULT;
        case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
            return VARIED_OBJECT_ID_EDEFAULT == null ? this.getVariedObjectId() != null
                    : !VARIED_OBJECT_ID_EDEFAULT.equals(this.getVariedObjectId());
        case ExperimentsPackage.VARIATION__NAME:
            return NAME_EDEFAULT == null ? this.getName() != null : !NAME_EDEFAULT.equals(this.getName());
        }
        return super.eIsSet(featureID);
    }

} // VariationImpl
