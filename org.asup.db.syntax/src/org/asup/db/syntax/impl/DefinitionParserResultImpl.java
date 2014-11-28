/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import java.util.Collection;
import java.util.List;

import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QDefinitionParserError;
import org.asup.db.syntax.QDefinitionParserResult;
import org.asup.db.syntax.QDefinitionStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Parser Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.impl.DefinitionParserResultImpl#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.asup.db.syntax.impl.DefinitionParserResultImpl#getErrorList <em>Error List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DefinitionParserResultImpl extends EObjectImpl implements QDefinitionParserResult {
	/**
	 * The cached value of the '{@link #getDefinitionStatement() <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionStatement()
	 * @generated
	 * @ordered
	 */
	protected QDefinitionStatement definitionStatement;

	/**
	 * The cached value of the '{@link #getErrorList() <em>Error List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected EList<QDefinitionParserError> errorList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionParserResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.DEFINITION_PARSER_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionStatement getDefinitionStatement() {
		if (definitionStatement != null && ((EObject)definitionStatement).eIsProxy()) {
			InternalEObject oldDefinitionStatement = (InternalEObject)definitionStatement;
			definitionStatement = (QDefinitionStatement)eResolveProxy(oldDefinitionStatement);
			if (definitionStatement != oldDefinitionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
			}
		}
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionStatement basicGetDefinitionStatement() {
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionStatement(QDefinitionStatement newDefinitionStatement) {
		QDefinitionStatement oldDefinitionStatement = definitionStatement;
		definitionStatement = newDefinitionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<QDefinitionParserError> getErrorList() {
		if (errorList == null) {
			errorList = new EObjectResolvingEList<QDefinitionParserError>(QDefinitionParserError.class, this, QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__ERROR_LIST);
		}
		return errorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT:
				if (resolve) return getDefinitionStatement();
				return basicGetDefinitionStatement();
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__ERROR_LIST:
				return getErrorList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((QDefinitionStatement)newValue);
				return;
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__ERROR_LIST:
				getErrorList().clear();
				getErrorList().addAll((Collection<? extends QDefinitionParserError>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((QDefinitionStatement)null);
				return;
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__ERROR_LIST:
				getErrorList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT:
				return definitionStatement != null;
			case QDatabaseSyntaxPackage.DEFINITION_PARSER_RESULT__ERROR_LIST:
				return errorList != null && !errorList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionParserResultImpl
