package org.asup.db.core.test;

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ConnectionCommands extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;

	public void _connect(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		long timeIni = System.currentTimeMillis();
		QConnection connection = connectionManager.createConnection(catalog);
		System.out.println(connection.getID());
		connection.close();
		long timeEnd = System.currentTimeMillis();
		
		System.out.println("(" + (timeEnd - timeIni) + " ms)");

	}
}