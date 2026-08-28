package org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;
import org.palladiosimulator.edp2.repository.local.LocalDirectoryRepositoryHelper;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;

public class EDP2DatasourceFactory {

    /**
     * Loads an EDP2 repository based on the given data source.
     *
     * @param datasource
     *            The data source to be used for loading, e.g., a memory or a file data source.
     * @return The repository corresponding to the given data source.
     */
    public static Repository createOrOpenDatasource(final EDP2Datasource datasource) {
        if (datasource.getId() != null) {
            final Repository existing = RepositoryManager.getRepositoryFromUUID(datasource.getId());
            if (existing != null) {
                return existing;
            }
        }

        final Repository repository;

        if (AbstractsimulationPackage.eINSTANCE.getMemoryDatasource().isInstance(datasource)) {
            // create Memory Repository
            repository = RepositoryFactory.eINSTANCE.createLocalMemoryRepository();
        } else if (AbstractsimulationPackage.eINSTANCE.getFileDatasource().isInstance(datasource)) {
            final FileDatasource fileDatasource = (FileDatasource) datasource;
            final File file = new File(fileDatasource.getLocation());
            final String repositoryID = URI.createFileURI(file.getAbsolutePath()).toString();
            final Repository ldRepository = RepositoryManager
                    .getRepositoryFromUUID(repositoryID);

            if (ldRepository == null) {
                // create LocalDirectory Repository
                repository = LocalDirectoryRepositoryHelper.initializeLocalDirectoryRepository(file);
            } else {
                // found existing LocalDirectory Repository
                repository = ldRepository;
            }
        } else {
            throw new RuntimeException("Could not determine datasource type. This should not have happened.");
        }

        RepositoryManager.addRepository(RepositoryManager.getCentralRepository(), repository);
        datasource.setId(repository.getId());

        return repository;
    }

}
