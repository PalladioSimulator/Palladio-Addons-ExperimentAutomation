/** */
package org.palladiosimulator.experimentautomation.application.ui.workflow;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import de.uka.ipd.sdq.workflow.launchconfig.extension.ExtendableTabGroup;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.DebugEnabledCommonTab;

/**
 * Configuration tabs for Experiment Automation.
 * 
 * @author Sebastian Lehrig
 */
public class ExperimentAutomationTabGroup extends ExtendableTabGroup {

    /** The id of the workflow extending configuration tabs have to register for. */
    public static String WORKFLOW_ID_EXPERIMENT_AUTOMATION_TABS = "workflow.extension.experimentautomation.tabs";

    /**
     * {@inheritDoc}
     */
    @Override
    public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
        final List<ILaunchConfigurationTab> tabs = new ArrayList<>();

        tabs.add(new ExperimentAutomationConfigurationTab());
        tabs.addAll(createExtensionTabs(dialog, mode, WORKFLOW_ID_EXPERIMENT_AUTOMATION_TABS));
        tabs.add(new DebugEnabledCommonTab());

        setTabs(tabs.toArray(new ILaunchConfigurationTab[] {}));
    }
}
