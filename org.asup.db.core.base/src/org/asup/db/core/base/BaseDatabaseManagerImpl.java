/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.base;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseDefinition;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QStatement;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.db.syntax.QDefinitionWriter;
import org.asup.db.syntax.QDefinitionWriterRegistry;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.connectivity.sqm.loader.IConnectionFilterProvider;
import org.eclipse.datatools.connectivity.sqm.loader.JDBCSchemaLoader;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
public class BaseDatabaseManagerImpl extends DatabaseManagerImpl {

	@Inject
	private QConnectionManager connectionManager;
	
	@Inject
	private QDefinitionWriterRegistry definiwtionWriterRegistry;
	
	private QDatabaseContainer databaseContainer;
	
	@Override
	public void createSchema(QConnection connection, String name, QSchemaDef schemaDef) throws SQLException {

		ConnectionInfo connectionInfo = connection.getConnectionContext().getAdapter(connection, ConnectionInfo.class);
		Database database = connectionInfo.getSharedDatabase();

		System.out.println(database.getSchemas().size());
		// Schema creation
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createSchema(name, schemaDef);
			statement.execute(command);

			
/*			ICatalogObject catalogObject = new DTPCatalogAdapter(database);
			ConnectionFilterProvider connectionFilterProvider = new DTPConnectionFilterProvider();
			
			JDBCSchemaLoader schemaLoader = new JDBCSchemaLoader(catalogObject, connectionFilterProvider);
			schemaLoader.loadSchemas(database.getSchemas(), database.getSchemas());*/
			
			System.out.println(database.getSchemas().size());
			
			//((ICatalogObject) database).refresh();
			
//			RefreshManager.getInstance().referesh((ICatalogObject) database);
			
			// refresh schema
/*			Catalog catalog = connection.getDefaultCatalog();
			if(catalog instanceof ICatalogObject && catalog instanceof Catalog) {
				synchronized (catalog) {
					JDBCSchemaLoader schemaLoader = new JDBCSchemaLoader((ICatalogObject)catalog);
					schemaLoader.loadSchemas(catalog.getSchemas(), catalog.getSchemas());
				}
			}*/
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void createTable(QConnection connection, Schema schema, String name, QTableDef tableDef) throws SQLException {

		QDatabaseDefinition databaseDefinition = connection.getDatabaseDefinition();
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			
			// relative record number support
			if(databaseDefinition.supportsRelativeRecordNumber()) {
				tableDef = (QTableDef) EcoreUtil.copy((EObject)tableDef);
				
				QTableColumnDef pkTableComColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
				pkTableComColumnDef.setDataType(DatabaseDataType.IDENTITY);
				pkTableComColumnDef.setName(TABLE_COLUMN_PRIMARY_KEY_NAME);

				tableDef.getColumns().add(pkTableComColumnDef);
			}
			
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createTable(schema, name, tableDef);
			statement.execute(command);

			// refresh table
/*			synchronized (schema) {
				JDBCTableLoader tableLoader = new JDBCTableLoader((ICatalogObject) schema);
				tableLoader.loadTables(schema.getTables(), schema.getTables());				
			}*/
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void createView(QConnection connection, Schema schema, String name, QViewDef viewDef) throws SQLException {

		QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
		String command = syntaxBuilder.createView(schema, name, viewDef);
		if(command == null)
			throw new SQLException("Empty view creation command: "+viewDef);
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			statement.execute(command);
			
			// refresh view
/*			synchronized (schema) {
				JDBCTableLoader tableLoader = new JDBCTableLoader((ICatalogObject) schema);
				tableLoader.loadTables(schema.getTables(), schema.getTables());				
			}*/
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}
	
	@Override
	public void createIndex(QConnection connection, Table table, String name, QIndexDef indexDef) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createIndex(table, name, indexDef);
			statement.execute(command);
			
			// refresh table
/*			synchronized (table) {
				JDBCTableIndexLoader indexLoader = new JDBCTableIndexLoader((ICatalogObject) table);
				indexLoader.loadIndexes(table.getIndex(), table.getIndex());
			}*/
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void dropSchema(QConnection connection, Schema schema) throws SQLException {

		ConnectionInfo connectionInfo = connection.getConnectionContext().getAdapter(connection, ConnectionInfo.class);
		Database database = connectionInfo.getSharedDatabase();

		System.out.println(database.getSchemas().size());

		
		// drop index
		for(Index index: (List<Index>)schema.getIndices()) {
			try {
				dropIndex(connection, index);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// Tables view
		for(Table table: (List<Table>)schema.getTables()) {
			try {
				if(table instanceof ViewTable)
					dropView(connection, (ViewTable)table);
				else
					dropTable(connection, table);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// schema drop
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = definitionWriter.dropSchema(schema);
			statement.execute(command);

			System.out.println(database.getSchemas().size());
			
/*			ICatalogObject catalogObject = new DTPCatalogAdapter(database);
			
			JDBCSchemaLoader schemaLoader = new JDBCSchemaLoader(catalogObject);
			schemaLoader.loadSchemas(database.getSchemas(), database.getSchemas());*/
			
			System.out.println(database.getSchemas().size());
			// refresh schema
/*			Catalog catalog = connection.getDefaultCatalog();
			synchronized (catalog) {
				catalog.getSchemas().remove(schema);
			}*/
			
		}
		finally {
			if(statement != null)
				statement.close();
		}

		schema.setCatalog(null);
		schema.setDatabase(null);
	}

	@Override
	public void dropTable(QConnection connection, Table table) throws SQLException {

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig());
			String command = syntaxBuilder.dropTable(table);
			statement.execute(command);
			
			// refresh table
			Schema schema = table.getSchema();
			synchronized (schema) {
				schema.getTables().remove(table);
			}
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void dropView(QConnection connection, ViewTable view) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropView(view);
			statement.execute(command);
			
			// refresh table
			Schema schema = view.getSchema();
			synchronized (schema) {
				schema.getTables().remove(view);
			}
		}
		finally {
			if(statement != null)
				statement.close();
		}			
	}

	@Override
	public void dropIndex(QConnection connection, Index index) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropIndex(index);
			statement.execute(command);
						
			// refresh schema
			Schema schema = index.getSchema();
			synchronized (schema) {
				schema.getIndices().remove(index);
			}
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteData(QConnection connection, Schema schema) throws SQLException {
		
		for(Table table: (List<Table>)schema.getTables()) {
			try {
				if(!(table instanceof ViewTable))
					deleteData(connection, table);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteData(QConnection connection, Table table) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter syntaxBuilder = definiwtionWriterRegistry.lookup(connection.getConnectionConfig());
			String command = syntaxBuilder.deleteData(table);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public Schema getSchema(QConnection connection, String schemaName) {

		Database database = getDatabaseContainer().getDatabase();
		System.out.println(database);

		for(Catalog catalog: (List<Catalog>)database.getCatalogs()) {
			
			// default catalog
			if(catalog.getName().equals(connection.getConnectionConfig().getDefaultCatalog())) {
				
				for(Schema schema: (List<Schema>)catalog.getSchemas()) {
					if(schema.getName().equals(schemaName))
						return schema;
				}
			}
		}
		
		return null;
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public Table getTable(QConnection connection, String schemaName, String tableName) {
		
		Schema schema = getSchema(connection, schemaName);
		if(schema == null)
			return null;

		for(Table table: (List<Table>)schema.getTables()) {
			if(table.getName().equals(tableName))
				return table;
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Index getIndex(QConnection connection, String schemaName, String indexName) {

		Schema schema = getSchema(connection, schemaName);
		for(Index index:  (List<Index>)schema.getIndices()) {
			if(index.getName().equalsIgnoreCase(indexName))
				return index;
		}
		
		return null;
	}

	@Override
	public ViewTable getView(QConnection connection, String schemaName, String tableName) {
		
		Table table = getTable(connection, schemaName, tableName);
		if(table instanceof ViewTable)
			return (ViewTable) table;
		else
			return null; 
	}
	
	@SuppressWarnings("unchecked")
	public void start() {
		
		this.databaseContainer = (QDatabaseContainer) getConfig();

		QConnectionConfig connectionConfig = this.databaseContainer.getDefaultConfig();

	
		try {
			for(Catalog catalog: this.databaseContainer.getCatalogs()) {
				if(catalog.getName().equals(connectionConfig.getDefaultCatalog())) {

					QConnection qConnection = connectionManager.createDatabaseConnection(connectionConfig);

					ConnectionInfo connectionInfo = qConnection.getConnectionContext().getAdapter(qConnection, ConnectionInfo.class);

					ICatalogObject iCatalogObject = new BaseCatalogAdapter(connectionInfo.getSharedConnection(), catalog);
					catalog.getEAnnotations();
					
					IConnectionFilterProvider iConnectionFilterProvider = new BaseConnectionFilterProvider();
					JDBCSchemaLoader jdbcSchemaLoader = new JDBCSchemaLoader(iCatalogObject, iConnectionFilterProvider);
					jdbcSchemaLoader.loadSchemas(catalog.getSchemas(), catalog.getSchemas());

					for(Schema schema: (List<Schema>)catalog.getSchemas()) {
						System.out.println(schema.getName());
					}
					
				}
			}
//			connection = getConnectionManager().createDatabaseConnection(connectionConfig);
		} catch (SQLException e) {
			e.printStackTrace();
//			connectionException = e;
		}

	}

	@Override
	public boolean isStarted() {
		return this.databaseContainer != null;
	}

	@Override
	public QDatabaseContainer getDatabaseContainer() {
		return this.databaseContainer;
	}
}