/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.test.QUnitTestRunner#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.test.QFrameworkTestPackage#getUnitTestRunner()
 * @model
 * @generated
 */
public interface QUnitTestRunner extends QTestRunner {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.asup.fw.test.QFrameworkTestPackage#getUnitTestRunner_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.asup.fw.test.QUnitTestRunner#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // QUnitTestRunner
