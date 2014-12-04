/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.os.omac.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QContent Lockable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getContentLockable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QContentLockable<T extends QContainer<K>, K extends QObject> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QContentLocker<T, K> getContainLocker();

} // QContentLockable
