/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaq;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QContentLockable;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QData Queue Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.dtaq.QOperatingSystemDataQueuePackage#getDataQueueManager()
 * @model abstract="true"
 * @generated
 */
public interface QDataQueueManager extends QTypedManager<QDataQueue>, QContentLockable<QDataQueue, QDataQueueEntry> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true" libraryRequired="true" nameRequired="true" typeRequired="true" maxEntryLengthRequired="true"
	 * @generated
	 */
	QDataQueue createDataQueue(QContextID ContextID, String library, String name, DataQueueType type, int maxEntryLength) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true" libraryRequired="true" nameRequired="true" valueRequired="true"
	 * @generated
	 */
	void writeDataQueue(QContextID ContextID, String library, String name, String key, String value) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String readDataQueue(QContextID ContextID, String library, String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	void clearDataQueue(QContextID ContextID, String library, String name) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String peekDataQueue(QContextID ContextID, String library, String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" ContextIDRequired="true"
	 * @generated
	 */
	void deleteDataQueue(QContextID ContextID, String library, String name) throws OperatingSystemException;

} // QDataQueueManager
