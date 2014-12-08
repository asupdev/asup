package org.asup.db.core.base;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionCredentials;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.syntax.QDefinitionWriter;
import org.asup.db.syntax.QDefinitionWriterRegistry;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.QQueryWriterRegistry;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class BaseDatabaseStarter {

	@Inject
	private QContext context;
	@Inject
	private QQueryWriterRegistry queryWriterRegistry;
	@Inject
	private QDefinitionWriterRegistry definitionWriterRegistry;

	
	@SuppressWarnings("unchecked")
	public void loadDatabase(QDatabaseContainer databaseContainer) {	

		try {
			
			// prepare catalog containers
			for (QCatalogContainer catalogContainer : databaseContainer.getCatalogContainers()) {

				QConnectionConfig connectionConfig = catalogContainer.getConnectionConfig();
				QConnectionCredentials credentials = connectionConfig.getCredentials();
				
				ConnectionInfo catalogInfo = catalogContainer.createConnection(ConnectionInfo.class, credentials.getUser(), credentials.getPassword());
				if(catalogInfo == null)
					throw new FrameworkCoreRuntimeException("Unexpected condition: x67045nx4xnb40hny5x7p");			

				// load catalog metadata
				Database catalogDatabase = catalogInfo.getSharedDatabase();
				List<Catalog> catalogDatabaseCatalogs = (List<Catalog>)catalogDatabase.getCatalogs();
				List<Schema> catalogMetadataSchemas = null;
				
				if(catalogDatabaseCatalogs.isEmpty())
					catalogMetadataSchemas = catalogDatabase.getSchemas();
				else { 					
					for(Catalog catalogDatabaseCatalog: catalogDatabaseCatalogs) {
						if(connectionConfig.getCatalog().equals(catalogDatabaseCatalog.getName())) {
							catalogMetadataSchemas = catalogDatabaseCatalog.getSchemas();
							break;
						}
					}
				}
							
				QCatalogMetaData catalogMetaData = new BaseCatalogMetaDataImpl(catalogMetadataSchemas);
				catalogContainer.setMetaData(catalogMetaData);

				// set catalog context
				QContext catalogContext = new BaseCatalogContextImpl(context.createChild(), catalogContainer.getName());
				catalogContainer.setCatalogContext(catalogContext);
				
				// query writer
				QQueryWriter queryWriter = queryWriterRegistry.lookup(connectionConfig);
				catalogContext.set(QQueryWriter.class, queryWriter);
				
				// definition writer
				QDefinitionWriter definitionWriter = definitionWriterRegistry.lookup(connectionConfig);
				catalogContext.set(QDefinitionWriter.class, definitionWriter);

				catalogInfo.getSharedConnection().setCatalog(connectionConfig.getCatalog());
			}
			
//			printDatabase(databaseContainer);
			
		} catch (SQLException e) {
			throw new FrameworkCoreRuntimeException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void printDatabase(QDatabaseContainer databaseContainer) {
		for(QCatalogContainer catalogContainer: databaseContainer.getCatalogContainers()) {
			System.out.println(catalogContainer);
			for(Schema schema: (List<Schema>)catalogContainer.getMetaData().getSchemas()) {
				System.out.println("\t"+schema);
				for(Table table: (List<Table>)schema.getTables()) {
					System.out.println("\t\t"+table);
				}
			}
		}		
	}
}