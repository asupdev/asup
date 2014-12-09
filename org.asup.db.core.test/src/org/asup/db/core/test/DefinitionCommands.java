package org.asup.db.core.test;

import java.net.URL;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;

import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QDatabaseObjectDef;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.fw.util.QFileUtil;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class DefinitionCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QFileUtil fileUtil;

	public void _createSchema(CommandInterpreter interpreter) throws SQLException {

		String schemaName = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();

		// connect to default catalog
		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		Enumeration<URL> tables = bundle.findEntries("/resources/schemas/" + schemaName + "/tables", null, false);

		while (tables.hasMoreElements()) {

			URL tableURL = tables.nextElement();
			String fileName = fileUtil.getBaseName(tableURL.getFile());

			QDatabaseObjectDef file = (QDatabaseObjectDef) load(tableURL);
			
			SQLObject sqlObject = null;
			try {
				if (file instanceof QViewDef) {
					QViewDef viewDef = (QViewDef) file;
					sqlObject = databaseManager.createView(connection, schema, fileName, viewDef);
				} else if (file instanceof QTableDef) {
					QTableDef tableDef = (QTableDef) file;
					sqlObject = databaseManager.createTable(connection, schema, fileName, tableDef);
				} else if (file instanceof QIndexDef) {
					QIndexDef indexDef = (QIndexDef) file;
					Table table = connection.getCatalogMetaData().getTable(schemaName, fileName);
					sqlObject = databaseManager.createIndex(connection, table, fileName, indexDef);
				}
				System.out.println(sqlObject);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		connection.close();
		System.out.println("Creazione schema completata");
	}

	@SuppressWarnings("unchecked")
	public Object _copyDDL(CommandInterpreter interpreter) throws SQLException {

		String catalogFrom = interpreter.nextArgument();
		String cataloTo = interpreter.nextArgument();
		String schemaName = interpreter.nextArgument();
				
		QConnection connectionTo = connectionManager.createConnection(cataloTo);

		Schema schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaName);
		if(schemaTo != null)
			databaseManager.dropSchema(connectionTo, schemaTo, true);

		QConnection connectionFrom = connectionManager.createConnection(catalogFrom);
		Schema schemaFrom = connectionFrom.getCatalogMetaData().getSchema(schemaName);
		
		QSchemaDef schemaDef = connectionTo.getConnectionContext().getAdapter(schemaFrom, QSchemaDef.class);
		databaseManager.createSchema(connectionTo, schemaFrom.getName(), schemaDef);
		// TODO
		schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaFrom.getName());

		for (Table table : (List<Table>) schemaFrom.getTables()) {

			if (table instanceof ViewTable) {
				QViewDef viewDef = connectionTo.getConnectionContext().getAdapter(schemaFrom, QViewDef.class);
				databaseManager.createView(connectionTo, schemaTo, table.getName(), viewDef);
			} else {
				QTableDef tableDef = connectionTo.getConnectionContext().getAdapter(table, QTableDef.class);
				databaseManager.createTable(connectionTo, schemaTo, table.getName(), tableDef);
			}
		}

		for (Index index : (List<Index>) schemaFrom.getIndices()) {
			QIndexDef indexDef = connectionTo.getConnectionContext().getAdapter(index, QIndexDef.class);
			Table tableTo = connectionTo.getCatalogMetaData().getTable(schemaTo.getName(), index.getName());
			databaseManager.createIndex(connectionTo, tableTo, index.getName(), indexDef);
		}

		return null;
	}

	public Object _testDDL(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		String schemaName = "ASUP_TEST";
		String tableName = "ASUP_TABLE";
		String indexName = "ASUP_INDEX";

		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);
		

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);

		QTableDef tableDef = QDatabaseCoreFactory.eINSTANCE.createTableDef();

		for (int i = 1; i <= 3; i++) {
			QTableColumnDef column = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
			column.setName("COL" + i);
			column.setDataType(DatabaseDataType.CHARACTER);
			column.setLength(10);
			tableDef.getColumns().add(column);
		}

		Table table = databaseManager.createTable(connection, schema, tableName, tableDef);

		QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();

		QIndexColumnDef indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
		indexColumn.setName("COL2");
		indexColumn.setSequence(1);
		indexColumn.setOrdering(OrderingType.ASCEND);

		indexDef.getColumns().add(indexColumn);

//		databaseManager.createIndex(connection, table, indexName, indexDef);
		connection.close();
		return null;
	}
}