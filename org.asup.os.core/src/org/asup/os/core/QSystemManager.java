/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.fw.core.QService;
import org.asup.os.core.jobs.QJob;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QSystem Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getSystemManager()
 * @model abstract="true"
 * @generated
 */
public interface QSystemManager extends QLockable<QSystem>, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	QSystem getSystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException"
	 * @generated
	 */
	QJob start() throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException"
	 * @generated
	 */
	void stop() throws OperatingSystemException, OperatingSystemException;

} // QSystemManager
