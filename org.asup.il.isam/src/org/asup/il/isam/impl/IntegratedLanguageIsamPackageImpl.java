/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.isam.OperationRead;
import org.asup.il.isam.OperationSet;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.asup.il.isam.QKeyList;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QTableDataSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageIsamPackageImpl extends EPackageImpl implements QIntegratedLanguageIsamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyListTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isamManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isamFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationReadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyValueEDataType = null;

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
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageIsamPackageImpl() {
		super(eNS_URI, QIntegratedLanguageIsamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageIsamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageIsamPackage init() {
		if (isInited) return (QIntegratedLanguageIsamPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageIsamPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageIsamPackageImpl theIntegratedLanguageIsamPackage = (IntegratedLanguageIsamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageIsamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageIsamPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageIsamPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageIsamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageIsamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageIsamPackage.eNS_URI, theIntegratedLanguageIsamPackage);
		return theIntegratedLanguageIsamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSet() {
		return dataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetTerm() {
		return dataSetTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetTerm_AccessMode() {
		return (EAttribute)dataSetTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetTerm_FileName() {
		return (EAttribute)dataSetTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetTerm_FormatName() {
		return (EAttribute)dataSetTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetTerm_KeyedAccess() {
		return (EAttribute)dataSetTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetTerm_Record() {
		return (EReference)dataSetTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetTerm_UserOpen() {
		return (EAttribute)dataSetTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyList() {
		return keyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyListTerm() {
		return keyListTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyListTerm_Name() {
		return (EAttribute)keyListTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyListTerm_KeyFields() {
		return (EAttribute)keyListTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexDataSet() {
		return indexDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsamManager() {
		return isamManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsamFactory() {
		return isamFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableDataSet() {
		return tableDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessMode() {
		return accessModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationSet() {
		return operationSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationRead() {
		return operationReadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeyValue() {
		return keyValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageIsamFactory getIntegratedLanguageIsamFactory() {
		return (QIntegratedLanguageIsamFactory)getEFactoryInstance();
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
		dataSetEClass = createEClass(DATA_SET);

		dataSetTermEClass = createEClass(DATA_SET_TERM);
		createEAttribute(dataSetTermEClass, DATA_SET_TERM__ACCESS_MODE);
		createEAttribute(dataSetTermEClass, DATA_SET_TERM__FILE_NAME);
		createEAttribute(dataSetTermEClass, DATA_SET_TERM__FORMAT_NAME);
		createEAttribute(dataSetTermEClass, DATA_SET_TERM__KEYED_ACCESS);
		createEReference(dataSetTermEClass, DATA_SET_TERM__RECORD);
		createEAttribute(dataSetTermEClass, DATA_SET_TERM__USER_OPEN);

		keyListEClass = createEClass(KEY_LIST);

		keyListTermEClass = createEClass(KEY_LIST_TERM);
		createEAttribute(keyListTermEClass, KEY_LIST_TERM__NAME);
		createEAttribute(keyListTermEClass, KEY_LIST_TERM__KEY_FIELDS);

		indexDataSetEClass = createEClass(INDEX_DATA_SET);

		isamManagerEClass = createEClass(ISAM_MANAGER);

		isamFactoryEClass = createEClass(ISAM_FACTORY);

		tableDataSetEClass = createEClass(TABLE_DATA_SET);

		// Create enums
		accessModeEEnum = createEEnum(ACCESS_MODE);
		operationSetEEnum = createEEnum(OPERATION_SET);
		operationReadEEnum = createEEnum(OPERATION_READ);

		// Create data types
		keyValueEDataType = createEDataType(KEY_VALUE);
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
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter dataSetEClass_DS = addETypeParameter(dataSetEClass, "DS");
		ETypeParameter indexDataSetEClass_DS = addETypeParameter(indexDataSetEClass, "DS");
		ETypeParameter tableDataSetEClass_DS = addETypeParameter(tableDataSetEClass, "DS");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataStruct());
		dataSetEClass_DS.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataStruct());
		indexDataSetEClass_DS.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataStruct());
		tableDataSetEClass_DS.getEBounds().add(g1);

		// Add supertypes to classes
		dataSetTermEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getTerm());
		keyListTermEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getTerm());
		g1 = createEGenericType(this.getDataSet());
		EGenericType g2 = createEGenericType(indexDataSetEClass_DS);
		g1.getETypeArguments().add(g2);
		indexDataSetEClass.getEGenericSuperTypes().add(g1);
		isamManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		g1 = createEGenericType(this.getDataSet());
		g2 = createEGenericType(tableDataSetEClass_DS);
		g1.getETypeArguments().add(g2);
		tableDataSetEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(dataSetEClass, QDataSet.class, "DataSet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataSetEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "isEndOfData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "isFound", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "read", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getIndicator(), "endOfRecord", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "readp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, ecorePackage.getEBoolean(), "readp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataPackage.getIndicator(), "endOfRecord", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(dataSetEClass_DS);
		initEOperation(op, g1);

		initEClass(dataSetTermEClass, QDataSetTerm.class, "DataSetTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSetTerm_AccessMode(), this.getAccessMode(), "accessMode", "I", 1, 1, QDataSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSetTerm_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, QDataSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSetTerm_FormatName(), ecorePackage.getEString(), "formatName", null, 0, 1, QDataSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSetTerm_KeyedAccess(), ecorePackage.getEBoolean(), "keyedAccess", null, 1, 1, QDataSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSetTerm_Record(), theIntegratedLanguageDataPackage.getDataStructDef(), null, "record", null, 0, 1, QDataSetTerm.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSetTerm_UserOpen(), ecorePackage.getEBoolean(), "userOpen", null, 1, 1, QDataSetTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyListEClass, QKeyList.class, "KeyList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyListTermEClass, QKeyListTerm.class, "KeyListTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyListTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QKeyListTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyListTerm_KeyFields(), ecorePackage.getEString(), "keyFields", null, 1, -1, QKeyListTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexDataSetEClass, QIndexDataSet.class, "IndexDataSet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(indexDataSetEClass, ecorePackage.getEBoolean(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKeyValue(), "keyList", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, ecorePackage.getEBoolean(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "keyField", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, ecorePackage.getEBoolean(), "reade", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKeyValue(), "keyList", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "reade", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, ecorePackage.getEBoolean(), "readpe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKeyValue(), "keyList", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "readpe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKeyValue(), "keyList", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setll", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setgt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKeyValue(), "keyList", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setgt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indexDataSetEClass, null, "setgt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isamManagerEClass, QIsamManager.class, "IsamManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(isamManagerEClass, this.getIsamFactory(), "createFactory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isamFactoryEClass, QIsamFactory.class, "IsamFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(isamFactoryEClass, null, "createDataSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSetTerm(), "dataSetTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataSet());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(isamFactoryEClass, this.getDataSetTerm(), "createDataSetTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableDataSetEClass, QTableDataSet.class, "TableDataSet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tableDataSetEClass, ecorePackage.getEBoolean(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "relativeRecordNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableDataSetEClass, null, "setgt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "relativeRecordNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tableDataSetEClass, null, "setll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "relativeRecordNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModeEEnum, AccessMode.class, "AccessMode");
		addEEnumLiteral(accessModeEEnum, AccessMode.INPUT);
		addEEnumLiteral(accessModeEEnum, AccessMode.OUTPUT);
		addEEnumLiteral(accessModeEEnum, AccessMode.UPDATE);

		initEEnum(operationSetEEnum, OperationSet.class, "OperationSet");
		addEEnumLiteral(operationSetEEnum, OperationSet.CHAIN);
		addEEnumLiteral(operationSetEEnum, OperationSet.SET_LOWER_LIMIT);
		addEEnumLiteral(operationSetEEnum, OperationSet.SET_GREATER_THAN);

		initEEnum(operationReadEEnum, OperationRead.class, "OperationRead");
		addEEnumLiteral(operationReadEEnum, OperationRead.CHAIN);
		addEEnumLiteral(operationReadEEnum, OperationRead.READ);
		addEEnumLiteral(operationReadEEnum, OperationRead.READ_EQUAL);
		addEEnumLiteral(operationReadEEnum, OperationRead.READ_PRIOR);
		addEEnumLiteral(operationReadEEnum, OperationRead.READ_PRIOR_EQUAL);

		// Initialize data types
		initEDataType(keyValueEDataType, Object[].class, "KeyValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageISAMPackageImpl
