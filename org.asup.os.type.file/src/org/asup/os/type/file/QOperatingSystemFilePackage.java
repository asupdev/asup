/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	int FILE = 1;

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
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

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
	 * The feature id for the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__RECORD_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__WAIT_FILE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__WAIT_RECORD = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DisplayFileImpl <em>Display File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DisplayFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFile()
	 * @generated
	 */
	int DISPLAY_FILE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__ATTRIBUTE = FILE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__RECORD_LENGTH = FILE__RECORD_LENGTH;

	/**
	 * The feature id for the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__WAIT_FILE = FILE__WAIT_FILE;

	/**
	 * The feature id for the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__WAIT_RECORD = FILE__WAIT_RECORD;

	/**
	 * The feature id for the '<em><b>Display Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__DISPLAY_FORMATS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileManagerImpl <em>File Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileManagerImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileManager()
	 * @generated
	 */
	int FILE_MANAGER = 2;

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
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberImpl <em>File Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMember()
	 * @generated
	 */
	int FILE_MEMBER = 3;

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
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberManagerImpl <em>File Member Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberManagerImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberManager()
	 * @generated
	 */
	int FILE_MEMBER_MANAGER = 4;

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
	 * The meta object id for the '{@link org.asup.os.type.file.impl.FileMemberRowImpl <em>File Member Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.FileMemberRowImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMemberRow()
	 * @generated
	 */
	int FILE_MEMBER_ROW = 5;

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
	 * The meta object id for the '{@link org.asup.os.type.file.QFileMembered <em>File Membered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.QFileMembered
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileMembered()
	 * @generated
	 */
	int FILE_MEMBERED = 6;

	/**
	 * The number of structural features of the '<em>File Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBERED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.LogicalFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
	 * @generated
	 */
	int LOGICAL_FILE = 7;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__ATTRIBUTE = FILE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__RECORD_LENGTH = FILE__RECORD_LENGTH;

	/**
	 * The feature id for the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__WAIT_FILE = FILE__WAIT_FILE;

	/**
	 * The feature id for the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__WAIT_RECORD = FILE__WAIT_RECORD;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__INDEX = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__VIEW = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PhysicalFileImpl <em>Physical File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PhysicalFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPhysicalFile()
	 * @generated
	 */
	int PHYSICAL_FILE = 8;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__ATTRIBUTE = FILE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__RECORD_LENGTH = FILE__RECORD_LENGTH;

	/**
	 * The feature id for the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__WAIT_FILE = FILE__WAIT_FILE;

	/**
	 * The feature id for the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__WAIT_RECORD = FILE__WAIT_RECORD;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__FILE_TYPE = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__TABLE = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__TABLE_FORMAT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.PrinterFileImpl <em>Printer File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.PrinterFileImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getPrinterFile()
	 * @generated
	 */
	int PRINTER_FILE = 9;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__ATTRIBUTE = FILE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__MEMORY_INFO = FILE__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__RECORD_LENGTH = FILE__RECORD_LENGTH;

	/**
	 * The feature id for the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__WAIT_FILE = FILE__WAIT_FILE;

	/**
	 * The feature id for the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__WAIT_RECORD = FILE__WAIT_RECORD;

	/**
	 * The number of structural features of the '<em>Printer File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.impl.DisplayFormatDefImpl <em>Display Format Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.impl.DisplayFormatDefImpl
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFormatDef()
	 * @generated
	 */
	int DISPLAY_FORMAT_DEF = 10;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FORMAT_DEF__CLASS_DELEGATOR = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FORMAT_DEF__ELEMENTS = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FORMAT_DEF__PREFIX = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FORMAT_DEF__QUALIFIED = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The number of structural features of the '<em>Display Format Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FORMAT_DEF_FEATURE_COUNT = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.file.FileType <em>File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.file.FileType
	 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 11;


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
	 * Returns the meta object for class '{@link org.asup.os.type.file.QFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.asup.os.type.file.QFile
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFile#getRecordLength <em>Record Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Length</em>'.
	 * @see org.asup.os.type.file.QFile#getRecordLength()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_RecordLength();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFile#getWaitFile <em>Wait File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait File</em>'.
	 * @see org.asup.os.type.file.QFile#getWaitFile()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_WaitFile();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QFile#getWaitRecord <em>Wait Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait Record</em>'.
	 * @see org.asup.os.type.file.QFile#getWaitRecord()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_WaitRecord();

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
	 * Returns the meta object for class '{@link org.asup.os.type.file.QLogicalFile <em>Logical File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical File</em>'.
	 * @see org.asup.os.type.file.QLogicalFile
	 * @generated
	 */
	EClass getLogicalFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.file.QLogicalFile#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.asup.os.type.file.QLogicalFile#getIndex()
	 * @see #getLogicalFile()
	 * @generated
	 */
	EReference getLogicalFile_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.file.QLogicalFile#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see org.asup.os.type.file.QLogicalFile#getView()
	 * @see #getLogicalFile()
	 * @generated
	 */
	EReference getLogicalFile_View();

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
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QPhysicalFile#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.asup.os.type.file.QPhysicalFile#getFileType()
	 * @see #getPhysicalFile()
	 * @generated
	 */
	EAttribute getPhysicalFile_FileType();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.file.QPhysicalFile#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.asup.os.type.file.QPhysicalFile#getTable()
	 * @see #getPhysicalFile()
	 * @generated
	 */
	EReference getPhysicalFile_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.file.QPhysicalFile#getTableFormat <em>Table Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Format</em>'.
	 * @see org.asup.os.type.file.QPhysicalFile#getTableFormat()
	 * @see #getPhysicalFile()
	 * @generated
	 */
	EAttribute getPhysicalFile_TableFormat();

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
	 * Returns the meta object for class '{@link org.asup.os.type.file.QDisplayFormatDef <em>Display Format Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Format Def</em>'.
	 * @see org.asup.os.type.file.QDisplayFormatDef
	 * @generated
	 */
	EClass getDisplayFormatDef();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.file.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Type</em>'.
	 * @see org.asup.os.type.file.FileType
	 * @generated
	 */
	EEnum getFileType();

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
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.FileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Record Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__RECORD_LENGTH = eINSTANCE.getFile_RecordLength();

		/**
		 * The meta object literal for the '<em><b>Wait File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__WAIT_FILE = eINSTANCE.getFile_WaitFile();

		/**
		 * The meta object literal for the '<em><b>Wait Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__WAIT_RECORD = eINSTANCE.getFile_WaitRecord();

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
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.LogicalFileImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
		 * @generated
		 */
		EClass LOGICAL_FILE = eINSTANCE.getLogicalFile();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FILE__INDEX = eINSTANCE.getLogicalFile_Index();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FILE__VIEW = eINSTANCE.getLogicalFile_View();

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
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_FILE__FILE_TYPE = eINSTANCE.getPhysicalFile_FileType();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FILE__TABLE = eINSTANCE.getPhysicalFile_Table();

		/**
		 * The meta object literal for the '<em><b>Table Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_FILE__TABLE_FORMAT = eINSTANCE.getPhysicalFile_TableFormat();

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
		 * The meta object literal for the '{@link org.asup.os.type.file.impl.DisplayFormatDefImpl <em>Display Format Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.impl.DisplayFormatDefImpl
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getDisplayFormatDef()
		 * @generated
		 */
		EClass DISPLAY_FORMAT_DEF = eINSTANCE.getDisplayFormatDef();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.file.FileType <em>File Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.file.FileType
		 * @see org.asup.os.type.file.impl.OperatingSystemFilePackageImpl#getFileType()
		 * @generated
		 */
		EEnum FILE_TYPE = eINSTANCE.getFileType();

	}

} //OSFileCorePackage
