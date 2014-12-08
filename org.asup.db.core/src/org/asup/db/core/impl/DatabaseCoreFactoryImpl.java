/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import org.asup.db.core.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DatabaseCoreFactoryImpl extends EFactoryImpl implements QDatabaseCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QDatabaseCoreFactory init() {
		try {
			QDatabaseCoreFactory theDatabaseCoreFactory = (QDatabaseCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseCorePackage.eNS_URI);
			if (theDatabaseCoreFactory != null) {
				return theDatabaseCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DatabaseCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDatabaseCorePackage.CATALOG_CONTAINER: return (EObject)createCatalogContainer();
			case QDatabaseCorePackage.CONNECTION_CONFIG: return (EObject)createConnectionConfig();
			case QDatabaseCorePackage.CONNECTION_CREDENTIALS: return (EObject)createConnectionCredentials();
			case QDatabaseCorePackage.DATABASE_CONTAINER: return (EObject)createDatabaseContainer();
			case QDatabaseCorePackage.INDEX_DEF: return (EObject)createIndexDef();
			case QDatabaseCorePackage.INDEX_COLUMN_DEF: return (EObject)createIndexColumnDef();
			case QDatabaseCorePackage.QUALIFIED_NAME: return (EObject)createQualifiedName();
			case QDatabaseCorePackage.SCHEMA_DEF: return (EObject)createSchemaDef();
			case QDatabaseCorePackage.TABLE_DEF: return (EObject)createTableDef();
			case QDatabaseCorePackage.TABLE_COLUMN_DEF: return (EObject)createTableColumnDef();
			case QDatabaseCorePackage.VIEW_DEF: return (EObject)createViewDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseCorePackage.DATABASE_DATA_TYPE:
				return createDatabaseDataTypeFromString(eDataType, initialValue);
			case QDatabaseCorePackage.ORDERING_TYPE:
				return createOrderingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseCorePackage.DATABASE_DATA_TYPE:
				return convertDatabaseDataTypeToString(eDataType, instanceValue);
			case QDatabaseCorePackage.ORDERING_TYPE:
				return convertOrderingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCatalogContainer createCatalogContainer() {
		CatalogContainerImpl catalogContainer = new CatalogContainerImpl();
		return catalogContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionConfig createConnectionConfig() {
		ConnectionConfigImpl connectionConfig = new ConnectionConfigImpl();
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionCredentials createConnectionCredentials() {
		ConnectionCredentialsImpl connectionCredentials = new ConnectionCredentialsImpl();
		return connectionCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseContainer createDatabaseContainer() {
		DatabaseContainerImpl databaseContainer = new DatabaseContainerImpl();
		return databaseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndexDef createIndexDef() {
		IndexDefImpl indexDef = new IndexDefImpl();
		return indexDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndexColumnDef createIndexColumnDef() {
		IndexColumnDefImpl indexColumnDef = new IndexColumnDefImpl();
		return indexColumnDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName createQualifiedName() {
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSchemaDef createSchemaDef() {
		SchemaDefImpl schemaDef = new SchemaDefImpl();
		return schemaDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTableDef createTableDef() {
		TableDefImpl tableDef = new TableDefImpl();
		return tableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTableColumnDef createTableColumnDef() {
		TableColumnDefImpl tableColumnDef = new TableColumnDefImpl();
		return tableColumnDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QViewDef createViewDef() {
		ViewDefImpl viewDef = new ViewDefImpl();
		return viewDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseDataType createDatabaseDataTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseDataType result = DatabaseDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType createOrderingTypeFromString(EDataType eDataType, String initialValue) {
		OrderingType result = OrderingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseCorePackage getDatabaseCorePackage() {
		return (QDatabaseCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseCorePackage getPackage() {
		return QDatabaseCorePackage.eINSTANCE;
	}

} // DatabaseCoreFactoryImpl
