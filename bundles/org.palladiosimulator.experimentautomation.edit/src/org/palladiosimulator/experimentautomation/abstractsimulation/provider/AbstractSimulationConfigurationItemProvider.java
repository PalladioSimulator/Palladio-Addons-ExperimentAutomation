/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.experiments.provider.ToolConfigurationItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class AbstractSimulationConfigurationItemProvider extends ToolConfigurationItemProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public AbstractSimulationConfigurationItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addSimulateLinkingResourcesPropertyDescriptor(object);
            this.addSimulateFailuresPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Simulate Linking Resources feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSimulateLinkingResourcesPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AbstractSimulationConfiguration_simulateLinkingResources_feature"),
                this.getString("_UI_PropertyDescriptor_description",
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
    protected void addSimulateFailuresPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AbstractSimulationConfiguration_simulateFailures_feature"),
                this.getString("_UI_PropertyDescriptor_description",
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
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures
                .add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS);
            this.childrenFeatures.add(
                    AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED);
            this.childrenFeatures.add(AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
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
    public String getText(final Object object) {
        final String label = ((AbstractSimulationConfiguration) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_AbstractSimulationConfiguration_type")
                : this.getString("_UI_AbstractSimulationConfiguration_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(AbstractSimulationConfiguration.class)) {
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
        case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createMeasurementCountStopCondition()));

        newChildDescriptors.add(this.createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createSimTimeStopCondition()));

        newChildDescriptors.add(this.createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED,
                AbstractsimulationFactory.eINSTANCE.createRandomNumberGeneratorSeed()));

        newChildDescriptors.add(this.createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE,
                AbstractsimulationFactory.eINSTANCE.createMemoryDatasource()));

        newChildDescriptors.add(this.createChildParameter(
                AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE,
                AbstractsimulationFactory.eINSTANCE.createFileDatasource()));
    }

}
