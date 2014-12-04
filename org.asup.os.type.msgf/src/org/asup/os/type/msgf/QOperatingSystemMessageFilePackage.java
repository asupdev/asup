/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf;

import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.type.msgf.QOperatingSystemMessageFileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemMessageFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msgf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/msgf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-msgf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemMessageFilePackage eINSTANCE = org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.msgf.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.impl.MessageDescriptionImpl
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescription()
	 * @generated
	 */
	int MESSAGE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__NAME = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__SEVERITY = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_HELP = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_TEXT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl <em>Message Description Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescriptionDataField()
	 * @generated
	 */
	int MESSAGE_DESCRIPTION_DATA_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Data Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Description Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_DATA_FIELD_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Message Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.MessageException
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageException()
	 * @generated
	 */
	int MESSAGE_EXCEPTION = 5;

	/**
	 * The meta object id for the '{@link org.asup.os.type.msgf.impl.MessageFileImpl <em>Message File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.impl.MessageFileImpl
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFile()
	 * @generated
	 */
	int MESSAGE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__MESSAGES = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.msgf.impl.MessageFileManagerImpl <em>Message File Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.impl.MessageFileManagerImpl
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFileManager()
	 * @generated
	 */
	int MESSAGE_FILE_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Message File Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Message Variable List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageVariableList()
	 * @generated
	 */
	int MESSAGE_VARIABLE_LIST = 4;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.msgf.QMessageDescription <em>Message Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Description</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription
	 * @generated
	 */
	EClass getMessageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.msgf.QMessageDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription#getName()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.msgf.QMessageDescription#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription#getSeverity()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.msgf.QMessageDescription#getMessageHelp <em>Message Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Help</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription#getMessageHelp()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.msgf.QMessageDescription#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Text</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription#getMessageText()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.msgf.QMessageDescription#getMessageDataFields <em>Message Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Data Fields</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescription#getMessageDataFields()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EReference getMessageDescription_MessageDataFields();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.msgf.QMessageDescriptionDataField <em>Message Description Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Description Data Field</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescriptionDataField
	 * @generated
	 */
	EClass getMessageDescriptionDataField();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getDataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Def</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescriptionDataField#getDataDef()
	 * @see #getMessageDescriptionDataField()
	 * @generated
	 */
	EReference getMessageDescriptionDataField_DataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getOutputMask <em>Output Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Mask</em>'.
	 * @see org.asup.os.type.msgf.QMessageDescriptionDataField#getOutputMask()
	 * @see #getMessageDescriptionDataField()
	 * @generated
	 */
	EAttribute getMessageDescriptionDataField_OutputMask();

	/**
	 * Returns the meta object for data type '{@link org.asup.os.type.msgf.MessageException <em>Message Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Exception</em>'.
	 * @see org.asup.os.type.msgf.MessageException
	 * @model instanceClass="org.asup.os.type.msgf.MessageException"
	 * @generated
	 */
	EDataType getMessageException();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.msgf.QMessageFile <em>Message File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message File</em>'.
	 * @see org.asup.os.type.msgf.QMessageFile
	 * @generated
	 */
	EClass getMessageFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.msgf.QMessageFile#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.asup.os.type.msgf.QMessageFile#getMessages()
	 * @see #getMessageFile()
	 * @generated
	 */
	EReference getMessageFile_Messages();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.msgf.QMessageFileManager <em>Message File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message File Manager</em>'.
	 * @see org.asup.os.type.msgf.QMessageFileManager
	 * @generated
	 */
	EClass getMessageFileManager();

	/**
	 * Returns the meta object for data type '<em>Message Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Variable List</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getMessageVariableList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemMessageFileFactory getOperatingSystemMessageFileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.os.type.msgf.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.impl.MessageDescriptionImpl
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescription()
		 * @generated
		 */
		EClass MESSAGE_DESCRIPTION = eINSTANCE.getMessageDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__NAME = eINSTANCE.getMessageDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__SEVERITY = eINSTANCE.getMessageDescription_Severity();

		/**
		 * The meta object literal for the '<em><b>Message Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_HELP = eINSTANCE.getMessageDescription_MessageHelp();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_TEXT = eINSTANCE.getMessageDescription_MessageText();

		/**
		 * The meta object literal for the '<em><b>Message Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = eINSTANCE.getMessageDescription_MessageDataFields();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl <em>Message Description Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescriptionDataField()
		 * @generated
		 */
		EClass MESSAGE_DESCRIPTION_DATA_FIELD = eINSTANCE.getMessageDescriptionDataField();

		/**
		 * The meta object literal for the '<em><b>Data Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF = eINSTANCE.getMessageDescriptionDataField_DataDef();

		/**
		 * The meta object literal for the '<em><b>Output Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK = eINSTANCE.getMessageDescriptionDataField_OutputMask();

		/**
		 * The meta object literal for the '<em>Message Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.MessageException
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageException()
		 * @generated
		 */
		EDataType MESSAGE_EXCEPTION = eINSTANCE.getMessageException();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.msgf.impl.MessageFileImpl <em>Message File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.impl.MessageFileImpl
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFile()
		 * @generated
		 */
		EClass MESSAGE_FILE = eINSTANCE.getMessageFile();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FILE__MESSAGES = eINSTANCE.getMessageFile_Messages();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.msgf.impl.MessageFileManagerImpl <em>Message File Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.impl.MessageFileManagerImpl
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFileManager()
		 * @generated
		 */
		EClass MESSAGE_FILE_MANAGER = eINSTANCE.getMessageFileManager();

		/**
		 * The meta object literal for the '<em>Message Variable List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageVariableList()
		 * @generated
		 */
		EDataType MESSAGE_VARIABLE_LIST = eINSTANCE.getMessageVariableList();

	}

} //QOperatingSystemMessageFilePackage
