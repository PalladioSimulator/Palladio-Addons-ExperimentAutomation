/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Experiment</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getVariations <em>Variations</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getModifications <em>Modifications</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getId <em>Id</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getToolConfiguration <em>Tool Configuration</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getStopConditions <em>Stop Conditions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getExperimentDesign <em>Experiment Design</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getResponseMeasurement <em>Response Measurement</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getInitialModel <em>Initial Model</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Experiment extends CDOObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * Returns the value of the '<em><b>Variations</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.experimentautomation.experiments.Variation}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Variations</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variations</em>' containment reference list.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Variations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Variation> getVariations();

	/**
	 * Returns the value of the '<em><b>Modifications</b></em>' containment reference list. The list
	 * contents are of type
	 * {@link org.palladiosimulator.experimentautomation.experiments.Modification}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifications</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Modifications</em>' containment reference list.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Modifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modification> getModifications();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tool Configuration</b></em>' containment reference list. The
	 * list contents are of type
	 * {@link org.palladiosimulator.experimentautomation.experiments.ToolConfiguration}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Tool Configuration</em>' containment reference list.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_ToolConfiguration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ToolConfiguration> getToolConfiguration();

	/**
	 * Returns the value of the '<em><b>Stop Conditions</b></em>' containment reference list. The
	 * list contents are of type
	 * {@link org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Stop Conditions</em>' containment reference list.
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_StopConditions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StopCondition> getStopConditions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Experiment Design</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Design</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Experiment Design</em>' containment reference.
	 * @see #setExperimentDesign(ExperimentDesign)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_ExperimentDesign()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExperimentDesign getExperimentDesign();

	/**
	 * Sets the value of the '
	 * {@link org.palladiosimulator.experimentautomation.experiments.Experiment#getExperimentDesign
	 * <em>Experiment Design</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Experiment Design</em>' containment reference.
	 * @see #getExperimentDesign()
	 * @generated
	 */
	void setExperimentDesign(ExperimentDesign value);

	/**
	 * Returns the value of the '<em><b>Response Measurement</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Response Measurement</em>' containment reference.
	 * @see #setResponseMeasurement(ResponseMeasurement)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_ResponseMeasurement()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ResponseMeasurement getResponseMeasurement();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getResponseMeasurement <em>Response Measurement</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Response Measurement</em>' containment reference.
	 * @see #getResponseMeasurement()
	 * @generated
	 */
	void setResponseMeasurement(ResponseMeasurement value);

	/**
	 * Returns the value of the '<em><b>Initial Model</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Model</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Initial Model</em>' containment reference.
	 * @see #setInitialModel(InitialModel)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_InitialModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialModel getInitialModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getInitialModel <em>Initial Model</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Model</em>' containment reference.
	 * @see #getInitialModel()
	 * @generated
	 */
	void setInitialModel(InitialModel value);

	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' attribute.
	 * @see #setRepetitions(int)
	 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperiment_Repetitions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRepetitions();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.experimentautomation.experiments.Experiment#getRepetitions <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' attribute.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(int value);

} // Experiment
