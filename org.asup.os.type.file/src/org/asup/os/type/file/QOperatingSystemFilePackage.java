/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.type.file.QOperatingSystemFileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/file";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemFilePackage eINSTANCE = org.asup.os.type.file.impl.OperatingSystemFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DICTIONARY = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileSingleFormatImpl <em>File Single Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileSingleFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileSingleFormat()
	 * @generated
	 */
	int FILE_SINGLE_FORMAT = 17;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__FACETS = FILE__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT__DICTIONARY = FILE__DICTIONARY;

	/**
	 * The number of structural features of the '<em>File Single Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SINGLE_FORMAT_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DatabaseFileImpl <em>Database File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DatabaseFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFile()
	 * @generated
	 */
	int DATABASE_FILE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__APPLICATION = FILE_SINGLE_FORMAT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__LIBRARY = FILE_SINGLE_FORMAT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__NAME = FILE_SINGLE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__TEXT = FILE_SINGLE_FORMAT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__CREATION_INFO = FILE_SINGLE_FORMAT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__MEMORY_INFO = FILE_SINGLE_FORMAT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__FACETS = FILE_SINGLE_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__DICTIONARY = FILE_SINGLE_FORMAT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__DATABASE_FORMAT = FILE_SINGLE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FEATURE_COUNT = FILE_SINGLE_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMultiFormatImpl <em>File Multi Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMultiFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMultiFormat()
	 * @generated
	 */
	int FILE_MULTI_FORMAT = 16;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DisplayFileImpl <em>Display File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DisplayFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFile()
	 * @generated
	 */
	int DISPLAY_FILE = 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileFormatImpl <em>File Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormat()
	 * @generated
	 */
	int FILE_FORMAT = 8;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DisplayFileFormatImpl <em>Display File Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DisplayFileFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormat()
	 * @generated
	 */
	int DISPLAY_FILE_FORMAT = 5;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileManagerImpl <em>File Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileManagerImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileManager()
	 * @generated
	 */
	int FILE_MANAGER = 11;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberImpl <em>File Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMember()
	 * @generated
	 */
	int FILE_MEMBER = 12;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberManagerImpl <em>File Member Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberManagerImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberManager()
	 * @generated
	 */
	int FILE_MEMBER_MANAGER = 13;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberRowImpl <em>File Member Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberRowImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberRow()
	 * @generated
	 */
	int FILE_MEMBER_ROW = 14;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.QFileMembered <em>File Membered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.QFileMembered
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMembered()
	 * @generated
	 */
	int FILE_MEMBERED = 15;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.LogicalFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
	 * @generated
	 */
	int LOGICAL_FILE = 18;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PhysicalFileImpl <em>Physical File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PhysicalFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPhysicalFile()
	 * @generated
	 */
	int PHYSICAL_FILE = 19;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PrinterFileImpl <em>Printer File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PrinterFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFile()
	 * @generated
	 */
	int PRINTER_FILE = 20;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.ExternalFileImpl <em>External File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.ExternalFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getExternalFile()
	 * @generated
	 */
	int EXTERNAL_FILE = 6;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileFormatFieldImpl <em>File Format Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileFormatFieldImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormatField()
	 * @generated
	 */
	int FILE_FORMAT_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__FACETS = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__CONSTANT = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__DEFINITION = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__INITIALIZED = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__LIKE = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__NAME = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__RESTRICTED = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__TEXT = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__DEFAULT = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__MANDATORY = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM__MANDATORY;

	/**
	 * The number of structural features of the '<em>File Format Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD_FEATURE_COUNT = QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DatabaseFileFieldImpl <em>Database File Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DatabaseFileFieldImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileField()
	 * @generated
	 */
	int DATABASE_FILE_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__MANDATORY = FILE_FORMAT_FIELD__MANDATORY;

	/**
	 * The number of structural features of the '<em>Database File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DisplayFileFieldImpl <em>Display File Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DisplayFileFieldImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFileField()
	 * @generated
	 */
	int DISPLAY_FILE_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__NAME = 1;

	/**
	 * The number of structural features of the '<em>File Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl <em>Database File Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DatabaseFileFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormat()
	 * @generated
	 */
	int DATABASE_FILE_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__FIELDS = FILE_FORMAT__FIELDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Format Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__FORMAT_KEYS = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database File Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__FACETS = FILE__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT__DICTIONARY = FILE__DICTIONARY;

	/**
	 * The number of structural features of the '<em>File Multi Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MULTI_FORMAT_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__APPLICATION = FILE_MULTI_FORMAT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__LIBRARY = FILE_MULTI_FORMAT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__NAME = FILE_MULTI_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__TEXT = FILE_MULTI_FORMAT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__CREATION_INFO = FILE_MULTI_FORMAT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__MEMORY_INFO = FILE_MULTI_FORMAT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__FACETS = FILE_MULTI_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__DICTIONARY = FILE_MULTI_FORMAT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Display Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__DISPLAY_FORMATS = FILE_MULTI_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FEATURE_COUNT = FILE_MULTI_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__MANDATORY = FILE_FORMAT_FIELD__MANDATORY;

	/**
	 * The number of structural features of the '<em>Display File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__FIELDS = FILE_FORMAT__FIELDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The number of structural features of the '<em>Display File Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__NAME = QIntegratedLanguageCorePackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__FORMAT = QIntegratedLanguageCorePackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE_FEATURE_COUNT = QIntegratedLanguageCorePackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileFormatKeyImpl <em>File Format Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileFormatKeyImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormatKey()
	 * @generated
	 */
	int FILE_FORMAT_KEY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY__DESCEND = 1;

	/**
	 * The number of structural features of the '<em>File Format Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>File Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__FILE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__NAME = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__ROWS = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__TEXT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__TYPE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>File Member Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__DATE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>File Member</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__FILE_MEMBER = 3;

	/**
	 * The number of structural features of the '<em>File Member Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>File Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBERED_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__APPLICATION = DATABASE_FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__LIBRARY = DATABASE_FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__NAME = DATABASE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__TEXT = DATABASE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__CREATION_INFO = DATABASE_FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__MEMORY_INFO = DATABASE_FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__FACETS = DATABASE_FILE__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__DICTIONARY = DATABASE_FILE__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__DATABASE_FORMAT = DATABASE_FILE__DATABASE_FORMAT;

	/**
	 * The feature id for the '<em><b>Creation Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__CREATION_STATEMENT = DATABASE_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE_FEATURE_COUNT = DATABASE_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__APPLICATION = DATABASE_FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__LIBRARY = DATABASE_FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__NAME = DATABASE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__TEXT = DATABASE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__CREATION_INFO = DATABASE_FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__MEMORY_INFO = DATABASE_FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__FACETS = DATABASE_FILE__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__DICTIONARY = DATABASE_FILE__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__DATABASE_FORMAT = DATABASE_FILE__DATABASE_FORMAT;

	/**
	 * The number of structural features of the '<em>Physical File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE_FEATURE_COUNT = DATABASE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__APPLICATION = FILE_MULTI_FORMAT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__LIBRARY = FILE_MULTI_FORMAT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__NAME = FILE_MULTI_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__TEXT = FILE_MULTI_FORMAT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__CREATION_INFO = FILE_MULTI_FORMAT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__MEMORY_INFO = FILE_MULTI_FORMAT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__FACETS = FILE_MULTI_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__DICTIONARY = FILE_MULTI_FORMAT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Printer Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__PRINTER_FORMATS = FILE_MULTI_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Printer File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FEATURE_COUNT = FILE_MULTI_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PrinterFileFormatImpl <em>Printer File Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PrinterFileFormatImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormat()
	 * @generated
	 */
	int PRINTER_FILE_FORMAT = 21;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__FIELDS = FILE_FORMAT__FIELDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The number of structural features of the '<em>Printer File Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PrinterFileFieldImpl <em>Printer File Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PrinterFileFieldImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFileField()
	 * @generated
	 */
	int PRINTER_FILE_FIELD = 22;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__MANDATORY = FILE_FORMAT_FIELD__MANDATORY;

	/**
	 * The number of structural features of the '<em>Printer File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.SourceFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 23;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__APPLICATION = FILE_SINGLE_FORMAT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__LIBRARY = FILE_SINGLE_FORMAT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__NAME = FILE_SINGLE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__TEXT = FILE_SINGLE_FORMAT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__CREATION_INFO = FILE_SINGLE_FORMAT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__MEMORY_INFO = FILE_SINGLE_FORMAT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__FACETS = FILE_SINGLE_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__DICTIONARY = FILE_SINGLE_FORMAT__DICTIONARY;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = FILE_SINGLE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDatabaseFile <em>Database File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database File</em>'.
	 * @see org.asup.os.type.file.QDatabaseFile
	 * @generated
	 */
	EClass getDatabaseFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.file.QDatabaseFile#getDatabaseFormat <em>Database Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Format</em>'.
	 * @see org.asup.os.type.file.QDatabaseFile#getDatabaseFormat()
	 * @see #getDatabaseFile()
	 * @generated
	 */
	EReference getDatabaseFile_DatabaseFormat();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDatabaseFileField <em>Database File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database File Field</em>'.
	 * @see org.asup.os.type.file.QDatabaseFileField
	 * @generated
	 */
	EClass getDatabaseFileField();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDatabaseFileFormat <em>Database File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database File Format</em>'.
	 * @see org.asup.os.type.file.QDatabaseFileFormat
	 * @generated
	 */
	EClass getDatabaseFileFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.file.QDatabaseFileFormat#getFormatKeys <em>Format Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Format Keys</em>'.
	 * @see org.asup.os.type.file.QDatabaseFileFormat#getFormatKeys()
	 * @see #getDatabaseFileFormat()
	 * @generated
	 */
	EReference getDatabaseFileFormat_FormatKeys();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDisplayFile <em>Display File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display File</em>'.
	 * @see org.asup.os.type.file.QDisplayFile
	 * @generated
	 */
	EClass getDisplayFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.file.QDisplayFile#getDisplayFormats <em>Display Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Formats</em>'.
	 * @see org.asup.os.type.file.QDisplayFile#getDisplayFormats()
	 * @see #getDisplayFile()
	 * @generated
	 */
	EReference getDisplayFile_DisplayFormats();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDisplayFileField <em>Display File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display File Field</em>'.
	 * @see org.asup.os.type.file.QDisplayFileField
	 * @generated
	 */
	EClass getDisplayFileField();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDisplayFileFormat <em>Display File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display File Format</em>'.
	 * @see org.asup.os.type.file.QDisplayFileFormat
	 * @generated
	 */
	EClass getDisplayFileFormat();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.asup.os.type.file.QFile
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFile#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary</em>'.
	 * @see org.asup.os.type.file.QFile#getDictionary()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Dictionary();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Format</em>'.
	 * @see org.asup.os.type.file.QFileFormat
	 * @generated
	 */
	EClass getFileFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.file.QFileFormat#getName()
	 * @see #getFileFormat()
	 * @generated
	 */
	EAttribute getFileFormat_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.file.QFileFormat#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.asup.os.type.file.QFileFormat#getFields()
	 * @see #getFileFormat()
	 * @generated
	 */
	EReference getFileFormat_Fields();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileFormatField <em>File Format Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Format Field</em>'.
	 * @see org.asup.os.type.file.QFileFormatField
	 * @generated
	 */
	EClass getFileFormatField();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileFormatKey <em>File Format Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Format Key</em>'.
	 * @see org.asup.os.type.file.QFileFormatKey
	 * @generated
	 */
	EClass getFileFormatKey();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileFormatKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.file.QFileFormatKey#getName()
	 * @see #getFileFormatKey()
	 * @generated
	 */
	EAttribute getFileFormatKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileFormatKey#isDescend <em>Descend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descend</em>'.
	 * @see org.asup.os.type.file.QFileFormatKey#isDescend()
	 * @see #getFileFormatKey()
	 * @generated
	 */
	EAttribute getFileFormatKey_Descend();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileManager <em>File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Manager</em>'.
	 * @see org.asup.os.type.file.QFileManager
	 * @generated
	 */
	EClass getFileManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileMember <em>File Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Member</em>'.
	 * @see org.asup.os.type.file.QFileMember
	 * @generated
	 */
	EClass getFileMember();

	/**
	 * Returns the meta object for the reference '{@link org.asup.os.type.file.QFileMember#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see org.asup.os.type.file.QFileMember#getFile()
	 * @see #getFileMember()
	 * @generated
	 */
	EReference getFileMember_File();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.file.QFileMember#getName()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.file.QFileMember#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.asup.os.type.file.QFileMember#getRows()
	 * @see #getFileMember()
	 * @generated
	 */
	EReference getFileMember_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMember#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.os.type.file.QFileMember#getText()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.type.file.QFileMember#getType()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileMemberManager <em>File Member Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Member Manager</em>'.
	 * @see org.asup.os.type.file.QFileMemberManager
	 * @generated
	 */
	EClass getFileMemberManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileMemberRow <em>File Member Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Member Row</em>'.
	 * @see org.asup.os.type.file.QFileMemberRow
	 * @generated
	 */
	EClass getFileMemberRow();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMemberRow#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.asup.os.type.file.QFileMemberRow#getSequence()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMemberRow#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.asup.os.type.file.QFileMemberRow#getDate()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFileMemberRow#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.file.QFileMemberRow#getContent()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Content();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.os.type.file.QFileMemberRow#getFileMember <em>File Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>File Member</em>'.
	 * @see org.asup.os.type.file.QFileMemberRow#getFileMember()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EReference getFileMemberRow_FileMember();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileMembered <em>File Membered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Membered</em>'.
	 * @see org.asup.os.type.file.QFileMembered
	 * @generated
	 */
	EClass getFileMembered();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileMultiFormat <em>File Multi Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Multi Format</em>'.
	 * @see org.asup.os.type.file.QFileMultiFormat
	 * @generated
	 */
	EClass getFileMultiFormat();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFileSingleFormat <em>File Single Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Single Format</em>'.
	 * @see org.asup.os.type.file.QFileSingleFormat
	 * @generated
	 */
	EClass getFileSingleFormat();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QLogicalFile <em>Logical File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical File</em>'.
	 * @see org.asup.os.type.file.QLogicalFile
	 * @generated
	 */
	EClass getLogicalFile();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QLogicalFile#getCreationStatement <em>Creation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Statement</em>'.
	 * @see org.asup.os.type.file.QLogicalFile#getCreationStatement()
	 * @see #getLogicalFile()
	 * @generated
	 */
	EAttribute getLogicalFile_CreationStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QPhysicalFile <em>Physical File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical File</em>'.
	 * @see org.asup.os.type.file.QPhysicalFile
	 * @generated
	 */
	EClass getPhysicalFile();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QPrinterFile <em>Printer File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer File</em>'.
	 * @see org.asup.os.type.file.QPrinterFile
	 * @generated
	 */
	EClass getPrinterFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.file.QPrinterFile#getPrinterFormats <em>Printer Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Printer Formats</em>'.
	 * @see org.asup.os.type.file.QPrinterFile#getPrinterFormats()
	 * @see #getPrinterFile()
	 * @generated
	 */
	EReference getPrinterFile_PrinterFormats();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QPrinterFileFormat <em>Printer File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer File Format</em>'.
	 * @see org.asup.os.type.file.QPrinterFileFormat
	 * @generated
	 */
	EClass getPrinterFileFormat();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QPrinterFileField <em>Printer File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer File Field</em>'.
	 * @see org.asup.os.type.file.QPrinterFileField
	 * @generated
	 */
	EClass getPrinterFileField();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QSourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see org.asup.os.type.file.QSourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.file.QExternalFile <em>External File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External File</em>'.
	 * @see org.asup.os.type.file.QExternalFile
	 * @generated
	 */
	EClass getExternalFile();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QExternalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.file.QExternalFile#getName()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QExternalFile#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.asup.os.type.file.QExternalFile#getFormat()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Format();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemFileFactory getOperatingSystemFileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DatabaseFileImpl <em>Database File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DatabaseFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFile()
		 * @generated
		 */
		EClass DATABASE_FILE = eINSTANCE.getDatabaseFile();

		/**
		 * The meta object literal for the '<em><b>Database Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_FILE__DATABASE_FORMAT = eINSTANCE.getDatabaseFile_DatabaseFormat();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DatabaseFileFieldImpl <em>Database File Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DatabaseFileFieldImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileField()
		 * @generated
		 */
		EClass DATABASE_FILE_FIELD = eINSTANCE.getDatabaseFileField();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl <em>Database File Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DatabaseFileFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormat()
		 * @generated
		 */
		EClass DATABASE_FILE_FORMAT = eINSTANCE.getDatabaseFileFormat();

		/**
		 * The meta object literal for the '<em><b>Format Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_FILE_FORMAT__FORMAT_KEYS = eINSTANCE.getDatabaseFileFormat_FormatKeys();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DisplayFileImpl <em>Display File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DisplayFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFile()
		 * @generated
		 */
		EClass DISPLAY_FILE = eINSTANCE.getDisplayFile();

		/**
		 * The meta object literal for the '<em><b>Display Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_FILE__DISPLAY_FORMATS = eINSTANCE.getDisplayFile_DisplayFormats();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DisplayFileFieldImpl <em>Display File Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DisplayFileFieldImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFileField()
		 * @generated
		 */
		EClass DISPLAY_FILE_FIELD = eINSTANCE.getDisplayFileField();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DisplayFileFormatImpl <em>Display File Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DisplayFileFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormat()
		 * @generated
		 */
		EClass DISPLAY_FILE_FORMAT = eINSTANCE.getDisplayFileFormat();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DICTIONARY = eINSTANCE.getFile_Dictionary();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileFormatImpl <em>File Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormat()
		 * @generated
		 */
		EClass FILE_FORMAT = eINSTANCE.getFileFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT__NAME = eINSTANCE.getFileFormat_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_FORMAT__FIELDS = eINSTANCE.getFileFormat_Fields();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileFormatFieldImpl <em>File Format Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileFormatFieldImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormatField()
		 * @generated
		 */
		EClass FILE_FORMAT_FIELD = eINSTANCE.getFileFormatField();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileFormatKeyImpl <em>File Format Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileFormatKeyImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileFormatKey()
		 * @generated
		 */
		EClass FILE_FORMAT_KEY = eINSTANCE.getFileFormatKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT_KEY__NAME = eINSTANCE.getFileFormatKey_Name();

		/**
		 * The meta object literal for the '<em><b>Descend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT_KEY__DESCEND = eINSTANCE.getFileFormatKey_Descend();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileManagerImpl <em>File Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileManagerImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileManager()
		 * @generated
		 */
		EClass FILE_MANAGER = eINSTANCE.getFileManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileMemberImpl <em>File Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileMemberImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMember()
		 * @generated
		 */
		EClass FILE_MEMBER = eINSTANCE.getFileMember();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER__FILE = eINSTANCE.getFileMember_File();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__NAME = eINSTANCE.getFileMember_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER__ROWS = eINSTANCE.getFileMember_Rows();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__TEXT = eINSTANCE.getFileMember_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__TYPE = eINSTANCE.getFileMember_Type();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileMemberManagerImpl <em>File Member Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileMemberManagerImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberManager()
		 * @generated
		 */
		EClass FILE_MEMBER_MANAGER = eINSTANCE.getFileMemberManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileMemberRowImpl <em>File Member Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileMemberRowImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberRow()
		 * @generated
		 */
		EClass FILE_MEMBER_ROW = eINSTANCE.getFileMemberRow();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__SEQUENCE = eINSTANCE.getFileMemberRow_Sequence();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__DATE = eINSTANCE.getFileMemberRow_Date();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__CONTENT = eINSTANCE.getFileMemberRow_Content();

		/**
		 * The meta object literal for the '<em><b>File Member</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER_ROW__FILE_MEMBER = eINSTANCE.getFileMemberRow_FileMember();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.QFileMembered <em>File Membered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.QFileMembered
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMembered()
		 * @generated
		 */
		EClass FILE_MEMBERED = eINSTANCE.getFileMembered();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileMultiFormatImpl <em>File Multi Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileMultiFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMultiFormat()
		 * @generated
		 */
		EClass FILE_MULTI_FORMAT = eINSTANCE.getFileMultiFormat();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileSingleFormatImpl <em>File Single Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileSingleFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileSingleFormat()
		 * @generated
		 */
		EClass FILE_SINGLE_FORMAT = eINSTANCE.getFileSingleFormat();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.LogicalFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
		 * @generated
		 */
		EClass LOGICAL_FILE = eINSTANCE.getLogicalFile();

		/**
		 * The meta object literal for the '<em><b>Creation Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_FILE__CREATION_STATEMENT = eINSTANCE.getLogicalFile_CreationStatement();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.PhysicalFileImpl <em>Physical File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.PhysicalFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPhysicalFile()
		 * @generated
		 */
		EClass PHYSICAL_FILE = eINSTANCE.getPhysicalFile();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.PrinterFileImpl <em>Printer File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.PrinterFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFile()
		 * @generated
		 */
		EClass PRINTER_FILE = eINSTANCE.getPrinterFile();

		/**
		 * The meta object literal for the '<em><b>Printer Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINTER_FILE__PRINTER_FORMATS = eINSTANCE.getPrinterFile_PrinterFormats();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.PrinterFileFormatImpl <em>Printer File Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.PrinterFileFormatImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormat()
		 * @generated
		 */
		EClass PRINTER_FILE_FORMAT = eINSTANCE.getPrinterFileFormat();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.PrinterFileFieldImpl <em>Printer File Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.PrinterFileFieldImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFileField()
		 * @generated
		 */
		EClass PRINTER_FILE_FIELD = eINSTANCE.getPrinterFileField();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.SourceFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.ExternalFileImpl <em>External File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.ExternalFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getExternalFile()
		 * @generated
		 */
		EClass EXTERNAL_FILE = eINSTANCE.getExternalFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__NAME = eINSTANCE.getExternalFile_Name();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__FORMAT = eINSTANCE.getExternalFile_Format();

	}

} //OSFileCorePackage
