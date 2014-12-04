/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.impl;

import org.asup.os.core.ContentLockType;
import org.asup.os.core.LockType;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QContentLock;
import org.asup.os.core.QObjectContent;
import org.asup.os.core.QOperatingSystemCoreFactory;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.QSystem;
import org.asup.os.core.Scope;
import org.asup.os.core.SystemStatus;
import org.asup.os.omac.QObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */

public class OperatingSystemCoreFactoryImpl extends EFactoryImpl implements QOperatingSystemCoreFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemCoreFactory init() {
		try {
			QOperatingSystemCoreFactory theOperatingSystemCoreFactory = (QOperatingSystemCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemCorePackage.eNS_URI);
			if (theOperatingSystemCoreFactory != null) {
				return theOperatingSystemCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemCorePackage.CONTENT_LOCK: return (EObject)createContentLock();
			case QOperatingSystemCorePackage.OBJECT_CONTENT: return (EObject)createObjectContent();
			case QOperatingSystemCorePackage.SYSTEM: return (EObject)createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemCorePackage.CONTENT_LOCK_TYPE:
				return createContentLockTypeFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.LOCK_TYPE:
				return createLockTypeFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.SYSTEM_STATUS:
				return createSystemStatusFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.OPERATING_SYSTEM_EXCEPTION:
				return createOperatingSystemExceptionFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.OPERATING_SYSTEM_RUNTIME_EXCEPTION:
				return createOperatingSystemRuntimeExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemCorePackage.CONTENT_LOCK_TYPE:
				return convertContentLockTypeToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.LOCK_TYPE:
				return convertLockTypeToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.SYSTEM_STATUS:
				return convertSystemStatusToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.OPERATING_SYSTEM_EXCEPTION:
				return convertOperatingSystemExceptionToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.OPERATING_SYSTEM_RUNTIME_EXCEPTION:
				return convertOperatingSystemRuntimeExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContentLock createContentLock() {
		ContentLockImpl contentLock = new ContentLockImpl();
		return contentLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QObject> QObjectContent<T> createObjectContent() {
		ObjectContentImpl<T> objectContent = new ObjectContentImpl<T>();
		return objectContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSystem createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentLockType createContentLockTypeFromString(EDataType eDataType, String initialValue) {
		ContentLockType result = ContentLockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentLockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockType createLockTypeFromString(EDataType eDataType, String initialValue) {
		LockType result = LockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus createSystemStatusFromString(EDataType eDataType, String initialValue) {
		SystemStatus result = SystemStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemException createOperatingSystemExceptionFromString(EDataType eDataType, String initialValue) {
		return (OperatingSystemException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingSystemExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemRuntimeException createOperatingSystemRuntimeExceptionFromString(EDataType eDataType, String initialValue) {
		return (OperatingSystemRuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingSystemRuntimeExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemCorePackage getOperatingSystemCorePackage() {
		return (QOperatingSystemCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemCorePackage getPackage() {
		return QOperatingSystemCorePackage.eINSTANCE;
	}

} //OSCoreFactoryImpl
