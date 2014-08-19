/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import java.util.List;

import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QObject Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.QObjectContent#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.asup.os.core.QObjectContent#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.asup.os.core.QObjectContent#getWriteLock <em>Write Lock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getObjectContent()
 * @model
 * @generated
 */
public interface QObjectContent<T extends QObject> extends QObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.asup.os.core.QOperatingSystemCorePackage#getObjectContent_Entries()
	 * @model containment="true"
	 * @generated
	 */
	List<T> getEntries();

	/**
	 * Returns the value of the '<em><b>Read Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Lock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Lock</em>' containment reference.
	 * @see #setReadLock(QContentLock)
	 * @see org.asup.os.core.QOperatingSystemCorePackage#getObjectContent_ReadLock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QContentLock getReadLock();

	/**
	 * Sets the value of the '{@link org.asup.os.core.QObjectContent#getReadLock <em>Read Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Lock</em>' containment reference.
	 * @see #getReadLock()
	 * @generated
	 */
	void setReadLock(QContentLock value);

	/**
	 * Returns the value of the '<em><b>Write Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Lock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Lock</em>' containment reference.
	 * @see #setWriteLock(QContentLock)
	 * @see org.asup.os.core.QOperatingSystemCorePackage#getObjectContent_WriteLock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QContentLock getWriteLock();

	/**
	 * Sets the value of the '{@link org.asup.os.core.QObjectContent#getWriteLock <em>Write Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Lock</em>' containment reference.
	 * @see #getWriteLock()
	 * @generated
	 */
	void setWriteLock(QContentLock value);

} // QObjectContent
