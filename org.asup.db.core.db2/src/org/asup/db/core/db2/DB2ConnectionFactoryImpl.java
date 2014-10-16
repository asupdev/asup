package org.asup.db.core.db2;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.osgi.service.jdbc.DataSourceFactory;

import com.ibm.db2.jcc.*;

public class DB2ConnectionFactoryImpl extends ConnectionFactoryImpl {

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		return createNativeDataSource(props);
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {
		return createNativeConnectionPoolDataSource(props);		
	}

	@Override
	public XADataSource createXADataSource(Properties props) throws SQLException {
		throw new IllegalStateException("Not implemented yet");
	}

	@Override
	public Driver createDriver(Properties props) throws SQLException {
		throw new IllegalStateException("Not implemented yet");
	}

	private DataSource createNativeDataSource(Properties props) {
		try {
			DB2Url db2Url = new DB2Url(props.getProperty(DataSourceFactory.JDBC_URL));
			System.out.println("Connecting....");
			DB2SimpleDataSource ds = new DB2SimpleDataSource();
			ds.setRetrieveMessagesFromServerOnGetMessage(true);
			ds.setServerName (db2Url.getHost());		
			ds.setPortNumber(db2Url.getPort());
			ds.setDatabaseName(db2Url.getDatabaseName());
			ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
			ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));
			return ds;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private ConnectionPoolDataSource createNativeConnectionPoolDataSource(Properties props) {
		try {
			DB2Url db2Url = new DB2Url(props.getProperty(DataSourceFactory.JDBC_URL));
			System.out.println("Connecting....");
			DB2ConnectionPoolDataSource ds = new DB2ConnectionPoolDataSource();
			ds.setRetrieveMessagesFromServerOnGetMessage(true);
			ds.setServerName (db2Url.getHost());		
			ds.setPortNumber(db2Url.getPort());
			ds.setDatabaseName(db2Url.getDatabaseName());
			ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
			ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));
			return ds;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}

}