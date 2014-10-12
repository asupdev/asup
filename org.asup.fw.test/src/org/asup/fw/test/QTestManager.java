/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.test.QFrameworkTestPackage#getTestManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTestManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.core.FrameworkCoreException" classNameRequired="true"
	 * @generated
	 */
	QTestRunner prepareRunner(QContextID contextID, String className) throws FrameworkCoreException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.core.FrameworkCoreException"
	 * @generated
	 */
	QTestResult execute(QContextID contextID, QTestRunner runner) throws FrameworkCoreException;

} // QTestManager
