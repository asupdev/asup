package org.asup.db.core.test;

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class DTPCommandProviderImpl extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;
	
	public void _connect(CommandInterpreter interpreter) throws SQLException {

		QConnectionConfig config = loadConfig(interpreter.nextArgument());

		long timeIni = System.currentTimeMillis();
		QConnection connection = connectionManager.createDatabaseConnection(config);		
		long timeEnd = System.currentTimeMillis();

		Database database = databaseManager.getDatabase(connection);
		System.out.println(database.getName()+"("+(timeEnd-timeIni)+" ms)");

		connection.close();
	}
}