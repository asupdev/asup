package org.asup.db.core.base;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QConnectionProfile;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.base.graph.BaseCatalogContainer;
import org.asup.db.core.base.graph.BaseConnectionFilterProvider;
import org.asup.db.core.base.graph.BaseSchemaLoader;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.mappings.ProviderIDMappingRegistry;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

public class BaseDatabaseStarter {
	
	private static final String FACTORY = "org.eclipse.datatools.enablement.asup.connectionFactory";

	
	private QConnectionManager connectionManager;
	private QDatabaseContainer databaseContainer;


	public BaseDatabaseStarter(QConnectionManager connectionManager, QDatabaseContainer databaseContainer) {
		this.connectionManager = connectionManager;
		this.databaseContainer = databaseContainer;
	}
	
	public void start() {	

		try {
			ProfileManager profileManager = ProfileManager.getInstance();
			
			QConnectionProfile qConnectionProfile = databaseContainer.getConnectionProfile();
			
			// check persistent profile
			IConnectionProfile connectionProfile = profileManager.getProfileByName(qConnectionProfile.getName());
			
			// create default DBM connection
			if (connectionProfile == null) {
				
				Database database = databaseContainer.getDatabase();
				
				ProviderIDMappingRegistry providerIDMappingRegistry = SQMServices.getProviderIDMappingRegistry();
				String providerID = providerIDMappingRegistry.getProviderIDforVendorVersion(database.getVendor(), database.getVersion());
				if (providerID == null)
					throw new FrameworkCoreRuntimeException("Provider ID not found: "+qConnectionProfile);
				
				// TODO create as transient
				Properties properties = connectionManager.createPropertiesByVendorVersion(database.getVendor(), database.getVersion());
				connectionProfile = profileManager.createProfile(qConnectionProfile.getName(), qConnectionProfile.getText(), providerID, properties);
			}

			// activate root connection for database
			ConnectionInfo connectionInfo = (ConnectionInfo) connectionProfile.createConnection(FACTORY);
			if(connectionInfo == null)
				throw new FrameworkCoreRuntimeException("Unexpected condition: x67045nx4xnb40hny5x7p");			


			for (QCatalogContainer catalogContainer : databaseContainer.getCatalogs()) {
				
				Catalog catalog = catalogContainer.getCatalog();

				// activate *LOCAL
				if (!catalog.equals(databaseContainer.getDefaultCatalog())) 
					continue;

				// connect to catalog
				QConnectionConfig connectionConfig = catalogContainer.getConnectionConfig();
				BaseConnectionImpl catalogConnection = (BaseConnectionImpl) connectionManager.createDatabaseConnection(connectionConfig);
				catalogConnection.setCatalog(catalog.getName());
				
				BaseCatalogContainer baseCatalogContainer = new BaseCatalogContainer(catalogConnection, catalog);

				List<Schema> schemas = new ArrayList<Schema>();
				BaseSchemaLoader schemaLoader = new BaseSchemaLoader(baseCatalogContainer, new BaseConnectionFilterProvider());
				schemaLoader.loadSchemas(schemas, Collections.EMPTY_LIST);

				break;
			}
		} catch (ConnectionProfileException | SQLException e) {
			throw new FrameworkCoreRuntimeException(e);
		}

	} 
}
