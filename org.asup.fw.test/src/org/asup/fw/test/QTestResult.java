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
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.test.QTestResult#getAssertResults <em>Assert Results</em>}</li>
 *   <li>{@link org.asup.fw.test.QTestResult#getCategory <em>Category</em>}</li>
 *   <li>{@link org.asup.fw.test.QTestResult#isFailed <em>Failed</em>}</li>
 *   <li>{@link org.asup.fw.test.QTestResult#getObject <em>Object</em>}</li>
 *   <li>{@link org.asup.fw.test.QTestResult#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult()
 * @model
 * @generated
 */
public interface QTestResult {
	/**
	 * Returns the value of the '<em><b>Failed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed</em>' attribute.
	 * @see #setFailed(boolean)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult_Failed()
	 * @model default="false"
	 * @generated
	 */
	boolean isFailed();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QTestResult#isFailed <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed</em>' attribute.
	 * @see #isFailed()
	 * @generated
	 */
	void setFailed(boolean value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QTestResult#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QTestResult#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Assert Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.fw.test.QAssertionResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Results</em>' containment reference list.
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult_AssertResults()
	 * @model containment="true"
	 * @generated
	 */
	List<QAssertionResult> getAssertResults();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getTestResult_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QTestResult#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // QTestResult
