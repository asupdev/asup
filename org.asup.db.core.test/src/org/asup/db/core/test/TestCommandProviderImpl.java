package org.asup.db.core.test;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.asup.db.core.DataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
	@Inject
	private QDatabaseManager databaseManager;

	public void _copySchema(CommandInterpreter interpreter) throws SQLException {
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		
		
		String schemaName = interpreter.nextArgument();
		Enumeration<String> entries = bundle.getEntryPaths("/config/schemas/"+schemaName);
		
		String pluginName = interpreter.nextArgument();
		QConnectionConfig connectionConfig = loadConfig(pluginName);

		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);	
		QSchema schema = databaseManager.getSchema(connection, schemaName);
		if(schema != null)
			databaseManager.dropSchema(connection, schema);

		schema = QDatabaseCoreFactory.eINSTANCE.createSchema();
		schema.setName(schemaName);
		databaseManager.createSchema(connection, schema, true);
		
		
		Set<String> fileNames = new TreeSet<String>();
		
		while(entries.hasMoreElements()) {
			String entry = entries.nextElement();
			fileNames.add(entry);
		}
		
		for(String fileName: fileNames) {
		
			URL url = bundle.getEntry(fileName);
			Object file = load(url);
			
			try {
				if(file instanceof QTable) {
					QTable table = (QTable) file;
					table.setSchema(schema);
					databaseManager.createTable(connection, table, true);
				}
				else if(file instanceof QView) {
					QView view = (QView) file;
					view.setSchema(schema);
					databaseManager.createView(connection, view);
				}
				else if(file instanceof QIndex) {
					QIndex index = (QIndex) file;
					databaseManager.createIndex(connection, index);
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		connection.close();
	}
	
	// connectionManager e disk
	public Object _testcon(CommandInterpreter interpreter) throws SQLException {
				
		String pluginName = interpreter.nextArgument();
		QConnectionConfig connectionConfig = loadConfig(pluginName);

		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);	
		System.out.println(connection.getConnection());
		
		return null;
	}

	public Object _testDDL(CommandInterpreter interpreter) throws SQLException {
				
		String pluginName = interpreter.nextArgument();
		QConnectionConfig connectionConfig = loadConfig(pluginName);
		
		String schemaName = "ASUP_TEST";
		String tableName = "ASUP_TABLE";
		String indexName = "ASUP_INDEX";
		
		QConnection connection = connectionManager.getDatabaseConnection(connectionConfig);
				
		QSchema schema = databaseManager.getSchema(connection, schemaName);
		if(schema != null)
			databaseManager.dropSchema(connection, schema);
		
		schema = QDatabaseCoreFactory.eINSTANCE.createSchema();
		schema.setDatabase(connection.getDatabase());
		schema.setName(schemaName);
		databaseManager.createSchema(connection, schema, true);
		
		QTable table = QDatabaseCoreFactory.eINSTANCE.createTable(); 
		table.setName(tableName);
		table.setSchema(schema);
		
		for(int i=1; i <= 3; i++) {
			QTableColumn column = QDatabaseCoreFactory.eINSTANCE.createTableColumn();
			column.setName("COL"+i);
			column.setDataType(DataType.CHARACTER);
			column.setPrecision(10);
			column.setTable(table);
			table.getColumns().add(column);
		}
		
		databaseManager.createTable(connection, table, false);

		QIndex index = QDatabaseCoreFactory.eINSTANCE.createIndex();
		index.setName(indexName);
		index.setSchema(schema);
		index.setObject(table.getName());
		
		QIndexColumn indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumn();
		indexColumn.setName("COL2");
		indexColumn.setSequence(1);
		indexColumn.setOrdering(OrderingType.ASCEND);
		
		index.getColumns().add(indexColumn);
		
		databaseManager.createIndex(connection, index);
		
		return null;
	}
	
	public Object _testcondb2(CommandInterpreter interpreter) throws SQLException {

		System.out.println(connectionFactoryRegistry);
		
		QConnectionFactory db2ConnectionFactory = connectionFactoryRegistry.lookup(DBType.DB2.name());
		System.out.println(db2ConnectionFactory);
		
		Properties props = new Properties();
		props.put("url", "jdbc:db2://172.16.2.133:50000/ASUP050");
		props.put("user", "asup");
		props.put("password", "asup2013");
		
		DataSource dataSource = db2ConnectionFactory.createDataSource(props);
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

		
		return (QConnectionConfig) load(url);
	}

	public EObject load(URL url) {

		ResourceSet resourceSet = new ResourceSetImpl();
    	Resource resource = resourceSet.createResource(URI.createURI(url.toString()));    	
        try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

        return resource.getContents().get(0);

	}
	
	public Object _copyDDL(CommandInterpreter interpreter) throws SQLException {
		
		String pluginNameFrom = interpreter.nextArgument();
		String pluginNameTo = interpreter.nextArgument();

		copyDDL(pluginNameFrom, pluginNameTo);
		
		return null;
	}

	private void copyDDL(String pluginNameFrom, String pluginNameTo) throws SQLException {
		QConnectionConfig connectionConfigFrom = loadConfig(pluginNameFrom);
		QConnection connectionFrom = connectionManager.getDatabaseConnection(connectionConfigFrom);
		
		QConnectionConfig connectionConfigTo = loadConfig(pluginNameTo);
		QConnection connectionTo = connectionManager.getDatabaseConnection(connectionConfigTo);
				
		System.out.print("Reading schema...");
		QSchema schema = databaseManager.getSchema(connectionFrom, "SMEUP_DAT");
		System.out.println("...OK");
		
		try {
			databaseManager.dropSchema(connectionTo, schema);
		} catch (Exception e) {
		}
		databaseManager.createSchema(connectionTo, schema, true);
	}
	
	
	
	public Object _copy(CommandInterpreter interpreter) throws SQLException {
		copyDDL("MSSQL040", "DB2");
		return  null;
	}
}
