/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaq.impl;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QContentLocker;
import org.asup.os.type.dtaq.DataQueueSearchType;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueManager;
import org.asup.os.type.dtaq.QOperatingSystemDataQueuePackage;
import org.asup.os.type.impl.TypedManagerImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QData Queue Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataQueueManagerImpl extends TypedManagerImpl<QDataQueue> implements QDataQueueManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QDataQueue> getTypedClass() {
		return QDataQueue.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataQueuePackage.Literals.DATA_QUEUE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataQueue createDataQueue(QContextID ContextID, String library, String name, DataQueueType type, int maxEntryLength) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeDataQueue(QContextID ContextID, String library, String name, String key, String value) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String readDataQueue(QContextID ContextID, String library, String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearDataQueue(QContextID ContextID, String library, String name) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String peekDataQueue(QContextID ContextID, String library, String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteDataQueue(QContextID ContextID, String library, String name) throws OperatingSystemException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContentLocker<QDataQueue> getContentLocker() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //DataQueueManagerImpl
