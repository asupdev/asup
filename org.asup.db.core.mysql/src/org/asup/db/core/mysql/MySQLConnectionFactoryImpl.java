/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.mysql;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.osgi.service.jdbc.DataSourceFactory;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQLConnectionFactoryImpl extends ConnectionFactoryImpl {

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setURL(props.getProperty(DataSourceFactory.JDBC_URL));
		ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
		ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));
		return ds;
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {		
		MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
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
