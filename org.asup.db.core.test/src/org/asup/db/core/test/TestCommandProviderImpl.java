package org.asup.db.core.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.inject.Inject;

import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QStatement;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestCommandProviderImpl extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;

	public void _copySchema(CommandInterpreter interpreter) throws SQLException {

		String schemaName = interpreter.nextArgument();
		String pluginName = interpreter.nextArgument();

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		Enumeration<String> objects = bundle.getEntryPaths("/config/schemas/" + schemaName);
		QConnectionConfig connectionConfig = loadConfig(pluginName);

		QConnection connection = connectionManager.createDatabaseConnection(connectionConfig);

		dropDB2Schema(connection, schemaName);

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schemaDef.setName(schemaName);
		databaseManager.createSchema(connection, schemaDef);

		Schema schema = databaseManager.getSchema(connection, schemaName);

		Set<String> fileNames = new TreeSet<String>();

		while (objects.hasMoreElements()) {
			String entry = objects.nextElement();
			fileNames.add(entry);
		}

		for (String fileName : fileNames) {

			URL url = bundle.getEntry(fileName);
			Object file = load(url);
			System.out.println("Create object: " + file);

			try {
				if (file instanceof QTableDef) {
					QTableDef tableDef = (QTableDef) file;
					databaseManager.createTable(connection, schema, tableDef);
				} else if (file instanceof QViewDef) {
					QViewDef viewDef = (QViewDef) file;
					databaseManager.createView(connection, schema, viewDef);
				} else if (file instanceof QIndexDef) {
					QIndexDef indexDef = (QIndexDef) file;
					Table table = databaseManager.getTable(connection, schemaName, ((QIndexDef) file).getName());
					databaseManager.createIndex(connection, table, indexDef);
				}
			} catch (SQLException e) {
				System.err.println(e.toString());
			}
		}

		connection.close();
		System.out.println("Creazione schema completata");
	}

	public void _cSQL(CommandInterpreter interpreter) throws Exception {

		QConnectionConfig connectionConfigTo = loadConfig("DB2");

		QConnection connectionTo = connectionManager.createDatabaseConnection(connectionConfigTo);
		List<String> statements = readStatementsForTest();

		for(int i=0; i<10; i++) {
			long timeIni = System.currentTimeMillis();
			for (String sql : statements) {
				try {
					QStatement s = connectionTo.createStatement();
					s.execute(sql);
					s.close();
	//				System.out.print(".");
				} catch (SQLException e) {
	//				System.err.println(e.getMessage());
					// writeToFile(sql, new File("c:\\temp\\sql.log"), true);
				}
			}
			long timeEnd = System.currentTimeMillis();
			System.out.println("DONE! " + (timeEnd - timeIni));
		}
		connectionTo.close();
	}

	@SuppressWarnings("unchecked")
	public Object _copyDDL(CommandInterpreter interpreter) throws SQLException {

		String pluginNameFrom = interpreter.nextArgument();
		String pluginNameTo = interpreter.nextArgument();

		QConnectionConfig connectionConfigFrom = loadConfig(pluginNameFrom);
		QConnection connectionFrom = connectionManager.createDatabaseConnection(connectionConfigFrom);

		QConnectionConfig connectionConfigTo = loadConfig(pluginNameTo);
		QConnection connectionTo = connectionManager.createDatabaseConnection(connectionConfigTo);

		System.out.print("Reading schema...");
		Schema schemaFrom = databaseManager.getSchema(connectionFrom, "SMEUP_DAT");
		System.out.println("...OK");

		try {
			dropDB2Schema(connectionTo, schemaFrom.getName());
		} catch (Exception e) {
		}

		QSchemaDef schemaDef = connectionTo.getConnectionContext().getAdapter(schemaFrom, QSchemaDef.class);
		databaseManager.createSchema(connectionTo, schemaDef);
		Schema schemaTo = databaseManager.getSchema(connectionTo, schemaDef.getName());

		for (Table table : (List<Table>) schemaFrom.getTables()) {

			if (table instanceof ViewTable) {
				QViewDef viewDef = connectionTo.getConnectionContext().getAdapter(schemaFrom, QViewDef.class);
				databaseManager.createView(connectionTo, schemaTo, viewDef);
			} else {
				QTableDef tableDef = connectionTo.getConnectionContext().getAdapter(table, QTableDef.class);
				databaseManager.createTable(connectionTo, schemaTo, tableDef);
			}
		}

		for (Index index : (List<Index>) schemaFrom.getIndices()) {
			QIndexDef indexDef = connectionTo.getConnectionContext().getAdapter(index, QIndexDef.class);
			Table tableTo = databaseManager.getTable(connectionTo, schemaTo.getName(), index.getName());
			databaseManager.createIndex(connectionTo, tableTo, indexDef);
		}

		return null;
	}

	// connectionManager e disk
	public Object _testcon(CommandInterpreter interpreter) throws SQLException {

		String pluginName = interpreter.nextArgument();
		QConnectionConfig connectionConfig = loadConfig(pluginName);

		QConnection connection = connectionManager.createDatabaseConnection(connectionConfig);
		System.out.println(connection);

		connection.close();

		return null;
	}

	public Object _testDDL(CommandInterpreter interpreter) throws SQLException {

		String pluginName = interpreter.nextArgument();
		QConnectionConfig connectionConfig = loadConfig(pluginName);

		String schemaName = "ASUP_TEST";
		String tableName = "ASUP_TABLE";
		String indexName = "ASUP_INDEX";

		QConnection connection = connectionManager.createDatabaseConnection(connectionConfig);

		Schema schema = databaseManager.getSchema(connection, schemaName);
		if (schema != null)
			dropDB2Schema(connection, schemaName);

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schemaDef.setName(schemaName);
		databaseManager.createSchema(connection, schemaDef);
		schema = databaseManager.getSchema(connection, schemaName);

		QTableDef tableDef = QDatabaseCoreFactory.eINSTANCE.createTableDef();
		tableDef.setName(tableName);

		for (int i = 1; i <= 3; i++) {
			QTableColumnDef column = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
			column.setName("COL" + i);
			column.setDataType(DatabaseDataType.CHARACTER);
			column.setLength(10);
			tableDef.getColumns().add(column);
		}

		databaseManager.createTable(connection, schema, tableDef);
		Table table = databaseManager.getTable(connection, schema.getName(), tableName);

		QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();
		indexDef.setName(indexName);

		QIndexColumnDef indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
		indexColumn.setName("COL2");
		indexColumn.setSequence(1);
		indexColumn.setOrdering(OrderingType.ASCEND);

		indexDef.getColumns().add(indexColumn);

		databaseManager.createIndex(connection, table, indexDef);

		return null;
	}

	@SuppressWarnings("unchecked")
	public Object _copyV(CommandInterpreter interpreter) throws SQLException {

		QConnectionConfig connectionConfigFrom = loadConfig("MSSQL");
		QConnection connectionFrom = connectionManager.createDatabaseConnection(connectionConfigFrom);

		QConnectionConfig connectionConfigTo = loadConfig("DB2");
		QConnection connectionTo = connectionManager.createDatabaseConnection(connectionConfigTo);

		System.out.print("Reading schemas...");
		Schema schemaFrom = databaseManager.getSchema(connectionFrom, "SMEUP_DAT");
		Schema schemaTo = databaseManager.getSchema(connectionFrom, "SMEUP_DAT");
		System.out.println("...OK");

		for (Table table : (List<Table>) schemaFrom.getTables()) {

			if (!(table instanceof ViewTable))
				continue;

			ViewTable view = (ViewTable) table;
			if (view.getName().equals("A£LIND0L")) {
				QViewDef viewDef = connectionFrom.getConnectionContext().getAdapter(view, QViewDef.class);
				databaseManager.createView(connectionTo, schemaTo, viewDef);
				break;
			}
		}
		return null;
	}

	private void dropDB2Schema(QConnection connection, String schemaName) throws SQLException {

		System.out.print("Dropping schema " + schemaName + "...");

		Schema schema = databaseManager.getSchema(connection, schemaName);
		if (schema == null)
			return;

		databaseManager.dropSchema(connection, schema);
		String sql = "begin " + "  declare l_errschema varchar(128) default 'ERRORSCHEMA';" + "  declare l_errtab varchar(128) default 'ERRORTABLE';" + "  CALL SYSPROC.ADMIN_DROP_SCHEMA('"
				+ schemaName + "', NULL, l_errschema, l_errtab);" + " end";
		try {
			connection.createStatement().execute(sql);
		} catch (Exception e) {
			System.err.println("****** ERRORE SU " + sql);
			System.err.println(e);
		}
		System.out.println("schema dropped");
	}

	private List<String> readStatementsForTest() throws IOException, SQLException {

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		// URL entry = bundle.getEntry("/config/statements/prova.txt");
		URL entry = bundle.getEntry("/config/statements/sql_smeup.txt");
		List<String> sourceSQL = readLinesFromInputStream(entry.openStream());

		return sourceSQL;
	}

	public static void writeToFile(String s, File file) throws IOException {
		writeToFile(s, file, false);
	}

	public static void writeToFile(String s, File file, boolean append) throws IOException {

		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(file, append));
			out.write(s);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	public static List<String> readLinesFromInputStream(InputStream inputStream) throws IOException {
		return readLinesFrom(new BufferedReader(new InputStreamReader(inputStream)));
	}

	public static List<String> readLinesFromFile(File file) throws IOException {
		return readLinesFrom(new BufferedReader(new FileReader(file)));
	}

	public static List<String> readLinesFrom(BufferedReader in) throws IOException {
		ArrayList<String> linee = new ArrayList<String>();
		String str;
		while ((str = in.readLine()) != null) {
			linee.add(str);
		}
		in.close();
		return linee;
	}

	@Override
	public String getHelp() {
		return "Nuovo help";
	}

	public enum DBType {
		MSSQL, DB2;
	}

	public QConnectionConfig loadConfig(String name) {

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());

		URL url = bundle.getEntry("/config/connection/" + name + ".xmi");

		return (QConnectionConfig) load(url);
	}

	public EObject load(URL url) {

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(url.toString()));
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resource.getContents().get(0);
	}
}
