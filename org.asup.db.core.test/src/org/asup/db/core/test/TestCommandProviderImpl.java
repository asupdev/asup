package org.asup.db.core.test;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Properties;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestCommandProviderImpl extends ServiceImpl implements CommandProvider  {
	
	@Inject
	private QConnectionFactoryRegistry connectionFactoryRegistry;
	@Inject
	private QConnectionManager connectionManager;
	
	public Object _testcondb2(CommandInterpreter interpreter) throws SQLException {

		System.out.println(connectionFactoryRegistry);
		
		QConnectionFactory mssqlConnectionFactory = connectionFactoryRegistry.lookup(DBType.DB2.name());
		System.out.println(mssqlConnectionFactory);
		
		Properties props = new Properties();
		props.put("url", "jdbc:db2://localhost:50000/ASUP050");
		props.put("user", "ASUP");
		props.put("password", "asup2013");
		
		DataSource dataSource = mssqlConnectionFactory.createDataSource(props);
		System.out.println(dataSource.getConnection());
		
		return null;
		
	}
	
	// dataFactory
	public Object _testcon1(CommandInterpreter interpreter) throws SQLException {

		System.out.println(connectionFactoryRegistry);
		
		QConnectionFactory mssqlConnectionFactory = connectionFactoryRegistry.lookup(DBType.MSSQL.name());
		System.out.println(mssqlConnectionFactory);
		
		Properties props = new Properties();
		props.put("url", "jdbc:jtds:sqlserver://127.0.0.1:1433/ASUP_0.5.0;instance=SQLEXPRESS");
		props.put("user", "ASUP");
		props.put("password", "asup2013");
		
		DataSource dataSource = mssqlConnectionFactory.createDataSource(props);
		System.out.println(dataSource.getConnection());
		
		return null;
		
	}
	
	// connectionManager e config
	public Object _testcon2(CommandInterpreter interpreter) throws SQLException {
		
		QConnectionConfig connectionConfig = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		connectionConfig.setDatabaseName("*LOCAL");
		connectionConfig.setDriver("net.sourceforge.jtds.jdbc.Driver");
		connectionConfig.setUrl("jdbc:jtds:sqlserver://localhost:1433/ASUP_0.5.0");
		connectionConfig.setUser("ASUP");
		connectionConfig.setPassword("asup2013");
		connectionConfig.setUseCatalog(false);
		connectionConfig.setPluginName(DBType.MSSQL.name());		
		
		System.out.println("Testing url " + connectionConfig.getUrl());
		
		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);	
		System.out.println(connection.getConnection());
		
		return null;
	}
	
	// connectionManager e disk
	public Object _testcon3(CommandInterpreter interpreter) throws SQLException {
		
		QConnectionConfig connectionConfig = loadConfig("DB2");

		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);	
		System.out.println(connection.getConnection());
		
		return null;
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public enum DBType {
		MSSQL, DB2;
	}
	
	public QConnectionConfig loadConfig(String name) {
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		
		URL url = bundle.getEntry("/config/connection/"+name+".xmi");
		System.out.println(URI.createURI(url.toString()));

		ResourceSet resourceSet = new ResourceSetImpl();
    	Resource resource = resourceSet.createResource(URI.createURI(url.toString()));    	
        try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Object object = resource.getContents().get(0);
        System.out.println(object);
        
		return (QConnectionConfig) object;
	}
}
