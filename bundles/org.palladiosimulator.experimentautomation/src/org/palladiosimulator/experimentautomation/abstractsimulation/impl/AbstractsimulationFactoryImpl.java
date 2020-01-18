/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.experimentautomation.abstractsimulation.*;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class AbstractsimulationFactoryImpl extends EFactoryImpl implements AbstractsimulationFactory {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsimulationFactory init() {
		try {
			AbstractsimulationFactory theAbstractsimulationFactory = (AbstractsimulationFactory) EPackage.Registry.INSTANCE
					.getEFactory(AbstractsimulationPackage.eNS_URI);
			if (theAbstractsimulationFactory != null) {
				return theAbstractsimulationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsimulationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AbstractsimulationPackage.RANDOM_NUMBER_GENERATOR_SEED:
			return createRandomNumberGeneratorSeed();
		case AbstractsimulationPackage.MEMORY_DATASOURCE:
			return createMemoryDatasource();
		case AbstractsimulationPackage.FILE_DATASOURCE:
			return createFileDatasource();
		case AbstractsimulationPackage.MEASUREMENT_COUNT_STOP_CONDITION:
			return createMeasurementCountStopCondition();
		case AbstractsimulationPackage.SIM_TIME_STOP_CONDITION:
			return createSimTimeStopCondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AbstractsimulationPackage.EXPORT_OPTION:
			return createExportOptionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AbstractsimulationPackage.EXPORT_OPTION:
			return convertExportOptionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomNumberGeneratorSeed createRandomNumberGeneratorSeed() {
		RandomNumberGeneratorSeedImpl randomNumberGeneratorSeed = new RandomNumberGeneratorSeedImpl();
		return randomNumberGeneratorSeed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryDatasource createMemoryDatasource() {
		MemoryDatasourceImpl memoryDatasource = new MemoryDatasourceImpl();
		return memoryDatasource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileDatasource createFileDatasource() {
		FileDatasourceImpl fileDatasource = new FileDatasourceImpl();
		return fileDatasource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementCountStopCondition createMeasurementCountStopCondition() {
		MeasurementCountStopConditionImpl measurementCountStopCondition = new MeasurementCountStopConditionImpl();
		return measurementCountStopCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimTimeStopCondition createSimTimeStopCondition() {
		SimTimeStopConditionImpl simTimeStopCondition = new SimTimeStopConditionImpl();
		return simTimeStopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportOption createExportOptionFromString(EDataType eDataType, String initialValue) {
		ExportOption result = ExportOption.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractsimulationPackage getAbstractsimulationPackage() {
		return (AbstractsimulationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsimulationPackage getPackage() {
		return AbstractsimulationPackage.eINSTANCE;
	}

} // AbstractsimulationFactoryImpl
