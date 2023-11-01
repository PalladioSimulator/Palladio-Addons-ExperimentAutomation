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
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getValueProvider <em>Value Provider</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getMaxVariations <em>Max Variations</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getVariedObjectId <em>Varied Object Id</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.VariationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariationImpl extends CDOObjectImpl implements Variation {

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
	 * @see #getMaxVariations()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_VARIATIONS_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getVariedObjectId() <em>Varied Object Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariedObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIED_OBJECT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.VARIATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationType getType() {
		return (VariationType) eDynamicGet(ExperimentsPackage.VARIATION__TYPE,
				ExperimentsPackage.Literals.VARIATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VariationType basicGetType() {
		return (VariationType) eDynamicGet(ExperimentsPackage.VARIATION__TYPE,
				ExperimentsPackage.Literals.VARIATION__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VariationType newType) {
		eDynamicSet(ExperimentsPackage.VARIATION__TYPE, ExperimentsPackage.Literals.VARIATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueProvider getValueProvider() {
		return (ValueProvider) eDynamicGet(ExperimentsPackage.VARIATION__VALUE_PROVIDER,
				ExperimentsPackage.Literals.VARIATION__VALUE_PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueProvider(ValueProvider newValueProvider, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newValueProvider, ExperimentsPackage.VARIATION__VALUE_PROVIDER,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueProvider(ValueProvider newValueProvider) {
		eDynamicSet(ExperimentsPackage.VARIATION__VALUE_PROVIDER, ExperimentsPackage.Literals.VARIATION__VALUE_PROVIDER,
				newValueProvider);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinValue() {
		return (Double) eDynamicGet(ExperimentsPackage.VARIATION__MIN_VALUE,
				ExperimentsPackage.Literals.VARIATION__MIN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValue(double newMinValue) {
		eDynamicSet(ExperimentsPackage.VARIATION__MIN_VALUE, ExperimentsPackage.Literals.VARIATION__MIN_VALUE,
				newMinValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxValue() {
		return (Double) eDynamicGet(ExperimentsPackage.VARIATION__MAX_VALUE,
				ExperimentsPackage.Literals.VARIATION__MAX_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValue(double newMaxValue) {
		eDynamicSet(ExperimentsPackage.VARIATION__MAX_VALUE, ExperimentsPackage.Literals.VARIATION__MAX_VALUE,
				newMaxValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxVariations() {
		return (Long) eDynamicGet(ExperimentsPackage.VARIATION__MAX_VARIATIONS,
				ExperimentsPackage.Literals.VARIATION__MAX_VARIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxVariations(long newMaxVariations) {
		eDynamicSet(ExperimentsPackage.VARIATION__MAX_VARIATIONS, ExperimentsPackage.Literals.VARIATION__MAX_VARIATIONS,
				newMaxVariations);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariedObjectId() {
		return (String) eDynamicGet(ExperimentsPackage.VARIATION__VARIED_OBJECT_ID,
				ExperimentsPackage.Literals.VARIATION__VARIED_OBJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariedObjectId(String newVariedObjectId) {
		eDynamicSet(ExperimentsPackage.VARIATION__VARIED_OBJECT_ID,
				ExperimentsPackage.Literals.VARIATION__VARIED_OBJECT_ID, newVariedObjectId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(ExperimentsPackage.VARIATION__NAME, ExperimentsPackage.Literals.VARIATION__NAME,
				true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ExperimentsPackage.VARIATION__NAME, ExperimentsPackage.Literals.VARIATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
			return basicSetValueProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.VARIATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
			return getValueProvider();
		case ExperimentsPackage.VARIATION__MIN_VALUE:
			return getMinValue();
		case ExperimentsPackage.VARIATION__MAX_VALUE:
			return getMaxValue();
		case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
			return getMaxVariations();
		case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
			return getVariedObjectId();
		case ExperimentsPackage.VARIATION__NAME:
			return getName();
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
		case ExperimentsPackage.VARIATION__TYPE:
			setType((VariationType) newValue);
			return;
		case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
			setValueProvider((ValueProvider) newValue);
			return;
		case ExperimentsPackage.VARIATION__MIN_VALUE:
			setMinValue((Double) newValue);
			return;
		case ExperimentsPackage.VARIATION__MAX_VALUE:
			setMaxValue((Double) newValue);
			return;
		case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
			setMaxVariations((Long) newValue);
			return;
		case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
			setVariedObjectId((String) newValue);
			return;
		case ExperimentsPackage.VARIATION__NAME:
			setName((String) newValue);
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
		case ExperimentsPackage.VARIATION__TYPE:
			setType((VariationType) null);
			return;
		case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
			setValueProvider((ValueProvider) null);
			return;
		case ExperimentsPackage.VARIATION__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
			return;
		case ExperimentsPackage.VARIATION__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
			setMaxVariations(MAX_VARIATIONS_EDEFAULT);
			return;
		case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
			setVariedObjectId(VARIED_OBJECT_ID_EDEFAULT);
			return;
		case ExperimentsPackage.VARIATION__NAME:
			setName(NAME_EDEFAULT);
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
		case ExperimentsPackage.VARIATION__TYPE:
			return basicGetType() != null;
		case ExperimentsPackage.VARIATION__VALUE_PROVIDER:
			return getValueProvider() != null;
		case ExperimentsPackage.VARIATION__MIN_VALUE:
			return getMinValue() != MIN_VALUE_EDEFAULT;
		case ExperimentsPackage.VARIATION__MAX_VALUE:
			return getMaxValue() != MAX_VALUE_EDEFAULT;
		case ExperimentsPackage.VARIATION__MAX_VARIATIONS:
			return getMaxVariations() != MAX_VARIATIONS_EDEFAULT;
		case ExperimentsPackage.VARIATION__VARIED_OBJECT_ID:
			return VARIED_OBJECT_ID_EDEFAULT == null ? getVariedObjectId() != null
					: !VARIED_OBJECT_ID_EDEFAULT.equals(getVariedObjectId());
		case ExperimentsPackage.VARIATION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} // VariationImpl
