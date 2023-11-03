/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.cdo.CDOObject;
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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Initial Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMiddlewareRepository <em>Middleware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getEventMiddleWareRepository <em>Event Middle Ware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getReconfigurationRules <em>Reconfiguration Rules</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMonitorRepository <em>Monitor Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getServiceLevelObjectives <em>Service Level Objectives</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getSystem <em>System</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageEvolution <em>Usage Evolution</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getScalingDefinitions <em>Scaling Definitions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getSpdSemanticConfiguration <em>Spd Semantic Configuration</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface InitialModel extends CDOObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Model</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Model</em>' reference.
	 * @see #setUsageModel(UsageModel)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_UsageModel()
	 * @model
	 * @generated
	 */
	UsageModel getUsageModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageModel <em>Usage Model</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Model</em>' reference.
	 * @see #getUsageModel()
	 * @generated
	 */
	void setUsageModel(UsageModel value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' reference.
	 * @see #setAllocation(Allocation)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_Allocation()
	 * @model
	 * @generated
	 */
	Allocation getAllocation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getAllocation <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(Allocation value);

	/**
	 * Returns the value of the '<em><b>Middleware Repository</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middleware Repository</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Middleware Repository</em>' reference.
	 * @see #setMiddlewareRepository(Repository)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_MiddlewareRepository()
	 * @model required="true"
	 * @generated
	 */
	Repository getMiddlewareRepository();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMiddlewareRepository <em>Middleware Repository</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware Repository</em>' reference.
	 * @see #getMiddlewareRepository()
	 * @generated
	 */
	void setMiddlewareRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Event Middle Ware Repository</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Middle Ware Repository</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Event Middle Ware Repository</em>' reference.
	 * @see #setEventMiddleWareRepository(Repository)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_EventMiddleWareRepository()
	 * @model required="true"
	 * @generated
	 */
	Repository getEventMiddleWareRepository();

	/**
	 * Sets the value of the '
	 * {@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getEventMiddleWareRepository
	 * <em>Event Middle Ware Repository</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Event Middle Ware Repository</em>' reference.
	 * @see #getEventMiddleWareRepository()
	 * @generated
	 */
	void setEventMiddleWareRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rules</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rules</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Reconfiguration Rules</em>' reference.
	 * @see #setReconfigurationRules(ReconfigurationRulesFolder)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_ReconfigurationRules()
	 * @model
	 * @generated
	 */
	ReconfigurationRulesFolder getReconfigurationRules();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getReconfigurationRules <em>Reconfiguration Rules</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rules</em>' reference.
	 * @see #getReconfigurationRules()
	 * @generated
	 */
	void setReconfigurationRules(ReconfigurationRulesFolder value);

	/**
	 * Returns the value of the '<em><b>Monitor Repository</b></em>' reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Monitor Repository</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Repository</em>' reference.
	 * @see #setMonitorRepository(MonitorRepository)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_MonitorRepository()
	 * @model
	 * @generated
	 */
	MonitorRepository getMonitorRepository();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getMonitorRepository <em>Monitor Repository</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Repository</em>' reference.
	 * @see #getMonitorRepository()
	 * @generated
	 */
	void setMonitorRepository(MonitorRepository value);

	/**
	 * Returns the value of the '<em><b>Service Level Objectives</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Level Objectives</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Service Level Objectives</em>' reference.
	 * @see #setServiceLevelObjectives(ServiceLevelObjectiveRepository)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_ServiceLevelObjectives()
	 * @model
	 * @generated
	 */
	ServiceLevelObjectiveRepository getServiceLevelObjectives();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getServiceLevelObjectives <em>Service Level Objectives</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level Objectives</em>' reference.
	 * @see #getServiceLevelObjectives()
	 * @generated
	 */
	void setServiceLevelObjectives(ServiceLevelObjectiveRepository value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(org.palladiosimulator.pcm.system.System)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_System()
	 * @model
	 * @generated
	 */
	org.palladiosimulator.pcm.system.System getSystem();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.palladiosimulator.pcm.system.System value);

	/**
	 * Returns the value of the '<em><b>Resource Environment</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Environment</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Resource Environment</em>' reference.
	 * @see #setResourceEnvironment(ResourceEnvironment)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_ResourceEnvironment()
	 * @model
	 * @generated
	 */
	ResourceEnvironment getResourceEnvironment();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getResourceEnvironment <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment</em>' reference.
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	void setResourceEnvironment(ResourceEnvironment value);

	/**
	 * Returns the value of the '<em><b>Usage Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Evolution</em>' reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Evolution</em>' reference.
	 * @see #setUsageEvolution(UsageEvolution)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_UsageEvolution()
	 * @model
	 * @generated
	 */
	UsageEvolution getUsageEvolution();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getUsageEvolution <em>Usage Evolution</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Evolution</em>' reference.
	 * @see #getUsageEvolution()
	 * @generated
	 */
	void setUsageEvolution(UsageEvolution value);

	/**
	 * Returns the value of the '<em><b>Scaling Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Definitions</em>' reference.
	 * @see #setScalingDefinitions(SPD)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_ScalingDefinitions()
	 * @model
	 * @generated
	 */
	SPD getScalingDefinitions();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getScalingDefinitions <em>Scaling Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Definitions</em>' reference.
	 * @see #getScalingDefinitions()
	 * @generated
	 */
	void setScalingDefinitions(SPD value);

	/**
	 * Returns the value of the '<em><b>Spd Semantic Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spd Semantic Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spd Semantic Configuration</em>' reference.
	 * @see #setSpdSemanticConfiguration(Configuration)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getInitialModel_SpdSemanticConfiguration()
	 * @model
	 * @generated
	 */
	Configuration getSpdSemanticConfiguration();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel#getSpdSemanticConfiguration <em>Spd Semantic Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spd Semantic Configuration</em>' reference.
	 * @see #getSpdSemanticConfiguration()
	 * @generated
	 */
	void setSpdSemanticConfiguration(Configuration value);

} // InitialModel
