package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.sql.Connection;

import javax.sql.DataSource;


public class LoggingDataSource implements InvocationHandler {

	public enum LoggingLevel {
		DEBUG, ERROR;
	}
	
	private DataSource implementation;
	private LoggingLevel loggingLevel;

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
		}
		return result;
	}
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static DataSource getInstance(DataSource implementation, LoggingLevel loggingLevel) {
		ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
		return (DataSource)Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
				analyzer.elencoInterfacceAsArray(),
				new LoggingDataSource(implementation, loggingLevel));
	}
}
