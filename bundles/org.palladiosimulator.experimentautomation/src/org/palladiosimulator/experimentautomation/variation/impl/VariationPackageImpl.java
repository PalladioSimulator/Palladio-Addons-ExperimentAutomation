/**
 */
package org.palladiosimulator.experimentautomation.variation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationPackageImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsPackageImpl;
import org.palladiosimulator.experimentautomation.variation.StructuralVariation;
import org.palladiosimulator.experimentautomation.variation.ValueVariation;
import org.palladiosimulator.experimentautomation.variation.VariationFactory;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;
import org.palladiosimulator.experimentautomation.variation.VariationRepository;
import org.palladiosimulator.experimentautomation.variation.VariationType;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.PcmPackage;
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
public class VariationPackageImpl extends EPackageImpl implements VariationPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueVariationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralVariationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationRepositoryEClass = null;

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
	 * @see org.palladiosimulator.experimentautomation.variation.VariationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariationPackageImpl() {
		super(eNS_URI, VariationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VariationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariationPackage init() {
		if (isInited)
			return (VariationPackage) EPackage.Registry.INSTANCE.getEPackage(VariationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVariationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VariationPackageImpl theVariationPackage = registeredVariationPackage instanceof VariationPackageImpl
				? (VariationPackageImpl) registeredVariationPackage
				: new VariationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DlimPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExperimentsPackage.eNS_URI);
		ExperimentsPackageImpl theExperimentsPackage = (ExperimentsPackageImpl) (registeredPackage instanceof ExperimentsPackageImpl
				? registeredPackage
				: ExperimentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AbstractsimulationPackage.eNS_URI);
		AbstractsimulationPackageImpl theAbstractsimulationPackage = (AbstractsimulationPackageImpl) (registeredPackage instanceof AbstractsimulationPackageImpl
				? registeredPackage
				: AbstractsimulationPackage.eINSTANCE);

		// Create package meta-data objects
		theVariationPackage.createPackageContents();
		theExperimentsPackage.createPackageContents();
		theAbstractsimulationPackage.createPackageContents();

		// Initialize created meta-data
		theVariationPackage.initializePackageContents();
		theExperimentsPackage.initializePackageContents();
		theAbstractsimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariationPackage.eNS_URI, theVariationPackage);
		return theVariationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariationType() {
		return variationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariationType_Name() {
		return (EAttribute) variationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariationType_StrategyClass() {
		return (EAttribute) variationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariationType_VariedEntityInterface() {
		return (EAttribute) variationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueVariation() {
		return valueVariationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuralVariation() {
		return structuralVariationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariationRepository() {
		return variationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariationRepository_Variation() {
		return (EReference) variationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationFactory getVariationFactory() {
		return (VariationFactory) getEFactoryInstance();
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
		variationTypeEClass = createEClass(VARIATION_TYPE);
		createEAttribute(variationTypeEClass, VARIATION_TYPE__NAME);
		createEAttribute(variationTypeEClass, VARIATION_TYPE__STRATEGY_CLASS);
		createEAttribute(variationTypeEClass, VARIATION_TYPE__VARIED_ENTITY_INTERFACE);

		valueVariationEClass = createEClass(VALUE_VARIATION);

		structuralVariationEClass = createEClass(STRUCTURAL_VARIATION);

		variationRepositoryEClass = createEClass(VARIATION_REPOSITORY);
		createEReference(variationRepositoryEClass, VARIATION_REPOSITORY__VARIATION);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variationTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		valueVariationEClass.getESuperTypes().add(this.getVariationType());
		structuralVariationEClass.getESuperTypes().add(this.getVariationType());

		// Initialize classes and features; add operations and parameters
		initEClass(variationTypeEClass, VariationType.class, "VariationType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariationType_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariationType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getVariationType_StrategyClass(), ecorePackage.getEString(), "strategyClass", null, 1, 1,
				VariationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariationType_VariedEntityInterface(), ecorePackage.getEString(), "variedEntityInterface",
				null, 1, 1, VariationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueVariationEClass, ValueVariation.class, "ValueVariation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralVariationEClass, StructuralVariation.class, "StructuralVariation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variationRepositoryEClass, VariationRepository.class, "VariationRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariationRepository_Variation(), this.getVariationType(), null, "variation", null, 0, -1,
				VariationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // VariationPackageImpl
