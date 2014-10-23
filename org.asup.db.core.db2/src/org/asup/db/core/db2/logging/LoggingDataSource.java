package org.asup.db.core.db2.logging;

import java.sql.*;

import com.ibm.db2.jcc.DB2SimpleDataSource;


public class LoggingDataSource extends DB2SimpleDataSource {

	private DB2SimpleDataSource implementation;

	public LoggingDataSource(DB2SimpleDataSource implementation) {
		this.implementation = implementation;
	}
	
    public Connection getConnection() throws SQLException {
		return LoggingConnection.getInstance(implementation.getConnection());
	}

    public Connection getConnection(String username, String password)  throws SQLException {
		return LoggingConnection.getInstance(implementation.getConnection(username, password));
    }

}
