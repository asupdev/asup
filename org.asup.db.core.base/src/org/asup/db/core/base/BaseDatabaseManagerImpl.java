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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.asup.db.core.DataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.core.QViewColumn;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.QSyntaxBuilderRegistry;

public class BaseDatabaseManagerImpl extends DatabaseManagerImpl {

	@Inject
	private QSyntaxBuilderRegistry syntaxBuilderRegistry;

	@Override
	public void createSchema(QConnection connection, QSchema schema, boolean deepCreation) throws SQLException {

		// Schema creation
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createSchema(schema);
			statement.execute(command);
			
			// set database on schema
			schema.setDatabase(connection.getDatabase());
		}
		finally {
			if(statement != null)
				statement.close();
		}

		if(!deepCreation)
			return;

		// Tables import
		for(QTable table: schema.getTables()) {
			createTable(connection, table, deepCreation);
		}

		// Index import
		for(QIndex index: schema.getIndexes()) {
			createIndex(connection, index);
		}

		// Views import
		for(QView view: schema.getViews()) {
			createView(connection, view);
		}
	}

	@Override
	public void createTable(QConnection connection, QTable table, boolean deepCreation) throws SQLException {

		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createTable(table);
//			System.out.println("Creazione tabella " + command);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void createView(QConnection connection, QView view) throws SQLException {

		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 

			String command = syntaxBuilder.createView(view);

			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}

	}
	
	@Override
	public void createIndex(QConnection connection, QIndex index) throws SQLException {
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createIndex(index);
//			System.out.println("Creazione indice " + command);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void dropSchema(QConnection connection, QSchema schema) throws SQLException {

		// drop index
		for(QIndex index: schema.getIndexes()) {
			try {
				dropIndex(connection, index);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// Views drop
		for(QView view: schema.getViews()) {
			try {
				dropView(connection, view);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// Tables drop
		for(QTable table: schema.getTables()) {
			try {
				dropTable(connection, table);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// Schema drop
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropSchema(schema);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}

//		connection.getDatabase().getSchemas().remove(schema);		
		schema.setDatabase(null);
	}

	@Override
	public void dropTable(QConnection connection, QTable table) throws SQLException {

		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig());
			String command = syntaxBuilder.dropTable(table);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void dropView(QConnection connection, QView view) throws SQLException {
		
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropView(view);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}			
	}

	@Override
	public void dropIndex(QConnection connection, QIndex index) throws SQLException {
		
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropIndex(index);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void deleteData(QConnection connection, QSchema schema) throws SQLException {
		
		for(QTable table: schema.getTables()) {
			try {
				deleteData(connection, table);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteData(QConnection connection, QTable table) throws SQLException {
		
		Statement statement = null;
		try {
			statement = connection.createStatement();
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig());
			String command = syntaxBuilder.deleteData(table);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public QSchema getSchema(QConnection connection, String name) {

		// already loaded
		for(QSchema schema: connection.getDatabase().getSchemas()) {
			if(schema.getName().equals(name))
				return schema;
		}

		// check on server
		if(!existsSchema(connection, name))
			return null;

		// Schema
		QSchema schema = QDatabaseCoreFactory.eINSTANCE.createSchema();
		schema.setDatabase(connection.getDatabase());
		schema.setName(name);

		// Tabelle e indici
		try {
			loadTables(connection, schema, null);
			// Viste
			loadViews(connection, schema);
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		connection.getDatabase().getSchemas().add(schema);

		return schema;
	}


	@Override
	public QTable getTable(QConnection connection, String schemaName, String tableName) {
		QSchema schema = null;
		for(QSchema s: connection.getDatabase().getSchemas()) {
			if(s.getName().equals(schemaName)) {
				schema = s;
				break;
			}
		}
		if(schema == null) {
			// check on server
			if(!existsSchema(connection, schemaName))
				return null;

			// Schema
			schema = QDatabaseCoreFactory.eINSTANCE.createSchema();
			schema.setDatabase(connection.getDatabase());
			schema.setName(schemaName);
		}
		// Tabelle e indici
		try {
			loadTables(connection, schema, tableName);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		for(QTable table: schema.getTables()) {
			if(table.getName().equals(tableName))
				return table;
		}
		return null;
	}

	@Override
	public QIndex getIndex(QConnection connection, String schemaName, String tableName, String indexName) {
		QSchema schema = null;
		for(QSchema s: connection.getDatabase().getSchemas()) {
			if(s.getName().equals(schemaName)) {
				schema = s;
				break;
			}
		}
		if(schema == null) {
			// check on server
			if(!existsSchema(connection, schemaName))
				return null;

			// Schema
			schema = QDatabaseCoreFactory.eINSTANCE.createSchema();
			schema.setDatabase(connection.getDatabase());
			schema.setName(schemaName);
		}
		// tables and indexes
		try {
			loadTables(connection, schema, tableName);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		for(QIndex index: schema.getIndexes()) {
			if(index.getName().equals(indexName))
				return index;
		}
		return null;

	}

	private boolean existsSchema(QConnection connection, String name) {

		// JDBC3 compliant
		try {
			if(connection.getConnectionConfig().isUseCatalog()) {
				ResultSet catalogs = connection.getConnection().getMetaData().getCatalogs();
				while(catalogs.next()) {
					System.out.println(catalogs.getString("TABLE_CAT"));
					if(catalogs.getString("TABLE_CAT").equals(name))
						return true;
				}
			}
			else {
				ResultSet schemas = connection.getConnection().getMetaData().getSchemas();
				while(schemas.next()) {
					if(schemas.getString("TABLE_SCHEM").equals(name))
						return true;
				}
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private void loadTables(QConnection connection, QSchema schema, String tableNamePattern) throws SQLException {

		ResultSet rst = connection.getConnection().getMetaData().getTables(connection.getConnection().getCatalog(), schema.getName(), tableNamePattern, new String[] {"TABLE"});

    	while(rst.next()) {
    		QTable table = QDatabaseCoreFactory.eINSTANCE.createTable();
    		table.setSchema(schema);
    		table.setName(rst.getString("TABLE_NAME").toUpperCase());

    		ResultSet rsc = connection.getConnection().getMetaData().getColumns(connection.getConnection().getCatalog(), schema.getName(), table.getName(), null);
    		while(rsc.next()) {
    			loadTableColumn(table, rsc);
    		}

			Map<String, QIndex> indexes = new HashMap<String, QIndex>();
			ResultSet rsi = connection.getConnection().getMetaData().getIndexInfo(connection.getConnection().getCatalog(), schema.getName(), table.getName(), false, false);

			while(rsi.next()) {
				String indexName = rsi.getString("INDEX_NAME");
				// statistic index
				if(indexName == null) continue;

				indexName = indexName.toUpperCase();

				// hidden index
				if(indexName.startsWith("PK__"))
					continue;

				QIndex index = indexes.get(indexName);
				if(index==null) {
					index = QDatabaseCoreFactory.eINSTANCE.createIndex();
					index.setSchema(schema);
					index.setName(indexName);
					boolean unique = !rsi.getBoolean("NON_UNIQUE");
					index.setUnique(unique);
					index.setObject(table.getName());
					indexes.put(indexName, index);
				}

				QIndexColumn indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumn();
				indexColumn.setIndex(index);
				indexColumn.setName(rsi.getString("COLUMN_NAME").toUpperCase());
				if(rsi.getString("ASC_OR_DESC").equals("A"))
					indexColumn.setOrdering(OrderingType.ASCEND);
				else
					indexColumn.setOrdering(OrderingType.DESCEND);

				indexColumn.setSequence(rsi.getShort("ORDINAL_POSITION"));				;
			}
    	}
	}

	private void loadTableColumn(QTable table, ResultSet rs) throws SQLException {
		QTableColumn tableColumn = QDatabaseCoreFactory.eINSTANCE.createTableColumn();
		tableColumn.setTable(table);
		tableColumn.setName(rs.getString("COLUMN_NAME").toUpperCase());
		tableColumn.setDataType(DataType.get(rs.getString("TYPE_NAME").toUpperCase()));
		tableColumn.setNullable(rs.getBoolean("NULLABLE"));
		tableColumn.setPrecision(rs.getInt("COLUMN_SIZE"));
		tableColumn.setScale(rs.getInt("DECIMAL_DIGITS"));
	}

	private void loadViews(QConnection connection, QSchema schema) throws SQLException {

		ResultSet rsv = connection.getConnection().getMetaData().getTables(connection.getConnection().getCatalog(), schema.getName(), null, new String[] {"VIEW"});

    	while(rsv.next()) {
    		try {
	    		QView view = QDatabaseCoreFactory.eINSTANCE.createView();
	    		view.setSchema(schema);
	    		view.setName(rsv.getString("TABLE_NAME").toUpperCase());

	    		// Colonne della vista
	    		ResultSet rs = connection.getConnection().getMetaData().getColumns(connection.getConnection().getCatalog(), schema.getName(), view.getName(), null);

	    		while(rs.next())
	    			loadViewColumn(view, rs);
	    		
	        	
	    		// Indici
	    		Map<String, QIndex> indexes = new HashMap<String, QIndex>();
	    		ResultSet rsi = connection.getConnection().getMetaData().getIndexInfo(connection.getConnection().getCatalog(), schema.getName(), view.getName(), false, false);;

	    		while(rsi.next()) {
	    			String indexName = rsi.getString("INDEX_NAME");
	    			// statistic index
	    			if(indexName == null) continue;

	    			// case unsensitive
	    			indexName = indexName.toUpperCase();

	    			// hidden index
	    			if(indexName.startsWith("PK__"))
	    				continue;

	    			QIndex index = indexes.get(indexName);
	    			if(index==null) {
	    				index = QDatabaseCoreFactory.eINSTANCE.createIndex();
	    				index.setSchema(schema);
	    				index.setName(indexName);
	    				boolean unique = !rsi.getBoolean("NON_UNIQUE");
	    				index.setUnique(unique);
	    				index.setObject(view.getFullName());
	    				indexes.put(indexName, index);
	    			}

	    			QIndexColumn indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumn();
	    			indexColumn.setIndex(index);
	    			indexColumn.setName(rsi.getString("COLUMN_NAME").toUpperCase());
	    			if(rsi.getString("ASC_OR_DESC").equals("A"))
	    				indexColumn.setOrdering(OrderingType.ASCEND);
	    			else
	    				indexColumn.setOrdering(OrderingType.DESCEND);

	    			indexColumn.setSequence(rsi.getShort("ORDINAL_POSITION"));				;
	    		}
    		}
    		catch(Exception e) {
				e.printStackTrace();
			}
    	}
	}

	private void loadViewColumn(QView view, ResultSet rs) throws SQLException {
		QViewColumn viewColumn = QDatabaseCoreFactory.eINSTANCE.createViewColumn();
		viewColumn.setView(view);
		viewColumn.setName(rs.getString("COLUMN_NAME").toUpperCase());
		viewColumn.setDataType(DataType.get(rs.getString("TYPE_NAME").toUpperCase()));
		viewColumn.setNullable(rs.getBoolean("NULLABLE"));
		viewColumn.setPrecision(rs.getInt("COLUMN_SIZE"));
		viewColumn.setScale(rs.getInt("DECIMAL_DIGITS"));
	}
	
}