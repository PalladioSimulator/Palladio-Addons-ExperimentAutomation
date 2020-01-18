/**
 */
package org.palladiosimulator.experimentautomation.variation.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;
import org.palladiosimulator.experimentautomation.variation.VariationType;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.variation.impl.VariationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.variation.impl.VariationTypeImpl#getStrategyClass <em>Strategy Class</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.variation.impl.VariationTypeImpl#getVariedEntityInterface <em>Varied Entity Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariationTypeImpl extends IdentifierImpl implements VariationType {

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
	 * The default value of the '{@link #getStrategyClass() <em>Strategy Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStrategyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_CLASS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVariedEntityInterface() <em>Varied Entity Interface</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariedEntityInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIED_ENTITY_INTERFACE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariationPackage.Literals.VARIATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(VariationPackage.VARIATION_TYPE__NAME,
				VariationPackage.Literals.VARIATION_TYPE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(VariationPackage.VARIATION_TYPE__NAME, VariationPackage.Literals.VARIATION_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategyClass() {
		return (String) eDynamicGet(VariationPackage.VARIATION_TYPE__STRATEGY_CLASS,
				VariationPackage.Literals.VARIATION_TYPE__STRATEGY_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategyClass(String newStrategyClass) {
		eDynamicSet(VariationPackage.VARIATION_TYPE__STRATEGY_CLASS,
				VariationPackage.Literals.VARIATION_TYPE__STRATEGY_CLASS, newStrategyClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariedEntityInterface() {
		return (String) eDynamicGet(VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE,
				VariationPackage.Literals.VARIATION_TYPE__VARIED_ENTITY_INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariedEntityInterface(String newVariedEntityInterface) {
		eDynamicSet(VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE,
				VariationPackage.Literals.VARIATION_TYPE__VARIED_ENTITY_INTERFACE, newVariedEntityInterface);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VariationPackage.VARIATION_TYPE__NAME:
			return getName();
		case VariationPackage.VARIATION_TYPE__STRATEGY_CLASS:
			return getStrategyClass();
		case VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE:
			return getVariedEntityInterface();
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
		case VariationPackage.VARIATION_TYPE__NAME:
			setName((String) newValue);
			return;
		case VariationPackage.VARIATION_TYPE__STRATEGY_CLASS:
			setStrategyClass((String) newValue);
			return;
		case VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE:
			setVariedEntityInterface((String) newValue);
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
		case VariationPackage.VARIATION_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case VariationPackage.VARIATION_TYPE__STRATEGY_CLASS:
			setStrategyClass(STRATEGY_CLASS_EDEFAULT);
			return;
		case VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE:
			setVariedEntityInterface(VARIED_ENTITY_INTERFACE_EDEFAULT);
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
		case VariationPackage.VARIATION_TYPE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case VariationPackage.VARIATION_TYPE__STRATEGY_CLASS:
			return STRATEGY_CLASS_EDEFAULT == null ? getStrategyClass() != null
					: !STRATEGY_CLASS_EDEFAULT.equals(getStrategyClass());
		case VariationPackage.VARIATION_TYPE__VARIED_ENTITY_INTERFACE:
			return VARIED_ENTITY_INTERFACE_EDEFAULT == null ? getVariedEntityInterface() != null
					: !VARIED_ENTITY_INTERFACE_EDEFAULT.equals(getVariedEntityInterface());
		}
		return super.eIsSet(featureID);
	}

} // VariationTypeImpl
