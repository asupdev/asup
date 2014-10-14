/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.test.QTestRunner#getTestListeners <em>Test Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.test.QFrameworkTestPackage#getTestRunner()
 * @model abstract="true"
 * @generated
 */
public interface QTestRunner {
	/**
	 * Returns the value of the '<em><b>Test Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.fw.test.QTestListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Listeners</em>' containment reference list.
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestRunner_TestListeners()
	 * @model containment="true"
	 * @generated
	 */
	List<QTestListener> getTestListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void runTest();

} // QTestRunner
