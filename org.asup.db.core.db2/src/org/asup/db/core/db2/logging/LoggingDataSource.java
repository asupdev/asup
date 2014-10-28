package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.sql.Connection;

import javax.sql.DataSource;


public class LoggingDataSource implements InvocationHandler {

	private DataSource implementation;

	public LoggingDataSource(DataSource implementation) {
		this.implementation = implementation;
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
			result = LoggingConnection.getInstance((Connection) result);
		}
		return result;
	}

	public static DataSource getInstance(DataSource implementation) {
		ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
		return (DataSource)Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
				analyzer.elencoInterfacceAsArray(),
				new LoggingDataSource(implementation));
	}
}
