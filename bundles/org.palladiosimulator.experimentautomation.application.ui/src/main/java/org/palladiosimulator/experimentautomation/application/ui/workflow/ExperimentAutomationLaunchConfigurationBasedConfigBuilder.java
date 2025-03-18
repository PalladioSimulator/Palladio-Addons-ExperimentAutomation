package org.palladiosimulator.experimentautomation.application.ui.workflow;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.experimentautomation.application.config.ExperimentAutomationConfiguration;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;

import de.uka.ipd.sdq.workflow.launchconfig.core.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractWorkflowConfigurationBuilder;

public class ExperimentAutomationLaunchConfigurationBasedConfigBuilder extends AbstractWorkflowConfigurationBuilder {

    public ExperimentAutomationLaunchConfigurationBasedConfigBuilder(ILaunchConfiguration configuration, String mode)
            throws CoreException {
        super(configuration, mode);
    }

    @Override
    public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
        final ExperimentAutomationConfiguration config = (ExperimentAutomationConfiguration) configuration;

        config.setExperiments(new ArrayList<Experiment>()); // TODO determine default experiment

        final String experimentsURI = hasAttribute(ExperimentAutomationConfigurationTab.EXPERIMENT_AUTOMATION)

        ? getStringAttribute(ExperimentAutomationConfigurationTab.EXPERIMENT_AUTOMATION)

        : ExperimentAutomationConfigurationTab.DEFAULT_EXPERIMENTS;

        config.setExperiments(getExperimentRepository(experimentsURI).getExperiments());
        config.setAttributes(this.properties);
    }

    private ExperimentRepository getExperimentRepository(final String experimentsURIString) {
        final URI experimentsURI = URI.createURI(experimentsURIString);
        final ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.getResource(experimentsURI, true);
        final EObject eObject = resource.getContents().get(0);

        if (ExperimentsPackage.eINSTANCE.getExperimentRepository().isInstance(eObject)) {
            return (ExperimentRepository) eObject;
        } else {
            throw new RuntimeException("The root element of the loaded resource is not of the expected type "
                    + ExperimentsPackage.eINSTANCE.getExperimentRepository().getName());
        }
    }

}
