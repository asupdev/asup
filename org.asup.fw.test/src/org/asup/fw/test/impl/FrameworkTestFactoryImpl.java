/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.test.impl;

import org.asup.fw.test.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkTestFactoryImpl extends EFactoryImpl implements QFrameworkTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QFrameworkTestFactory init() {
		try {
			QFrameworkTestFactory theFrameworkTestFactory = (QFrameworkTestFactory)EPackage.Registry.INSTANCE.getEFactory(QFrameworkTestPackage.eNS_URI);
			if (theFrameworkTestFactory != null) {
				return theFrameworkTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrameworkTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QFrameworkTestPackage.ASSERTION_FAILED: return (EObject)createAssertionFailed();
			case QFrameworkTestPackage.ASSERTION_SUCCESS: return (EObject)createAssertionSuccess();
			case QFrameworkTestPackage.SUITE_TEST_RUNNER: return (EObject)createSuiteTestRunner();
			case QFrameworkTestPackage.TEST_RESULT: return (EObject)createTestResult();
			case QFrameworkTestPackage.UNIT_TEST_RUNNER: return (EObject)createUnitTestRunner();
			case QFrameworkTestPackage.TEST_CONTAINER: return (EObject)createTestContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QFrameworkTestPackage.ASSERTION_STATE:
				return createAssertionStateFromString(eDataType, initialValue);
			case QFrameworkTestPackage.FRAMEWORK_TEST_FAILLURE_ERROR:
				return createFrameworkTestFaillureErrorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QFrameworkTestPackage.ASSERTION_STATE:
				return convertAssertionStateToString(eDataType, instanceValue);
			case QFrameworkTestPackage.FRAMEWORK_TEST_FAILLURE_ERROR:
				return convertFrameworkTestFaillureErrorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAssertionFailed createAssertionFailed() {
		AssertionFailedImpl assertionFailed = new AssertionFailedImpl();
		return assertionFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAssertionSuccess createAssertionSuccess() {
		AssertionSuccessImpl assertionSuccess = new AssertionSuccessImpl();
		return assertionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSuiteTestRunner createSuiteTestRunner() {
		SuiteTestRunnerImpl suiteTestRunner = new SuiteTestRunnerImpl();
		return suiteTestRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTestResult createTestResult() {
		TestResultImpl testResult = new TestResultImpl();
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUnitTestRunner createUnitTestRunner() {
		UnitTestRunnerImpl unitTestRunner = new UnitTestRunnerImpl();
		return unitTestRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTestContainer createTestContainer() {
		TestContainerImpl testContainer = new TestContainerImpl();
		return testContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionState createAssertionStateFromString(EDataType eDataType, String initialValue) {
		AssertionState result = AssertionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTestFailureError createFrameworkTestFaillureErrorFromString(EDataType eDataType, String initialValue) {
		return (FrameworkTestFailureError)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkTestFaillureErrorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkTestPackage getFrameworkTestPackage() {
		return (QFrameworkTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QFrameworkTestPackage getPackage() {
		return QFrameworkTestPackage.eINSTANCE;
	}

} //FrameworkTestFactoryImpl
