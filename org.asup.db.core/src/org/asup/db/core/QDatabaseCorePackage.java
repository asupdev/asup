/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.db.core.QDatabaseCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/db/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseCorePackage eINSTANCE = org.asup.db.core.impl.DatabaseCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.CatalogContainerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogContainer()
	 * @generated
	 */
	int CATALOG_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Connection Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__CONNECTION_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Supports Guest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Generation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__GENERATION_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Catalog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.CatalogGenerationStrategyImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogGenerationStrategy()
	 * @generated
	 */
	int CATALOG_GENERATION_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Create Index On View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Create Relative Record Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Catalog Generation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.CatalogMetaDataImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogMetaData()
	 * @generated
	 */
	int CATALOG_META_DATA = 2;

	/**
	 * The number of structural features of the '<em>Catalog Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_META_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.QConnection <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.QConnection
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = QFrameworkCorePackage.CONTEXT_ID_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionConfigImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
	 * @generated
	 */
	int CONNECTION_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CREDENTIALS = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VENDOR = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VERSION = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__URL = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CATALOG = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PERSISTENT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionCredentialsImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionCredentials()
	 * @generated
	 */
	int CONNECTION_CREDENTIALS = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__USER = QFrameworkCorePackage.CREDENTIALS__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__PASSWORD = QFrameworkCorePackage.CREDENTIALS__PASSWORD;

	/**
	 * The number of structural features of the '<em>Connection Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS_FEATURE_COUNT = QFrameworkCorePackage.CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.QConnectionDescription <em>Connection Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.QConnectionDescription
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionDescription()
	 * @generated
	 */
	int CONNECTION_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DESCRIPTION__SCHEMAS = 0;

	/**
	 * The number of structural features of the '<em>Connection Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseContainerImpl <em>Database Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseContainerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseContainer()
	 * @generated
	 */
	int DATABASE_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Catalog Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__CATALOG_CONTAINERS = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Catalog Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VENDOR = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VERSION = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseObjectDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseObjectDef()
	 * @generated
	 */
	int DATABASE_OBJECT_DEF = 9;

	/**
	 * The number of structural features of the '<em>Database Object Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseManagerImpl <em>Database Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
	 * @generated
	 */
	int DATABASE_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Database Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.service.jdbc.DataSourceFactory
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDataSourceFactory()
	 * @generated
	 */
	int DATA_SOURCE_FACTORY = 11;

	/**
	 * The number of structural features of the '<em>Data Source Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.IndexDefImpl <em>Index Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.IndexDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexDef()
	 * @generated
	 */
	int INDEX_DEF = 12;

	/**
	 * The feature id for the '<em><b>Clustered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__CLUSTERED = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__UNIQUE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.IndexColumnDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexColumnDef()
	 * @generated
	 */
	int INDEX_COLUMN_DEF = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__ORDERING = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__SEQUENCE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Column Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.db.core.QPreparedStatement <em>Prepared Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.QPreparedStatement
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
	 * @generated
	 */
	int PREPARED_STATEMENT = 14;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.QualifiedNameImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 15;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.SchemaDefImpl <em>Schema Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.SchemaDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
	 * @generated
	 */
	int SCHEMA_DEF = 16;

	/**
	 * The meta object id for the '{@link org.asup.db.core.QStatement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.QStatement
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 17;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Prepared Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__QUALIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Schema Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableDefImpl <em>Table Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableDef()
	 * @generated
	 */
	int TABLE_DEF = 18;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableColumnDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableColumnDef()
	 * @generated
	 */
	int TABLE_COLUMN_DEF = 19;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DATA_TYPE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DEFAULT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__LENGTH = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NULLABLE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__SCALE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Table Column Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ViewDefImpl <em>View Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ViewDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getViewDef()
	 * @generated
	 */
	int VIEW_DEF = 20;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__COLUMNS = TABLE_DEF__COLUMNS;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__QUERY_SELECT = TABLE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF_FEATURE_COUNT = TABLE_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.DatabaseDataType <em>Database Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.DatabaseDataType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseDataType()
	 * @generated
	 */
	int DATABASE_DATA_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.asup.db.core.OrderingType <em>Ordering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.OrderingType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 22;

	/**
	 * The meta object id for the '<em>Database Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.SQLException
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseException()
	 * @generated
	 */
	int DATABASE_EXCEPTION = 23;

	/**
	 * The meta object id for the '<em>Database Result Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSet
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSet()
	 * @generated
	 */
	int DATABASE_RESULT_SET = 24;


	/**
	 * The meta object id for the '<em>Statement Batch Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatementBatchResult()
	 * @generated
	 */
	int STATEMENT_BATCH_RESULT = 25;


	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QCatalogContainer <em>Catalog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Container</em>'.
	 * @see org.asup.db.core.QCatalogContainer
	 * @generated
	 */
	EClass getCatalogContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QCatalogContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QCatalogContainer#getName()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QCatalogContainer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.asup.db.core.QCatalogContainer#isActive()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Active();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.db.core.QCatalogContainer#getConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Config</em>'.
	 * @see org.asup.db.core.QCatalogContainer#getConnectionConfig()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_ConnectionConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QCatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Guest Access</em>'.
	 * @see org.asup.db.core.QCatalogContainer#isSupportsGuestAccess()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_SupportsGuestAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.db.core.QCatalogContainer#getGenerationStrategy <em>Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Strategy</em>'.
	 * @see org.asup.db.core.QCatalogContainer#getGenerationStrategy()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_GenerationStrategy();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QCatalogGenerationStrategy <em>Catalog Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Generation Strategy</em>'.
	 * @see org.asup.db.core.QCatalogGenerationStrategy
	 * @generated
	 */
	EClass getCatalogGenerationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QCatalogGenerationStrategy#isCreateIndexOnView <em>Create Index On View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Index On View</em>'.
	 * @see org.asup.db.core.QCatalogGenerationStrategy#isCreateIndexOnView()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateIndexOnView();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QCatalogGenerationStrategy#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Relative Record Number</em>'.
	 * @see org.asup.db.core.QCatalogGenerationStrategy#isCreateRelativeRecordNumber()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateRelativeRecordNumber();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QCatalogMetaData <em>Catalog Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Meta Data</em>'.
	 * @see org.asup.db.core.QCatalogMetaData
	 * @generated
	 */
	EClass getCatalogMetaData();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.asup.db.core.QConnection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Config</em>'.
	 * @see org.asup.db.core.QConnectionConfig
	 * @generated
	 */
	EClass getConnectionConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getUrl()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getCatalog()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.asup.db.core.QConnectionConfig#isPersistent()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getVendor()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getVersion()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.db.core.QConnectionConfig#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getCredentials()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EReference getConnectionConfig_Credentials();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionCredentials <em>Connection Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Credentials</em>'.
	 * @see org.asup.db.core.QConnectionCredentials
	 * @generated
	 */
	EClass getConnectionCredentials();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionDescription <em>Connection Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Description</em>'.
	 * @see org.asup.db.core.QConnectionDescription
	 * @generated
	 */
	EClass getConnectionDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.db.core.QConnectionDescription#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemas</em>'.
	 * @see org.asup.db.core.QConnectionDescription#getSchemas()
	 * @see #getConnectionDescription()
	 * @generated
	 */
	EAttribute getConnectionDescription_Schemas();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see org.asup.db.core.QConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabaseContainer <em>Database Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Container</em>'.
	 * @see org.asup.db.core.QDatabaseContainer
	 * @generated
	 */
	EClass getDatabaseContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QDatabaseContainer#getCatalogContainers <em>Catalog Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog Containers</em>'.
	 * @see org.asup.db.core.QDatabaseContainer#getCatalogContainers()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_CatalogContainers();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QDatabaseContainer#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.asup.db.core.QDatabaseContainer#getVendor()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QDatabaseContainer#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.asup.db.core.QDatabaseContainer#getVersion()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Version();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.core.QDatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Catalog Container</em>'.
	 * @see org.asup.db.core.QDatabaseContainer#getDefaultCatalogContainer()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_DefaultCatalogContainer();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabaseObjectDef <em>Database Object Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Object Def</em>'.
	 * @see org.asup.db.core.QDatabaseObjectDef
	 * @generated
	 */
	EClass getDatabaseObjectDef();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabaseManager <em>Database Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Manager</em>'.
	 * @see org.asup.db.core.QDatabaseManager
	 * @generated
	 */
	EClass getDatabaseManager();

	/**
	 * Returns the meta object for class '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Factory</em>'.
	 * @see org.osgi.service.jdbc.DataSourceFactory
	 * @model instanceClass="org.osgi.service.jdbc.DataSourceFactory"
	 * @generated
	 */
	EClass getDataSourceFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QIndexDef <em>Index Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Def</em>'.
	 * @see org.asup.db.core.QIndexDef
	 * @generated
	 */
	EClass getIndexDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexDef#isClustered <em>Clustered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clustered</em>'.
	 * @see org.asup.db.core.QIndexDef#isClustered()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Clustered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QIndexDef#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.asup.db.core.QIndexDef#getColumns()
	 * @see #getIndexDef()
	 * @generated
	 */
	EReference getIndexDef_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexDef#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.asup.db.core.QIndexDef#isUnique()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Unique();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QIndexColumnDef <em>Index Column Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column Def</em>'.
	 * @see org.asup.db.core.QIndexColumnDef
	 * @generated
	 */
	EClass getIndexColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumnDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QIndexColumnDef#getName()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumnDef#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.asup.db.core.QIndexColumnDef#getOrdering()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumnDef#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.asup.db.core.QIndexColumnDef#getSequence()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Sequence();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QPreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Statement</em>'.
	 * @see org.asup.db.core.QPreparedStatement
	 * @generated
	 */
	EClass getPreparedStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see org.asup.db.core.QQualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.db.core.QQualifiedName#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifiers</em>'.
	 * @see org.asup.db.core.QQualifiedName#getQualifiers()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Qualifiers();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QSchemaDef <em>Schema Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Def</em>'.
	 * @see org.asup.db.core.QSchemaDef
	 * @generated
	 */
	EClass getSchemaDef();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.asup.db.core.QStatement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QTableDef <em>Table Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Def</em>'.
	 * @see org.asup.db.core.QTableDef
	 * @generated
	 */
	EClass getTableDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QTableDef#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.asup.db.core.QTableDef#getColumns()
	 * @see #getTableDef()
	 * @generated
	 */
	EReference getTableDef_Columns();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QTableColumnDef <em>Table Column Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column Def</em>'.
	 * @see org.asup.db.core.QTableColumnDef
	 * @generated
	 */
	EClass getTableColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.asup.db.core.QTableColumnDef#getDataType()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.asup.db.core.QTableColumnDef#isDefault()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QTableColumnDef#getName()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.asup.db.core.QTableColumnDef#isNullable()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.asup.db.core.QTableColumnDef#getLength()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableColumnDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.asup.db.core.QTableColumnDef#getScale()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Scale();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QViewDef <em>View Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Def</em>'.
	 * @see org.asup.db.core.QViewDef
	 * @generated
	 */
	EClass getViewDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QViewDef#getQuerySelect <em>Query Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Select</em>'.
	 * @see org.asup.db.core.QViewDef#getQuerySelect()
	 * @see #getViewDef()
	 * @generated
	 */
	EAttribute getViewDef_QuerySelect();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.core.DatabaseDataType <em>Database Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Data Type</em>'.
	 * @see org.asup.db.core.DatabaseDataType
	 * @generated
	 */
	EEnum getDatabaseDataType();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.core.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.asup.db.core.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for data type '{@link java.sql.SQLException <em>Database Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Exception</em>'.
	 * @see java.sql.SQLException
	 * @model instanceClass="java.sql.SQLException" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseException();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSet <em>Database Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Result Set</em>'.
	 * @see java.sql.ResultSet
	 * @model instanceClass="java.sql.ResultSet" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseResultSet();

	/**
	 * Returns the meta object for data type '<em>Statement Batch Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Statement Batch Result</em>'.
	 * @model instanceClass="int[]" serializeable="false"
	 * @generated
	 */
	EDataType getStatementBatchResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseCoreFactory getDatabaseCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.CatalogContainerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogContainer()
		 * @generated
		 */
		EClass CATALOG_CONTAINER = eINSTANCE.getCatalogContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__NAME = eINSTANCE.getCatalogContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__ACTIVE = eINSTANCE.getCatalogContainer_Active();

		/**
		 * The meta object literal for the '<em><b>Connection Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__CONNECTION_CONFIG = eINSTANCE.getCatalogContainer_ConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Supports Guest Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = eINSTANCE.getCatalogContainer_SupportsGuestAccess();

		/**
		 * The meta object literal for the '<em><b>Generation Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__GENERATION_STRATEGY = eINSTANCE.getCatalogContainer_GenerationStrategy();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.CatalogGenerationStrategyImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogGenerationStrategy()
		 * @generated
		 */
		EClass CATALOG_GENERATION_STRATEGY = eINSTANCE.getCatalogGenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Create Index On View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = eINSTANCE.getCatalogGenerationStrategy_CreateIndexOnView();

		/**
		 * The meta object literal for the '<em><b>Create Relative Record Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = eINSTANCE.getCatalogGenerationStrategy_CreateRelativeRecordNumber();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.CatalogMetaDataImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getCatalogMetaData()
		 * @generated
		 */
		EClass CATALOG_META_DATA = eINSTANCE.getCatalogMetaData();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.QConnection <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.QConnection
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionConfigImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
		 * @generated
		 */
		EClass CONNECTION_CONFIG = eINSTANCE.getConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__URL = eINSTANCE.getConnectionConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__CATALOG = eINSTANCE.getConnectionConfig_Catalog();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PERSISTENT = eINSTANCE.getConnectionConfig_Persistent();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VENDOR = eINSTANCE.getConnectionConfig_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VERSION = eINSTANCE.getConnectionConfig_Version();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONFIG__CREDENTIALS = eINSTANCE.getConnectionConfig_Credentials();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionCredentialsImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionCredentials()
		 * @generated
		 */
		EClass CONNECTION_CREDENTIALS = eINSTANCE.getConnectionCredentials();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.QConnectionDescription <em>Connection Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.QConnectionDescription
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionDescription()
		 * @generated
		 */
		EClass CONNECTION_DESCRIPTION = eINSTANCE.getConnectionDescription();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_DESCRIPTION__SCHEMAS = eINSTANCE.getConnectionDescription_Schemas();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionManagerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseContainerImpl <em>Database Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseContainerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseContainer()
		 * @generated
		 */
		EClass DATABASE_CONTAINER = eINSTANCE.getDatabaseContainer();

		/**
		 * The meta object literal for the '<em><b>Catalog Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTAINER__CATALOG_CONTAINERS = eINSTANCE.getDatabaseContainer_CatalogContainers();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VENDOR = eINSTANCE.getDatabaseContainer_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VERSION = eINSTANCE.getDatabaseContainer_Version();

		/**
		 * The meta object literal for the '<em><b>Default Catalog Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = eINSTANCE.getDatabaseContainer_DefaultCatalogContainer();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseObjectDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseObjectDef()
		 * @generated
		 */
		EClass DATABASE_OBJECT_DEF = eINSTANCE.getDatabaseObjectDef();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseManagerImpl <em>Database Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseManagerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
		 * @generated
		 */
		EClass DATABASE_MANAGER = eINSTANCE.getDatabaseManager();

		/**
		 * The meta object literal for the '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.service.jdbc.DataSourceFactory
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDataSourceFactory()
		 * @generated
		 */
		EClass DATA_SOURCE_FACTORY = eINSTANCE.getDataSourceFactory();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.IndexDefImpl <em>Index Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.IndexDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexDef()
		 * @generated
		 */
		EClass INDEX_DEF = eINSTANCE.getIndexDef();

		/**
		 * The meta object literal for the '<em><b>Clustered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__CLUSTERED = eINSTANCE.getIndexDef_Clustered();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_DEF__COLUMNS = eINSTANCE.getIndexDef_Columns();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__UNIQUE = eINSTANCE.getIndexDef_Unique();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.IndexColumnDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexColumnDef()
		 * @generated
		 */
		EClass INDEX_COLUMN_DEF = eINSTANCE.getIndexColumnDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__NAME = eINSTANCE.getIndexColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__ORDERING = eINSTANCE.getIndexColumnDef_Ordering();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__SEQUENCE = eINSTANCE.getIndexColumnDef_Sequence();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.QPreparedStatement <em>Prepared Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.QPreparedStatement
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
		 * @generated
		 */
		EClass PREPARED_STATEMENT = eINSTANCE.getPreparedStatement();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.QualifiedNameImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__QUALIFIERS = eINSTANCE.getQualifiedName_Qualifiers();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.SchemaDefImpl <em>Schema Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.SchemaDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
		 * @generated
		 */
		EClass SCHEMA_DEF = eINSTANCE.getSchemaDef();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.QStatement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.QStatement
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.TableDefImpl <em>Table Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.TableDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableDef()
		 * @generated
		 */
		EClass TABLE_DEF = eINSTANCE.getTableDef();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DEF__COLUMNS = eINSTANCE.getTableDef_Columns();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.TableColumnDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableColumnDef()
		 * @generated
		 */
		EClass TABLE_COLUMN_DEF = eINSTANCE.getTableColumnDef();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__DATA_TYPE = eINSTANCE.getTableColumnDef_DataType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__DEFAULT = eINSTANCE.getTableColumnDef_Default();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NAME = eINSTANCE.getTableColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NULLABLE = eINSTANCE.getTableColumnDef_Nullable();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__LENGTH = eINSTANCE.getTableColumnDef_Length();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__SCALE = eINSTANCE.getTableColumnDef_Scale();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ViewDefImpl <em>View Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ViewDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getViewDef()
		 * @generated
		 */
		EClass VIEW_DEF = eINSTANCE.getViewDef();

		/**
		 * The meta object literal for the '<em><b>Query Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEF__QUERY_SELECT = eINSTANCE.getViewDef_QuerySelect();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.DatabaseDataType <em>Database Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.DatabaseDataType
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseDataType()
		 * @generated
		 */
		EEnum DATABASE_DATA_TYPE = eINSTANCE.getDatabaseDataType();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.OrderingType <em>Ordering Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.OrderingType
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '<em>Database Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.SQLException
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseException()
		 * @generated
		 */
		EDataType DATABASE_EXCEPTION = eINSTANCE.getDatabaseException();

		/**
		 * The meta object literal for the '<em>Database Result Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.ResultSet
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSet()
		 * @generated
		 */
		EDataType DATABASE_RESULT_SET = eINSTANCE.getDatabaseResultSet();

		/**
		 * The meta object literal for the '<em>Statement Batch Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatementBatchResult()
		 * @generated
		 */
		EDataType STATEMENT_BATCH_RESULT = eINSTANCE.getStatementBatchResult();

	}

} //QDatabaseCorePackage
