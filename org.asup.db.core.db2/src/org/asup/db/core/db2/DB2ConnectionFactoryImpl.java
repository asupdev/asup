package org.asup.db.core.db2;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.asup.db.core.impl.ConnectionFactoryImpl;

public class DB2ConnectionFactoryImpl extends ConnectionFactoryImpl {

	public DB2ConnectionFactoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(
			Properties props) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XADataSource createXADataSource(Properties props)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver createDriver(Properties props) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
