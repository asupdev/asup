package org.asup.db.core.db2.logging;

import java.lang.reflect.*;
import java.sql.*;



public class LoggingConnection implements InvocationHandler {

  private Connection implementation;

  private LoggingConnection(Connection implementation) {
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
    if (result instanceof Statement) {
      Object sql = null;
      if (m.getName().startsWith("prepare") && args != null && args.length > 0) {
        sql = args[0];
      }
      result = LoggingSQLStatement.getInstance((Statement) result, sql);
    }
    return result;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  public static Connection getInstance(Connection implementation) {
    ClassAnalyzer analyzer = new ClassAnalyzer(implementation.getClass());
    return (Connection)Proxy.newProxyInstance(implementation.getClass().getClassLoader(),
                                              analyzer.elencoInterfacceAsArray(),
                                              new LoggingConnection(implementation));
  }
}
