/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;

import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshotConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage;

import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

import org.palladiosimulator.experimentautomation.variation.VariationPackage;

import org.palladiosimulator.metricspec.MetricSpecPackage;

import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.semanticspd.SemanticspdPackage;

import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

import org.palladiosimulator.spd.SpdPackage;

import org.scaledl.usageevolution.UsageevolutionPackage;

import tools.descartes.dlim.DlimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlingshottooladapterPackageImpl extends EPackageImpl implements SlingshottooladapterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slingshotConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.experimentautomation.application.tooladapter.slingshot.model.SlingshottooladapterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SlingshottooladapterPackageImpl() {
		super(eNS_URI, SlingshottooladapterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SlingshottooladapterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SlingshottooladapterPackage init() {
		if (isInited) return (SlingshottooladapterPackage)EPackage.Registry.INSTANCE.getEPackage(SlingshottooladapterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSlingshottooladapterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SlingshottooladapterPackageImpl theSlingshottooladapterPackage = registeredSlingshottooladapterPackage instanceof SlingshottooladapterPackageImpl ? (SlingshottooladapterPackageImpl)registeredSlingshottooladapterPackage : new SlingshottooladapterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DlimPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();
		VariationPackage.eINSTANCE.eClass();
		ExperimentsPackage.eINSTANCE.eClass();
		AbstractsimulationPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		MetricSpecPackage.eINSTANCE.eClass();
		MonitorRepositoryPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		SpdPackage.eINSTANCE.eClass();
		SemanticspdPackage.eINSTANCE.eClass();
		ServicelevelObjectivePackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		UsageevolutionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSlingshottooladapterPackage.createPackageContents();

		// Initialize created meta-data
		theSlingshottooladapterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSlingshottooladapterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SlingshottooladapterPackage.eNS_URI, theSlingshottooladapterPackage);
		return theSlingshottooladapterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlingshotConfiguration() {
		return slingshotConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlingshottooladapterFactory getSlingshottooladapterFactory() {
		return (SlingshottooladapterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		slingshotConfigurationEClass = createEClass(SLINGSHOT_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AbstractsimulationPackage theAbstractsimulationPackage = (AbstractsimulationPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractsimulationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		slingshotConfigurationEClass.getESuperTypes().add(theAbstractsimulationPackage.getAbstractSimulationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(slingshotConfigurationEClass, SlingshotConfiguration.class, "SlingshotConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SlingshottooladapterPackageImpl
