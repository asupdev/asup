/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.splf.impl;

import org.asup.il.data.QIntegratedLanguageDataPackage;

import org.asup.os.omac.QOperatingSystemOmacPackage;

import org.asup.os.splf.QOperatingSystemSpoolfileFactory;
import org.asup.os.splf.QOperatingSystemSpoolfilePackage;
import org.asup.os.splf.QSpoolFile;
import org.asup.os.splf.QSpoolFileRow;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemSpoolfilePackageImpl extends EPackageImpl implements QOperatingSystemSpoolfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileRowEClass = null;

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
	 * @see org.asup.os.splf.QOperatingSystemSpoolfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemSpoolfilePackageImpl() {
		super(eNS_URI, QOperatingSystemSpoolfileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemSpoolfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemSpoolfilePackage init() {
		if (isInited) return (QOperatingSystemSpoolfilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemSpoolfilePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemSpoolfilePackageImpl theOperatingSystemSpoolfilePackage = (OperatingSystemSpoolfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemSpoolfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemSpoolfilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QOperatingSystemOmacPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemSpoolfilePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemSpoolfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemSpoolfilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemSpoolfilePackage.eNS_URI, theOperatingSystemSpoolfilePackage);
		return theOperatingSystemSpoolfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFile() {
		return spoolFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_FileName() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_JobName() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_JobNumber() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_JobUser() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_SpoolID() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_UserData() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpoolFile_Rows() {
		return (EReference)spoolFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFileRow() {
		return spoolFileRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpoolFileRow_SpoolFile() {
		return (EReference)spoolFileRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFileRow_Content() {
		return (EAttribute)spoolFileRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemSpoolfileFactory getOperatingSystemSpoolfileFactory() {
		return (QOperatingSystemSpoolfileFactory)getEFactoryInstance();
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
		spoolFileEClass = createEClass(SPOOL_FILE);
		createEAttribute(spoolFileEClass, SPOOL_FILE__FILE_NAME);
		createEAttribute(spoolFileEClass, SPOOL_FILE__JOB_NAME);
		createEAttribute(spoolFileEClass, SPOOL_FILE__JOB_NUMBER);
		createEAttribute(spoolFileEClass, SPOOL_FILE__JOB_USER);
		createEAttribute(spoolFileEClass, SPOOL_FILE__SPOOL_ID);
		createEAttribute(spoolFileEClass, SPOOL_FILE__USER_DATA);
		createEReference(spoolFileEClass, SPOOL_FILE__ROWS);

		spoolFileRowEClass = createEClass(SPOOL_FILE_ROW);
		createEReference(spoolFileRowEClass, SPOOL_FILE_ROW__SPOOL_FILE);
		createEAttribute(spoolFileRowEClass, SPOOL_FILE_ROW__CONTENT);
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
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spoolFileEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObjectNameable());
		spoolFileRowEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(spoolFileEClass, QSpoolFile.class, "SpoolFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpoolFile_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_JobName(), ecorePackage.getEString(), "jobName", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_JobNumber(), ecorePackage.getEInt(), "jobNumber", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_JobUser(), ecorePackage.getEString(), "jobUser", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_SpoolID(), ecorePackage.getEString(), "spoolID", null, 1, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_UserData(), ecorePackage.getEString(), "userData", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpoolFile_Rows(), this.getSpoolFileRow(), this.getSpoolFileRow_SpoolFile(), "rows", null, 0, -1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spoolFileRowEClass, QSpoolFileRow.class, "SpoolFileRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpoolFileRow_SpoolFile(), this.getSpoolFile(), this.getSpoolFile_Rows(), "spoolFile", null, 1, 1, QSpoolFileRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFileRow_Content(), ecorePackage.getEString(), "content", null, 1, 1, QSpoolFileRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (getSpoolFile_JobName(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getSpoolFile_JobNumber(), 
		   source, 
		   new String[] {
			 "precision", "6"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//DecimalDef")
		   });	
		addAnnotation
		  (getSpoolFile_JobUser(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getSpoolFile_SpoolID(), 
		   source, 
		   new String[] {
			 "length", "13"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getSpoolFile_UserData(), 
		   source, 
		   new String[] {
			 "length", "48"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });
	}

} //OperatingSystemSpoolfilePackageImpl
