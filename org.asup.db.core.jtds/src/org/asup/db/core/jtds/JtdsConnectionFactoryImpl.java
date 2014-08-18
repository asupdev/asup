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
package org.asup.db.core.jtds;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import net.sourceforge.jtds.jdbcx.JtdsDataSource;

import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.jdbc.DataSourceFactory;


public class JtdsConnectionFactoryImpl extends ConnectionFactoryImpl {

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		return createNativeDataSource(props);
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {
		return createNativeDataSource(props);		
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

	private JtdsDataSource createNativeDataSource(Properties props) {
		// Url normalization (last schema part)
		String jdbcUrl = props.getProperty(DataSourceFactory.JDBC_URL);
		String tempUrl = jdbcUrl.substring(0, jdbcUrl.indexOf("://"));
		String cleanUri = jdbcUrl.substring(tempUrl.lastIndexOf(":")+1);	
		URI uri = URI.createURI(cleanUri);
		
		JtdsDataSource ds = new JtdsDataSource();
		ds.setServerName (uri.host());		
		ds.setDatabaseName(uri.lastSegment());
		ds.setUser(props.getProperty(DataSourceFactory.JDBC_USER));
		ds.setPassword(props.getProperty(DataSourceFactory.JDBC_PASSWORD));

		return ds;
	}
}
