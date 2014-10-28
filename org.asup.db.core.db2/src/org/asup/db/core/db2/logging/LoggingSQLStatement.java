package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.sql.*;


public class LoggingSQLStatement implements InvocationHandler {

	private Statement implementation;


	private final Object sql;

	private LoggingSQLStatement(Statement implementation, Object sql) {
		this.implementation = implementation;
		this.sql = sql;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		if (method.getName().startsWith("execute")) {
			printStatement(args);
		}
		try {
			result = method.invoke(implementation, args);
		} catch (InvocationTargetException e) {
			//Rilancio le SQLException senza che vengano incapsulate 
			//in UndeclaredThrowableException
			throw e.getTargetException();
		}

		return result;
	}

	protected void printStatement(Object[] args) {
		if (args != null && args.length > 0) {
			System.out.println("[Execute SQL] : " + args[0]);
		}
		if (sql != null) {
			System.out.println("[Prepared SQL] : " + sql);
		}
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static Statement getInstance(Statement implementation, Object sql) {
		ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
		return (Statement) Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
				analyzer.elencoInterfacceAsArray(),
				new LoggingSQLStatement(implementation, sql));  
	}
}
