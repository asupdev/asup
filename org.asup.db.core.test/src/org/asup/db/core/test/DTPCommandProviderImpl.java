package org.asup.db.core.test;

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class DTPCommandProviderImpl extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	
	public void _connect(CommandInterpreter interpreter) throws SQLException {

		QConnectionConfig config = loadConfig(interpreter.nextArgument());

		long timeIni = System.currentTimeMillis();
		QConnection connection = connectionManager.createDatabaseConnection(config);		
		long timeEnd = System.currentTimeMillis();

		System.out.println("("+(timeEnd-timeIni)+" ms)");

		connection.close();
	}
}