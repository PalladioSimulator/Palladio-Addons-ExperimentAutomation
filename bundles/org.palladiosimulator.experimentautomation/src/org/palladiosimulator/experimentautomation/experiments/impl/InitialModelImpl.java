/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.semanticspd.Configuration;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.palladiosimulator.spd.SPD;
import org.scaledl.usageevolution.UsageEvolution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Initial Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMiddlewareRepository <em>Middleware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getEventMiddleWareRepository <em>Event Middle Ware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getReconfigurationRules <em>Reconfiguration Rules</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMonitorRepository <em>Monitor Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getServiceLevelObjectives <em>Service Level Objectives</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageEvolution <em>Usage Evolution</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getScalingDefinitions <em>Scaling Definitions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getSpdSemanticConfiguration <em>Spd Semantic Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialModelImpl extends CDOObjectImpl implements InitialModel {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.INITIAL_MODEL;
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
	public UsageModel getUsageModel() {
		return (UsageModel) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel basicGetUsageModel() {
		return (UsageModel) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageModel(UsageModel newUsageModel) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, newUsageModel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Allocation getAllocation() {
		return (Allocation) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION,
				ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation basicGetAllocation() {
		return (Allocation) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION,
				ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocation(Allocation newAllocation) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION, ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION,
				newAllocation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getMiddlewareRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetMiddlewareRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddlewareRepository(Repository newMiddlewareRepository) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, newMiddlewareRepository);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getEventMiddleWareRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetEventMiddleWareRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventMiddleWareRepository(Repository newEventMiddleWareRepository) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, newEventMiddleWareRepository);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigurationRulesFolder getReconfigurationRules() {
		return (ReconfigurationRulesFolder) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
				ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRulesFolder basicGetReconfigurationRules() {
		return (ReconfigurationRulesFolder) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
				ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconfigurationRules(ReconfigurationRulesFolder newReconfigurationRules) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
				ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, newReconfigurationRules);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitorRepository getMonitorRepository() {
		return (MonitorRepository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorRepository basicGetMonitorRepository() {
		return (MonitorRepository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitorRepository(MonitorRepository newMonitorRepository) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, newMonitorRepository);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLevelObjectiveRepository getServiceLevelObjectives() {
		return (ServiceLevelObjectiveRepository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
				ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectiveRepository basicGetServiceLevelObjectives() {
		return (ServiceLevelObjectiveRepository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
				ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceLevelObjectives(ServiceLevelObjectiveRepository newServiceLevelObjectives) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
				ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, newServiceLevelObjectives);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return (Repository) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY,
				ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(Repository newRepository) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY, ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY,
				newRepository);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.palladiosimulator.pcm.system.System getSystem() {
		return (org.palladiosimulator.pcm.system.System) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SYSTEM,
				ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System basicGetSystem() {
		return (org.palladiosimulator.pcm.system.System) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SYSTEM,
				ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(org.palladiosimulator.pcm.system.System newSystem) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SYSTEM, ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM,
				newSystem);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceEnvironment getResourceEnvironment() {
		return (ResourceEnvironment) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
				ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment basicGetResourceEnvironment() {
		return (ResourceEnvironment) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
				ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
				ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, newResourceEnvironment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageEvolution getUsageEvolution() {
		return (UsageEvolution) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsageEvolution basicGetUsageEvolution() {
		return (UsageEvolution) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageEvolution(UsageEvolution newUsageEvolution) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
				ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, newUsageEvolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPD getScalingDefinitions() {
		return (SPD) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS,
				ExperimentsPackage.Literals.INITIAL_MODEL__SCALING_DEFINITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD basicGetScalingDefinitions() {
		return (SPD) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS,
				ExperimentsPackage.Literals.INITIAL_MODEL__SCALING_DEFINITIONS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingDefinitions(SPD newScalingDefinitions) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS,
				ExperimentsPackage.Literals.INITIAL_MODEL__SCALING_DEFINITIONS, newScalingDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getSpdSemanticConfiguration() {
		return (Configuration) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION,
				ExperimentsPackage.Literals.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetSpdSemanticConfiguration() {
		return (Configuration) eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION,
				ExperimentsPackage.Literals.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpdSemanticConfiguration(Configuration newSpdSemanticConfiguration) {
		eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION,
				ExperimentsPackage.Literals.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION, newSpdSemanticConfiguration);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
			if (resolve)
				return getUsageModel();
			return basicGetUsageModel();
		case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
			if (resolve)
				return getAllocation();
			return basicGetAllocation();
		case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
			if (resolve)
				return getMiddlewareRepository();
			return basicGetMiddlewareRepository();
		case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
			if (resolve)
				return getEventMiddleWareRepository();
			return basicGetEventMiddleWareRepository();
		case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
			if (resolve)
				return getReconfigurationRules();
			return basicGetReconfigurationRules();
		case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
			if (resolve)
				return getMonitorRepository();
			return basicGetMonitorRepository();
		case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
			if (resolve)
				return getServiceLevelObjectives();
			return basicGetServiceLevelObjectives();
		case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
			if (resolve)
				return getResourceEnvironment();
			return basicGetResourceEnvironment();
		case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
			if (resolve)
				return getUsageEvolution();
			return basicGetUsageEvolution();
		case ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS:
			if (resolve)
				return getScalingDefinitions();
			return basicGetScalingDefinitions();
		case ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION:
			if (resolve)
				return getSpdSemanticConfiguration();
			return basicGetSpdSemanticConfiguration();
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
		case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
			setUsageModel((UsageModel) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
			setAllocation((Allocation) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
			setMiddlewareRepository((Repository) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
			setEventMiddleWareRepository((Repository) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
			setReconfigurationRules((ReconfigurationRulesFolder) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
			setMonitorRepository((MonitorRepository) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
			setServiceLevelObjectives((ServiceLevelObjectiveRepository) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
			setSystem((org.palladiosimulator.pcm.system.System) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
			setResourceEnvironment((ResourceEnvironment) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
			setUsageEvolution((UsageEvolution) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS:
			setScalingDefinitions((SPD) newValue);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION:
			setSpdSemanticConfiguration((Configuration) newValue);
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
		case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
			setUsageModel((UsageModel) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
			setAllocation((Allocation) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
			setMiddlewareRepository((Repository) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
			setEventMiddleWareRepository((Repository) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
			setReconfigurationRules((ReconfigurationRulesFolder) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
			setMonitorRepository((MonitorRepository) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
			setServiceLevelObjectives((ServiceLevelObjectiveRepository) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
			setRepository((Repository) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
			setSystem((org.palladiosimulator.pcm.system.System) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
			setResourceEnvironment((ResourceEnvironment) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
			setUsageEvolution((UsageEvolution) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS:
			setScalingDefinitions((SPD) null);
			return;
		case ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION:
			setSpdSemanticConfiguration((Configuration) null);
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
		case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
			return basicGetUsageModel() != null;
		case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
			return basicGetAllocation() != null;
		case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
			return basicGetMiddlewareRepository() != null;
		case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
			return basicGetEventMiddleWareRepository() != null;
		case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
			return basicGetReconfigurationRules() != null;
		case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
			return basicGetMonitorRepository() != null;
		case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
			return basicGetServiceLevelObjectives() != null;
		case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
			return basicGetRepository() != null;
		case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
			return basicGetSystem() != null;
		case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
			return basicGetResourceEnvironment() != null;
		case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
			return basicGetUsageEvolution() != null;
		case ExperimentsPackage.INITIAL_MODEL__SCALING_DEFINITIONS:
			return basicGetScalingDefinitions() != null;
		case ExperimentsPackage.INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION:
			return basicGetSpdSemanticConfiguration() != null;
		}
		return super.eIsSet(featureID);
	}

} // InitialModelImpl
