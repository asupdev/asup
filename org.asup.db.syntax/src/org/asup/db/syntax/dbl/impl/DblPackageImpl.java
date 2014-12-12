/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl.impl;

import org.asup.db.core.QDatabaseCorePackage;

import org.asup.db.syntax.QDatabaseSyntaxPackage;

import org.asup.db.syntax.dbl.IsolationLevel;
import org.asup.db.syntax.dbl.QDblFactory;
import org.asup.db.syntax.dbl.QDblPackage;
import org.asup.db.syntax.dbl.QSetTransactionStatement;
import org.asup.db.syntax.dbl.RWOperation;

import org.asup.db.syntax.ddl.QDdlPackage;

import org.asup.db.syntax.ddl.impl.DdlPackageImpl;

import org.asup.db.syntax.dml.QDatabaseDMLPackage;

import org.asup.db.syntax.dml.impl.DatabaseDMLPackageImpl;

import org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DblPackageImpl extends EPackageImpl implements QDblPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTransactionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isolationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rwOperationEEnum = null;

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
	 * @see org.asup.db.syntax.dbl.QDblPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DblPackageImpl() {
		super(eNS_URI, QDblFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDblPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDblPackage init() {
		if (isInited) return (QDblPackage)EPackage.Registry.INSTANCE.getEPackage(QDblPackage.eNS_URI);

		// Obtain or create and register package
		DblPackageImpl theDblPackage = (DblPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DblPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DblPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);
		DdlPackageImpl theDdlPackage = (DdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDdlPackage.eNS_URI) instanceof DdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDdlPackage.eNS_URI) : QDdlPackage.eINSTANCE);
		DatabaseDMLPackageImpl theDatabaseDMLPackage = (DatabaseDMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseDMLPackage.eNS_URI) instanceof DatabaseDMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseDMLPackage.eNS_URI) : QDatabaseDMLPackage.eINSTANCE);

		// Create package meta-data objects
		theDblPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();
		theDdlPackage.createPackageContents();
		theDatabaseDMLPackage.createPackageContents();

		// Initialize created meta-data
		theDblPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();
		theDdlPackage.initializePackageContents();
		theDatabaseDMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDblPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDblPackage.eNS_URI, theDblPackage);
		return theDblPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTransactionStatement() {
		return setTransactionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTransactionStatement_IsolationLevel() {
		return (EAttribute)setTransactionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTransactionStatement_RwOperation() {
		return (EAttribute)setTransactionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsolationLevel() {
		return isolationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRWOperation() {
		return rwOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDblFactory getDblFactory() {
		return (QDblFactory)getEFactoryInstance();
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
		setTransactionStatementEClass = createEClass(SET_TRANSACTION_STATEMENT);
		createEAttribute(setTransactionStatementEClass, SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL);
		createEAttribute(setTransactionStatementEClass, SET_TRANSACTION_STATEMENT__RW_OPERATION);

		// Create enums
		isolationLevelEEnum = createEEnum(ISOLATION_LEVEL);
		rwOperationEEnum = createEEnum(RW_OPERATION);
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
		QDatabaseSyntaxPackage theDatabaseSyntaxPackage = (QDatabaseSyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		setTransactionStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(setTransactionStatementEClass, QSetTransactionStatement.class, "SetTransactionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetTransactionStatement_IsolationLevel(), this.getIsolationLevel(), "isolationLevel", null, 0, 1, QSetTransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTransactionStatement_RwOperation(), this.getRWOperation(), "rwOperation", null, 0, 1, QSetTransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(isolationLevelEEnum, IsolationLevel.class, "IsolationLevel");
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.SERIALIZABLE);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.NO_COMMIT);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.READ_UNCOMMITTED);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.READ_COMMITTED);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.REPEATABLE_READ);

		initEEnum(rwOperationEEnum, RWOperation.class, "RWOperation");
		addEEnumLiteral(rwOperationEEnum, RWOperation.READ_ONLY);
		addEEnumLiteral(rwOperationEEnum, RWOperation.READ_WRITE);
	}

} //DblPackageImpl
