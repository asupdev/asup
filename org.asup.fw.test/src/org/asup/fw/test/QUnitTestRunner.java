/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.QContext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.test.QFrameworkTestPackage#getUnitTestRunner()
 * @model abstract="true"
 * @generated
 */
public interface QUnitTestRunner extends QTestRunner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.core.FrameworkCoreException"
	 * @generated
	 */
	QTestResult executeTest(QContext context) throws FrameworkCoreException;

} // QUnitTestRunner
