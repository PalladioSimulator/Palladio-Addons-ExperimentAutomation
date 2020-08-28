package org.palladiosimulator.experimentautomation.application.jobs;

import java.util.Objects;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.edp2.batchexport.BatchExporter;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;

import de.uka.ipd.sdq.workflow.jobs.AbstractJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

public class BatchExporterJob extends AbstractJob {
	private final FileDatasource source;

	public BatchExporterJob(FileDatasource source) {
		this.source = Objects.requireNonNull(source);
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		monitor.subTask("Exporting CSV");
		BatchExporter.batchExport(RepositoryManager.getRepositoryFromUUID(source.getId()), source.getLocation());
		monitor.worked(1);
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
	}

	@Override
	public String getName() {
		return "CSV export job";
	}

}
