/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.ddl.QCreateAliasStatement;
import org.asup.db.syntax.ddl.QDdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateAliasStatementImpl extends EObjectImpl implements QCreateAliasStatement {
	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName aliasName;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName tableName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAliasStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.CREATE_ALIAS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getAliasName() {
		if (aliasName != null && ((EObject)aliasName).eIsProxy()) {
			InternalEObject oldAliasName = (InternalEObject)aliasName;
			aliasName = (QQualifiedName)eResolveProxy(oldAliasName);
			if (aliasName != oldAliasName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, aliasName));
			}
		}
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName basicGetAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(QQualifiedName newAliasName) {
		QQualifiedName oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, aliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getTableName() {
		if (tableName != null && ((EObject)tableName).eIsProxy()) {
			InternalEObject oldTableName = (InternalEObject)tableName;
			tableName = (QQualifiedName)eResolveProxy(oldTableName);
			if (tableName != oldTableName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, oldTableName, tableName));
			}
		}
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName basicGetTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(QQualifiedName newTableName) {
		QQualifiedName oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				if (resolve) return getAliasName();
				return basicGetAliasName();
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				if (resolve) return getTableName();
				return basicGetTableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QQualifiedName)newValue);
				return;
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)newValue);
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
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QQualifiedName)null);
				return;
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)null);
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
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return aliasName != null;
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return tableName != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateAliasStatementImpl
