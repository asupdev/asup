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
import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QStatement;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.db.syntax.QDefinitionWriter;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BaseDatabaseManagerImpl extends DatabaseManagerImpl {

	@Inject
	private QContext context;

	private QDatabaseContainer databaseContainer;

	protected QDatabaseContainer getDatabaseContainer() {
		return this.databaseContainer;
	}

	@Override
	public boolean isStarted() {
		return getDatabaseContainer() != null;
	}

	@Override
	public void start(QDatabaseContainer databaseContainer) {

		if (isStarted())
			throw new FrameworkCoreRuntimeException("Database Manager already started: " + this.databaseContainer);

		BaseDatabaseLoader databaseStarter = context.make(BaseDatabaseLoader.class);
		databaseStarter.loadDatabase(databaseContainer);

		this.databaseContainer = databaseContainer;
	}

	@Override
	public Schema createSchema(QConnection connection, String name, QSchemaDef schemaDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;

		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.createSchema(name, schemaDef);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		Schema schema = getCatalogContainer(connection).loadSchema(name);

		return schema;
	}

	@Override
	public Table createTable(QConnection connection, Schema schema, String name, QTableDef tableDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);

			// relative record number support
			if (!catalogContainer.isSupportsRelativeRecordNumber()) {
				tableDef = (QTableDef) EcoreUtil.copy((EObject) tableDef);

				QTableColumnDef pkTableComColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
				pkTableComColumnDef.setDataType(DatabaseDataType.IDENTITY);
				pkTableComColumnDef.setName(TABLE_COLUMN_PRIMARY_KEY_NAME);

				tableDef.getColumns().add(pkTableComColumnDef);
			}

			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.createTable(schema, name, tableDef);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		Table table = catalogContainer.loadTable(schema, name);
		return table;
	}

	@Override
	public ViewTable createView(QConnection connection, Schema schema, String name, QViewDef viewDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
		String command = definitionWriter.createView(schema, name, viewDef);
		if (command == null)
			throw new SQLException("Empty view creation command: " + viewDef);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		ViewTable view = getCatalogContainer(connection).loadView(schema, name);
		return view;
	}

	@Override
	public Index createIndex(QConnection connection, Table table, String name, QIndexDef indexDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.createIndex(table, name, indexDef);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		Index index = getCatalogContainer(connection).loadIndex(table, name);
		return index;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteData(QConnection connection, Schema schema) throws SQLException {

		for (Table table : (List<Table>) schema.getTables()) {
			try {
				if (!(table instanceof ViewTable))
					deleteData(connection, table);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteData(QConnection connection, Table table) throws SQLException {

		// persistent table only
		if (table instanceof ViewTable)
			return;

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = getCatalogContext(connection).get(QDefinitionWriter.class);
			String command = definitionWriter.deleteData(table);
			statement.execute(command);
		} finally {
			if (statement != null)
				statement.close();
		}
	}

	@Override
	public void dropSchema(QConnection connection, Schema schema, boolean ignoreFailOnNonEmpty) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropSchema(schema, ignoreFailOnNonEmpty);
			statement.execute(command);
		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeSchema(schema);
	}

	@Override
	public void dropTable(QConnection connection, Table table) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropTable(table);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeTable(table);
	}

	@Override
	public void dropView(QConnection connection, ViewTable view) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropView(view);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeView(view);
	}

	@Override
	public void dropIndex(QConnection connection, Index index) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			statement = connection.createStatement(true);
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropIndex(index);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeIndex(index);
	}

	private QCatalogContainer getCatalogContainer(QConnection connection) throws SQLException {

		QCatalogContainer catalogContainer = null;

		String catalogName = connection.getCatalog();
		if (catalogName == null || catalogName.isEmpty()) {
			catalogContainer = this.databaseContainer.getDefaultCatalogContainer();
		} else {
			for (QCatalogContainer tempContainer : this.databaseContainer.getCatalogContainers()) {
				if (tempContainer.getConnectionConfig().getCatalog() == catalogName) {
					catalogContainer = tempContainer;
					break;
				}
			}
		}

		return catalogContainer;
	}

	private QContext getCatalogContext(QConnection connection) throws SQLException {
		return getCatalogContainer(connection).getCatalogContext();
	}
}