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
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.db.core.QDatabaseCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/db/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDatabaseCorePackage eINSTANCE = org.asup.db.core.impl.DatabaseCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionImpl
	 * <em>Connection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.asup.db.core.impl.ConnectionImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionConfigImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
	 * @generated
	 */
	int CONNECTION_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Driver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__DRIVER_NAME = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PRODUCT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PASSWORD = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__URL = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__USER = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VERSION = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionContextImpl <em>Connection Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionContextImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionContext()
	 * @generated
	 */
	int CONNECTION_CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Connection Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONTEXT_FEATURE_COUNT = QFrameworkCorePackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionFactoryImpl <em>Connection Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionFactoryImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionFactory()
	 * @generated
	 */
	int CONNECTION_FACTORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionFactoryRegistryImpl <em>Connection Factory Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionFactoryRegistryImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionFactoryRegistry()
	 * @generated
	 */
	int CONNECTION_FACTORY_REGISTRY = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Connection Factory Registry</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition <em>Database Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseDefinition()
	 * @generated
	 */
	int DATABASE_DEFINITION = 6;

	/**
	 * The number of structural features of the '<em>Database Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseObjectDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseObjectDef()
	 * @generated
	 */
	int DATABASE_OBJECT_DEF = 7;

	/**
	 * The number of structural features of the '<em>Database Object Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>Database Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseNameHelper()
	 * @generated
	 */
	int DATABASE_NAME_HELPER = 8;

	/**
	 * The number of structural features of the '<em>Database Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_NAME_HELPER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseManagerImpl <em>Database Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
	 * @generated
	 */
	int DATABASE_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Database Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.IndexDefImpl <em>Index Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.IndexDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexDef()
	 * @generated
	 */
	int INDEX_DEF = 10;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

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
	int INDEX_COLUMN_DEF = 11;

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
	int PREPARED_STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Prepared Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.SchemaDefImpl <em>Schema Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.SchemaDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
	 * @generated
	 */
	int SCHEMA_DEF = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.QStatement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.QStatement
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 14;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableDefImpl <em>Table Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableDef()
	 * @generated
	 */
	int TABLE_DEF = 15;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableColumnDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableColumnDef()
	 * @generated
	 */
	int TABLE_COLUMN_DEF = 16;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DATA_TYPE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NULLABLE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__LENGTH = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__SCALE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table Column Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ViewDefImpl <em>View Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ViewDefImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getViewDef()
	 * @generated
	 */
	int VIEW_DEF = 17;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__COLUMNS = TABLE_DEF__COLUMNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__NAME = TABLE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Creation Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__CREATION_PLUGIN = TABLE_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__CREATION_COMMAND = TABLE_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF_FEATURE_COUNT = TABLE_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.core.DatabaseDataType <em>Database Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.DatabaseDataType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseDataType()
	 * @generated
	 */
	int DATABASE_DATA_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.asup.db.core.OrderingType
	 * <em>Ordering Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.asup.db.core.OrderingType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 19;

	/**
	 * The meta object id for the '<em>Database Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.sql.SQLException
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseException()
	 * @generated
	 */
	int DATABASE_EXCEPTION = 20;

	/**
	 * The meta object id for the '<em>Database Result Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSet
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSet()
	 * @generated
	 */
	int DATABASE_RESULT_SET = 21;

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getDriverName <em>Driver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Name</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getDriverName()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_DriverName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getProduct()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getPassword()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Password();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getUser()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_User();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionContext <em>Connection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Context</em>'.
	 * @see org.asup.db.core.QConnectionContext
	 * @generated
	 */
	EClass getConnectionContext();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionFactory <em>Connection Factory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Factory</em>'.
	 * @see org.asup.db.core.QConnectionFactory
	 * @generated
	 */
	EClass getConnectionFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionFactoryRegistry <em>Connection Factory Registry</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Connection Factory Registry</em>'.
	 * @see org.asup.db.core.QConnectionFactoryRegistry
	 * @generated
	 */
	EClass getConnectionFactoryRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see org.asup.db.core.QConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition <em>Database Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Definition</em>'.
	 * @see org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition
	 * @model instanceClass="org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition"
	 * @generated
	 */
	EClass getDatabaseDefinition();

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
	 * Returns the meta object for class '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>Database Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Name Helper</em>'.
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @model instanceClass="org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper"
	 * @generated
	 */
	EClass getDatabaseNameHelper();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabaseManager <em>Database Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Manager</em>'.
	 * @see org.asup.db.core.QDatabaseManager
	 * @generated
	 */
	EClass getDatabaseManager();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QIndexDef#getName()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Name();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QSchemaDef <em>Schema Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Def</em>'.
	 * @see org.asup.db.core.QSchemaDef
	 * @generated
	 */
	EClass getSchemaDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QSchemaDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QSchemaDef#getName()
	 * @see #getSchemaDef()
	 * @generated
	 */
	EAttribute getSchemaDef_Name();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTableDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QTableDef#getName()
	 * @see #getTableDef()
	 * @generated
	 */
	EAttribute getTableDef_Name();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QViewDef#getCreationPlugin <em>Creation Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Plugin</em>'.
	 * @see org.asup.db.core.QViewDef#getCreationPlugin()
	 * @see #getViewDef()
	 * @generated
	 */
	EAttribute getViewDef_CreationPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QViewDef#getCreationCommand <em>Creation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Command</em>'.
	 * @see org.asup.db.core.QViewDef#getCreationCommand()
	 * @see #getViewDef()
	 * @generated
	 */
	EAttribute getViewDef_CreationCommand();

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.asup.db.core.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for data type '{@link java.sql.SQLException
	 * <em>Database Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
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
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseCoreFactory getDatabaseCoreFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.db.core.QConnection <em>Connection</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		 * The meta object literal for the '<em><b>Driver Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__DRIVER_NAME = eINSTANCE.getConnectionConfig_DriverName();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PRODUCT = eINSTANCE.getConnectionConfig_Product();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PASSWORD = eINSTANCE.getConnectionConfig_Password();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__URL = eINSTANCE.getConnectionConfig_Url();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__USER = eINSTANCE.getConnectionConfig_User();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VERSION = eINSTANCE.getConnectionConfig_Version();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionContextImpl <em>Connection Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionContextImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionContext()
		 * @generated
		 */
		EClass CONNECTION_CONTEXT = eINSTANCE.getConnectionContext();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionFactoryImpl <em>Connection Factory</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionFactoryImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionFactory()
		 * @generated
		 */
		EClass CONNECTION_FACTORY = eINSTANCE.getConnectionFactory();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionFactoryRegistryImpl <em>Connection Factory Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionFactoryRegistryImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionFactoryRegistry()
		 * @generated
		 */
		EClass CONNECTION_FACTORY_REGISTRY = eINSTANCE.getConnectionFactoryRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionManagerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '{@link org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition <em>Database Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseDefinition()
		 * @generated
		 */
		EClass DATABASE_DEFINITION = eINSTANCE.getDatabaseDefinition();

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
		 * The meta object literal for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>Database Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseNameHelper()
		 * @generated
		 */
		EClass DATABASE_NAME_HELPER = eINSTANCE.getDatabaseNameHelper();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseManagerImpl <em>Database Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseManagerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
		 * @generated
		 */
		EClass DATABASE_MANAGER = eINSTANCE.getDatabaseManager();

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
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_DEF__COLUMNS = eINSTANCE.getIndexDef_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__NAME = eINSTANCE.getIndexDef_Name();

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
		 * The meta object literal for the '{@link org.asup.db.core.impl.SchemaDefImpl <em>Schema Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.SchemaDefImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
		 * @generated
		 */
		EClass SCHEMA_DEF = eINSTANCE.getSchemaDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_DEF__NAME = eINSTANCE.getSchemaDef_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_DEF__NAME = eINSTANCE.getTableDef_Name();

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
		 * The meta object literal for the '<em><b>Creation Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEF__CREATION_PLUGIN = eINSTANCE.getViewDef_CreationPlugin();

		/**
		 * The meta object literal for the '<em><b>Creation Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEF__CREATION_COMMAND = eINSTANCE.getViewDef_CreationCommand();

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
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.asup.db.core.OrderingType
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '<em>Database Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	}

} // DatabaseCorePackage
