/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.fw.test.QFrameworkTestPackage
 * @generated
 */
public interface QFrameworkTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFrameworkTestFactory eINSTANCE = org.asup.fw.test.impl.FrameworkTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assertion Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Failed</em>'.
	 * @generated
	 */
	QAssertionFailed createAssertionFailed();

	/**
	 * Returns a new object of class '<em>Assertion Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Success</em>'.
	 * @generated
	 */
	QAssertionSuccess createAssertionSuccess();

	/**
	 * Returns a new object of class '<em>Suite Test Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suite Test Runner</em>'.
	 * @generated
	 */
	QSuiteTestRunner createSuiteTestRunner();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	QTestResult createTestResult();

	/**
	 * Returns a new object of class '<em>Unit Test Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test Runner</em>'.
	 * @generated
	 */
	QUnitTestRunner createUnitTestRunner();

	/**
	 * Returns a new object of class '<em>Test Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Container</em>'.
	 * @generated
	 */
	QTestContainer createTestContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QFrameworkTestPackage getFrameworkTestPackage();

} //QFrameworkTestFactory