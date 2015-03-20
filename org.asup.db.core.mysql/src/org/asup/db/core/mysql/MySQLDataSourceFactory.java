package org.asup.db.core.mysql;

import java.sql.*;
import java.sql.Driver;
import java.util.Properties;

import javax.sql.*;

import org.asup.fw.core.impl.ServiceImpl;
import org.osgi.service.jdbc.DataSourceFactory;
import org.mariadb.jdbc.*;

public class MySQLDataSourceFactory extends ServiceImpl implements DataSourceFactory {


	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		MySQLDataSource ds = new MySQLDataSource();
		ds.setURL(props.getProperty(DataSourceFactory.JDBC_URL));
		ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
		ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));
		return ds;
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {		
		MySQLDataSource ds = new MySQLDataSource();
		ds.setURL(props.getProperty(DataSourceFactory.JDBC_URL));
		ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
		ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));
		return ds;
	}

	@Override
	public XADataSource createXADataSource(Properties props)
			throws SQLException {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Not implemented yet");
	}

	@Override
	public Driver createDriver(Properties props) throws SQLException {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Not implemented yet");
	}

}
