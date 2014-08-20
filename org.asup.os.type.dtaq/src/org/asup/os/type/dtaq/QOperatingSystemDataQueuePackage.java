/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaq;

import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.asup.os.type.dtaq.QOperatingSystemDataQueueFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemDataQueuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtaq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/dtaq";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-dtaq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemDataQueuePackage eINSTANCE = org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaq.impl.DataQueueImpl <em>Data Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaq.impl.DataQueueImpl
	 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueue()
	 * @generated
	 */
	int DATA_QUEUE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__CONTENT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Queue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__DATA_QUEUE_TYPE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__KEY_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Entry Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__MAX_ENTRY_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sender Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE__SENDER_INFO = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaq.impl.DataQueueEntryImpl <em>Data Queue Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaq.impl.DataQueueEntryImpl
	 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueEntry()
	 * @generated
	 */
	int DATA_QUEUE_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY__KEY = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY__VALUE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Queue Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_ENTRY_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaq.impl.DataQueueManagerImpl <em>Data Queue Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaq.impl.DataQueueManagerImpl
	 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueManager()
	 * @generated
	 */
	int DATA_QUEUE_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Data Queue Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaq.DataQueueType <em>Data Queue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaq.DataQueueType
	 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueType()
	 * @generated
	 */
	int DATA_QUEUE_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaq.DataQueueSearchType
	 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueSearchType()
	 * @generated
	 */
	int DATA_QUEUE_SEARCH_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link org.asup.os.type.dtaq.QDataQueue <em>Data Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Queue</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueue
	 * @generated
	 */
	EClass getDataQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueue#getDataQueueType <em>Data Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Queue Type</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueue#getDataQueueType()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_DataQueueType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueue#getKeyLength <em>Key Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Length</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueue#getKeyLength()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_KeyLength();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueue#getMaxEntryLength <em>Max Entry Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Entry Length</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueue#getMaxEntryLength()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_MaxEntryLength();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueue#isSenderInfo <em>Sender Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender Info</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueue#isSenderInfo()
	 * @see #getDataQueue()
	 * @generated
	 */
	EAttribute getDataQueue_SenderInfo();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.dtaq.QDataQueueEntry <em>Data Queue Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Queue Entry</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueueEntry
	 * @generated
	 */
	EClass getDataQueueEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueueEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueueEntry#getKey()
	 * @see #getDataQueueEntry()
	 * @generated
	 */
	EAttribute getDataQueueEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaq.QDataQueueEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueueEntry#getValue()
	 * @see #getDataQueueEntry()
	 * @generated
	 */
	EAttribute getDataQueueEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.dtaq.QDataQueueManager <em>Data Queue Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Queue Manager</em>'.
	 * @see org.asup.os.type.dtaq.QDataQueueManager
	 * @generated
	 */
	EClass getDataQueueManager();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.dtaq.DataQueueType <em>Data Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Queue Type</em>'.
	 * @see org.asup.os.type.dtaq.DataQueueType
	 * @generated
	 */
	EEnum getDataQueueType();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Queue Search Type</em>'.
	 * @see org.asup.os.type.dtaq.DataQueueSearchType
	 * @generated
	 */
	EEnum getDataQueueSearchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemDataQueueFactory getOperatingSystemDataQueueFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.dtaq.impl.DataQueueImpl <em>Data Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaq.impl.DataQueueImpl
		 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueue()
		 * @generated
		 */
		EClass DATA_QUEUE = eINSTANCE.getDataQueue();

		/**
		 * The meta object literal for the '<em><b>Data Queue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__DATA_QUEUE_TYPE = eINSTANCE.getDataQueue_DataQueueType();

		/**
		 * The meta object literal for the '<em><b>Key Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__KEY_LENGTH = eINSTANCE.getDataQueue_KeyLength();

		/**
		 * The meta object literal for the '<em><b>Max Entry Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__MAX_ENTRY_LENGTH = eINSTANCE.getDataQueue_MaxEntryLength();

		/**
		 * The meta object literal for the '<em><b>Sender Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE__SENDER_INFO = eINSTANCE.getDataQueue_SenderInfo();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaq.impl.DataQueueEntryImpl <em>Data Queue Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaq.impl.DataQueueEntryImpl
		 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueEntry()
		 * @generated
		 */
		EClass DATA_QUEUE_ENTRY = eINSTANCE.getDataQueueEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE_ENTRY__KEY = eINSTANCE.getDataQueueEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE_ENTRY__VALUE = eINSTANCE.getDataQueueEntry_Value();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaq.impl.DataQueueManagerImpl <em>Data Queue Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaq.impl.DataQueueManagerImpl
		 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueManager()
		 * @generated
		 */
		EClass DATA_QUEUE_MANAGER = eINSTANCE.getDataQueueManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaq.DataQueueType <em>Data Queue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaq.DataQueueType
		 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueType()
		 * @generated
		 */
		EEnum DATA_QUEUE_TYPE = eINSTANCE.getDataQueueType();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaq.DataQueueSearchType <em>Data Queue Search Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaq.DataQueueSearchType
		 * @see org.asup.os.type.dtaq.impl.OperatingSystemDataQueuePackageImpl#getDataQueueSearchType()
		 * @generated
		 */
		EEnum DATA_QUEUE_SEARCH_TYPE = eINSTANCE.getDataQueueSearchType();

	}

} //OSDataQueueCorePackage
