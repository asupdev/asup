/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test;

import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.fw.test.QFrameworkTestFactory
 * @model kind="package"
 * @generated
 */
public interface QFrameworkTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/fw/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fw-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFrameworkTestPackage eINSTANCE = org.asup.fw.test.impl.FrameworkTestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.fw.test.QAsserter <em>Asserter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.QAsserter
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAsserter()
	 * @generated
	 */
	int ASSERTER = 0;

	/**
	 * The number of structural features of the '<em>Asserter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.AssertionResultImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionResult()
	 * @generated
	 */
	int ASSERTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Assertion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.AssertionFailedImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionFailed()
	 * @generated
	 */
	int ASSERTION_FAILED = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The number of structural features of the '<em>Assertion Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.AssertionSuccessImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionSuccess()
	 * @generated
	 */
	int ASSERTION_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The number of structural features of the '<em>Assertion Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.QTestListener <em>Test Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.QTestListener
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestListener()
	 * @generated
	 */
	int TEST_LISTENER = 5;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.QTestManager <em>Test Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.QTestManager
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestManager()
	 * @generated
	 */
	int TEST_MANAGER = 6;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.TestResultImpl <em>Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.TestResultImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 7;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.UnitTestRunnerImpl <em>Unit Test Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.UnitTestRunnerImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getUnitTestRunner()
	 * @generated
	 */
	int UNIT_TEST_RUNNER = 9;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.TestContainerImpl <em>Test Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.TestContainerImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestContainer()
	 * @generated
	 */
	int TEST_CONTAINER = 10;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.TestRunnerImpl <em>Test Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.TestRunnerImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestRunner()
	 * @generated
	 */
	int TEST_RUNNER = 8;

	/**
	 * The feature id for the '<em><b>Test Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__TEST_LISTENERS = 0;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__TEST_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Test Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.impl.SuiteTestRunnerImpl <em>Suite Test Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.impl.SuiteTestRunnerImpl
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getSuiteTestRunner()
	 * @generated
	 */
	int SUITE_TEST_RUNNER = 4;

	/**
	 * The feature id for the '<em><b>Test Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_TEST_RUNNER__TEST_LISTENERS = TEST_RUNNER__TEST_LISTENERS;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_TEST_RUNNER__TEST_RESULT = TEST_RUNNER__TEST_RESULT;

	/**
	 * The number of structural features of the '<em>Suite Test Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_TEST_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Test Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__FAILED = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__TIME = 1;

	/**
	 * The feature id for the '<em><b>Assert Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__ASSERT_RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Test Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_RUNNER__TEST_LISTENERS = TEST_RUNNER__TEST_LISTENERS;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_RUNNER__TEST_RESULT = TEST_RUNNER__TEST_RESULT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_RUNNER__CLASS_NAME = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Test Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTAINER__TESTS = 0;

	/**
	 * The number of structural features of the '<em>Test Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.fw.test.AssertionState <em>Assertion State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.AssertionState
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionState()
	 * @generated
	 */
	int ASSERTION_STATE = 11;

	/**
	 * The meta object id for the '<em>Faillure Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.test.FrameworkTestFailureError
	 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getFrameworkTestFaillureError()
	 * @generated
	 */
	int FRAMEWORK_TEST_FAILLURE_ERROR = 12;


	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserter</em>'.
	 * @see org.asup.fw.test.QAsserter
	 * @generated
	 */
	EClass getAsserter();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QAssertionFailed <em>Assertion Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Failed</em>'.
	 * @see org.asup.fw.test.QAssertionFailed
	 * @generated
	 */
	EClass getAssertionFailed();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QAssertionResult <em>Assertion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Result</em>'.
	 * @see org.asup.fw.test.QAssertionResult
	 * @generated
	 */
	EClass getAssertionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.test.QAssertionResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.asup.fw.test.QAssertionResult#getMessage()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Message();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QAssertionSuccess <em>Assertion Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Success</em>'.
	 * @see org.asup.fw.test.QAssertionSuccess
	 * @generated
	 */
	EClass getAssertionSuccess();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QSuiteTestRunner <em>Suite Test Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite Test Runner</em>'.
	 * @see org.asup.fw.test.QSuiteTestRunner
	 * @generated
	 */
	EClass getSuiteTestRunner();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QTestListener <em>Test Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Listener</em>'.
	 * @see org.asup.fw.test.QTestListener
	 * @generated
	 */
	EClass getTestListener();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QTestManager <em>Test Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Manager</em>'.
	 * @see org.asup.fw.test.QTestManager
	 * @generated
	 */
	EClass getTestManager();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see org.asup.fw.test.QTestResult
	 * @generated
	 */
	EClass getTestResult();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.test.QTestResult#isFailed <em>Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failed</em>'.
	 * @see org.asup.fw.test.QTestResult#isFailed()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Failed();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.test.QTestResult#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.asup.fw.test.QTestResult#getTime()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.test.QTestResult#getAssertResults <em>Assert Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert Results</em>'.
	 * @see org.asup.fw.test.QTestResult#getAssertResults()
	 * @see #getTestResult()
	 * @generated
	 */
	EReference getTestResult_AssertResults();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QTestRunner <em>Test Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner</em>'.
	 * @see org.asup.fw.test.QTestRunner
	 * @generated
	 */
	EClass getTestRunner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.test.QTestRunner#getTestListeners <em>Test Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Listeners</em>'.
	 * @see org.asup.fw.test.QTestRunner#getTestListeners()
	 * @see #getTestRunner()
	 * @generated
	 */
	EReference getTestRunner_TestListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.fw.test.QTestRunner#getTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Result</em>'.
	 * @see org.asup.fw.test.QTestRunner#getTestResult()
	 * @see #getTestRunner()
	 * @generated
	 */
	EReference getTestRunner_TestResult();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QUnitTestRunner <em>Unit Test Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test Runner</em>'.
	 * @see org.asup.fw.test.QUnitTestRunner
	 * @generated
	 */
	EClass getUnitTestRunner();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.test.QUnitTestRunner#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.asup.fw.test.QUnitTestRunner#getClassName()
	 * @see #getUnitTestRunner()
	 * @generated
	 */
	EAttribute getUnitTestRunner_ClassName();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.test.QTestContainer <em>Test Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Container</em>'.
	 * @see org.asup.fw.test.QTestContainer
	 * @generated
	 */
	EClass getTestContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.test.QTestContainer#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.asup.fw.test.QTestContainer#getTests()
	 * @see #getTestContainer()
	 * @generated
	 */
	EReference getTestContainer_Tests();

	/**
	 * Returns the meta object for enum '{@link org.asup.fw.test.AssertionState <em>Assertion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion State</em>'.
	 * @see org.asup.fw.test.AssertionState
	 * @generated
	 */
	EEnum getAssertionState();

	/**
	 * Returns the meta object for data type '{@link org.asup.fw.test.FrameworkTestFailureError <em>Faillure Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Faillure Error</em>'.
	 * @see org.asup.fw.test.FrameworkTestFailureError
	 * @model instanceClass="org.asup.fw.test.FrameworkTestFailureError"
	 * @generated
	 */
	EDataType getFrameworkTestFaillureError();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QFrameworkTestFactory getFrameworkTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.fw.test.QAsserter <em>Asserter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.QAsserter
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAsserter()
		 * @generated
		 */
		EClass ASSERTER = eINSTANCE.getAsserter();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.AssertionFailedImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionFailed()
		 * @generated
		 */
		EClass ASSERTION_FAILED = eINSTANCE.getAssertionFailed();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.AssertionResultImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionResult()
		 * @generated
		 */
		EClass ASSERTION_RESULT = eINSTANCE.getAssertionResult();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__MESSAGE = eINSTANCE.getAssertionResult_Message();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.AssertionSuccessImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionSuccess()
		 * @generated
		 */
		EClass ASSERTION_SUCCESS = eINSTANCE.getAssertionSuccess();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.SuiteTestRunnerImpl <em>Suite Test Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.SuiteTestRunnerImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getSuiteTestRunner()
		 * @generated
		 */
		EClass SUITE_TEST_RUNNER = eINSTANCE.getSuiteTestRunner();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.QTestListener <em>Test Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.QTestListener
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestListener()
		 * @generated
		 */
		EClass TEST_LISTENER = eINSTANCE.getTestListener();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.QTestManager <em>Test Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.QTestManager
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestManager()
		 * @generated
		 */
		EClass TEST_MANAGER = eINSTANCE.getTestManager();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.TestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.TestResultImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestResult()
		 * @generated
		 */
		EClass TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em><b>Failed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__FAILED = eINSTANCE.getTestResult_Failed();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__TIME = eINSTANCE.getTestResult_Time();

		/**
		 * The meta object literal for the '<em><b>Assert Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESULT__ASSERT_RESULTS = eINSTANCE.getTestResult_AssertResults();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.TestRunnerImpl <em>Test Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.TestRunnerImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestRunner()
		 * @generated
		 */
		EClass TEST_RUNNER = eINSTANCE.getTestRunner();

		/**
		 * The meta object literal for the '<em><b>Test Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RUNNER__TEST_LISTENERS = eINSTANCE.getTestRunner_TestListeners();

		/**
		 * The meta object literal for the '<em><b>Test Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RUNNER__TEST_RESULT = eINSTANCE.getTestRunner_TestResult();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.UnitTestRunnerImpl <em>Unit Test Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.UnitTestRunnerImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getUnitTestRunner()
		 * @generated
		 */
		EClass UNIT_TEST_RUNNER = eINSTANCE.getUnitTestRunner();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST_RUNNER__CLASS_NAME = eINSTANCE.getUnitTestRunner_ClassName();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.impl.TestContainerImpl <em>Test Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.impl.TestContainerImpl
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getTestContainer()
		 * @generated
		 */
		EClass TEST_CONTAINER = eINSTANCE.getTestContainer();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTAINER__TESTS = eINSTANCE.getTestContainer_Tests();

		/**
		 * The meta object literal for the '{@link org.asup.fw.test.AssertionState <em>Assertion State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.AssertionState
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getAssertionState()
		 * @generated
		 */
		EEnum ASSERTION_STATE = eINSTANCE.getAssertionState();

		/**
		 * The meta object literal for the '<em>Faillure Error</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.test.FrameworkTestFailureError
		 * @see org.asup.fw.test.impl.FrameworkTestPackageImpl#getFrameworkTestFaillureError()
		 * @generated
		 */
		EDataType FRAMEWORK_TEST_FAILLURE_ERROR = eINSTANCE.getFrameworkTestFaillureError();

	}

} //QFrameworkTestPackage
