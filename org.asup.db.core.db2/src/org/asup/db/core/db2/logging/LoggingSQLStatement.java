package org.asup.db.core.db2.logging;

import java.io.PrintStream;
import java.lang.reflect.*;
import java.sql.*;

import org.asup.db.core.db2.logging.LoggingDataSource.LoggingLevel;

import static org.asup.db.core.db2.logging.LoggingDataSource.LoggingLevel.*;

public class LoggingSQLStatement implements InvocationHandler {

	private final Statement implementation;
	private final Object sql;
	private final LoggingLevel loggingLevel;

	private LoggingSQLStatement(Statement implementation, Object sql, LoggingLevel loggingLevel) {
		this.implementation = implementation;
		this.sql = sql;
		this.loggingLevel = loggingLevel;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		if (method.getName().startsWith("execute") && DEBUG.equals(loggingLevel)) {
			printStatement(args, System.out);
		}
		try {
			result = method.invoke(implementation, args);
		} catch (InvocationTargetException e) {
			if (ERROR.equals(loggingLevel)) {
				printStatement(args, System.err);				
			}
			//Rilancio le SQLException senza che vengano incapsulate 
			//in UndeclaredThrowableException
			throw e.getTargetException();
		}

		return result;
	}

	protected void printStatement(Object[] args, PrintStream printStream) {
		if (args != null && args.length > 0) {
			printStream.println("[Execute SQL] : " + formatStmt(args[0]));
		}
		if (sql != null) {
			printStream.println("[Prepared SQL] : " + formatStmt(sql));
		}
	}

	private String formatStmt(Object obj) {
		return ("" + obj).replaceAll("[\\t\\n\\r]+"," ");
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static Statement getInstance(Statement implementation, Object sql, LoggingLevel loggingLevel) {
		ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
		return (Statement) Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
				analyzer.elencoInterfacceAsArray(),
				new LoggingSQLStatement(implementation, sql, loggingLevel));  
	}
}
