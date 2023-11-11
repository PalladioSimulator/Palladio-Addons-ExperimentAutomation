/**
 */
package org.palladiosimulator.experimentautomation.experiments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.experimentautomation.experiments.Experiment} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ExperimentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
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
	public ExperimentItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addRepetitionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Experiment_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Experiment_id_feature",
								"_UI_Experiment_type"),
						ExperimentsPackage.Literals.EXPERIMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Experiment_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Experiment_name_feature",
								"_UI_Experiment_type"),
						ExperimentsPackage.Literals.EXPERIMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Experiment_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Experiment_description_feature",
								"_UI_Experiment_type"),
						ExperimentsPackage.Literals.EXPERIMENT__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Repetitions feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addRepetitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Experiment_repetitions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Experiment_repetitions_feature",
								"_UI_Experiment_type"),
						ExperimentsPackage.Literals.EXPERIMENT__REPETITIONS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
	 * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__VARIATIONS);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__TOOL_CONFIGURATION);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT);
			childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Experiment.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Experiment"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Experiment) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Experiment_type")
				: getString("_UI_Experiment_type") + " " + label;
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

		switch (notification.getFeatureID(Experiment.class)) {
		case ExperimentsPackage.EXPERIMENT__ID:
		case ExperimentsPackage.EXPERIMENT__NAME:
		case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
		case ExperimentsPackage.EXPERIMENT__REPETITIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ExperimentsPackage.EXPERIMENT__VARIATIONS:
		case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
		case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
		case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
		case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
		case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
		case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__VARIATIONS,
				ExperimentsFactory.eINSTANCE.createVariation()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS,
				ExperimentsFactory.eINSTANCE.createObjectModification()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS,
				ExperimentsFactory.eINSTANCE.createSchedulingPolicy2DelayModification()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS,
				AbstractsimulationFactory.eINSTANCE.createMeasurementCountStopCondition()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS,
				AbstractsimulationFactory.eINSTANCE.createSimTimeStopCondition()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN,
				ExperimentsFactory.eINSTANCE.createFullFactorialDesign()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN,
				ExperimentsFactory.eINSTANCE.createOneFactorAtATime()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
				ExperimentsFactory.eINSTANCE.createSimulationDurationMeasurement()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
				ExperimentsFactory.eINSTANCE.createProfilingMeasurement()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
				ExperimentsFactory.eINSTANCE.createJMXMeasurement()));

		newChildDescriptors.add(createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL,
				ExperimentsFactory.eINSTANCE.createInitialModel()));
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
