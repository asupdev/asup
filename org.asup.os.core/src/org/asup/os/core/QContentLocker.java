/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.os.core.jobs.QJob;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QContent Locker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getContentLocker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QContentLocker<T extends QContainer<?>> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	void lock(QJob job, T object, ContentLockType lockType) throws OperatingSystemRuntimeException, OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	boolean tryLock(QJob job, T object, long time, ContentLockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" objectRequired="true"
	 * @generated
	 */
	void unlock(QJob job, T object, ContentLockType lockType) throws OperatingSystemRuntimeException, OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	boolean isLocked(QJob job, T object, ContentLockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	boolean isLockedByOther(QJob job, T object, ContentLockType lockType);

} // QContentLocker
