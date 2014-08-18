/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QDatabase;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QConnection;
import org.asup.db.core.QSchema;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osgi.service.jdbc.DataSourceFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.ConnectionImpl#getConnectionConfig <em>Connection Config</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionImpl#getCurrentSchema <em>Current Schema</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements QConnection {
	/**
	 * The cached value of the '{@link #getConnectionConfig() <em>Connection Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionConfig()
	 * @generated
	 * @ordered
	 */
	protected QConnectionConfig connectionConfig;

	/**
	 * The cached value of the '{@link #getCurrentSchema() <em>Current Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSchema()
	 * @generated
	 * @ordered
	 */
	protected QSchema currentSchema;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected QDatabase database;

	/**
	 * The cached value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactory()
	 * @generated
	 * @ordered
	 */
	protected QConnectionFactory connectionFactory;

	private Connection connection;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (QDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CONNECTION__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabase basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(QDatabase newDatabase) {
		QDatabase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionFactory getConnectionFactory() {
		if (connectionFactory != null && ((EObject)connectionFactory).eIsProxy()) {
			InternalEObject oldConnectionFactory = (InternalEObject)connectionFactory;
			connectionFactory = (QConnectionFactory)eResolveProxy(oldConnectionFactory);
			if (connectionFactory != oldConnectionFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY, oldConnectionFactory, connectionFactory));
			}
		}
		return connectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionFactory basicGetConnectionFactory() {
		return connectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionFactory(QConnectionFactory newConnectionFactory) {
		QConnectionFactory oldConnectionFactory = connectionFactory;
		connectionFactory = newConnectionFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY, oldConnectionFactory, connectionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSchema getCurrentSchema() {
		if (currentSchema != null && ((EObject)currentSchema).eIsProxy()) {
			InternalEObject oldCurrentSchema = (InternalEObject)currentSchema;
			currentSchema = (QSchema)eResolveProxy(oldCurrentSchema);
			if (currentSchema != oldCurrentSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA, oldCurrentSchema, currentSchema));
			}
		}
		return currentSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSchema basicGetCurrentSchema() {
		return currentSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSchema(QSchema newCurrentSchema) {
		QSchema oldCurrentSchema = currentSchema;
		currentSchema = newCurrentSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA, oldCurrentSchema, currentSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionConfig getConnectionConfig() {
		if (connectionConfig != null && ((EObject)connectionConfig).eIsProxy()) {
			InternalEObject oldConnectionConfig = (InternalEObject)connectionConfig;
			connectionConfig = (QConnectionConfig)eResolveProxy(oldConnectionConfig);
			if (connectionConfig != oldConnectionConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG, oldConnectionConfig, connectionConfig));
			}
		}
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionConfig basicGetConnectionConfig() {
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionConfig(QConnectionConfig newConnectionConfig) {
		QConnectionConfig oldConnectionConfig = connectionConfig;
		connectionConfig = newConnectionConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG, oldConnectionConfig, connectionConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Statement createStatement() throws SQLException {
		return createStatement(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Statement createStatement(boolean update) throws SQLException {
		if(update)
			return getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		else
			return getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PreparedStatement prepareStatement(String sqlCommand) throws SQLException {
		return getConnection().prepareStatement(sqlCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean close() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				return false;
			}
			return true;
		}
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG:
				if (resolve) return getConnectionConfig();
				return basicGetConnectionConfig();
			case QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA:
				if (resolve) return getCurrentSchema();
				return basicGetCurrentSchema();
			case QDatabaseCorePackage.CONNECTION__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY:
				if (resolve) return getConnectionFactory();
				return basicGetConnectionFactory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA:
				setCurrentSchema((QSchema)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION__DATABASE:
				setDatabase((QDatabase)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY:
				setConnectionFactory((QConnectionFactory)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)null);
				return;
			case QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA:
				setCurrentSchema((QSchema)null);
				return;
			case QDatabaseCorePackage.CONNECTION__DATABASE:
				setDatabase((QDatabase)null);
				return;
			case QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY:
				setConnectionFactory((QConnectionFactory)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION__CONNECTION_CONFIG:
				return connectionConfig != null;
			case QDatabaseCorePackage.CONNECTION__CURRENT_SCHEMA:
				return currentSchema != null;
			case QDatabaseCorePackage.CONNECTION__DATABASE:
				return database != null;
			case QDatabaseCorePackage.CONNECTION__CONNECTION_FACTORY:
				return connectionFactory != null;
		}
		return super.eIsSet(featureID);
	}


	public Connection getConnection() throws SQLException {
		
		if(connection == null || connection.isClosed()) {
			QConnectionConfig config = getConnectionConfig();

			Properties properties = new Properties();				
			properties.put(DataSourceFactory.JDBC_DATABASE_NAME, config.getDatabaseName());
			properties.put(DataSourceFactory.JDBC_URL, config.getUrl());				
			properties.put(DataSourceFactory.JDBC_USER, config.getUser());
			properties.put(DataSourceFactory.JDBC_PASSWORD, config.getPassword());
			
			if(config.isUsePool())
				connection = getConnectionFactory().createConnectionPoolDataSource(properties).getPooledConnection().getConnection();
			else
				connection = getConnectionFactory().createDataSource(properties).getConnection();
		}
		return connection;				
	}
	
} //DatabaseConnectionImpl
