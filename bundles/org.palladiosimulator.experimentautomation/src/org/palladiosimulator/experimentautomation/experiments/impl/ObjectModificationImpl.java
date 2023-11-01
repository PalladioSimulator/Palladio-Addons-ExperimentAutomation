/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;
import org.palladiosimulator.experimentautomation.variation.VariationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Object
 * Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getVariedObjectId <em>Varied Object Id</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectModificationImpl extends ModificationImpl implements ObjectModification {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

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
	 * The default value of the '{@link #getVariedObjectId() <em>Varied Object Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariedObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIED_OBJECT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectModificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.OBJECT_MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationType getType() {
		return (VariationType) eDynamicGet(ExperimentsPackage.OBJECT_MODIFICATION__TYPE,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VariationType basicGetType() {
		return (VariationType) eDynamicGet(ExperimentsPackage.OBJECT_MODIFICATION__TYPE,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VariationType newType) {
		eDynamicSet(ExperimentsPackage.OBJECT_MODIFICATION__TYPE, ExperimentsPackage.Literals.OBJECT_MODIFICATION__TYPE,
				newType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(ExperimentsPackage.OBJECT_MODIFICATION__NAME,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ExperimentsPackage.OBJECT_MODIFICATION__NAME, ExperimentsPackage.Literals.OBJECT_MODIFICATION__NAME,
				newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariedObjectId() {
		return (String) eDynamicGet(ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__VARIED_OBJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariedObjectId(String newVariedObjectId) {
		eDynamicSet(ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__VARIED_OBJECT_ID, newVariedObjectId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getValue() {
		return (Long) eDynamicGet(ExperimentsPackage.OBJECT_MODIFICATION__VALUE,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(long newValue) {
		eDynamicSet(ExperimentsPackage.OBJECT_MODIFICATION__VALUE,
				ExperimentsPackage.Literals.OBJECT_MODIFICATION__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
			return getName();
		case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
			return getVariedObjectId();
		case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
			return getValue();
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
		case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
			setType((VariationType) newValue);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
			setName((String) newValue);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
			setVariedObjectId((String) newValue);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
			setValue((Long) newValue);
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
		case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
			setType((VariationType) null);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
			setVariedObjectId(VARIED_OBJECT_ID_EDEFAULT);
			return;
		case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
			return basicGetType() != null;
		case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
			return VARIED_OBJECT_ID_EDEFAULT == null ? getVariedObjectId() != null
					: !VARIED_OBJECT_ID_EDEFAULT.equals(getVariedObjectId());
		case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
			return getValue() != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ObjectModificationImpl
