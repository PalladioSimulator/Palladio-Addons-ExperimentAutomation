/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Reconfiguration Rules
 * Folder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ReconfigurationRulesFolderImpl#getFolderUri
 * <em>Folder Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationRulesFolderImpl extends CDOObjectImpl implements ReconfigurationRulesFolder {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";
    /**
     * The default value of the '{@link #getFolderUri() <em>Folder Uri</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFolderUri()
     * @generated
     * @ordered
     */
    protected static final String FOLDER_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReconfigurationRulesFolderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.RECONFIGURATION_RULES_FOLDER;
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
    public String getFolderUri() {
        return (String) this.eDynamicGet(ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI,
                ExperimentsPackage.Literals.RECONFIGURATION_RULES_FOLDER__FOLDER_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFolderUri(final String newFolderUri) {
        this.eDynamicSet(ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI,
                ExperimentsPackage.Literals.RECONFIGURATION_RULES_FOLDER__FOLDER_URI, newFolderUri);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI:
            return this.getFolderUri();
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
        case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI:
            this.setFolderUri((String) newValue);
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
        case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI:
            this.setFolderUri(FOLDER_URI_EDEFAULT);
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
        case ExperimentsPackage.RECONFIGURATION_RULES_FOLDER__FOLDER_URI:
            return FOLDER_URI_EDEFAULT == null ? this.getFolderUri() != null
                    : !FOLDER_URI_EDEFAULT.equals(this.getFolderUri());
        }
        return super.eIsSet(featureID);
    }

} // ReconfigurationRulesFolderImpl
