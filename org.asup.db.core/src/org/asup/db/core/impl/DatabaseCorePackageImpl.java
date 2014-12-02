/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QDatabaseDefinition;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QDatabaseObjectDef;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QPreparedStatement;
import org.asup.db.core.QQualifiedName;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QStatement;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QTableFieldDef;
import org.asup.db.core.QViewDef;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;

import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;

import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;

import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;

import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;

import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;

import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass catalogContainerEClass = null;

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
	private EClass connectionContextEClass = null;

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
	private EClass databaseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseObjectDefEClass = null;

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
	private EClass indexDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFieldDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseDataTypeEEnum = null;

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
	private EDataType databaseExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseResultSetEDataType = null;

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
		SQLSchemaPackage.eINSTANCE.eClass();
		SQLConstraintsPackage.eINSTANCE.eClass();
		SQLDataTypesPackage.eINSTANCE.eClass();
		SQLExpressionsPackage.eINSTANCE.eClass();
		SQLRoutinesPackage.eINSTANCE.eClass();
		SQLStatementsPackage.eINSTANCE.eClass();
		SQLTablesPackage.eINSTANCE.eClass();
		SQLAccessControlPackage.eINSTANCE.eClass();

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
	public EClass getCatalogContainer() {
		return catalogContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogContainer_DefaultConfig() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogContainer_Catalog() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(1);
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
	public EClass getConnectionConfig() {
		return connectionConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_AutoCommit() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Persistent() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_DriverName() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Password() {
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
	public EAttribute getConnectionConfig_User() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Vendor() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Version() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionContext() {
		return connectionContextEClass;
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
	public EClass getDatabaseContainer() {
		return databaseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContainer_Database() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseContainer_LocalCatalog() {
		return (EAttribute)databaseContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContainer_Catalogs() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseDefinition() {
		return databaseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseObjectDef() {
		return databaseObjectDefEClass;
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
	public EClass getIndexDef() {
		return indexDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexDef_Clustered() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexDef_Columns() {
		return (EReference)indexDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexDef_Unique() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexColumnDef() {
		return indexColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Name() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Ordering() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Sequence() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreparedStatement() {
		return preparedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedName() {
		return qualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Schema() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Table() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Member() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaDef() {
		return schemaDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableDef() {
		return tableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableDef_Columns() {
		return (EReference)tableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumnDef() {
		return tableColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_DataType() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Name() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Nullable() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Length() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Scale() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDef() {
		return viewDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDef_CreationPlugin() {
		return (EAttribute)viewDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDef_CreationCommand() {
		return (EAttribute)viewDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableFieldDef() {
		return tableFieldDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFieldDef_Default() {
		return (EAttribute)tableFieldDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFieldDef_FieldName() {
		return (EAttribute)tableFieldDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseDataType() {
		return databaseDataTypeEEnum;
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
	public EDataType getDatabaseException() {
		return databaseExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatabaseResultSet() {
		return databaseResultSetEDataType;
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
		catalogContainerEClass = createEClass(CATALOG_CONTAINER);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__DEFAULT_CONFIG);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__CATALOG);

		connectionEClass = createEClass(CONNECTION);

		connectionConfigEClass = createEClass(CONNECTION_CONFIG);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__AUTO_COMMIT);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PERSISTENT);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__DRIVER_NAME);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PASSWORD);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__URL);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__USER);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VENDOR);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VERSION);

		connectionContextEClass = createEClass(CONNECTION_CONTEXT);

		connectionFactoryEClass = createEClass(CONNECTION_FACTORY);

		connectionFactoryRegistryEClass = createEClass(CONNECTION_FACTORY_REGISTRY);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);

		databaseContainerEClass = createEClass(DATABASE_CONTAINER);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__DATABASE);
		createEAttribute(databaseContainerEClass, DATABASE_CONTAINER__LOCAL_CATALOG);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__CATALOGS);

		databaseDefinitionEClass = createEClass(DATABASE_DEFINITION);

		databaseObjectDefEClass = createEClass(DATABASE_OBJECT_DEF);

		databaseManagerEClass = createEClass(DATABASE_MANAGER);

		indexDefEClass = createEClass(INDEX_DEF);
		createEAttribute(indexDefEClass, INDEX_DEF__CLUSTERED);
		createEReference(indexDefEClass, INDEX_DEF__COLUMNS);
		createEAttribute(indexDefEClass, INDEX_DEF__UNIQUE);

		indexColumnDefEClass = createEClass(INDEX_COLUMN_DEF);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__NAME);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__ORDERING);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__SEQUENCE);

		preparedStatementEClass = createEClass(PREPARED_STATEMENT);

		qualifiedNameEClass = createEClass(QUALIFIED_NAME);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__SCHEMA);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__TABLE);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__MEMBER);

		schemaDefEClass = createEClass(SCHEMA_DEF);

		statementEClass = createEClass(STATEMENT);

		tableDefEClass = createEClass(TABLE_DEF);
		createEReference(tableDefEClass, TABLE_DEF__COLUMNS);

		tableColumnDefEClass = createEClass(TABLE_COLUMN_DEF);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__DATA_TYPE);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NAME);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NULLABLE);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__LENGTH);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__SCALE);

		viewDefEClass = createEClass(VIEW_DEF);
		createEAttribute(viewDefEClass, VIEW_DEF__CREATION_PLUGIN);
		createEAttribute(viewDefEClass, VIEW_DEF__CREATION_COMMAND);

		tableFieldDefEClass = createEClass(TABLE_FIELD_DEF);
		createEAttribute(tableFieldDefEClass, TABLE_FIELD_DEF__DEFAULT);
		createEAttribute(tableFieldDefEClass, TABLE_FIELD_DEF__FIELD_NAME);

		// Create enums
		databaseDataTypeEEnum = createEEnum(DATABASE_DATA_TYPE);
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);

		// Create data types
		databaseExceptionEDataType = createEDataType(DATABASE_EXCEPTION);
		databaseResultSetEDataType = createEDataType(DATABASE_RESULT_SET);
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
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogContainerEClass.getESuperTypes().add(theFrameworkCorePackage.getServiceConfig());
		connectionEClass.getESuperTypes().add(theFrameworkCorePackage.getContextID());
		connectionConfigEClass.getESuperTypes().add(theFrameworkCorePackage.getServiceConfig());
		connectionContextEClass.getESuperTypes().add(theFrameworkCorePackage.getContext());
		connectionFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		connectionFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		EGenericType g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getConnectionFactory());
		g1.getETypeArguments().add(g2);
		connectionFactoryRegistryEClass.getEGenericSuperTypes().add(g1);
		connectionManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		databaseContainerEClass.getESuperTypes().add(theFrameworkCorePackage.getServiceConfig());
		databaseManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		indexDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		indexColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		schemaDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		viewDefEClass.getESuperTypes().add(this.getTableDef());
		tableFieldDefEClass.getESuperTypes().add(this.getTableColumnDef());

		// Initialize classes and features; add operations and parameters
		initEClass(catalogContainerEClass, QCatalogContainer.class, "CatalogContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogContainer_DefaultConfig(), this.getConnectionConfig(), null, "defaultConfig", null, 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogContainer_Catalog(), theSQLSchemaPackage.getCatalog(), null, "catalog", null, 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, QConnection.class, "Connection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, null, "commit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(connectionEClass, this.getConnectionConfig(), "getConnectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, this.getConnectionContext(), "getConnectionContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, ecorePackage.getEString(), "getCurrentCatalog", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, this.getDatabaseDefinition(), "getDatabaseDefinition", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, null, "rollback", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, null, "setAutoCommit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "autoCommit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(connectionConfigEClass, QConnectionConfig.class, "ConnectionConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionConfig_AutoCommit(), ecorePackage.getEBoolean(), "autoCommit", "true", 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_DriverName(), ecorePackage.getEString(), "driverName", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Password(), ecorePackage.getEString(), "password", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_User(), ecorePackage.getEString(), "user", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Vendor(), ecorePackage.getEString(), "vendor", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Version(), ecorePackage.getEString(), "version", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionContextEClass, QConnectionContext.class, "ConnectionContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionFactoryEClass, QConnectionFactory.class, "ConnectionFactory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionFactoryEClass, this.getConnection(), "createDatabaseConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionFactoryRegistryEClass, QConnectionFactoryRegistry.class, "ConnectionFactoryRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionFactoryRegistryEClass, this.getConnectionFactory(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionManagerEClass, QConnectionManager.class, "ConnectionManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createDatabaseConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createDatabaseConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionManagerEClass, null, "registerConnectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseContainerEClass, QDatabaseContainer.class, "DatabaseContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseContainer_Database(), theSQLSchemaPackage.getDatabase(), null, "database", null, 1, 1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseContainer_LocalCatalog(), ecorePackage.getEString(), "localCatalog", "LOCAL", 1, 1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseContainer_Catalogs(), this.getCatalogContainer(), null, "catalogs", null, 1, -1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseDefinitionEClass, QDatabaseDefinition.class, "DatabaseDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(databaseDefinitionEClass, ecorePackage.getEBoolean(), "supportsRelativeRecordNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseObjectDefEClass, QDatabaseObjectDef.class, "DatabaseObjectDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseManagerEClass, QDatabaseManager.class, "DatabaseManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(databaseManagerEClass, null, "createIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "createSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchemaDef(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "createView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getViewDef(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "deleteData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "deleteData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(databaseManagerEClass, this.getDatabaseContainer(), "getDatabaseContainer", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, theSQLConstraintsPackage.getIndex(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, theSQLSchemaPackage.getSchema(), "getSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getViewTable(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(databaseManagerEClass, ecorePackage.getEBoolean(), "isStarted", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(indexDefEClass, QIndexDef.class, "IndexDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexDef_Clustered(), ecorePackage.getEBoolean(), "clustered", null, 0, 1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexDef_Columns(), this.getIndexColumnDef(), null, "columns", null, 0, -1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexDef_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexColumnDefEClass, QIndexColumnDef.class, "IndexColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Ordering(), this.getOrderingType(), "ordering", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Sequence(), ecorePackage.getEInt(), "sequence", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparedStatementEClass, QPreparedStatement.class, "PreparedStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(preparedStatementEClass, null, "clearParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(preparedStatementEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(preparedStatementEClass, null, "setString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qualifiedNameEClass, QQualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedName_Schema(), theEcorePackage.getEString(), "schema", null, 0, 1, QQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedName_Table(), theEcorePackage.getEString(), "table", null, 0, 1, QQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedName_Member(), theEcorePackage.getEString(), "member", null, 0, 1, QQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaDefEClass, QSchemaDef.class, "SchemaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, QStatement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statementEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(tableDefEClass, QTableDef.class, "TableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDef_Columns(), this.getTableColumnDef(), null, "columns", null, 0, -1, QTableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnDefEClass, QTableColumnDef.class, "TableColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumnDef_DataType(), this.getDatabaseDataType(), "dataType", null, 1, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Length(), ecorePackage.getEInt(), "length", null, 0, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDefEClass, QViewDef.class, "ViewDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDef_CreationPlugin(), ecorePackage.getEString(), "creationPlugin", "IBMI", 0, 1, QViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewDef_CreationCommand(), ecorePackage.getEString(), "creationCommand", null, 0, 1, QViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableFieldDefEClass, QTableFieldDef.class, "TableFieldDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableFieldDef_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, QTableFieldDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableFieldDef_FieldName(), ecorePackage.getEString(), "fieldName", null, 1, 1, QTableFieldDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(databaseDataTypeEEnum, DatabaseDataType.class, "DatabaseDataType");
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.IDENTITY);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.CHARACTER);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.VARCHAR);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.DECIMAL);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.BOOLEAN);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.DATE);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.TIME);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.TIME_STAMP);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.INTEGER);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.FLOAT);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.GRAPHICAL);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.TEXT);
		addEEnumLiteral(databaseDataTypeEEnum, DatabaseDataType.BLOB);

		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ASCEND);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.DESCEND);

		// Initialize data types
		initEDataType(databaseExceptionEDataType, SQLException.class, "DatabaseException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseResultSetEDataType, ResultSet.class, "DatabaseResultSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabaseCorePackageImpl
