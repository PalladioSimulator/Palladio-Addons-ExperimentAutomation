/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.experiments.provider.ToolConfigurationItemProvider;
import org.palladiosimulator.experimentautomation.variation.provider.ExperimentAutomationEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AbstractSimulationConfigurationItemProvider extends ToolConfigurationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public AbstractSimulationConfigurationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addSimulateLinkingResourcesPropertyDescriptor(object);
            addSimulateFailuresPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Simulate Linking Resources feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSimulateLinkingResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractSimulationConfiguration_simulateLinkingResources_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_AbstractSimulationConfiguration_simulateLinkingResources_feature",
                        "_UI_AbstractSimulationConfiguration_type"),
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Simulate Failures feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSimulateFailuresPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractSimulationConfiguration_simulateFailures_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_AbstractSimulationConfiguration_simulateFailures_feature",
                        "_UI_AbstractSimulationConfiguration_type"),
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
            childrenFeatures
                    .add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__PERSISTENCE_FRAMEWORK);
            childrenFeatures.add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS);
            childrenFeatures
                    .add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED);
            childrenFeatures
                    .add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__PROBE_SPEC_CONFIGURATION);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AbstractSimulationConfiguration) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_AbstractSimulationConfiguration_type")
                : getString("_UI_AbstractSimulationConfiguration_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(AbstractSimulationConfiguration.class)) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__PERSISTENCE_FRAMEWORK:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__PROBE_SPEC_CONFIGURATION:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__PERSISTENCE_FRAMEWORK,
                AbstractsimulationFactory.eINSTANCE.createSensorFramework()));

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__PERSISTENCE_FRAMEWORK,
                AbstractsimulationFactory.eINSTANCE.createEDP2()));

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createMeasurementCountStopCondition()));

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createSimTimeStopCondition()));

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                AbstractsimulationFactory.eINSTANCE.createRandomNumberGeneratorSeed()));

        newChildDescriptors.add(createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__PROBE_SPEC_CONFIGURATION,
                AbstractsimulationFactory.eINSTANCE.createProbeSpecConfiguration()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ExperimentAutomationEditPlugin.INSTANCE;
    }

}