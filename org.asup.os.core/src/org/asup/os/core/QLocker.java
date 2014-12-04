/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.os.core.jobs.QJob;
import org.asup.os.omac.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLocker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getLocker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QLocker<T extends QObject> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	void lock(QJob job, T object, LockType lockType) throws OperatingSystemRuntimeException, OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" objectRequired="true" lockTypeRequired="true"
	 * @generated
	 */
	boolean tryLock(QJob job, T object, long time, LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" objectRequired="true"
	 * @generated
	 */
	void unlock(QJob job, T object) throws OperatingSystemRuntimeException, OperatingSystemRuntimeException;

} // QLocker
