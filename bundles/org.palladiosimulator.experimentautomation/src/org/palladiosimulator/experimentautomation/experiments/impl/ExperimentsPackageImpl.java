/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentDesign;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
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
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;
import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;
import org.palladiosimulator.experimentautomation.variation.impl.VariationPackageImpl;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import tools.descartes.dlim.DlimPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExperimentsPackageImpl extends EPackageImpl implements ExperimentsPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentDesignEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polynomialValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placketBurmanDesignEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullFactorialDesignEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fractionalFactorialDesignEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneFactorAtATimeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationDurationMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profilingMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jmxMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectModificationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationRulesFolderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedIntervalsDoubleValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedIntervalsLongValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingPolicy2DelayModificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExperimentsPackageImpl() {
		super(eNS_URI, ExperimentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExperimentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExperimentsPackage init() {
		if (isInited)
			return (ExperimentsPackage) EPackage.Registry.INSTANCE.getEPackage(ExperimentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExperimentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExperimentsPackageImpl theExperimentsPackage = registeredExperimentsPackage instanceof ExperimentsPackageImpl
				? (ExperimentsPackageImpl) registeredExperimentsPackage
				: new ExperimentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DlimPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		org.palladiosimulator.edp2.models.Repository.RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		MetricSpecPackage.eINSTANCE.eClass();
		MonitorRepositoryPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		org.palladiosimulator.spd.SpdPackage.eINSTANCE.eClass();
		org.palladiosimulator.semanticspd.SemanticspdPackage.eINSTANCE.eClass();
		ServicelevelObjectivePackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		UsageevolutionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariationPackage.eNS_URI);
		VariationPackageImpl theVariationPackage = (VariationPackageImpl) (registeredPackage instanceof VariationPackageImpl
				? registeredPackage
				: VariationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AbstractsimulationPackage.eNS_URI);
		AbstractsimulationPackageImpl theAbstractsimulationPackage = (AbstractsimulationPackageImpl) (registeredPackage instanceof AbstractsimulationPackageImpl
				? registeredPackage
				: AbstractsimulationPackage.eINSTANCE);

		// Create package meta-data objects
		theExperimentsPackage.createPackageContents();
		theVariationPackage.createPackageContents();
		theAbstractsimulationPackage.createPackageContents();

		// Initialize created meta-data
		theExperimentsPackage.initializePackageContents();
		theVariationPackage.initializePackageContents();
		theAbstractsimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExperimentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExperimentsPackage.eNS_URI, theExperimentsPackage);
		return theExperimentsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentRepository() {
		return experimentRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimentRepository_Experiments() {
		return (EReference) experimentRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperiment() {
		return experimentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_Variations() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_Modifications() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Id() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Name() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_ToolConfiguration() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_StopConditions() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Description() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_ExperimentDesign() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_ResponseMeasurement() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_InitialModel() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Repetitions() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariation() {
		return variationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariation_Type() {
		return (EReference) variationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariation_ValueProvider() {
		return (EReference) variationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariation_MinValue() {
		return (EAttribute) variationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariation_MaxValue() {
		return (EAttribute) variationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariation_MaxVariations() {
		return (EAttribute) variationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariation_VariedObjectId() {
		return (EAttribute) variationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariation_Name() {
		return (EAttribute) variationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueProvider() {
		return valueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolConfiguration() {
		return toolConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolConfiguration_Name() {
		return (EAttribute) toolConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentDesign() {
		return experimentDesignEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseMeasurement() {
		return responseMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolynomialValueProvider() {
		return polynomialValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolynomialValueProvider_Exponent() {
		return (EAttribute) polynomialValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolynomialValueProvider_Factor() {
		return (EAttribute) polynomialValueProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExponentialValueProvider() {
		return exponentialValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExponentialValueProvider_Base() {
		return (EAttribute) exponentialValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetValueProvider() {
		return setValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetValueProvider_Values() {
		return (EAttribute) setValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacketBurmanDesign() {
		return placketBurmanDesignEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFullFactorialDesign() {
		return fullFactorialDesignEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFractionalFactorialDesign() {
		return fractionalFactorialDesignEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneFactorAtATime() {
		return oneFactorAtATimeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulationDurationMeasurement() {
		return simulationDurationMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfilingMeasurement() {
		return profilingMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJMXMeasurement() {
		return jmxMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJMXMeasurement_PollingPeriod() {
		return (EAttribute) jmxMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinearValueProvider() {
		return linearValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinearValueProvider_Summand() {
		return (EAttribute) linearValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinearValueProvider_Factor() {
		return (EAttribute) linearValueProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectModification() {
		return objectModificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectModification_Type() {
		return (EReference) objectModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModification_Name() {
		return (EAttribute) objectModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModification_VariedObjectId() {
		return (EAttribute) objectModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModification_Value() {
		return (EAttribute) objectModificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialModel() {
		return initialModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_UsageModel() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_Allocation() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_MiddlewareRepository() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_EventMiddleWareRepository() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_ReconfigurationRules() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_MonitorRepository() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_ServiceLevelObjectives() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_Repository() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_System() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_ResourceEnvironment() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_UsageEvolution() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_ScalingDefinitions() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialModel_SpdSemanticConfiguration() {
		return (EReference) initialModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReconfigurationRulesFolder() {
		return reconfigurationRulesFolderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReconfigurationRulesFolder_FolderUri() {
		return (EAttribute) reconfigurationRulesFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedIntervalsDoubleValueProvider() {
		return nestedIntervalsDoubleValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedIntervalsDoubleValueProvider_MinValue() {
		return (EAttribute) nestedIntervalsDoubleValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedIntervalsDoubleValueProvider_MaxValue() {
		return (EAttribute) nestedIntervalsDoubleValueProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedIntervalsLongValueProvider() {
		return nestedIntervalsLongValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedIntervalsLongValueProvider_MinValue() {
		return (EAttribute) nestedIntervalsLongValueProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedIntervalsLongValueProvider_MaxValue() {
		return (EAttribute) nestedIntervalsLongValueProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModification() {
		return modificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingPolicy2DelayModification() {
		return schedulingPolicy2DelayModificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentsFactory getExperimentsFactory() {
		return (ExperimentsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		experimentRepositoryEClass = createEClass(EXPERIMENT_REPOSITORY);
		createEReference(experimentRepositoryEClass, EXPERIMENT_REPOSITORY__EXPERIMENTS);

		experimentEClass = createEClass(EXPERIMENT);
		createEReference(experimentEClass, EXPERIMENT__VARIATIONS);
		createEReference(experimentEClass, EXPERIMENT__MODIFICATIONS);
		createEAttribute(experimentEClass, EXPERIMENT__ID);
		createEAttribute(experimentEClass, EXPERIMENT__NAME);
		createEReference(experimentEClass, EXPERIMENT__TOOL_CONFIGURATION);
		createEReference(experimentEClass, EXPERIMENT__STOP_CONDITIONS);
		createEAttribute(experimentEClass, EXPERIMENT__DESCRIPTION);
		createEReference(experimentEClass, EXPERIMENT__EXPERIMENT_DESIGN);
		createEReference(experimentEClass, EXPERIMENT__RESPONSE_MEASUREMENT);
		createEReference(experimentEClass, EXPERIMENT__INITIAL_MODEL);
		createEAttribute(experimentEClass, EXPERIMENT__REPETITIONS);

		variationEClass = createEClass(VARIATION);
		createEReference(variationEClass, VARIATION__TYPE);
		createEReference(variationEClass, VARIATION__VALUE_PROVIDER);
		createEAttribute(variationEClass, VARIATION__MIN_VALUE);
		createEAttribute(variationEClass, VARIATION__MAX_VALUE);
		createEAttribute(variationEClass, VARIATION__MAX_VARIATIONS);
		createEAttribute(variationEClass, VARIATION__VARIED_OBJECT_ID);
		createEAttribute(variationEClass, VARIATION__NAME);

		valueProviderEClass = createEClass(VALUE_PROVIDER);

		toolConfigurationEClass = createEClass(TOOL_CONFIGURATION);
		createEAttribute(toolConfigurationEClass, TOOL_CONFIGURATION__NAME);

		experimentDesignEClass = createEClass(EXPERIMENT_DESIGN);

		responseMeasurementEClass = createEClass(RESPONSE_MEASUREMENT);

		polynomialValueProviderEClass = createEClass(POLYNOMIAL_VALUE_PROVIDER);
		createEAttribute(polynomialValueProviderEClass, POLYNOMIAL_VALUE_PROVIDER__EXPONENT);
		createEAttribute(polynomialValueProviderEClass, POLYNOMIAL_VALUE_PROVIDER__FACTOR);

		exponentialValueProviderEClass = createEClass(EXPONENTIAL_VALUE_PROVIDER);
		createEAttribute(exponentialValueProviderEClass, EXPONENTIAL_VALUE_PROVIDER__BASE);

		setValueProviderEClass = createEClass(SET_VALUE_PROVIDER);
		createEAttribute(setValueProviderEClass, SET_VALUE_PROVIDER__VALUES);

		placketBurmanDesignEClass = createEClass(PLACKET_BURMAN_DESIGN);

		fullFactorialDesignEClass = createEClass(FULL_FACTORIAL_DESIGN);

		fractionalFactorialDesignEClass = createEClass(FRACTIONAL_FACTORIAL_DESIGN);

		oneFactorAtATimeEClass = createEClass(ONE_FACTOR_AT_ATIME);

		simulationDurationMeasurementEClass = createEClass(SIMULATION_DURATION_MEASUREMENT);

		profilingMeasurementEClass = createEClass(PROFILING_MEASUREMENT);

		jmxMeasurementEClass = createEClass(JMX_MEASUREMENT);
		createEAttribute(jmxMeasurementEClass, JMX_MEASUREMENT__POLLING_PERIOD);

		linearValueProviderEClass = createEClass(LINEAR_VALUE_PROVIDER);
		createEAttribute(linearValueProviderEClass, LINEAR_VALUE_PROVIDER__SUMMAND);
		createEAttribute(linearValueProviderEClass, LINEAR_VALUE_PROVIDER__FACTOR);

		objectModificationEClass = createEClass(OBJECT_MODIFICATION);
		createEReference(objectModificationEClass, OBJECT_MODIFICATION__TYPE);
		createEAttribute(objectModificationEClass, OBJECT_MODIFICATION__NAME);
		createEAttribute(objectModificationEClass, OBJECT_MODIFICATION__VARIED_OBJECT_ID);
		createEAttribute(objectModificationEClass, OBJECT_MODIFICATION__VALUE);

		initialModelEClass = createEClass(INITIAL_MODEL);
		createEReference(initialModelEClass, INITIAL_MODEL__USAGE_MODEL);
		createEReference(initialModelEClass, INITIAL_MODEL__ALLOCATION);
		createEReference(initialModelEClass, INITIAL_MODEL__MIDDLEWARE_REPOSITORY);
		createEReference(initialModelEClass, INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY);
		createEReference(initialModelEClass, INITIAL_MODEL__RECONFIGURATION_RULES);
		createEReference(initialModelEClass, INITIAL_MODEL__MONITOR_REPOSITORY);
		createEReference(initialModelEClass, INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES);
		createEReference(initialModelEClass, INITIAL_MODEL__REPOSITORY);
		createEReference(initialModelEClass, INITIAL_MODEL__SYSTEM);
		createEReference(initialModelEClass, INITIAL_MODEL__RESOURCE_ENVIRONMENT);
		createEReference(initialModelEClass, INITIAL_MODEL__USAGE_EVOLUTION);
		createEReference(initialModelEClass, INITIAL_MODEL__SCALING_DEFINITIONS);
		createEReference(initialModelEClass, INITIAL_MODEL__SPD_SEMANTIC_CONFIGURATION);

		reconfigurationRulesFolderEClass = createEClass(RECONFIGURATION_RULES_FOLDER);
		createEAttribute(reconfigurationRulesFolderEClass, RECONFIGURATION_RULES_FOLDER__FOLDER_URI);

		nestedIntervalsDoubleValueProviderEClass = createEClass(NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER);
		createEAttribute(nestedIntervalsDoubleValueProviderEClass, NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MIN_VALUE);
		createEAttribute(nestedIntervalsDoubleValueProviderEClass, NESTED_INTERVALS_DOUBLE_VALUE_PROVIDER__MAX_VALUE);

		nestedIntervalsLongValueProviderEClass = createEClass(NESTED_INTERVALS_LONG_VALUE_PROVIDER);
		createEAttribute(nestedIntervalsLongValueProviderEClass, NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE);
		createEAttribute(nestedIntervalsLongValueProviderEClass, NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE);

		modificationEClass = createEClass(MODIFICATION);

		schedulingPolicy2DelayModificationEClass = createEClass(SCHEDULING_POLICY2_DELAY_MODIFICATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AbstractsimulationPackage theAbstractsimulationPackage = (AbstractsimulationPackage) EPackage.Registry.INSTANCE
				.getEPackage(AbstractsimulationPackage.eNS_URI);
		VariationPackage theVariationPackage = (VariationPackage) EPackage.Registry.INSTANCE
				.getEPackage(VariationPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(UsagemodelPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
				.getEPackage(AllocationPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage_1 = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);
		MonitorRepositoryPackage theMonitorRepositoryPackage = (MonitorRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(MonitorRepositoryPackage.eNS_URI);
		ServicelevelObjectivePackage theServicelevelObjectivePackage = (ServicelevelObjectivePackage) EPackage.Registry.INSTANCE
				.getEPackage(ServicelevelObjectivePackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage) EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
				.getEPackage(ResourceenvironmentPackage.eNS_URI);
		UsageevolutionPackage theUsageevolutionPackage = (UsageevolutionPackage) EPackage.Registry.INSTANCE
				.getEPackage(UsageevolutionPackage.eNS_URI);
		org.palladiosimulator.spd.SpdPackage theSpdPackage = (org.palladiosimulator.spd.SpdPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.palladiosimulator.spd.SpdPackage.eNS_URI);
		org.palladiosimulator.semanticspd.SemanticspdPackage theSemanticspdPackage = (org.palladiosimulator.semanticspd.SemanticspdPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.palladiosimulator.semanticspd.SemanticspdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polynomialValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		exponentialValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		setValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		fullFactorialDesignEClass.getESuperTypes().add(this.getExperimentDesign());
		oneFactorAtATimeEClass.getESuperTypes().add(this.getExperimentDesign());
		simulationDurationMeasurementEClass.getESuperTypes().add(this.getResponseMeasurement());
		profilingMeasurementEClass.getESuperTypes().add(this.getResponseMeasurement());
		jmxMeasurementEClass.getESuperTypes().add(this.getResponseMeasurement());
		linearValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		objectModificationEClass.getESuperTypes().add(this.getModification());
		nestedIntervalsDoubleValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		nestedIntervalsLongValueProviderEClass.getESuperTypes().add(this.getValueProvider());
		schedulingPolicy2DelayModificationEClass.getESuperTypes().add(this.getModification());

		// Initialize classes and features; add operations and parameters
		initEClass(experimentRepositoryEClass, ExperimentRepository.class, "ExperimentRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentRepository_Experiments(), this.getExperiment(), null, "experiments", null, 0, -1,
				ExperimentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperiment_Variations(), this.getVariation(), null, "variations", null, 0, -1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExperiment_Modifications(), this.getModification(), null, "modifications", null, 0, -1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_Id(), ecorePackage.getEString(), "id", null, 1, 1, Experiment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperiment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExperiment_ToolConfiguration(), this.getToolConfiguration(), null, "toolConfiguration", null,
				1, -1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExperiment_StopConditions(), theAbstractsimulationPackage.getStopCondition(), null,
				"stopConditions", null, 0, -1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperiment_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getExperiment_ExperimentDesign(), this.getExperimentDesign(), null, "experimentDesign", null, 1,
				1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExperiment_ResponseMeasurement(), this.getResponseMeasurement(), null, "responseMeasurement",
				null, 1, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExperiment_InitialModel(), this.getInitialModel(), null, "initialModel", null, 1, 1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_Repetitions(), ecorePackage.getEInt(), "repetitions", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(variationEClass, Variation.class, "Variation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariation_Type(), theVariationPackage.getVariationType(), null, "type", null, 1, 1,
				Variation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariation_ValueProvider(), this.getValueProvider(), null, "valueProvider", null, 1, 1,
				Variation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariation_MinValue(), ecorePackage.getEDouble(), "minValue", null, 1, 1, Variation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getVariation_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 1, 1, Variation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getVariation_MaxVariations(), ecorePackage.getELong(), "maxVariations", null, 1, 1,
				Variation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariation_VariedObjectId(), ecorePackage.getEString(), "variedObjectId", null, 1, 1,
				Variation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(valueProviderEClass, ValueProvider.class, "ValueProvider", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolConfigurationEClass, ToolConfiguration.class, "ToolConfiguration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ToolConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(experimentDesignEClass, ExperimentDesign.class, "ExperimentDesign", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseMeasurementEClass, ResponseMeasurement.class, "ResponseMeasurement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polynomialValueProviderEClass, PolynomialValueProvider.class, "PolynomialValueProvider",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolynomialValueProvider_Exponent(), ecorePackage.getEDouble(), "exponent", null, 1, 1,
				PolynomialValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPolynomialValueProvider_Factor(), ecorePackage.getEDouble(), "factor", null, 1, 1,
				PolynomialValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exponentialValueProviderEClass, ExponentialValueProvider.class, "ExponentialValueProvider",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialValueProvider_Base(), ecorePackage.getEDouble(), "base", null, 1, 1,
				ExponentialValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setValueProviderEClass, SetValueProvider.class, "SetValueProvider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetValueProvider_Values(), ecorePackage.getEString(), "values", null, 1, 1,
				SetValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(placketBurmanDesignEClass, PlacketBurmanDesign.class, "PlacketBurmanDesign", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fullFactorialDesignEClass, FullFactorialDesign.class, "FullFactorialDesign", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fractionalFactorialDesignEClass, FractionalFactorialDesign.class, "FractionalFactorialDesign",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneFactorAtATimeEClass, OneFactorAtATime.class, "OneFactorAtATime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulationDurationMeasurementEClass, SimulationDurationMeasurement.class,
				"SimulationDurationMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profilingMeasurementEClass, ProfilingMeasurement.class, "ProfilingMeasurement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jmxMeasurementEClass, JMXMeasurement.class, "JMXMeasurement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJMXMeasurement_PollingPeriod(), ecorePackage.getEIntegerObject(), "pollingPeriod", null, 1, 1,
				JMXMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(linearValueProviderEClass, LinearValueProvider.class, "LinearValueProvider", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearValueProvider_Summand(), ecorePackage.getEDouble(), "summand", null, 1, 1,
				LinearValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinearValueProvider_Factor(), ecorePackage.getEDouble(), "factor", null, 1, 1,
				LinearValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectModificationEClass, ObjectModification.class, "ObjectModification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectModification_Type(), theVariationPackage.getVariationType(), null, "type", null, 0, 1,
				ObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectModification_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectModification_VariedObjectId(), ecorePackage.getEString(), "variedObjectId", null, 1, 1,
				ObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectModification_Value(), ecorePackage.getELong(), "value", null, 1, 1,
				ObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(initialModelEClass, InitialModel.class, "InitialModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialModel_UsageModel(), theUsagemodelPackage.getUsageModel(), null, "usageModel", null, 0,
				1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_Allocation(), theAllocationPackage.getAllocation(), null, "allocation", null, 0,
				1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_MiddlewareRepository(), theRepositoryPackage_1.getRepository(), null,
				"middlewareRepository", null, 1, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_EventMiddleWareRepository(), theRepositoryPackage_1.getRepository(), null,
				"eventMiddleWareRepository", null, 1, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_ReconfigurationRules(), this.getReconfigurationRulesFolder(), null,
				"reconfigurationRules", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_MonitorRepository(), theMonitorRepositoryPackage.getMonitorRepository(), null,
				"monitorRepository", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_ServiceLevelObjectives(),
				theServicelevelObjectivePackage.getServiceLevelObjectiveRepository(), null, "serviceLevelObjectives",
				null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_Repository(), theRepositoryPackage_1.getRepository(), null, "repository", null,
				0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_System(), theSystemPackage.getSystem(), null, "system", null, 0, 1,
				InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(),
				null, "resourceEnvironment", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_UsageEvolution(), theUsageevolutionPackage.getUsageEvolution(), null,
				"usageEvolution", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_ScalingDefinitions(), theSpdPackage.getSPD(), null, "scalingDefinitions", null,
				0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModel_SpdSemanticConfiguration(), theSemanticspdPackage.getConfiguration(), null,
				"spdSemanticConfiguration", null, 0, 1, InitialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationRulesFolderEClass, ReconfigurationRulesFolder.class, "ReconfigurationRulesFolder",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationRulesFolder_FolderUri(), ecorePackage.getEString(), "folderUri", null, 1, 1,
				ReconfigurationRulesFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedIntervalsDoubleValueProviderEClass, NestedIntervalsDoubleValueProvider.class,
				"NestedIntervalsDoubleValueProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedIntervalsDoubleValueProvider_MinValue(), ecorePackage.getEDouble(), "minValue", null, 1,
				1, NestedIntervalsDoubleValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedIntervalsDoubleValueProvider_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 1,
				1, NestedIntervalsDoubleValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedIntervalsLongValueProviderEClass, NestedIntervalsLongValueProvider.class,
				"NestedIntervalsLongValueProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedIntervalsLongValueProvider_MinValue(), ecorePackage.getELong(), "minValue", null, 1, 1,
				NestedIntervalsLongValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedIntervalsLongValueProvider_MaxValue(), ecorePackage.getELong(), "maxValue", null, 1, 1,
				NestedIntervalsLongValueProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modificationEClass, Modification.class, "Modification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingPolicy2DelayModificationEClass, SchedulingPolicy2DelayModification.class,
				"SchedulingPolicy2DelayModification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ExperimentsPackageImpl
