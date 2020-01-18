/**
 */
package org.palladiosimulator.experimentautomation.experiments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.experimentautomation.experiments.InitialModel} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class InitialModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public InitialModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUsageModelPropertyDescriptor(object);
			addAllocationPropertyDescriptor(object);
			addMiddlewareRepositoryPropertyDescriptor(object);
			addEventMiddleWareRepositoryPropertyDescriptor(object);
			addReconfigurationRulesPropertyDescriptor(object);
			addMonitorRepositoryPropertyDescriptor(object);
			addServiceLevelObjectivesPropertyDescriptor(object);
			addRepositoryPropertyDescriptor(object);
			addSystemPropertyDescriptor(object);
			addResourceEnvironmentPropertyDescriptor(object);
			addUsageEvolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Usage Model feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addUsageModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_usageModel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_usageModel_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Allocation feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addAllocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_allocation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_allocation_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Middleware Repository feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiddlewareRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InitialModel_middlewareRepository_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_middlewareRepository_feature",
						"_UI_InitialModel_type"),
				ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Event Middle Ware Repository feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEventMiddleWareRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_eventMiddleWareRepository_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InitialModel_eventMiddleWareRepository_feature", "_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Reconfiguration Rules feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReconfigurationRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InitialModel_reconfigurationRules_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_reconfigurationRules_feature",
						"_UI_InitialModel_type"),
				ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Monitor Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitorRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_monitorRepository_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_monitorRepository_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__MONITOR_REPOSITORY, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Service Level Objectives feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceLevelObjectivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InitialModel_serviceLevelObjectives_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_serviceLevelObjectives_feature",
						"_UI_InitialModel_type"),
				ExperimentsPackage.Literals.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Repository feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_repository_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_repository_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__REPOSITORY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the System feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_system_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_system_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__SYSTEM, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InitialModel_resourceEnvironment_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_resourceEnvironment_feature",
						"_UI_InitialModel_type"),
				ExperimentsPackage.Literals.INITIAL_MODEL__RESOURCE_ENVIRONMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Usage Evolution feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addUsageEvolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InitialModel_usageEvolution_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_usageEvolution_feature",
								"_UI_InitialModel_type"),
						ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_EVOLUTION, true, false, true, null, null,
						null));
	}

	/**
	 * This returns InitialModel.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InitialModel"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_InitialModel_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
