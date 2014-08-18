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
import java.sql.SQLException;
import java.sql.Statement;

import org.asup.db.core.DataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QColumn;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabase;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QDatabaseObject;
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.core.QViewColumn;
import org.asup.db.core.StatementType;

import org.asup.fw.core.QFrameworkCorePackage;

import org.asup.fw.java.QFrameworkJavaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.service.jdbc.DataSourceFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseCorePackageImpl extends EPackageImpl implements QDatabaseCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionFactoryRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jdbcConnectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jdbcExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jdbcStatementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preparedStatementEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.db.core.QDatabaseCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseCorePackageImpl() {
		super(eNS_URI, QDatabaseCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDatabaseCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseCorePackage init() {
		if (isInited) return (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);

		// Obtain or create and register package
		DatabaseCorePackageImpl theDatabaseCorePackage = (DatabaseCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatabaseCorePackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseCorePackage.eNS_URI, theDatabaseCorePackage);
		return theDatabaseCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_DataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Precision() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Scale() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionConfig() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_CurrentSchema() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Database() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionFactory() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionConfig() {
		return connectionConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_DatabaseName() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Driver() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Password() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_PluginName() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Url() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_UseCatalog() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_UsePool() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_User() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionFactory() {
		return connectionFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionFactoryRegistry() {
		return connectionFactoryRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Name() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Schemas() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseManager() {
		return databaseManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseObject() {
		return databaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceFactory() {
		return dataSourceFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_Columns() {
		return (EReference)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Name() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Object() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_Schema() {
		return (EReference)indexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Unique() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexColumn() {
		return indexColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexColumn_Index() {
		return (EReference)indexColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumn_Name() {
		return (EAttribute)indexColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumn_Ordering() {
		return (EAttribute)indexColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumn_Sequence() {
		return (EAttribute)indexColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Database() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Tables() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Views() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Indexes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Schema() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumn_Table() {
		return (EReference)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Columns() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_CreationPlugin() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_CreationCommand() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Schema() {
		return (EReference)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewColumn() {
		return viewColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewColumn_View() {
		return (EReference)viewColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderingType() {
		return orderingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatementType() {
		return statementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJDBCConnection() {
		return jdbcConnectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJDBCException() {
		return jdbcExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJDBCStatement() {
		return jdbcStatementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreparedStatement() {
		return preparedStatementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseCoreFactory getDatabaseCoreFactory() {
		return (QDatabaseCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__DATA_TYPE);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__PRECISION);
		createEAttribute(columnEClass, COLUMN__SCALE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__CONNECTION_CONFIG);
		createEReference(connectionEClass, CONNECTION__CURRENT_SCHEMA);
		createEReference(connectionEClass, CONNECTION__DATABASE);
		createEReference(connectionEClass, CONNECTION__CONNECTION_FACTORY);

		connectionConfigEClass = createEClass(CONNECTION_CONFIG);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__DATABASE_NAME);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__DRIVER);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PASSWORD);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PLUGIN_NAME);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__URL);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__USE_CATALOG);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__USE_POOL);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__USER);

		connectionFactoryEClass = createEClass(CONNECTION_FACTORY);

		connectionFactoryRegistryEClass = createEClass(CONNECTION_FACTORY_REGISTRY);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__NAME);
		createEReference(databaseEClass, DATABASE__SCHEMAS);

		databaseManagerEClass = createEClass(DATABASE_MANAGER);

		databaseObjectEClass = createEClass(DATABASE_OBJECT);

		dataSourceFactoryEClass = createEClass(DATA_SOURCE_FACTORY);

		indexEClass = createEClass(INDEX);
		createEReference(indexEClass, INDEX__COLUMNS);
		createEAttribute(indexEClass, INDEX__NAME);
		createEAttribute(indexEClass, INDEX__OBJECT);
		createEReference(indexEClass, INDEX__SCHEMA);
		createEAttribute(indexEClass, INDEX__UNIQUE);

		indexColumnEClass = createEClass(INDEX_COLUMN);
		createEReference(indexColumnEClass, INDEX_COLUMN__INDEX);
		createEAttribute(indexColumnEClass, INDEX_COLUMN__NAME);
		createEAttribute(indexColumnEClass, INDEX_COLUMN__ORDERING);
		createEAttribute(indexColumnEClass, INDEX_COLUMN__SEQUENCE);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__DATABASE);
		createEAttribute(schemaEClass, SCHEMA__NAME);
		createEReference(schemaEClass, SCHEMA__TABLES);
		createEReference(schemaEClass, SCHEMA__VIEWS);
		createEReference(schemaEClass, SCHEMA__INDEXES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__SCHEMA);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEReference(tableColumnEClass, TABLE_COLUMN__TABLE);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__COLUMNS);
		createEAttribute(viewEClass, VIEW__CREATION_PLUGIN);
		createEAttribute(viewEClass, VIEW__CREATION_COMMAND);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__SCHEMA);

		viewColumnEClass = createEClass(VIEW_COLUMN);
		createEReference(viewColumnEClass, VIEW_COLUMN__VIEW);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);
		statementTypeEEnum = createEEnum(STATEMENT_TYPE);

		// Create data types
		jdbcConnectionEDataType = createEDataType(JDBC_CONNECTION);
		jdbcExceptionEDataType = createEDataType(JDBC_EXCEPTION);
		jdbcStatementEDataType = createEDataType(JDBC_STATEMENT);
		preparedStatementEDataType = createEDataType(PREPARED_STATEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionConfigEClass.getESuperTypes().add(theFrameworkCorePackage.getServiceConfig());
		connectionFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		connectionFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		connectionFactoryEClass.getESuperTypes().add(this.getDataSourceFactory());
		EGenericType g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getConnectionFactory());
		g1.getETypeArguments().add(g2);
		connectionFactoryRegistryEClass.getEGenericSuperTypes().add(g1);
		connectionManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		databaseManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		tableEClass.getESuperTypes().add(this.getDatabaseObject());
		tableColumnEClass.getESuperTypes().add(this.getColumn());
		viewEClass.getESuperTypes().add(this.getDatabaseObject());
		viewColumnEClass.getESuperTypes().add(this.getColumn());

		// Initialize classes and features; add operations and parameters
		initEClass(columnEClass, QColumn.class, "Column", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_DataType(), this.getDataType(), "dataType", null, 1, 1, QColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, QColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, QColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, QColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, QColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, QConnection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_ConnectionConfig(), this.getConnectionConfig(), null, "connectionConfig", null, 1, 1, QConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_CurrentSchema(), this.getSchema(), null, "currentSchema", null, 0, 1, QConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Database(), this.getDatabase(), null, "database", null, 1, 1, QConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionFactory(), this.getConnectionFactory(), null, "connectionFactory", null, 1, 1, QConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(connectionEClass, ecorePackage.getEBoolean(), "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(connectionEClass, this.getJDBCStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(connectionEClass, this.getJDBCStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(connectionEClass, this.getJDBCConnection(), "getConnection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sqlCommand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		initEClass(connectionConfigEClass, QConnectionConfig.class, "ConnectionConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionConfig_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Driver(), ecorePackage.getEString(), "driver", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Password(), ecorePackage.getEString(), "password", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_PluginName(), ecorePackage.getEString(), "pluginName", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Url(), ecorePackage.getEString(), "url", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_UseCatalog(), ecorePackage.getEBoolean(), "useCatalog", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_UsePool(), ecorePackage.getEBoolean(), "usePool", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_User(), ecorePackage.getEString(), "user", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionFactoryEClass, QConnectionFactory.class, "ConnectionFactory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionFactoryRegistryEClass, QConnectionFactoryRegistry.class, "ConnectionFactoryRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionFactoryRegistryEClass, this.getConnectionFactory(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionManagerEClass, QConnectionManager.class, "ConnectionManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionManagerEClass, this.getConnectionConfig(), "createConnectionConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaDictionary());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dictionary", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "getDatabaseConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "config", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "getDatabaseConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerEClass, null, "registerConnectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "config", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseEClass, QDatabase.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 1, 1, QDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Schemas(), this.getSchema(), this.getSchema_Database(), "schemas", null, 0, -1, QDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseManagerEClass, QDatabaseManager.class, "DatabaseManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(databaseManagerEClass, null, "createIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "createSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchema(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deepCreation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deepCreation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "createView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getView(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "deleteData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "deleteData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "dropIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "dropSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "dropTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, null, "dropView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getView(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJDBCException());

		op = addEOperation(databaseManagerEClass, this.getSchema(), "getSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, this.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, this.getIndex(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseObjectEClass, QDatabaseObject.class, "DatabaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSourceFactoryEClass, DataSourceFactory.class, "DataSourceFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexEClass, QIndex.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndex_Columns(), this.getIndexColumn(), this.getIndexColumn_Index(), "columns", null, 0, -1, QIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, QIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndex_Object(), ecorePackage.getEString(), "object", null, 1, 1, QIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndex_Schema(), this.getSchema(), this.getSchema_Indexes(), "schema", null, 0, 1, QIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndex_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, QIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(indexEClass, ecorePackage.getEString(), "getFullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(indexColumnEClass, QIndexColumn.class, "IndexColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexColumn_Index(), this.getIndex(), this.getIndex_Columns(), "index", null, 1, 1, QIndexColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIndexColumn_Index().getEKeys().add(this.getIndex_Name());
		initEAttribute(getIndexColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, QIndexColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumn_Ordering(), this.getOrderingType(), "ordering", null, 1, 1, QIndexColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumn_Sequence(), ecorePackage.getEInt(), "sequence", null, 1, 1, QIndexColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, QSchema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Database(), this.getDatabase(), this.getDatabase_Schemas(), "database", null, 1, 1, QSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, QSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Tables(), this.getTable(), this.getTable_Schema(), "tables", null, 0, -1, QSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Views(), this.getView(), this.getView_Schema(), "views", null, 0, -1, QSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Indexes(), this.getIndex(), this.getIndex_Schema(), "indexes", null, 0, -1, QSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, QTable.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getTableColumn(), this.getTableColumn_Table(), "columns", null, 0, -1, QTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Schema(), this.getSchema(), this.getSchema_Tables(), "schema", null, 0, 1, QTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(tableEClass, ecorePackage.getEString(), "getFullName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableColumnEClass, QTableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, QTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTableColumn_Table().getEKeys().add(this.getTable_Name());

		initEClass(viewEClass, QView.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Columns(), this.getViewColumn(), this.getViewColumn_View(), "columns", null, 0, -1, QView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_CreationPlugin(), ecorePackage.getEString(), "creationPlugin", "IBMI", 0, 1, QView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_CreationCommand(), ecorePackage.getEString(), "creationCommand", null, 0, 1, QView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 1, 1, QView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Schema(), this.getSchema(), this.getSchema_Views(), "schema", null, 0, 1, QView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(viewEClass, ecorePackage.getEString(), "getFullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewColumnEClass, QViewColumn.class, "ViewColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewColumn_View(), this.getView(), this.getView_Columns(), "view", null, 1, 1, QViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getViewColumn_View().getEKeys().add(this.getView_Name());

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.IDENTITY);
		addEEnumLiteral(dataTypeEEnum, DataType.CHARACTER);
		addEEnumLiteral(dataTypeEEnum, DataType.VARCHAR);
		addEEnumLiteral(dataTypeEEnum, DataType.DECIMAL);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME_STAMP);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.GRAPHICAL);
		addEEnumLiteral(dataTypeEEnum, DataType.TEXT);
		addEEnumLiteral(dataTypeEEnum, DataType.BLOB);

		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ASCEND);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.DESCEND);

		initEEnum(statementTypeEEnum, StatementType.class, "StatementType");
		addEEnumLiteral(statementTypeEEnum, StatementType.DECLARE);
		addEEnumLiteral(statementTypeEEnum, StatementType.PREPARE);
		addEEnumLiteral(statementTypeEEnum, StatementType.OPEN);
		addEEnumLiteral(statementTypeEEnum, StatementType.FETCH);
		addEEnumLiteral(statementTypeEEnum, StatementType.INSERT);
		addEEnumLiteral(statementTypeEEnum, StatementType.UPDATE);
		addEEnumLiteral(statementTypeEEnum, StatementType.DELETE);
		addEEnumLiteral(statementTypeEEnum, StatementType.CLOSE);

		// Initialize data types
		initEDataType(jdbcConnectionEDataType, Connection.class, "JDBCConnection", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jdbcExceptionEDataType, SQLException.class, "JDBCException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jdbcStatementEDataType, Statement.class, "JDBCStatement", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preparedStatementEDataType, PreparedStatement.class, "PreparedStatement", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabaseCorePackageImpl
