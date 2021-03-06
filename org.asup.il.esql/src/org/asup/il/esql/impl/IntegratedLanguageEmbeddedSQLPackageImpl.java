/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql.impl;

import org.asup.fw.core.QFrameworkCorePackage;

import org.asup.fw.java.QFrameworkJavaPackage;

import org.asup.il.core.QIntegratedLanguageCorePackage;

import org.asup.il.data.QIntegratedLanguageDataPackage;

import org.asup.il.esql.CursorType;
import org.asup.il.esql.FetchPositioning;
import org.asup.il.esql.QCommunicationArea;
import org.asup.il.esql.QCursor;
import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QDescriptorArea;
import org.asup.il.esql.QESqlFactory;
import org.asup.il.esql.QESqlManager;
import org.asup.il.esql.QESqlObject;
import org.asup.il.esql.QESqlTerm;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.asup.il.esql.QStatement;
import org.asup.il.esql.QStatementTerm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageEmbeddedSQLPackageImpl extends EPackageImpl implements QIntegratedLanguageEmbeddedSQLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlTermEClass = null;

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
	private EClass statementTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSqlFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cursorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchPositioningEEnum = null;

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
	 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageEmbeddedSQLPackageImpl() {
		super(eNS_URI, QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageEmbeddedSQLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageEmbeddedSQLPackage init() {
		if (isInited) return (QIntegratedLanguageEmbeddedSQLPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageEmbeddedSQLPackageImpl theIntegratedLanguageEmbeddedSQLPackage = (IntegratedLanguageEmbeddedSQLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageEmbeddedSQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageEmbeddedSQLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageEmbeddedSQLPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageEmbeddedSQLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageEmbeddedSQLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI, theIntegratedLanguageEmbeddedSQLPackage);
		return theIntegratedLanguageEmbeddedSQLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationArea() {
		return communicationAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursor() {
		return cursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursorTerm() {
		return cursorTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_CursorType() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_Hold() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_Sql() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorTerm_StatementName() {
		return (EAttribute)cursorTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorArea() {
		return descriptorAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlObject() {
		return eSqlObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlTerm() {
		return eSqlTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESqlTerm_Name() {
		return (EAttribute)eSqlTermEClass.getEStructuralFeatures().get(0);
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
	public EClass getStatementTerm() {
		return statementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlManager() {
		return eSqlManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESqlFactory() {
		return eSqlFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCursorType() {
		return cursorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchPositioning() {
		return fetchPositioningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageEmbeddedSQLFactory getIntegratedLanguageEmbeddedSQLFactory() {
		return (QIntegratedLanguageEmbeddedSQLFactory)getEFactoryInstance();
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
		communicationAreaEClass = createEClass(COMMUNICATION_AREA);

		cursorEClass = createEClass(CURSOR);

		cursorTermEClass = createEClass(CURSOR_TERM);
		createEAttribute(cursorTermEClass, CURSOR_TERM__CURSOR_TYPE);
		createEAttribute(cursorTermEClass, CURSOR_TERM__HOLD);
		createEAttribute(cursorTermEClass, CURSOR_TERM__SQL);
		createEAttribute(cursorTermEClass, CURSOR_TERM__STATEMENT_NAME);

		descriptorAreaEClass = createEClass(DESCRIPTOR_AREA);

		eSqlObjectEClass = createEClass(ESQL_OBJECT);

		eSqlTermEClass = createEClass(ESQL_TERM);
		createEAttribute(eSqlTermEClass, ESQL_TERM__NAME);

		statementEClass = createEClass(STATEMENT);

		statementTermEClass = createEClass(STATEMENT_TERM);

		eSqlManagerEClass = createEClass(ESQL_MANAGER);

		eSqlFactoryEClass = createEClass(ESQL_FACTORY);

		// Create enums
		cursorTypeEEnum = createEEnum(CURSOR_TYPE);
		fetchPositioningEEnum = createEEnum(FETCH_POSITIONING);
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
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationAreaEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());
		cursorEClass.getESuperTypes().add(this.getESqlObject());
		cursorTermEClass.getESuperTypes().add(this.getESqlTerm());
		descriptorAreaEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());
		eSqlTermEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getTerm());
		statementEClass.getESuperTypes().add(this.getESqlObject());
		statementTermEClass.getESuperTypes().add(this.getESqlTerm());
		eSqlManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationAreaEClass, QCommunicationArea.class, "CommunicationArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cursorEClass, QCursor.class, "Cursor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(cursorEClass, null, "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "openUsingDescriptor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getString(), "descriptorName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cursorEClass, null, "openUsingVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getString(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cursorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cursorTermEClass, QCursorTerm.class, "CursorTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCursorTerm_CursorType(), this.getCursorType(), "cursorType", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_Hold(), ecorePackage.getEBoolean(), "hold", null, 1, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_Sql(), ecorePackage.getEString(), "sql", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursorTerm_StatementName(), ecorePackage.getEString(), "statementName", null, 0, 1, QCursorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorAreaEClass, QDescriptorArea.class, "DescriptorArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSqlObjectEClass, QESqlObject.class, "ESqlObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eSqlObjectEClass, this.getCommunicationArea(), "getCommunicationArea", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eSqlTermEClass, QESqlTerm.class, "ESqlTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESqlTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QESqlTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, QStatement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statementEClass, null, "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getString(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(statementEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementTermEClass, QStatementTerm.class, "StatementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSqlManagerEClass, QESqlManager.class, "ESqlManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eSqlManagerEClass, this.getESqlFactory(), "createFactory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eSqlFactoryEClass, QESqlFactory.class, "ESqlFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eSqlFactoryEClass, this.getCursor(), "createCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCursorTerm(), "cursorTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getCursorTerm(), "createCursorTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatementTerm(), "statementTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eSqlFactoryEClass, this.getStatementTerm(), "createStatementTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cursorTypeEEnum, CursorType.class, "CursorType");
		addEEnumLiteral(cursorTypeEEnum, CursorType.NOT_SCROLLABLE);
		addEEnumLiteral(cursorTypeEEnum, CursorType.SCROLLABLE);
		addEEnumLiteral(cursorTypeEEnum, CursorType.DYNAMIC_SCROLL);

		initEEnum(fetchPositioningEEnum, FetchPositioning.class, "FetchPositioning");
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.NEXT);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.PRIOR);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.FIRST);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.LAST);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.BEFORE);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.AFTER);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.CURRENT);
		addEEnumLiteral(fetchPositioningEEnum, FetchPositioning.RELATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageEmbeddedSQLPackageImpl
