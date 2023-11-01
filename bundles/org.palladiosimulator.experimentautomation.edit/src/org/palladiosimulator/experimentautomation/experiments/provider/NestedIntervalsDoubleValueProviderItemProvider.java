/**
 */
package org.palladiosimulator.experimentautomation.experiments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class NestedIntervalsDoubleValueProviderItemProvider extends ValueProviderItemProvider {

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
	public NestedIntervalsDoubleValueProviderItemProvider(AdapterFactory adapterFactory) {
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

			addMinValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Value feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addMinValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NestedIntervalsDoubleValueProvider_minValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NestedIntervalsDoubleValueProvider_minValue_feature",
								"_UI_NestedIntervalsDoubleValueProvider_type"),
						ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE, true, false,
						false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Value feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NestedIntervalsDoubleValueProvider_maxValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NestedIntervalsDoubleValueProvider_maxValue_feature",
								"_UI_NestedIntervalsDoubleValueProvider_type"),
						ExperimentsPackage.Literals.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE, true, false,
						false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NestedIntervalsDoubleValueProvider.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NestedIntervalsDoubleValueProvider"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NestedIntervalsDoubleValueProvider nestedIntervalsDoubleValueProvider = (NestedIntervalsDoubleValueProvider) object;
		return getString("_UI_NestedIntervalsDoubleValueProvider_type") + " "
				+ nestedIntervalsDoubleValueProvider.getMinValue();
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

		switch (notification.getFeatureID(NestedIntervalsDoubleValueProvider.class)) {
		case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE:
		case ExperimentsPackage.NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE:
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

}
