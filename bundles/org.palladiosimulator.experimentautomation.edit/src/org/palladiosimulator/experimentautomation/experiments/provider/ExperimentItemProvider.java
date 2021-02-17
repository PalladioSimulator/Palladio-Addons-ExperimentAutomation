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
    public ExperimentItemProvider(final AdapterFactory adapterFactory) {
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

            this.addIdPropertyDescriptor(object);
            this.addNamePropertyDescriptor(object);
            this.addDescriptionPropertyDescriptor(object);
            this.addRepetitionsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    protected void addIdPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_Experiment_id_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_Experiment_id_feature",
                        "_UI_Experiment_type"),
                ExperimentsPackage.Literals.EXPERIMENT__ID, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addNamePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_Experiment_name_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_Experiment_name_feature",
                        "_UI_Experiment_type"),
                ExperimentsPackage.Literals.EXPERIMENT__NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_Experiment_description_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_Experiment_description_feature",
                        "_UI_Experiment_type"),
                ExperimentsPackage.Literals.EXPERIMENT__DESCRIPTION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Repetitions feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRepetitionsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_Experiment_repetitions_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_Experiment_repetitions_feature",
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
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__VARIATIONS);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__TOOL_CONFIGURATION);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT);
            this.childrenFeatures.add(ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL);
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
     * This returns Experiment.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/Experiment"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((Experiment) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_Experiment_type")
                : this.getString("_UI_Experiment_type") + " " + label;
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

        switch (notification.getFeatureID(Experiment.class)) {
        case ExperimentsPackage.EXPERIMENT__ID:
        case ExperimentsPackage.EXPERIMENT__NAME:
        case ExperimentsPackage.EXPERIMENT__DESCRIPTION:
        case ExperimentsPackage.EXPERIMENT__REPETITIONS:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ExperimentsPackage.EXPERIMENT__VARIATIONS:
        case ExperimentsPackage.EXPERIMENT__MODIFICATIONS:
        case ExperimentsPackage.EXPERIMENT__TOOL_CONFIGURATION:
        case ExperimentsPackage.EXPERIMENT__STOP_CONDITIONS:
        case ExperimentsPackage.EXPERIMENT__EXPERIMENT_DESIGN:
        case ExperimentsPackage.EXPERIMENT__RESPONSE_MEASUREMENT:
        case ExperimentsPackage.EXPERIMENT__INITIAL_MODEL:
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

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__VARIATIONS,
                ExperimentsFactory.eINSTANCE.createVariation()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS,
                ExperimentsFactory.eINSTANCE.createObjectModification()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__MODIFICATIONS,
                ExperimentsFactory.eINSTANCE.createSchedulingPolicy2DelayModification()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createMeasurementCountStopCondition()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__STOP_CONDITIONS,
                AbstractsimulationFactory.eINSTANCE.createSimTimeStopCondition()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN,
                ExperimentsFactory.eINSTANCE.createFullFactorialDesign()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__EXPERIMENT_DESIGN,
                ExperimentsFactory.eINSTANCE.createOneFactorAtATime()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
                ExperimentsFactory.eINSTANCE.createSimulationDurationMeasurement()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
                ExperimentsFactory.eINSTANCE.createProfilingMeasurement()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__RESPONSE_MEASUREMENT,
                ExperimentsFactory.eINSTANCE.createJMXMeasurement()));

        newChildDescriptors.add(this.createChildParameter(ExperimentsPackage.Literals.EXPERIMENT__INITIAL_MODEL,
                ExperimentsFactory.eINSTANCE.createInitialModel()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
    }

}
