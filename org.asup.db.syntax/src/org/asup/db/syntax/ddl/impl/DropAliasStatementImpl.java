/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.ddl.QDdlPackage;
import org.asup.db.syntax.ddl.QDropAliasStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.DropAliasStatementImpl#getAliasName <em>Alias Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropAliasStatementImpl extends EObjectImpl implements QDropAliasStatement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropAliasStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.DROP_ALIAS_STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, aliasName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, aliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME:
				if (resolve) return getAliasName();
				return basicGetAliasName();
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
			case QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QQualifiedName)newValue);
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
			case QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QQualifiedName)null);
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
			case QDdlPackage.DROP_ALIAS_STATEMENT__ALIAS_NAME:
				return aliasName != null;
		}
		return super.eIsSet(featureID);
	}

} //DropAliasStatementImpl
