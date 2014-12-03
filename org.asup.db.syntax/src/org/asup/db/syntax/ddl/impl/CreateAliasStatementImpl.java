/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import org.asup.db.core.QQualifiedName;
import org.asup.db.syntax.StatementType;
import org.asup.db.syntax.ddl.QCreateAliasStatement;
import org.asup.db.syntax.ddl.QDdlPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateAliasStatementImpl extends EObjectImpl implements QCreateAliasStatement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StatementType TYPE_EDEFAULT = StatementType.DDL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StatementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName aliasName;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' containment reference.
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
	public StatementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StatementType newType) {
		StatementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasName(QQualifiedName newAliasName, NotificationChain msgs) {
		QQualifiedName oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, newAliasName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(QQualifiedName newAliasName) {
		if (newAliasName != aliasName) {
			NotificationChain msgs = null;
			if (aliasName != null)
				msgs = ((InternalEObject)aliasName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, null, msgs);
			if (newAliasName != null)
				msgs = ((InternalEObject)newAliasName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, null, msgs);
			msgs = basicSetAliasName(newAliasName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, newAliasName, newAliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableName(QQualifiedName newTableName, NotificationChain msgs) {
		QQualifiedName oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, oldTableName, newTableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(QQualifiedName newTableName) {
		if (newTableName != tableName) {
			NotificationChain msgs = null;
			if (tableName != null)
				msgs = ((InternalEObject)tableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, null, msgs);
			if (newTableName != null)
				msgs = ((InternalEObject)newTableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, null, msgs);
			msgs = basicSetTableName(newTableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, newTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return basicSetAliasName(null, msgs);
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return basicSetTableName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TYPE:
				return getType();
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return getAliasName();
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return getTableName();
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
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TYPE:
				setType((StatementType)newValue);
				return;
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
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
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
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case QDdlPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return aliasName != null;
			case QDdlPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return tableName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CreateAliasStatementImpl
