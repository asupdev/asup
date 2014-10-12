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
 *   <li>{@link org.asup.fw.test.QTestRunner#getTestResult <em>Test Result</em>}</li>
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
	 * Returns the value of the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Result</em>' containment reference.
	 * @see #setTestResult(QTestResult)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestRunner_TestResult()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QTestResult getTestResult();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QTestRunner#getTestResult <em>Test Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Result</em>' containment reference.
	 * @see #getTestResult()
	 * @generated
	 */
	void setTestResult(QTestResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void runTest();

} // QTestRunner
