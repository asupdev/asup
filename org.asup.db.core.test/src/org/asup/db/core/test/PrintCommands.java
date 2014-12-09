package org.asup.db.core.test;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class PrintCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;

	public void _printCatalog(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);

		for (Schema schema : connection.getCatalogMetaData().getSchemas()) {
			System.out.println(schema);
		}

		connection.close();

	}

	@SuppressWarnings("unchecked")
	public void _printSchema(CommandInterpreter interpreter) throws SQLException {

		String schemaName = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema == null)
			return;

		System.out.println("\t" + schema);
		for (Table table : (List<Table>) schema.getTables()) {
			System.out.println("\t\t" + table);
		}

		connection.close();

	}
}