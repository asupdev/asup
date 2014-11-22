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

import org.asup.db.core.QConnection;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QStatement;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.QSyntaxBuilderRegistry;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.query.helper.DatabaseHelper;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public class BaseDatabaseManagerImpl extends DatabaseManagerImpl {

	@Inject
	private QSyntaxBuilderRegistry syntaxBuilderRegistry;
	
	@Override
	public void createSchema(QConnection connection, QSchemaDef schema) throws SQLException {

		// Schema creation
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createSchema(schema);
			statement.execute(command);			
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void createTable(QConnection connection, Schema schema, QTableDef table) throws SQLException {

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createTable(schema, table);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@Override
	public void createView(QConnection connection, Schema schema, QViewDef view) throws SQLException {

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createView(schema, view);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}
	
	@Override
	public void createIndex(QConnection connection, Table table, QIndexDef index) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.createIndex(table, index);
			statement.execute(command);
		}
		finally {
			if(statement != null)
				statement.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void dropSchema(QConnection connection, Schema schema) throws SQLException {

		// drop index
		for(Index index: (List<Index>)schema.getIndices()) {
			try {
				dropIndex(connection, index);
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		// Tables drop
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

		// Schema drop
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
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
	public void dropTable(QConnection connection, Table table) throws SQLException {

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
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
	public void dropView(QConnection connection, ViewTable view) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
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
	public void dropIndex(QConnection connection, Index index) throws SQLException {
		
		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig()); 
			String command = syntaxBuilder.dropIndex(index);
			statement.execute(command);
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
	public Database getDatabase(QConnection connection) {		
		return connection.getAdapter(connection, ConnectionInfo.class).getSharedDatabase();
	}

	@Override
	public Schema getSchema(QConnection connection, String schemaName) {

		Database database = getDatabase(connection);
		if(database == null)
			return null;
		
		return DatabaseHelper.findSchema(database, schemaName);
	}

	@Override
	public Table getTable(QConnection connection, String schemaName, String tableName) {
		
		Schema schema = getSchema(connection, schemaName);
		if(schema == null)
			return null;

		return DatabaseHelper.findTable(schema, tableName);
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
}