package org.asup.db.core.db2;

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QTable;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class DB2CommandProviderImpl extends ServiceImpl implements CommandProvider  {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;
	
	public Object _testdb2(CommandInterpreter interpreter) {
		
		QConnectionConfig connectionConfig = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		connectionConfig.setDatabaseName("*LOCAL");
		connectionConfig.setDriver("net.sourceforge.jtds.jdbc.Driver");
		connectionConfig.setUrl("jdbc:jtds:sqlserver://ASUP-DB1/ASUP_0.5.0");
		connectionConfig.setUser("ASUP");
		connectionConfig.setPassword("asup2013");
		connectionConfig.setUseCatalog(false);
		connectionConfig.setPluginName("MSSQL");		

		connectionManager.registerConnectionConfig("*LOCAL", connectionConfig);
		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);
		
		QTable muconv0f = databaseManager.getTable(connection, "P_MULT", "MUCONV0F");
		
		try {
			databaseManager.createTable(connection, muconv0f, true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
