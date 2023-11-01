/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentDesign;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.Modification;
import org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.Variation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Experiment</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getVariations <em>Variations</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getModifications <em>Modifications</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getToolConfiguration <em>Tool Configuration</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getStopConditions <em>Stop Conditions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getExperimentDesign <em>Experiment Design</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getResponseMeasurement <em>Response Measurement</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getInitialModel <em>Initial Model</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ExperimentImpl#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentImpl extends CDOObjectImpl implements Experiment {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int REPETITIONS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.EXPERIMENT;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Variation> getVariations() {
		return (EList<Variation>) eDynamicGet(ExperimentsPackage.EXPERIMENT__VARIATIONS,
				ExperimentsPackage.Literals.EXPERIMENT__VARIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Modification> getModifications() {
		return (EList<Modification>) eDynamicGet(ExperimentsPackage.EXPERIMENT__MODIFICATIONS,
				ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eDynamicGet(ExperimentsPackage.EXPERIMENT__ID, ExperimentsPackage.Literals.EXPERIMENT__ID, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__ID, ExperimentsPackage.Literals.EXPERIMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(ExperimentsPackage.EXPERIMENT__NAME, ExperimentsPackage.Literals.EXPERIMENT__NAME,
				true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__NAME, ExperimentsPackage.Literals.EXPERIMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ToolConfiguration> getToolConfiguration() {
		return (EList<ToolConfiguration>) eDynamicGet(ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION,
				ExperimentsPackage.Literals.EXPERIMENT__TOOL_CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StopCondition> getStopConditions() {
		return (EList<StopCondition>) eDynamicGet(ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS,
				ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(ExperimentsPackage.EXPERIMENT__DESCRIPTION,
				ExperimentsPackage.Literals.EXPERIMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__DESCRIPTION, ExperimentsPackage.Literals.EXPERIMENT__DESCRIPTION,
				newDescription);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentDesign getExperimentDesign() {
		return (ExperimentDesign) eDynamicGet(ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN,
				ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentDesign(ExperimentDesign newExperimentDesign, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newExperimentDesign,
				ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentDesign(ExperimentDesign newExperimentDesign) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN,
				ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN, newExperimentDesign);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseMeasurement getResponseMeasurement() {
		return (ResponseMeasurement) eDynamicGet(ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT,
				ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseMeasurement(ResponseMeasurement newResponseMeasurement,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newResponseMeasurement,
				ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseMeasurement(ResponseMeasurement newResponseMeasurement) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT,
				ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT, newResponseMeasurement);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialModel getInitialModel() {
		return (InitialModel) eDynamicGet(ExperimentsPackage.EXPERIMENT__INITIAL_MODEL,
				ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialModel(InitialModel newInitialModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newInitialModel, ExperimentsPackage.EXPERIMENT__INITIAL_MODEL,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialModel(InitialModel newInitialModel) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__INITIAL_MODEL, ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL,
				newInitialModel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRepetitions() {
		return (Integer) eDynamicGet(ExperimentsPackage.EXPERIMENT__REPETITIONS,
				ExperimentsPackage.Literals.EXPERIMENT__REPETITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepetitions(int newRepetitions) {
		eDynamicSet(ExperimentsPackage.EXPERIMENT__REPETITIONS, ExperimentsPackage.Literals.EXPERIMENT__REPETITIONS,
				newRepetitions);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
			return ((InternalEList<?>) getVariations()).basicRemove(otherEnd, msgs);
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
			return ((InternalEList<?>) getModifications()).basicRemove(otherEnd, msgs);
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
			return ((InternalEList<?>) getToolConfiguration()).basicRemove(otherEnd, msgs);
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
			return ((InternalEList<?>) getStopConditions()).basicRemove(otherEnd, msgs);
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
			return basicSetExperimentDesign(null, msgs);
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
			return basicSetResponseMeasurement(null, msgs);
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			return basicSetInitialModel(null, msgs);
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
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
			return getVariations();
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
			return getModifications();
		case ExperimentsPackage.EXPERIMENT__ID:
			return getId();
		case ExperimentsPackage.EXPERIMENT__NAME:
			return getName();
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
			return getToolConfiguration();
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
			return getStopConditions();
		case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
			return getDescription();
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
			return getExperimentDesign();
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
			return getResponseMeasurement();
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			return getInitialModel();
		case ExperimentsPackage.EXPERIMENT__REPETITIONS:
			return getRepetitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
			getVariations().clear();
			getVariations().addAll((Collection<? extends Variation>) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
			getModifications().clear();
			getModifications().addAll((Collection<? extends Modification>) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__ID:
			setId((String) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__NAME:
			setName((String) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
			getToolConfiguration().clear();
			getToolConfiguration().addAll((Collection<? extends ToolConfiguration>) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
			getStopConditions().clear();
			getStopConditions().addAll((Collection<? extends StopCondition>) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
			setExperimentDesign((ExperimentDesign) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
			setResponseMeasurement((ResponseMeasurement) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			setInitialModel((InitialModel) newValue);
			return;
		case ExperimentsPackage.EXPERIMENT__REPETITIONS:
			setRepetitions((Integer) newValue);
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
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
			getVariations().clear();
			return;
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
			getModifications().clear();
			return;
		case ExperimentsPackage.EXPERIMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case ExperimentsPackage.EXPERIMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
			getToolConfiguration().clear();
			return;
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
			getStopConditions().clear();
			return;
		case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
			setExperimentDesign((ExperimentDesign) null);
			return;
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
			setResponseMeasurement((ResponseMeasurement) null);
			return;
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			setInitialModel((InitialModel) null);
			return;
		case ExperimentsPackage.EXPERIMENT__REPETITIONS:
			setRepetitions(REPETITIONS_EDEFAULT);
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
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
			return !getVariations().isEmpty();
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
			return !getModifications().isEmpty();
		case ExperimentsPackage.EXPERIMENT__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		case ExperimentsPackage.EXPERIMENT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
			return !getToolConfiguration().isEmpty();
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
			return !getStopConditions().isEmpty();
		case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
			return getExperimentDesign() != null;
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
			return getResponseMeasurement() != null;
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			return getInitialModel() != null;
		case ExperimentsPackage.EXPERIMENT__REPETITIONS:
			return getRepetitions() != REPETITIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ExperimentImpl
