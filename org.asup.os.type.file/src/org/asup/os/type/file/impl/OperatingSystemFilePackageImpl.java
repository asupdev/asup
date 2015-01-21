/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QDatabaseFileField;
import org.asup.os.type.file.QDatabaseFileFormat;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QDisplayFileField;
import org.asup.os.type.file.QDisplayFileFormat;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileFormat;
import org.asup.os.type.file.QFileFormatField;
import org.asup.os.type.file.QFileFormatKey;
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
import org.asup.os.type.file.QPrinterFileField;
import org.asup.os.type.file.QPrinterFileFormat;
import org.asup.os.type.file.QSourceFile;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class OperatingSystemFilePackageImpl extends EPackageImpl implements QOperatingSystemFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileFormatEClass = null;

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
	private EClass displayFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileFormatEClass = null;

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
	private EClass fileFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatKeyEClass = null;

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
	private EClass printerFileFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFileEClass = null;

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
	public EClass getDatabaseFile() {
		return databaseFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseFile_DatabaseFormat() {
		return (EReference)databaseFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseFileField() {
		return databaseFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseFileFormat() {
		return databaseFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseFileFormat_Fields() {
		return (EReference)databaseFileFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseFileFormat_Keys() {
		return (EReference)databaseFileFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseFileFormat_Unique() {
		return (EAttribute)databaseFileFormatEClass.getEStructuralFeatures().get(2);
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
	public EClass getDisplayFileField() {
		return displayFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayFileFormat() {
		return displayFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayFileFormat_Fields() {
		return (EReference)displayFileFormatEClass.getEStructuralFeatures().get(0);
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
	public EClass getFileFormat() {
		return fileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileFormat_Name() {
		return (EAttribute)fileFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileFormatField() {
		return fileFormatFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileFormatKey() {
		return fileFormatKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileFormatKey_Name() {
		return (EAttribute)fileFormatKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileFormatKey_Descend() {
		return (EAttribute)fileFormatKeyEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getLogicalFile_CreationStatement() {
		return (EAttribute)logicalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalFile_Tables() {
		return (EAttribute)logicalFileEClass.getEStructuralFeatures().get(1);
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
	public EClass getPrinterFile() {
		return printerFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrinterFile_PrinterFormats() {
		return (EReference)printerFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinterFileFormat() {
		return printerFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrinterFileFormat_Fields() {
		return (EReference)printerFileFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinterFileField() {
		return printerFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		return sourceFileEClass;
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
		databaseFileEClass = createEClass(DATABASE_FILE);
		createEReference(databaseFileEClass, DATABASE_FILE__DATABASE_FORMAT);

		databaseFileFieldEClass = createEClass(DATABASE_FILE_FIELD);

		databaseFileFormatEClass = createEClass(DATABASE_FILE_FORMAT);
		createEReference(databaseFileFormatEClass, DATABASE_FILE_FORMAT__FIELDS);
		createEReference(databaseFileFormatEClass, DATABASE_FILE_FORMAT__KEYS);
		createEAttribute(databaseFileFormatEClass, DATABASE_FILE_FORMAT__UNIQUE);

		displayFileEClass = createEClass(DISPLAY_FILE);
		createEReference(displayFileEClass, DISPLAY_FILE__DISPLAY_FORMATS);

		displayFileFieldEClass = createEClass(DISPLAY_FILE_FIELD);

		displayFileFormatEClass = createEClass(DISPLAY_FILE_FORMAT);
		createEReference(displayFileFormatEClass, DISPLAY_FILE_FORMAT__FIELDS);

		externalFileEClass = createEClass(EXTERNAL_FILE);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__NAME);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__FORMAT);

		fileEClass = createEClass(FILE);

		fileFormatEClass = createEClass(FILE_FORMAT);
		createEAttribute(fileFormatEClass, FILE_FORMAT__NAME);

		fileFormatFieldEClass = createEClass(FILE_FORMAT_FIELD);

		fileFormatKeyEClass = createEClass(FILE_FORMAT_KEY);
		createEAttribute(fileFormatKeyEClass, FILE_FORMAT_KEY__NAME);
		createEAttribute(fileFormatKeyEClass, FILE_FORMAT_KEY__DESCEND);

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
		createEAttribute(logicalFileEClass, LOGICAL_FILE__CREATION_STATEMENT);
		createEAttribute(logicalFileEClass, LOGICAL_FILE__TABLES);

		physicalFileEClass = createEClass(PHYSICAL_FILE);

		printerFileEClass = createEClass(PRINTER_FILE);
		createEReference(printerFileEClass, PRINTER_FILE__PRINTER_FORMATS);

		printerFileFormatEClass = createEClass(PRINTER_FILE_FORMAT);
		createEReference(printerFileFormatEClass, PRINTER_FILE_FORMAT__FIELDS);

		printerFileFieldEClass = createEClass(PRINTER_FILE_FIELD);

		sourceFileEClass = createEClass(SOURCE_FILE);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter fileFormatEClass_F = addETypeParameter(fileFormatEClass, "F");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getFileFormatField());
		fileFormatEClass_F.getEBounds().add(g1);

		// Add supertypes to classes
		databaseFileEClass.getESuperTypes().add(this.getFile());
		databaseFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		g1 = createEGenericType(this.getFileFormat());
		EGenericType g2 = createEGenericType(this.getDatabaseFileField());
		g1.getETypeArguments().add(g2);
		databaseFileFormatEClass.getEGenericSuperTypes().add(g1);
		displayFileEClass.getESuperTypes().add(this.getFile());
		displayFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType(this.getDisplayFileField());
		g1.getETypeArguments().add(g2);
		displayFileFormatEClass.getEGenericSuperTypes().add(g1);
		externalFileEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getFacet());
		fileEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		fileEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNamedNode());
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getUnaryAtomicDataTerm());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getUnaryAtomicBufferedDataDef());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		fileFormatFieldEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		g2 = createEGenericType(this.getFile());
		g1.getETypeArguments().add(g2);
		fileManagerEClass.getEGenericSuperTypes().add(g1);
		fileMemberEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		fileMemberManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		logicalFileEClass.getESuperTypes().add(this.getDatabaseFile());
		physicalFileEClass.getESuperTypes().add(this.getDatabaseFile());
		printerFileEClass.getESuperTypes().add(this.getFile());
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType(this.getPrinterFileField());
		g1.getETypeArguments().add(g2);
		printerFileFormatEClass.getEGenericSuperTypes().add(g1);
		printerFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		sourceFileEClass.getESuperTypes().add(this.getFile());
		sourceFileEClass.getESuperTypes().add(this.getFileMembered());

		// Initialize classes and features; add operations and parameters
		initEClass(databaseFileEClass, QDatabaseFile.class, "DatabaseFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseFile_DatabaseFormat(), this.getDatabaseFileFormat(), null, "databaseFormat", null, 0, 1, QDatabaseFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseFileFieldEClass, QDatabaseFileField.class, "DatabaseFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseFileFormatEClass, QDatabaseFileFormat.class, "DatabaseFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseFileFormat_Fields(), this.getDatabaseFileField(), null, "fields", null, 0, -1, QDatabaseFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseFileFormat_Keys(), this.getFileFormatKey(), null, "keys", null, 0, -1, QDatabaseFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseFileFormat_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, QDatabaseFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayFileEClass, QDisplayFile.class, "DisplayFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayFile_DisplayFormats(), this.getDisplayFileFormat(), null, "displayFormats", null, 0, -1, QDisplayFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayFileFieldEClass, QDisplayFileField.class, "DisplayFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayFileFormatEClass, QDisplayFileFormat.class, "DisplayFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayFileFormat_Fields(), this.getDisplayFileField(), null, "fields", null, 0, -1, QDisplayFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalFileEClass, QExternalFile.class, "ExternalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFile_Format(), ecorePackage.getEString(), "format", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, QFile.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fileEClass, theFrameworkJavaPackage.getJavaURI(), "getClassURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fileEClass, theFrameworkJavaPackage.getJavaURI(), "getPackageInfoURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileFormatEClass, QFileFormat.class, "FileFormat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileFormat_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(fileFormatEClass, null, "getFields", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(fileFormatEClass_F);
		initEOperation(op, g1);

		addEOperation(fileFormatEClass, ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileFormatFieldEClass, QFileFormatField.class, "FileFormatField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileFormatKeyEClass, QFileFormatKey.class, "FileFormatKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileFormatKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileFormatKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileFormatKey_Descend(), ecorePackage.getEBoolean(), "descend", null, 0, 1, QFileFormatKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileManagerEClass, QFileManager.class, "FileManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileManagerEClass, this.getFile(), "getOverriddenFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theOperatingSystemCorePackage.getOperatingSystemRuntimeException());

		op = addEOperation(fileManagerEClass, null, "overrideFile", 1, 1, IS_UNIQUE, IS_ORDERED);
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
		initEAttribute(getLogicalFile_CreationStatement(), ecorePackage.getEString(), "creationStatement", null, 0, 1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalFile_Tables(), ecorePackage.getEString(), "tables", null, 1, -1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalFileEClass, QPhysicalFile.class, "PhysicalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printerFileEClass, QPrinterFile.class, "PrinterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrinterFile_PrinterFormats(), this.getPrinterFileFormat(), null, "printerFormats", null, 0, -1, QPrinterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerFileFormatEClass, QPrinterFileFormat.class, "PrinterFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrinterFileFormat_Fields(), this.getPrinterFileField(), null, "fields", null, 0, -1, QPrinterFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerFileFieldEClass, QPrinterFileField.class, "PrinterFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFileEClass, QSourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OSFileCorePackageImpl
