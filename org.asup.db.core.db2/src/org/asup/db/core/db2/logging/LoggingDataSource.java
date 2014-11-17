package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.sql.*;

import javax.sql.DataSource;


public class LoggingDataSource implements InvocationHandler {

	public enum LoggingLevel {
		DEBUG, ERROR;
	}
	
	private final DataSource implementation;
	private final LoggingLevel loggingLevel;

	private LoggingDataSource(DataSource implementation, LoggingLevel loggingLevel) {
		this.implementation = implementation;
		this.loggingLevel = loggingLevel;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		Object result = null;
		try {
			result = m.invoke(implementation, args);
		} catch (InvocationTargetException e) {
			//Rilancio le SQLException senza che vengano incapsulate 
			//in UndeclaredThrowableException
			throw e.getTargetException();
		}
		if (result instanceof Connection) {
			result = LoggingConnection.getInstance((Connection) result, loggingLevel);
			System.out.println("Connected to " + describeConnection((Connection)result));
		}
		return result;
	}
	
	private String describeConnection(Connection connection) {
		try {
			DatabaseMetaData metaData = connection.getMetaData();
			return metaData.getURL() + 
				   " - Driver " + metaData.getDriverVersion() +
				   " - " + metaData.getDatabaseProductName() + 
				   " " + metaData.getDatabaseMajorVersion() + "." + metaData.getDatabaseMinorVersion();
		} catch (SQLException e) {
			return e.toString();
		}
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static DataSource getInstance(DataSource implementation, LoggingLevel loggingLevel) {
		ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
		return (DataSource)Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
				analyzer.elencoInterfacceAsArray(),
				new LoggingDataSource(implementation, loggingLevel));
	}
}
