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
 *   <li>each operation of each class,</li>
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
	 * The meta object id for the '{@link org.asup.db.core.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ColumnImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Connection Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Current Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CURRENT_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Connection Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_FACTORY = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionConfigImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
	 * @generated
	 */
	int CONNECTION_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__DATABASE_NAME = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__DRIVER = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PASSWORD = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PLUGIN_NAME = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__URL = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Use Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__USE_CATALOG = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__USE_POOL = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__USER = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Connection Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionFactoryImpl <em>Connection Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionFactoryImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionFactory()
	 * @generated
	 */
	int CONNECTION_FACTORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Connection Factory Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FACTORY_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ConnectionManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 5;

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
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEMAS = 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseManagerImpl <em>Database Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseManagerImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
	 * @generated
	 */
	int DATABASE_MANAGER = 7;

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
	 * The meta object id for the '{@link org.asup.db.core.impl.DatabaseObjectImpl <em>Database Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.DatabaseObjectImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseObject()
	 * @generated
	 */
	int DATABASE_OBJECT = 8;

	/**
	 * The number of structural features of the '<em>Database Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.service.jdbc.DataSourceFactory
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDataSourceFactory()
	 * @generated
	 */
	int DATA_SOURCE_FACTORY = 9;

	/**
	 * The number of structural features of the '<em>Data Source Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.IndexImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 10;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__UNIQUE = 4;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.IndexColumnImpl <em>Index Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.IndexColumnImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexColumn()
	 * @generated
	 */
	int INDEX_COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Index</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__ORDERING = 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN__SEQUENCE = 3;

	/**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.SchemaImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 12;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VIEWS = 3;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INDEXES = 4;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 13;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = DATABASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = DATABASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = DATABASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DATABASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.TableColumnImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 14;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__DATA_TYPE = COLUMN__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__NULLABLE = COLUMN__NULLABLE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__PRECISION = COLUMN__PRECISION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__SCALE = COLUMN__SCALE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__TABLE = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ViewImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 15;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COLUMNS = DATABASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CREATION_PLUGIN = DATABASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CREATION_COMMAND = DATABASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = DATABASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SCHEMA = DATABASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = DATABASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.asup.db.core.impl.ViewColumnImpl <em>View Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.impl.ViewColumnImpl
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getViewColumn()
	 * @generated
	 */
	int VIEW_COLUMN = 16;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__DATA_TYPE = COLUMN__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__NULLABLE = COLUMN__NULLABLE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__PRECISION = COLUMN__PRECISION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__SCALE = COLUMN__SCALE;

	/**
	 * The feature id for the '<em><b>View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__VIEW = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.core.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.DataType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.asup.db.core.OrderingType <em>Ordering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.OrderingType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.asup.db.core.StatementType <em>Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.core.StatementType
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 19;

	/**
	 * The meta object id for the '<em>JDBC Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Connection
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCConnection()
	 * @generated
	 */
	int JDBC_CONNECTION = 20;

	/**
	 * The meta object id for the '<em>JDBC Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.SQLException
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCException()
	 * @generated
	 */
	int JDBC_EXCEPTION = 21;

	/**
	 * The meta object id for the '<em>JDBC Statement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Statement
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCStatement()
	 * @generated
	 */
	int JDBC_STATEMENT = 22;

	/**
	 * The meta object id for the '<em>Prepared Statement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.PreparedStatement
	 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
	 * @generated
	 */
	int PREPARED_STATEMENT = 23;


	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.asup.db.core.QColumn
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QColumn#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.asup.db.core.QColumn#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QColumn#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.asup.db.core.QColumn#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QColumn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.asup.db.core.QColumn#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.asup.db.core.QColumn#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

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
	 * Returns the meta object for the reference '{@link org.asup.db.core.QConnection#getConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Config</em>'.
	 * @see org.asup.db.core.QConnection#getConnectionConfig()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionConfig();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.core.QConnection#getCurrentSchema <em>Current Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Schema</em>'.
	 * @see org.asup.db.core.QConnection#getCurrentSchema()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_CurrentSchema();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.core.QConnection#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see org.asup.db.core.QConnection#getDatabase()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Database();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.core.QConnection#getConnectionFactory <em>Connection Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Factory</em>'.
	 * @see org.asup.db.core.QConnection#getConnectionFactory()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionFactory();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getDatabaseName()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getDriver()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Driver();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.asup.db.core.QConnectionConfig#getPluginName()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_PluginName();

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
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#isUseCatalog <em>Use Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Catalog</em>'.
	 * @see org.asup.db.core.QConnectionConfig#isUseCatalog()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_UseCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QConnectionConfig#isUsePool <em>Use Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Pool</em>'.
	 * @see org.asup.db.core.QConnectionConfig#isUsePool()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_UsePool();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionFactory <em>Connection Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Factory</em>'.
	 * @see org.asup.db.core.QConnectionFactory
	 * @generated
	 */
	EClass getConnectionFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QConnectionFactoryRegistry <em>Connection Factory Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Factory Registry</em>'.
	 * @see org.asup.db.core.QConnectionFactoryRegistry
	 * @generated
	 */
	EClass getConnectionFactoryRegistry();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.asup.db.core.QDatabase
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QDatabase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QDatabase#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.db.core.QDatabase#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schemas</em>'.
	 * @see org.asup.db.core.QDatabase#getSchemas()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Schemas();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QDatabaseObject <em>Database Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Object</em>'.
	 * @see org.asup.db.core.QDatabaseObject
	 * @generated
	 */
	EClass getDatabaseObject();

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
	 * Returns the meta object for class '{@link org.asup.db.core.QIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.asup.db.core.QIndex
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QIndex#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.asup.db.core.QIndex#getColumns()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QIndex#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndex#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.asup.db.core.QIndex#getObject()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Object();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QIndex#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see org.asup.db.core.QIndex#getSchema()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndex#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.asup.db.core.QIndex#isUnique()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Unique();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QIndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see org.asup.db.core.QIndexColumn
	 * @generated
	 */
	EClass getIndexColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QIndexColumn#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Index</em>'.
	 * @see org.asup.db.core.QIndexColumn#getIndex()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EReference getIndexColumn_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QIndexColumn#getName()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EAttribute getIndexColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumn#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.asup.db.core.QIndexColumn#getOrdering()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EAttribute getIndexColumn_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QIndexColumn#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.asup.db.core.QIndexColumn#getSequence()
	 * @see #getIndexColumn()
	 * @generated
	 */
	EAttribute getIndexColumn_Sequence();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see org.asup.db.core.QSchema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.core.QSchema#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see org.asup.db.core.QSchema#getDatabase()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Database();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QSchema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see org.asup.db.core.QSchema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QSchema#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.asup.db.core.QSchema#getViews()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QSchema#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see org.asup.db.core.QSchema#getIndexes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Indexes();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.asup.db.core.QTable
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.asup.db.core.QTable#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QTable#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see org.asup.db.core.QTable#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see org.asup.db.core.QTableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QTableColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.asup.db.core.QTableColumn#getTable()
	 * @see #getTableColumn()
	 * @generated
	 */
	EReference getTableColumn_Table();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.asup.db.core.QView
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.db.core.QView#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.asup.db.core.QView#getColumns()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QView#getCreationPlugin <em>Creation Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Plugin</em>'.
	 * @see org.asup.db.core.QView#getCreationPlugin()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_CreationPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QView#getCreationCommand <em>Creation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Command</em>'.
	 * @see org.asup.db.core.QView#getCreationCommand()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_CreationCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.core.QView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.core.QView#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QView#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see org.asup.db.core.QView#getSchema()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Schema();

	/**
	 * Returns the meta object for class '{@link org.asup.db.core.QViewColumn <em>View Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Column</em>'.
	 * @see org.asup.db.core.QViewColumn
	 * @generated
	 */
	EClass getViewColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.db.core.QViewColumn#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View</em>'.
	 * @see org.asup.db.core.QViewColumn#getView()
	 * @see #getViewColumn()
	 * @generated
	 */
	EReference getViewColumn_View();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.asup.db.core.DataType
	 * @generated
	 */
	EEnum getDataType();

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
	 * Returns the meta object for enum '{@link org.asup.db.core.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Type</em>'.
	 * @see org.asup.db.core.StatementType
	 * @generated
	 */
	EEnum getStatementType();

	/**
	 * Returns the meta object for data type '{@link java.sql.Connection <em>JDBC Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JDBC Connection</em>'.
	 * @see java.sql.Connection
	 * @model instanceClass="java.sql.Connection" serializeable="false"
	 * @generated
	 */
	EDataType getJDBCConnection();

	/**
	 * Returns the meta object for data type '{@link java.sql.SQLException <em>JDBC Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JDBC Exception</em>'.
	 * @see java.sql.SQLException
	 * @model instanceClass="java.sql.SQLException" serializeable="false"
	 * @generated
	 */
	EDataType getJDBCException();

	/**
	 * Returns the meta object for data type '{@link java.sql.Statement <em>JDBC Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JDBC Statement</em>'.
	 * @see java.sql.Statement
	 * @model instanceClass="java.sql.Statement" serializeable="false"
	 * @generated
	 */
	EDataType getJDBCStatement();

	/**
	 * Returns the meta object for data type '{@link java.sql.PreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prepared Statement</em>'.
	 * @see java.sql.PreparedStatement
	 * @model instanceClass="java.sql.PreparedStatement" serializeable="false"
	 * @generated
	 */
	EDataType getPreparedStatement();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ColumnImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__PRECISION = eINSTANCE.getColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCALE = eINSTANCE.getColumn_Scale();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_CONFIG = eINSTANCE.getConnection_ConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Current Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CURRENT_SCHEMA = eINSTANCE.getConnection_CurrentSchema();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DATABASE = eINSTANCE.getConnection_Database();

		/**
		 * The meta object literal for the '<em><b>Connection Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_FACTORY = eINSTANCE.getConnection_ConnectionFactory();

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
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__DATABASE_NAME = eINSTANCE.getConnectionConfig_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__DRIVER = eINSTANCE.getConnectionConfig_Driver();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PASSWORD = eINSTANCE.getConnectionConfig_Password();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PLUGIN_NAME = eINSTANCE.getConnectionConfig_PluginName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__URL = eINSTANCE.getConnectionConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Use Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__USE_CATALOG = eINSTANCE.getConnectionConfig_UseCatalog();

		/**
		 * The meta object literal for the '<em><b>Use Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__USE_POOL = eINSTANCE.getConnectionConfig_UsePool();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__USER = eINSTANCE.getConnectionConfig_User();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ConnectionFactoryImpl <em>Connection Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
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
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ConnectionManagerImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEMAS = eINSTANCE.getDatabase_Schemas();

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
		 * The meta object literal for the '{@link org.asup.db.core.impl.DatabaseObjectImpl <em>Database Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.DatabaseObjectImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDatabaseObject()
		 * @generated
		 */
		EClass DATABASE_OBJECT = eINSTANCE.getDatabaseObject();

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
		 * The meta object literal for the '{@link org.asup.db.core.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.IndexImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__COLUMNS = eINSTANCE.getIndex_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__OBJECT = eINSTANCE.getIndex_Object();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__SCHEMA = eINSTANCE.getIndex_Schema();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__UNIQUE = eINSTANCE.getIndex_Unique();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.IndexColumnImpl <em>Index Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.IndexColumnImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getIndexColumn()
		 * @generated
		 */
		EClass INDEX_COLUMN = eINSTANCE.getIndexColumn();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_COLUMN__INDEX = eINSTANCE.getIndexColumn_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN__NAME = eINSTANCE.getIndexColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN__ORDERING = eINSTANCE.getIndexColumn_Ordering();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN__SEQUENCE = eINSTANCE.getIndexColumn_Sequence();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.SchemaImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DATABASE = eINSTANCE.getSchema_Database();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__VIEWS = eINSTANCE.getSchema_Views();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__INDEXES = eINSTANCE.getSchema_Indexes();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.TableImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__SCHEMA = eINSTANCE.getTable_Schema();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.TableColumnImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN__TABLE = eINSTANCE.getTableColumn_Table();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ViewImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__COLUMNS = eINSTANCE.getView_Columns();

		/**
		 * The meta object literal for the '<em><b>Creation Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__CREATION_PLUGIN = eINSTANCE.getView_CreationPlugin();

		/**
		 * The meta object literal for the '<em><b>Creation Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__CREATION_COMMAND = eINSTANCE.getView_CreationCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SCHEMA = eINSTANCE.getView_Schema();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.impl.ViewColumnImpl <em>View Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.impl.ViewColumnImpl
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getViewColumn()
		 * @generated
		 */
		EClass VIEW_COLUMN = eINSTANCE.getViewColumn();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COLUMN__VIEW = eINSTANCE.getViewColumn_View();

		/**
		 * The meta object literal for the '{@link org.asup.db.core.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.DataType
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

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
		 * The meta object literal for the '{@link org.asup.db.core.StatementType <em>Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.core.StatementType
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getStatementType()
		 * @generated
		 */
		EEnum STATEMENT_TYPE = eINSTANCE.getStatementType();

		/**
		 * The meta object literal for the '<em>JDBC Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Connection
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCConnection()
		 * @generated
		 */
		EDataType JDBC_CONNECTION = eINSTANCE.getJDBCConnection();

		/**
		 * The meta object literal for the '<em>JDBC Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.SQLException
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCException()
		 * @generated
		 */
		EDataType JDBC_EXCEPTION = eINSTANCE.getJDBCException();

		/**
		 * The meta object literal for the '<em>JDBC Statement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Statement
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getJDBCStatement()
		 * @generated
		 */
		EDataType JDBC_STATEMENT = eINSTANCE.getJDBCStatement();

		/**
		 * The meta object literal for the '<em>Prepared Statement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.PreparedStatement
		 * @see org.asup.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
		 * @generated
		 */
		EDataType PREPARED_STATEMENT = eINSTANCE.getPreparedStatement();

	}

} //DatabaseCorePackage
