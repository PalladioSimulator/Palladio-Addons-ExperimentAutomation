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
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.scaledl.usageevolution.UsageEvolution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Initial Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageModel
 * <em>Usage Model</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getAllocation
 * <em>Allocation</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMiddlewareRepository
 * <em>Middleware Repository</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getEventMiddleWareRepository
 * <em>Event Middle Ware Repository</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getReconfigurationRules
 * <em>Reconfiguration Rules</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMonitorRepository
 * <em>Monitor Repository</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getServiceLevelObjectives
 * <em>Service Level Objectives</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getRepository
 * <em>Repository</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getSystem
 * <em>System</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getResourceEnvironment
 * <em>Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageEvolution
 * <em>Usage Evolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialModelImpl extends CDOObjectImpl implements InitialModel {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InitialModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.INITIAL_MODEL;
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
    public UsageModel getUsageModel() {
        return (UsageModel) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageModel basicGetUsageModel() {
        return (UsageModel) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageModel(final UsageModel newUsageModel) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, newUsageModel);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Allocation getAllocation() {
        return (Allocation) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION,
                ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Allocation basicGetAllocation() {
        return (Allocation) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION,
                ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAllocation(final Allocation newAllocation) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__ALLOCATION,
                ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, newAllocation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repository getMiddlewareRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Repository basicGetMiddlewareRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMiddlewareRepository(final Repository newMiddlewareRepository) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, newMiddlewareRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repository getEventMiddleWareRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Repository basicGetEventMiddleWareRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEventMiddleWareRepository(final Repository newEventMiddleWareRepository) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, newEventMiddleWareRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReconfigurationRulesFolder getReconfigurationRules() {
        return (ReconfigurationRulesFolder) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
                ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ReconfigurationRulesFolder basicGetReconfigurationRules() {
        return (ReconfigurationRulesFolder) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
                ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReconfigurationRules(final ReconfigurationRulesFolder newReconfigurationRules) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES,
                ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, newReconfigurationRules);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MonitorRepository getMonitorRepository() {
        return (MonitorRepository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MonitorRepository basicGetMonitorRepository() {
        return (MonitorRepository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMonitorRepository(final MonitorRepository newMonitorRepository) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, newMonitorRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceLevelObjectiveRepository getServiceLevelObjectives() {
        return (ServiceLevelObjectiveRepository) this.eDynamicGet(
                ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
                ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceLevelObjectiveRepository basicGetServiceLevelObjectives() {
        return (ServiceLevelObjectiveRepository) this.eDynamicGet(
                ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
                ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceLevelObjectives(final ServiceLevelObjectiveRepository newServiceLevelObjectives) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES,
                ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, newServiceLevelObjectives);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repository getRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Repository basicGetRepository() {
        return (Repository) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepository(final Repository newRepository) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__REPOSITORY,
                ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, newRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.palladiosimulator.pcm.system.System getSystem() {
        return (org.palladiosimulator.pcm.system.System) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SYSTEM,
                ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.palladiosimulator.pcm.system.System basicGetSystem() {
        return (org.palladiosimulator.pcm.system.System) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__SYSTEM,
                ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSystem(final org.palladiosimulator.pcm.system.System newSystem) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__SYSTEM, ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM,
                newSystem);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceEnvironment getResourceEnvironment() {
        return (ResourceEnvironment) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
                ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ResourceEnvironment basicGetResourceEnvironment() {
        return (ResourceEnvironment) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
                ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResourceEnvironment(final ResourceEnvironment newResourceEnvironment) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT,
                ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, newResourceEnvironment);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageEvolution getUsageEvolution() {
        return (UsageEvolution) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageEvolution basicGetUsageEvolution() {
        return (UsageEvolution) this.eDynamicGet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageEvolution(final UsageEvolution newUsageEvolution) {
        this.eDynamicSet(ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION,
                ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, newUsageEvolution);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
            if (resolve) {
                return this.getUsageModel();
            }
            return this.basicGetUsageModel();
        case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
            if (resolve) {
                return this.getAllocation();
            }
            return this.basicGetAllocation();
        case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
            if (resolve) {
                return this.getMiddlewareRepository();
            }
            return this.basicGetMiddlewareRepository();
        case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
            if (resolve) {
                return this.getEventMiddleWareRepository();
            }
            return this.basicGetEventMiddleWareRepository();
        case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
            if (resolve) {
                return this.getReconfigurationRules();
            }
            return this.basicGetReconfigurationRules();
        case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
            if (resolve) {
                return this.getMonitorRepository();
            }
            return this.basicGetMonitorRepository();
        case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
            if (resolve) {
                return this.getServiceLevelObjectives();
            }
            return this.basicGetServiceLevelObjectives();
        case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
            if (resolve) {
                return this.getRepository();
            }
            return this.basicGetRepository();
        case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
            if (resolve) {
                return this.getSystem();
            }
            return this.basicGetSystem();
        case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
            if (resolve) {
                return this.getResourceEnvironment();
            }
            return this.basicGetResourceEnvironment();
        case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
            if (resolve) {
                return this.getUsageEvolution();
            }
            return this.basicGetUsageEvolution();
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
        case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
            this.setUsageModel((UsageModel) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
            this.setAllocation((Allocation) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
            this.setMiddlewareRepository((Repository) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
            this.setEventMiddleWareRepository((Repository) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
            this.setReconfigurationRules((ReconfigurationRulesFolder) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
            this.setMonitorRepository((MonitorRepository) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
            this.setServiceLevelObjectives((ServiceLevelObjectiveRepository) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
            this.setRepository((Repository) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
            this.setSystem((org.palladiosimulator.pcm.system.System) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
            this.setResourceEnvironment((ResourceEnvironment) newValue);
            return;
        case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
            this.setUsageEvolution((UsageEvolution) newValue);
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
        case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
            this.setUsageModel((UsageModel) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
            this.setAllocation((Allocation) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
            this.setMiddlewareRepository((Repository) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
            this.setEventMiddleWareRepository((Repository) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
            this.setReconfigurationRules((ReconfigurationRulesFolder) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
            this.setMonitorRepository((MonitorRepository) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
            this.setServiceLevelObjectives((ServiceLevelObjectiveRepository) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
            this.setRepository((Repository) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
            this.setSystem((org.palladiosimulator.pcm.system.System) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
            this.setResourceEnvironment((ResourceEnvironment) null);
            return;
        case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
            this.setUsageEvolution((UsageEvolution) null);
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
        case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
            return this.basicGetUsageModel() != null;
        case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
            return this.basicGetAllocation() != null;
        case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
            return this.basicGetMiddlewareRepository() != null;
        case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
            return this.basicGetEventMiddleWareRepository() != null;
        case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
            return this.basicGetReconfigurationRules() != null;
        case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
            return this.basicGetMonitorRepository() != null;
        case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
            return this.basicGetServiceLevelObjectives() != null;
        case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
            return this.basicGetRepository() != null;
        case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
            return this.basicGetSystem() != null;
        case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
            return this.basicGetResourceEnvironment() != null;
        case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
            return this.basicGetUsageEvolution() != null;
        }
        return super.eIsSet(featureID);
    }

} // InitialModelImpl
