/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.util;

import org.asup.db.syntax.QDefinitionStatement;
import org.asup.db.syntax.ddl.*;
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
 * @see org.asup.db.syntax.ddl.QDdlPackage
 * @generated
 */
public class DdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QDdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdlSwitch() {
		if (modelPackage == null) {
			modelPackage = QDdlPackage.eINSTANCE;
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
			case QDdlPackage.CALL_STATEMENT: {
				QCallStatement callStatement = (QCallStatement)theEObject;
				T result = caseCallStatement(callStatement);
				if (result == null) result = caseDefinitionStatement(callStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.COMMIT_STATEMENT: {
				QCommitStatement commitStatement = (QCommitStatement)theEObject;
				T result = caseCommitStatement(commitStatement);
				if (result == null) result = caseDefinitionStatement(commitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.CONNECT_STATEMENT: {
				QConnectStatement connectStatement = (QConnectStatement)theEObject;
				T result = caseConnectStatement(connectStatement);
				if (result == null) result = caseDefinitionStatement(connectStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.CREATE_ALIAS_STATEMENT: {
				QCreateAliasStatement createAliasStatement = (QCreateAliasStatement)theEObject;
				T result = caseCreateAliasStatement(createAliasStatement);
				if (result == null) result = caseDefinitionStatement(createAliasStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.CREATE_INDEX_STATEMENT: {
				QCreateIndexStatement createIndexStatement = (QCreateIndexStatement)theEObject;
				T result = caseCreateIndexStatement(createIndexStatement);
				if (result == null) result = caseDefinitionStatement(createIndexStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.CREATE_TABLE_STATEMENT: {
				QCreateTableStatement createTableStatement = (QCreateTableStatement)theEObject;
				T result = caseCreateTableStatement(createTableStatement);
				if (result == null) result = caseDefinitionStatement(createTableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.CREATE_VIEW_STATEMENT: {
				QCreateViewStatement createViewStatement = (QCreateViewStatement)theEObject;
				T result = caseCreateViewStatement(createViewStatement);
				if (result == null) result = caseDefinitionStatement(createViewStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.DISCONNECT_STATEMENT: {
				QDisconnectStatement disconnectStatement = (QDisconnectStatement)theEObject;
				T result = caseDisconnectStatement(disconnectStatement);
				if (result == null) result = caseDefinitionStatement(disconnectStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.DROP_STATEMENT: {
				QDropStatement dropStatement = (QDropStatement)theEObject;
				T result = caseDropStatement(dropStatement);
				if (result == null) result = caseDefinitionStatement(dropStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.LOCK_TABLE_STATEMENT: {
				QLockTableStatement lockTableStatement = (QLockTableStatement)theEObject;
				T result = caseLockTableStatement(lockTableStatement);
				if (result == null) result = caseDefinitionStatement(lockTableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.RELEASE_STATEMENT: {
				QReleaseStatement releaseStatement = (QReleaseStatement)theEObject;
				T result = caseReleaseStatement(releaseStatement);
				if (result == null) result = caseDefinitionStatement(releaseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.RENAME_STATEMENT: {
				QRenameStatement renameStatement = (QRenameStatement)theEObject;
				T result = caseRenameStatement(renameStatement);
				if (result == null) result = caseDefinitionStatement(renameStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.ROLLBACK_STATEMENT: {
				QRollbackStatement rollbackStatement = (QRollbackStatement)theEObject;
				T result = caseRollbackStatement(rollbackStatement);
				if (result == null) result = caseDefinitionStatement(rollbackStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.SET_CONNECTION_STATEMENT: {
				QSetConnectionStatement setConnectionStatement = (QSetConnectionStatement)theEObject;
				T result = caseSetConnectionStatement(setConnectionStatement);
				if (result == null) result = caseDefinitionStatement(setConnectionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QDdlPackage.SET_TRANSACTION_STATEMENT: {
				QSetTransactionStatement setTransactionStatement = (QSetTransactionStatement)theEObject;
				T result = caseSetTransactionStatement(setTransactionStatement);
				if (result == null) result = caseDefinitionStatement(setTransactionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitStatement(QCommitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectStatement(QConnectStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Alias Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAliasStatement(QCreateAliasStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Index Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Index Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateIndexStatement(QCreateIndexStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Table Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTableStatement(QCreateTableStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create View Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create View Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateViewStatement(QCreateViewStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectStatement(QDisconnectStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropStatement(QDropStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Table Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockTableStatement(QLockTableStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseStatement(QReleaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameStatement(QRenameStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollback Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollback Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollbackStatement(QRollbackStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Connection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Connection Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConnectionStatement(QSetConnectionStatement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallStatement(QCallStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionStatement(QDefinitionStatement object) {
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

} //DdlSwitch
