/**
 */
package org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimuComConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;
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
 *
 * @generated
 */
public class SimucomtooladapterPackageImpl extends EPackageImpl implements SimucomtooladapterPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simuComConfigurationEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SimucomtooladapterPackageImpl() {
        super(eNS_URI, SimucomtooladapterFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link SimucomtooladapterPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SimucomtooladapterPackage init() {
        if (isInited) {
            return (SimucomtooladapterPackage) EPackage.Registry.INSTANCE
                .getEPackage(SimucomtooladapterPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredSimucomtooladapterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final SimucomtooladapterPackageImpl theSimucomtooladapterPackage = registeredSimucomtooladapterPackage instanceof SimucomtooladapterPackageImpl
                ? (SimucomtooladapterPackageImpl) registeredSimucomtooladapterPackage
                : new SimucomtooladapterPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();
        VariationPackage.eINSTANCE.eClass();
        ExperimentsPackage.eINSTANCE.eClass();
        AbstractsimulationPackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        MetricSpecPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        MonitorRepositoryPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();
        ServicelevelObjectivePackage.eINSTANCE.eClass();
        UsageevolutionPackage.eINSTANCE.eClass();
        DlimPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSimucomtooladapterPackage.createPackageContents();

        // Initialize created meta-data
        theSimucomtooladapterPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSimucomtooladapterPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SimucomtooladapterPackage.eNS_URI, theSimucomtooladapterPackage);
        return theSimucomtooladapterPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimuComConfiguration() {
        return this.simuComConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimucomtooladapterFactory getSimucomtooladapterFactory() {
        return (SimucomtooladapterFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.simuComConfigurationEClass = this.createEClass(SIMU_COM_CONFIGURATION);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final AbstractsimulationPackage theAbstractsimulationPackage = (AbstractsimulationPackage) EPackage.Registry.INSTANCE
            .getEPackage(AbstractsimulationPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.simuComConfigurationEClass.getESuperTypes()
            .add(theAbstractsimulationPackage.getAbstractSimulationConfiguration());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.simuComConfigurationEClass, SimuComConfiguration.class, "SimuComConfiguration",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // SimucomtooladapterPackageImpl
