/**
 */
package org.palladiosimulator.experimentautomation.experiments.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentDesign;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.JMXMeasurement;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Modification;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;
import org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime;
import org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement;
import org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification;
import org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Variation;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage
 * @generated
 */
public class ExperimentsAdapterFactory extends AdapterFactoryImpl {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExperimentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExperimentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ExperimentsSwitch<Adapter> modelSwitch = new ExperimentsSwitch<>() {
		@Override
		public Adapter caseExperimentRepository(ExperimentRepository object) {
			return createExperimentRepositoryAdapter();
		}

		@Override
		public Adapter caseExperiment(Experiment object) {
			return createExperimentAdapter();
		}

		@Override
		public Adapter caseVariation(Variation object) {
			return createVariationAdapter();
		}

		@Override
		public Adapter caseValueProvider(ValueProvider object) {
			return createValueProviderAdapter();
		}

		@Override
		public Adapter caseToolConfiguration(ToolConfiguration object) {
			return createToolConfigurationAdapter();
		}

		@Override
		public Adapter caseExperimentDesign(ExperimentDesign object) {
			return createExperimentDesignAdapter();
		}

		@Override
		public Adapter caseResponseMeasurement(ResponseMeasurement object) {
			return createResponseMeasurementAdapter();
		}

		@Override
		public Adapter casePolynomialValueProvider(PolynomialValueProvider object) {
			return createPolynomialValueProviderAdapter();
		}

		@Override
		public Adapter caseExponentialValueProvider(ExponentialValueProvider object) {
			return createExponentialValueProviderAdapter();
		}

		@Override
		public Adapter caseSetValueProvider(SetValueProvider object) {
			return createSetValueProviderAdapter();
		}

		@Override
		public Adapter casePlacketBurmanDesign(PlacketBurmanDesign object) {
			return createPlacketBurmanDesignAdapter();
		}

		@Override
		public Adapter caseFullFactorialDesign(FullFactorialDesign object) {
			return createFullFactorialDesignAdapter();
		}

		@Override
		public Adapter caseFractionalFactorialDesign(FractionalFactorialDesign object) {
			return createFractionalFactorialDesignAdapter();
		}

		@Override
		public Adapter caseOneFactorAtATime(OneFactorAtATime object) {
			return createOneFactorAtATimeAdapter();
		}

		@Override
		public Adapter caseSimulationDurationMeasurement(SimulationDurationMeasurement object) {
			return createSimulationDurationMeasurementAdapter();
		}

		@Override
		public Adapter caseProfilingMeasurement(ProfilingMeasurement object) {
			return createProfilingMeasurementAdapter();
		}

		@Override
		public Adapter caseJMXMeasurement(JMXMeasurement object) {
			return createJMXMeasurementAdapter();
		}

		@Override
		public Adapter caseLinearValueProvider(LinearValueProvider object) {
			return createLinearValueProviderAdapter();
		}

		@Override
		public Adapter caseObjectModification(ObjectModification object) {
			return createObjectModificationAdapter();
		}

		@Override
		public Adapter caseInitialModel(InitialModel object) {
			return createInitialModelAdapter();
		}

		@Override
		public Adapter caseReconfigurationRulesFolder(ReconfigurationRulesFolder object) {
			return createReconfigurationRulesFolderAdapter();
		}

		@Override
		public Adapter caseNestedIntervalsDoubleValueProvider(NestedIntervalsDoubleValueProvider object) {
			return createNestedIntervalsDoubleValueProviderAdapter();
		}

		@Override
		public Adapter caseNestedIntervalsLongValueProvider(NestedIntervalsLongValueProvider object) {
			return createNestedIntervalsLongValueProviderAdapter();
		}

		@Override
		public Adapter caseModification(Modification object) {
			return createModificationAdapter();
		}

		@Override
		public Adapter caseSchedulingPolicy2DelayModification(SchedulingPolicy2DelayModification object) {
			return createSchedulingPolicy2DelayModificationAdapter();
		}

		@Override
		public Adapter caseSetLongValueProvider(SetLongValueProvider object) {
			return createSetLongValueProviderAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository <em>Experiment Repository</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentRepository
	 * @generated
	 */
	public Adapter createExperimentRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.Experiment
	 * @generated
	 */
	public Adapter createExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.Variation
	 * @generated
	 */
	public Adapter createVariationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ValueProvider
	 * @generated
	 */
	public Adapter createValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration <em>Tool Configuration</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ToolConfiguration
	 * @generated
	 */
	public Adapter createToolConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ExperimentDesign <em>Experiment Design</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentDesign
	 * @generated
	 */
	public Adapter createExperimentDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement <em>Response Measurement</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ResponseMeasurement
	 * @generated
	 */
	public Adapter createResponseMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider <em>Polynomial Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider
	 * @generated
	 */
	public Adapter createPolynomialValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider <em>Exponential Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider
	 * @generated
	 */
	public Adapter createExponentialValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider <em>Set Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.SetValueProvider
	 * @generated
	 */
	public Adapter createSetValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign <em>Placket Burman Design</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign
	 * @generated
	 */
	public Adapter createPlacketBurmanDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign <em>Full Factorial Design</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign
	 * @generated
	 */
	public Adapter createFullFactorialDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign <em>Fractional Factorial Design</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign
	 * @generated
	 */
	public Adapter createFractionalFactorialDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime <em>One Factor At ATime</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime
	 * @generated
	 */
	public Adapter createOneFactorAtATimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement <em>Simulation Duration Measurement</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement
	 * @generated
	 */
	public Adapter createSimulationDurationMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement <em>Profiling Measurement</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement
	 * @generated
	 */
	public Adapter createProfilingMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement <em>JMX Measurement</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.JMXMeasurement
	 * @generated
	 */
	public Adapter createJMXMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider <em>Linear Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.LinearValueProvider
	 * @generated
	 */
	public Adapter createLinearValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ObjectModification <em>Object Modification</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ObjectModification
	 * @generated
	 */
	public Adapter createObjectModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.InitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.InitialModel
	 * @generated
	 */
	public Adapter createInitialModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder <em>Reconfiguration Rules Folder</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder
	 * @generated
	 */
	public Adapter createReconfigurationRulesFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider <em>Nested Intervals Double Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider
	 * @generated
	 */
	public Adapter createNestedIntervalsDoubleValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider <em>Nested Intervals Long Value Provider</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider
	 * @generated
	 */
	public Adapter createNestedIntervalsLongValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.Modification
	 * @generated
	 */
	public Adapter createModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification <em>Scheduling Policy2 Delay Modification</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification
	 * @generated
	 */
	public Adapter createSchedulingPolicy2DelayModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider <em>Set Long Value Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider
	 * @generated
	 */
	public Adapter createSetLongValueProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ExperimentsAdapterFactory
