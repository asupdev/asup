/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl.util;

import org.asup.db.syntax.QBindingStatement;

import org.asup.db.syntax.dbl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.dbl.QDblPackage
 * @generated
 */
public class DblSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QDblPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblSwitch() {
		if (modelPackage == null) {
			modelPackage = QDblPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QDblPackage.DECLARE_CURSOR_STATEMENT: {
				QDeclareCursorStatement declareCursorStatement = (QDeclareCursorStatement)theEObject;
				T result = caseDeclareCursorStatement(declareCursorStatement);
				if (result == null) result = caseBindingStatement(declareCursorStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.DESCRIBE_STATEMENT: {
				QDescribeStatement describeStatement = (QDescribeStatement)theEObject;
				T result = caseDescribeStatement(describeStatement);
				if (result == null) result = caseBindingStatement(describeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.EXECUTE_IMMEDIATE_STATEMENT: {
				QExecuteImmediateStatement executeImmediateStatement = (QExecuteImmediateStatement)theEObject;
				T result = caseExecuteImmediateStatement(executeImmediateStatement);
				if (result == null) result = caseBindingStatement(executeImmediateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.EXECUTE_STATEMENT: {
				QExecuteStatement executeStatement = (QExecuteStatement)theEObject;
				T result = caseExecuteStatement(executeStatement);
				if (result == null) result = caseBindingStatement(executeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.INTO_CLAUSE: {
				QIntoClause intoClause = (QIntoClause)theEObject;
				T result = caseIntoClause(intoClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.SET_TRANSACTION_STATEMENT: {
				QSetTransactionStatement setTransactionStatement = (QSetTransactionStatement)theEObject;
				T result = caseSetTransactionStatement(setTransactionStatement);
				if (result == null) result = caseBindingStatement(setTransactionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.OPEN_STATEMENT: {
				QOpenStatement openStatement = (QOpenStatement)theEObject;
				T result = caseOpenStatement(openStatement);
				if (result == null) result = caseBindingStatement(openStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.PREPARE_STATEMENT: {
				QPrepareStatement prepareStatement = (QPrepareStatement)theEObject;
				T result = casePrepareStatement(prepareStatement);
				if (result == null) result = caseBindingStatement(prepareStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDblPackage.CLOSE_STATEMENT: {
				QCloseStatement closeStatement = (QCloseStatement)theEObject;
				T result = caseCloseStatement(closeStatement);
				if (result == null) result = caseBindingStatement(closeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Cursor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Cursor Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareCursorStatement(QDeclareCursorStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeStatement(QDescribeStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Immediate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Immediate Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteImmediateStatement(QExecuteImmediateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteStatement(QExecuteStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Transaction Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Transaction Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTransactionStatement(QSetTransactionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStatement(QOpenStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepare Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepare Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrepareStatement(QPrepareStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseStatement(QCloseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Into Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Into Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntoClause(QIntoClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingStatement(QBindingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DblSwitch
