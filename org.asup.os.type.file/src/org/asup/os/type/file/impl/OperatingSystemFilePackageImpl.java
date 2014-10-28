/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.db.core.QDatabaseCorePackage;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.file.FileType;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QDisplayFormatDef;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMemberManager;
import org.asup.os.type.file.QFileMemberRow;
import org.asup.os.type.file.QFileMembered;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QOperatingSystemFileFactory;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPhysicalFile;
import org.asup.os.type.file.QPrinterFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemFilePackageImpl extends EPackageImpl implements QOperatingSystemFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFormatDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileTypeEEnum = null;

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
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemFilePackageImpl() {
		super(eNS_URI, QOperatingSystemFileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemFilePackage init() {
		if (isInited) return (QOperatingSystemFilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemFilePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemFilePackageImpl theOperatingSystemFilePackage = (OperatingSystemFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemFilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemFilePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemFilePackage.eNS_URI, theOperatingSystemFilePackage);
		return theOperatingSystemFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayFile() {
		return displayFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayFile_DisplayFormats() {
		return (EReference)displayFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_RecordLength() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_WaitFile() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_WaitRecord() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileManager() {
		return fileManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileMember() {
		return fileMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileMember_File() {
		return (EReference)fileMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMember_Name() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileMember_Rows() {
		return (EReference)fileMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMember_Text() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMember_Type() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileMemberManager() {
		return fileMemberManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileMemberRow() {
		return fileMemberRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMemberRow_Sequence() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMemberRow_Date() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMemberRow_Content() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileMemberRow_FileMember() {
		return (EReference)fileMemberRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileMembered() {
		return fileMemberedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalFile() {
		return logicalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalFile_Index() {
		return (EReference)logicalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalFile_View() {
		return (EReference)logicalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFile() {
		return physicalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalFile_FileType() {
		return (EAttribute)physicalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFile_Table() {
		return (EReference)physicalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalFile_TableFormat() {
		return (EAttribute)physicalFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinterFile() {
		return printerFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayFormatDef() {
		return displayFormatDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalFile() {
		return externalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFile_Name() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFile_Format() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFile_LinkedClass() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileType() {
		return fileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemFileFactory getOperatingSystemFileFactory() {
		return (QOperatingSystemFileFactory)getEFactoryInstance();
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
		displayFileEClass = createEClass(DISPLAY_FILE);
		createEReference(displayFileEClass, DISPLAY_FILE__DISPLAY_FORMATS);

		displayFormatDefEClass = createEClass(DISPLAY_FORMAT_DEF);

		externalFileEClass = createEClass(EXTERNAL_FILE);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__NAME);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__FORMAT);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__LINKED_CLASS);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__RECORD_LENGTH);
		createEAttribute(fileEClass, FILE__WAIT_FILE);
		createEAttribute(fileEClass, FILE__WAIT_RECORD);

		fileManagerEClass = createEClass(FILE_MANAGER);

		fileMemberEClass = createEClass(FILE_MEMBER);
		createEReference(fileMemberEClass, FILE_MEMBER__FILE);
		createEAttribute(fileMemberEClass, FILE_MEMBER__NAME);
		createEReference(fileMemberEClass, FILE_MEMBER__ROWS);
		createEAttribute(fileMemberEClass, FILE_MEMBER__TEXT);
		createEAttribute(fileMemberEClass, FILE_MEMBER__TYPE);

		fileMemberManagerEClass = createEClass(FILE_MEMBER_MANAGER);

		fileMemberRowEClass = createEClass(FILE_MEMBER_ROW);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__SEQUENCE);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__DATE);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__CONTENT);
		createEReference(fileMemberRowEClass, FILE_MEMBER_ROW__FILE_MEMBER);

		fileMemberedEClass = createEClass(FILE_MEMBERED);

		logicalFileEClass = createEClass(LOGICAL_FILE);
		createEReference(logicalFileEClass, LOGICAL_FILE__INDEX);
		createEReference(logicalFileEClass, LOGICAL_FILE__VIEW);

		physicalFileEClass = createEClass(PHYSICAL_FILE);
		createEAttribute(physicalFileEClass, PHYSICAL_FILE__FILE_TYPE);
		createEReference(physicalFileEClass, PHYSICAL_FILE__TABLE);
		createEAttribute(physicalFileEClass, PHYSICAL_FILE__TABLE_FORMAT);

		printerFileEClass = createEClass(PRINTER_FILE);

		// Create enums
		fileTypeEEnum = createEEnum(FILE_TYPE);
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
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		displayFileEClass.getESuperTypes().add(this.getFile());
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataPackage.getUnaryCompoundDataDef());
		EGenericType g2 = createEGenericType(theIntegratedLanguageDataPackage.getStruct());
		g1.getETypeArguments().add(g2);
		displayFormatDefEClass.getEGenericSuperTypes().add(g1);
		externalFileEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getFacet());
		fileEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		g2 = createEGenericType(this.getFile());
		g1.getETypeArguments().add(g2);
		fileManagerEClass.getEGenericSuperTypes().add(g1);
		fileMemberEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		fileMemberManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		logicalFileEClass.getESuperTypes().add(this.getFile());
		logicalFileEClass.getESuperTypes().add(this.getFileMembered());
		physicalFileEClass.getESuperTypes().add(this.getFile());
		physicalFileEClass.getESuperTypes().add(this.getFileMembered());
		printerFileEClass.getESuperTypes().add(this.getFile());

		// Initialize classes and features; add operations and parameters
		initEClass(displayFileEClass, QDisplayFile.class, "DisplayFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayFile_DisplayFormats(), this.getDisplayFormatDef(), null, "displayFormats", null, 0, -1, QDisplayFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayFormatDefEClass, QDisplayFormatDef.class, "DisplayFormatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalFileEClass, QExternalFile.class, "ExternalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFile_Format(), ecorePackage.getEString(), "format", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getExternalFile_LinkedClass(), g1, "linkedClass", null, 0, 1, QExternalFile.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, QFile.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_RecordLength(), ecorePackage.getEInt(), "recordLength", null, 0, 1, QFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_WaitFile(), ecorePackage.getEInt(), "waitFile", null, 0, 1, QFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_WaitRecord(), ecorePackage.getEInt(), "waitRecord", null, 0, 1, QFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileManagerEClass, QFileManager.class, "FileManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(fileManagerEClass, theDatabaseCorePackage.getConnection(), "getDatabaseConnection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theOperatingSystemCorePackage.getOperatingSystemRuntimeException());

		op = addEOperation(fileManagerEClass, this.getFile(), "getOverridedDatabaseFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theOperatingSystemCorePackage.getOperatingSystemRuntimeException());

		op = addEOperation(fileManagerEClass, null, "overrideDatabaseFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileFrom", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "fileTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theOperatingSystemCorePackage.getOperatingSystemRuntimeException());

		initEClass(fileMemberEClass, QFileMember.class, "FileMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileMember_File(), this.getFileMembered(), null, "file", null, 1, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileMember_Rows(), this.getFileMemberRow(), this.getFileMemberRow_FileMember(), "rows", null, 0, -1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Text(), ecorePackage.getEString(), "text", null, 0, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMemberManagerEClass, QFileMemberManager.class, "FileMemberManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "ContextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "ContextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileMemberRowEClass, QFileMemberRow.class, "FileMemberRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileMemberRow_Sequence(), ecorePackage.getEInt(), "sequence", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMemberRow_Date(), ecorePackage.getEInt(), "date", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMemberRow_Content(), ecorePackage.getEString(), "content", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileMemberRow_FileMember(), this.getFileMember(), this.getFileMember_Rows(), "fileMember", null, 1, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMemberedEClass, QFileMembered.class, "FileMembered", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fileMemberedEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logicalFileEClass, QLogicalFile.class, "LogicalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalFile_Index(), theDatabaseCorePackage.getIndex(), null, "index", null, 1, 1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalFile_View(), theDatabaseCorePackage.getView(), null, "view", null, 1, 1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalFileEClass, QPhysicalFile.class, "PhysicalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalFile_FileType(), this.getFileType(), "fileType", null, 1, 1, QPhysicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFile_Table(), theDatabaseCorePackage.getTable(), null, "table", null, 1, 1, QPhysicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalFile_TableFormat(), ecorePackage.getEString(), "tableFormat", null, 0, 1, QPhysicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerFileEClass, QPrinterFile.class, "PrinterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(fileTypeEEnum, FileType.class, "FileType");
		addEEnumLiteral(fileTypeEEnum, FileType.SOURCE);
		addEEnumLiteral(fileTypeEEnum, FileType.DATA);

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
		  (getFile_RecordLength(), 
		   source, 
		   new String[] {
			 "precision", "5"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//DecimalDef")
		   });	
		addAnnotation
		  (getFile_WaitFile(), 
		   source, 
		   new String[] {
			 "precision", "3"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//DecimalDef")
		   });
	}

} //OSFileCorePackageImpl
