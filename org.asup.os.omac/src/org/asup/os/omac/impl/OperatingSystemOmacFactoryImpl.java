/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac.impl;

import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QMemoryInfo;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QOperatingSystemOmacFactory;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EClass;
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
public class OperatingSystemOmacFactoryImpl extends EFactoryImpl implements QOperatingSystemOmacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemOmacFactory init() {
		try {
			QOperatingSystemOmacFactory theOperatingSystemOmacFactory = (QOperatingSystemOmacFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemOmacPackage.eNS_URI);
			if (theOperatingSystemOmacFactory != null) {
				return theOperatingSystemOmacFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemOmacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemOmacFactoryImpl() {
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
			case QOperatingSystemOmacPackage.CREATION_INFO: return (EObject)createCreationInfo();
			case QOperatingSystemOmacPackage.MEMORY_INFO: return (EObject)createMemoryInfo();
			case QOperatingSystemOmacPackage.OBJECT: return (EObject)createObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreationInfo createCreationInfo() {
		CreationInfoImpl creationInfo = new CreationInfoImpl();
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMemoryInfo createMemoryInfo() {
		MemoryInfoImpl memoryInfo = new MemoryInfoImpl();
		return memoryInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QObject createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemOmacPackage getOperatingSystemOmacPackage() {
		return (QOperatingSystemOmacPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemOmacPackage getPackage() {
		return QOperatingSystemOmacPackage.eINSTANCE;
	}

} //OSCoreOmacFactoryImpl
