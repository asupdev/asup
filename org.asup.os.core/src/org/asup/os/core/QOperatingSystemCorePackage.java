/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.asup.os.core.QOperatingSystemCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemCorePackage eINSTANCE = org.asup.os.core.impl.OperatingSystemCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.core.QCallable <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QCallable
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 0;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.QContainer <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QContainer
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.os.core.QContentLockable <em>Content Lockable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QContentLockable
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLockable()
	 * @generated
	 */
	int CONTENT_LOCKABLE = 2;

	/**
	 * The number of structural features of the '<em>Content Lockable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LOCKABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.impl.ContentLockImpl <em>Content Lock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.impl.ContentLockImpl
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLock()
	 * @generated
	 */
	int CONTENT_LOCK = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LOCK__TYPE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Lock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LOCK_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.core.QContentLocker <em>Content Locker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QContentLocker
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLocker()
	 * @generated
	 */
	int CONTENT_LOCKER = 4;

	/**
	 * The number of structural features of the '<em>Content Locker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LOCKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.QLockable <em>Lockable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QLockable
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLockable()
	 * @generated
	 */
	int LOCKABLE = 5;

	/**
	 * The number of structural features of the '<em>Lockable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.QLocker <em>Locker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.QLocker
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLocker()
	 * @generated
	 */
	int LOCKER = 6;

	/**
	 * The number of structural features of the '<em>Locker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.impl.ObjectContentImpl <em>Object Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.impl.ObjectContentImpl
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getObjectContent()
	 * @generated
	 */
	int OBJECT_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTENT__ENTRIES = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTENT__READ_LOCK = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Write Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTENT__WRITE_LOCK = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTENT_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.core.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.impl.SystemImpl
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CREATION_INFO = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Install Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INSTALL_PATH = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LAST_JOB_NUMBER = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_LIBRARY = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_USER = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.asup.os.core.impl.SystemManagerImpl <em>System Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.impl.SystemManagerImpl
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystemManager()
	 * @generated
	 */
	int SYSTEM_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MANAGER__CONFIG = LOCKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MANAGER_FEATURE_COUNT = LOCKABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.core.ContentLockType <em>Content Lock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.ContentLockType
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLockType()
	 * @generated
	 */
	int CONTENT_LOCK_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.asup.os.core.LockType <em>Lock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.LockType
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLockType()
	 * @generated
	 */
	int LOCK_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.asup.os.core.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.Scope
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 12;

	/**
	 * The meta object id for the '{@link org.asup.os.core.SystemStatus <em>System Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.SystemStatus
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 13;

	/**
	 * The meta object id for the '<em>Operating System Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.OperatingSystemException
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getOperatingSystemException()
	 * @generated
	 */
	int OPERATING_SYSTEM_EXCEPTION = 14;

	/**
	 * The meta object id for the '<em>Operating System Runtime Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.OperatingSystemRuntimeException
	 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getOperatingSystemRuntimeException()
	 * @generated
	 */
	int OPERATING_SYSTEM_RUNTIME_EXCEPTION = 15;


	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.asup.os.core.QCallable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.asup.os.core.QContainer
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.QContainer#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.asup.os.core.QContainer#getContent()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Content();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QContentLockable <em>Content Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Lockable</em>'.
	 * @see org.asup.os.core.QContentLockable
	 * @generated
	 */
	EClass getContentLockable();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QContentLock <em>Content Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Lock</em>'.
	 * @see org.asup.os.core.QContentLock
	 * @generated
	 */
	EClass getContentLock();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QContentLock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.core.QContentLock#getType()
	 * @see #getContentLock()
	 * @generated
	 */
	EAttribute getContentLock_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QContentLocker <em>Content Locker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Locker</em>'.
	 * @see org.asup.os.core.QContentLocker
	 * @generated
	 */
	EClass getContentLocker();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QLockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lockable</em>'.
	 * @see org.asup.os.core.QLockable
	 * @generated
	 */
	EClass getLockable();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QLocker <em>Locker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locker</em>'.
	 * @see org.asup.os.core.QLocker
	 * @generated
	 */
	EClass getLocker();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QObjectContent <em>Object Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Content</em>'.
	 * @see org.asup.os.core.QObjectContent
	 * @generated
	 */
	EClass getObjectContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.core.QObjectContent#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.asup.os.core.QObjectContent#getEntries()
	 * @see #getObjectContent()
	 * @generated
	 */
	EReference getObjectContent_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.QObjectContent#getReadLock <em>Read Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Lock</em>'.
	 * @see org.asup.os.core.QObjectContent#getReadLock()
	 * @see #getObjectContent()
	 * @generated
	 */
	EReference getObjectContent_ReadLock();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.QObjectContent#getWriteLock <em>Write Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Lock</em>'.
	 * @see org.asup.os.core.QObjectContent#getWriteLock()
	 * @see #getObjectContent()
	 * @generated
	 */
	EReference getObjectContent_WriteLock();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.asup.os.core.QSystem
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.QSystem#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.asup.os.core.QSystem#getCreationInfo()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_CreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getInstallPath <em>Install Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Path</em>'.
	 * @see org.asup.os.core.QSystem#getInstallPath()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_InstallPath();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getLastJobNumber <em>Last Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Job Number</em>'.
	 * @see org.asup.os.core.QSystem#getLastJobNumber()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_LastJobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.core.QSystem#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.asup.os.core.QSystem#getStatus()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getSystemLibrary <em>System Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Library</em>'.
	 * @see org.asup.os.core.QSystem#getSystemLibrary()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.QSystem#getSystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System User</em>'.
	 * @see org.asup.os.core.QSystem#getSystemUser()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemUser();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.QSystemManager <em>System Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Manager</em>'.
	 * @see org.asup.os.core.QSystemManager
	 * @generated
	 */
	EClass getSystemManager();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.ContentLockType <em>Content Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Lock Type</em>'.
	 * @see org.asup.os.core.ContentLockType
	 * @generated
	 */
	EEnum getContentLockType();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.LockType <em>Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Type</em>'.
	 * @see org.asup.os.core.LockType
	 * @generated
	 */
	EEnum getLockType();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.asup.os.core.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Status</em>'.
	 * @see org.asup.os.core.SystemStatus
	 * @generated
	 */
	EEnum getSystemStatus();

	/**
	 * Returns the meta object for data type '{@link org.asup.os.core.OperatingSystemException <em>Operating System Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operating System Exception</em>'.
	 * @see org.asup.os.core.OperatingSystemException
	 * @model instanceClass="org.asup.os.core.OperatingSystemException"
	 * @generated
	 */
	EDataType getOperatingSystemException();

	/**
	 * Returns the meta object for data type '{@link org.asup.os.core.OperatingSystemRuntimeException <em>Operating System Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operating System Runtime Exception</em>'.
	 * @see org.asup.os.core.OperatingSystemRuntimeException
	 * @model instanceClass="org.asup.os.core.OperatingSystemRuntimeException"
	 * @generated
	 */
	EDataType getOperatingSystemRuntimeException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemCoreFactory getOperatingSystemCoreFactory();

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
		 * The meta object literal for the '{@link org.asup.os.core.QCallable <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QCallable
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.QContainer <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QContainer
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENT = eINSTANCE.getContainer_Content();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.QContentLockable <em>Content Lockable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QContentLockable
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLockable()
		 * @generated
		 */
		EClass CONTENT_LOCKABLE = eINSTANCE.getContentLockable();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.impl.ContentLockImpl <em>Content Lock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.impl.ContentLockImpl
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLock()
		 * @generated
		 */
		EClass CONTENT_LOCK = eINSTANCE.getContentLock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_LOCK__TYPE = eINSTANCE.getContentLock_Type();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.QContentLocker <em>Content Locker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QContentLocker
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLocker()
		 * @generated
		 */
		EClass CONTENT_LOCKER = eINSTANCE.getContentLocker();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.QLockable <em>Lockable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QLockable
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLockable()
		 * @generated
		 */
		EClass LOCKABLE = eINSTANCE.getLockable();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.QLocker <em>Locker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.QLocker
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLocker()
		 * @generated
		 */
		EClass LOCKER = eINSTANCE.getLocker();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.impl.ObjectContentImpl <em>Object Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.impl.ObjectContentImpl
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getObjectContent()
		 * @generated
		 */
		EClass OBJECT_CONTENT = eINSTANCE.getObjectContent();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTENT__ENTRIES = eINSTANCE.getObjectContent_Entries();

		/**
		 * The meta object literal for the '<em><b>Read Lock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTENT__READ_LOCK = eINSTANCE.getObjectContent_ReadLock();

		/**
		 * The meta object literal for the '<em><b>Write Lock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTENT__WRITE_LOCK = eINSTANCE.getObjectContent_WriteLock();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.impl.SystemImpl
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CREATION_INFO = eINSTANCE.getSystem_CreationInfo();

		/**
		 * The meta object literal for the '<em><b>Install Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__INSTALL_PATH = eINSTANCE.getSystem_InstallPath();

		/**
		 * The meta object literal for the '<em><b>Last Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__LAST_JOB_NUMBER = eINSTANCE.getSystem_LastJobNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__STATUS = eINSTANCE.getSystem_Status();

		/**
		 * The meta object literal for the '<em><b>System Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_LIBRARY = eINSTANCE.getSystem_SystemLibrary();

		/**
		 * The meta object literal for the '<em><b>System User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_USER = eINSTANCE.getSystem_SystemUser();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.impl.SystemManagerImpl <em>System Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.impl.SystemManagerImpl
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystemManager()
		 * @generated
		 */
		EClass SYSTEM_MANAGER = eINSTANCE.getSystemManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.ContentLockType <em>Content Lock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.ContentLockType
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getContentLockType()
		 * @generated
		 */
		EEnum CONTENT_LOCK_TYPE = eINSTANCE.getContentLockType();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.LockType <em>Lock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.LockType
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getLockType()
		 * @generated
		 */
		EEnum LOCK_TYPE = eINSTANCE.getLockType();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.Scope
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.SystemStatus <em>System Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.SystemStatus
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getSystemStatus()
		 * @generated
		 */
		EEnum SYSTEM_STATUS = eINSTANCE.getSystemStatus();

		/**
		 * The meta object literal for the '<em>Operating System Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.OperatingSystemException
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getOperatingSystemException()
		 * @generated
		 */
		EDataType OPERATING_SYSTEM_EXCEPTION = eINSTANCE.getOperatingSystemException();

		/**
		 * The meta object literal for the '<em>Operating System Runtime Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.OperatingSystemRuntimeException
		 * @see org.asup.os.core.impl.OperatingSystemCorePackageImpl#getOperatingSystemRuntimeException()
		 * @generated
		 */
		EDataType OPERATING_SYSTEM_RUNTIME_EXCEPTION = eINSTANCE.getOperatingSystemRuntimeException();

	}

} //OSCorePackage
