/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.provider;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class RandomNumberGeneratorSeedItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
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
	public RandomNumberGeneratorSeedItemProvider(AdapterFactory adapterFactory) {
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

			addSeed0PropertyDescriptor(object);
			addSeed1PropertyDescriptor(object);
			addSeed2PropertyDescriptor(object);
			addSeed3PropertyDescriptor(object);
			addSeed4PropertyDescriptor(object);
			addSeed5PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Seed0 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed0PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed0_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed0_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED0, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seed1 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed1PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed1_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed1_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED1, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seed2 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed2PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed2_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed2_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED2, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seed3 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed3PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed3_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed3_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED3, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seed4 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed4PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed4_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed4_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED4, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Seed5 feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSeed5PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RandomNumberGeneratorSeed_seed5_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RandomNumberGeneratorSeed_seed5_feature",
								"_UI_RandomNumberGeneratorSeed_type"),
						AbstractsimulationPackage.Literals.RANDOM_NUMBER_GENERATOR_SEED__SEED5, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RandomNumberGeneratorSeed.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RandomNumberGeneratorSeed"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RandomNumberGeneratorSeed randomNumberGeneratorSeed = (RandomNumberGeneratorSeed) object;
		return getString("_UI_RandomNumberGeneratorSeed_type") + " " + randomNumberGeneratorSeed.getSeed0();
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

		switch (notification.getFeatureID(RandomNumberGeneratorSeed.class)) {
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED0:
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED1:
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED2:
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED3:
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED4:
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED__SEED5:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
