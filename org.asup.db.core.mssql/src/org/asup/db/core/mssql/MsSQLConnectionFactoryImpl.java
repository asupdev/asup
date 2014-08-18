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
package org.asup.db.core.mssql;

import java.net.URI;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.osgi.service.jdbc.DataSourceFactory;

import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;

	public class MsSQLConnectionFactoryImpl extends ConnectionFactoryImpl {
		
	@Override
	public DataSource createDataSource(Properties props) throws SQLException {                              
	        SQLServerDataSource ds = new SQLServerDataSource();     
	        configureDataSource(ds, props);
	        return ds;              
	}
	
	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {
	        SQLServerConnectionPoolDataSource ds = new SQLServerConnectionPoolDataSource(); 
	        configureDataSource(ds,props);
	        return ds;              
	}
	
	@Override
	public XADataSource createXADataSource(Properties props) throws SQLException {          
	        SQLServerXADataSource ds = new SQLServerXADataSource();
	        configureDataSource(ds, props);
	        return ds;              
	}
	
	@Override
	public Driver createDriver(Properties props) throws SQLException {
	        //SQLServerDriver driver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();          
	        return new com.microsoft.sqlserver.jdbc.SQLServerDriver();
	}

	private void configureDataSource(SQLServerDataSource ds, Properties props) throws SQLException{
        
        String description = props.getProperty(DataSourceFactory.JDBC_DESCRIPTION);
        String databaseName = props.getProperty(DataSourceFactory.JDBC_DATABASE_NAME);
        String serverName = props.getProperty(DataSourceFactory.JDBC_SERVER_NAME);
        String port = props.getProperty(DataSourceFactory.JDBC_PORT_NUMBER);
        
        String user = props.getProperty(DataSourceFactory.JDBC_USER);
        String password = props.getProperty(DataSourceFactory.JDBC_PASSWORD);


        if(serverName == null) {
    		String jdbcUrl = props.getProperty(DataSourceFactory.JDBC_URL);
    		String tempUrl = jdbcUrl.substring(0, jdbcUrl.indexOf("://"));
    		String cleanUri = jdbcUrl.substring(tempUrl.lastIndexOf(":")+1);	
    		URI uri = URI.create(cleanUri);
    		serverName = uri.getHost();
        }
        
        ds.setServerName(serverName);
        ds.setUser(user);
        ds.setPassword(password);
        
        if(databaseName!=null) {
                ds.setDatabaseName(databaseName);
        }                       
        if(port!=null){
                int portNumber = Integer.parseInt(port);
                ds.setPortNumber(portNumber);
        }                               
        if(description!=null) {
                ds.setDescription(description);
        }
	}	
}