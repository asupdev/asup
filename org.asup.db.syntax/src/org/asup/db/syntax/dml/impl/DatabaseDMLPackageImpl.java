/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dml.impl;

import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.ddl.QDdlPackage;
import org.asup.db.syntax.ddl.impl.DdlPackageImpl;
import org.asup.db.syntax.dml.QDatabaseDMLFactory;
import org.asup.db.syntax.dml.QDatabaseDMLPackage;
import org.asup.db.syntax.dml.QExtendedQueryExpressionBody;
import org.asup.db.syntax.dml.QExtendedQuerySelect;
import org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseDMLPackageImpl extends EPackageImpl implements QDatabaseDMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQuerySelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQueryExpressionBodyEClass = null;

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
	 * @see org.asup.db.syntax.dml.QDatabaseDMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseDMLPackageImpl() {
		super(eNS_URI, QDatabaseDMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDatabaseDMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseDMLPackage init() {
		if (isInited) return (QDatabaseDMLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseDMLPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseDMLPackageImpl theDatabaseDMLPackage = (DatabaseDMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseDMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseDMLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);
		DdlPackageImpl theDdlPackage = (DdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDdlPackage.eNS_URI) instanceof DdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDdlPackage.eNS_URI) : QDdlPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseDMLPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();
		theDdlPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseDMLPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();
		theDdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseDMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseDMLPackage.eNS_URI, theDatabaseDMLPackage);
		return theDatabaseDMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQuerySelect() {
		return extendedQuerySelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQueryExpressionBody() {
		return extendedQueryExpressionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedQueryExpressionBody_OptimizeRecordsNumber() {
		return (EAttribute)extendedQueryExpressionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseDMLFactory getDatabaseDMLFactory() {
		return (QDatabaseDMLFactory)getEFactoryInstance();
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
		extendedQuerySelectEClass = createEClass(EXTENDED_QUERY_SELECT);

		extendedQueryExpressionBodyEClass = createEClass(EXTENDED_QUERY_EXPRESSION_BODY);
		createEAttribute(extendedQueryExpressionBodyEClass, EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER);
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
		SQLQueryModelPackage theSQLQueryModelPackage = (SQLQueryModelPackage)EPackage.Registry.INSTANCE.getEPackage(SQLQueryModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedQuerySelectEClass.getESuperTypes().add(this.getExtendedQueryExpressionBody());
		extendedQuerySelectEClass.getESuperTypes().add(theSQLQueryModelPackage.getQuerySelect());
		extendedQueryExpressionBodyEClass.getESuperTypes().add(theSQLQueryModelPackage.getQueryExpressionBody());

		// Initialize classes and features; add operations and parameters
		initEClass(extendedQuerySelectEClass, QExtendedQuerySelect.class, "ExtendedQuerySelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendedQueryExpressionBodyEClass, QExtendedQueryExpressionBody.class, "ExtendedQueryExpressionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedQueryExpressionBody_OptimizeRecordsNumber(), theEcorePackage.getEInt(), "optimizeRecordsNumber", null, 0, 1, QExtendedQueryExpressionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DatabaseDMLPackageImpl
