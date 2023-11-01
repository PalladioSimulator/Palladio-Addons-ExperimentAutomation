/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.ExportOption;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>File Datasource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.FileDatasourceImpl#getExportOption <em>Export Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileDatasourceImpl extends EDP2DatasourceImpl implements FileDatasource {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExportOption() <em>Export Option</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getExportOption()
	 * @generated
	 * @ordered
	 */
	protected static final ExportOption EXPORT_OPTION_EDEFAULT = ExportOption.EDP2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDatasourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsimulationPackage.Literals.FILE_DATASOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String) eDynamicGet(AbstractsimulationPackage.FILE_DATASOURCE__LOCATION,
				AbstractsimulationPackage.Literals.FILE_DATASOURCE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(AbstractsimulationPackage.FILE_DATASOURCE__LOCATION,
				AbstractsimulationPackage.Literals.FILE_DATASOURCE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportOption getExportOption() {
		return (ExportOption) eDynamicGet(AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION,
				AbstractsimulationPackage.Literals.FILE_DATASOURCE__EXPORT_OPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportOption(ExportOption newExportOption) {
		eDynamicSet(AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION,
				AbstractsimulationPackage.Literals.FILE_DATASOURCE__EXPORT_OPTION, newExportOption);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AbstractsimulationPackage.FILE_DATASOURCE__LOCATION:
			return getLocation();
		case AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION:
			return getExportOption();
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
		case AbstractsimulationPackage.FILE_DATASOURCE__LOCATION:
			setLocation((String) newValue);
			return;
		case AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION:
			setExportOption((ExportOption) newValue);
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
		case AbstractsimulationPackage.FILE_DATASOURCE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION:
			setExportOption(EXPORT_OPTION_EDEFAULT);
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
		case AbstractsimulationPackage.FILE_DATASOURCE__LOCATION:
			return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
		case AbstractsimulationPackage.FILE_DATASOURCE__EXPORT_OPTION:
			return getExportOption() != EXPORT_OPTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // FileDatasourceImpl
