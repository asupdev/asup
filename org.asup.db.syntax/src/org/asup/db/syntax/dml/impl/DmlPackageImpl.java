/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dml.impl;

import org.asup.db.core.QDatabaseCorePackage;

import org.asup.db.syntax.QDatabaseSyntaxPackage;

import org.asup.db.syntax.dml.QDmlFactory;
import org.asup.db.syntax.dml.QDmlPackage;
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
public class DmlPackageImpl extends EPackageImpl implements QDmlPackage {
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
	 * @see org.asup.db.syntax.dml.QDmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmlPackageImpl() {
		super(eNS_URI, QDmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDmlPackage init() {
		if (isInited) return (QDmlPackage)EPackage.Registry.INSTANCE.getEPackage(QDmlPackage.eNS_URI);

		// Obtain or create and register package
		DmlPackageImpl theDmlPackage = (DmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);

		// Create package meta-data objects
		theDmlPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theDmlPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDmlPackage.eNS_URI, theDmlPackage);
		return theDmlPackage;
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
	public QDmlFactory getDmlFactory() {
		return (QDmlFactory)getEFactoryInstance();
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

} //DmlPackageImpl
