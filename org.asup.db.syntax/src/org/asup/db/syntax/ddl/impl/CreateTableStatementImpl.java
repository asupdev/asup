/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import java.util.Collection;
import java.util.List;

import org.asup.db.core.QQualifiedName;
import org.asup.db.core.QTableFieldDef;

import org.asup.db.syntax.ddl.QCreateTableStatement;
import org.asup.db.syntax.ddl.QDdlPackage;

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
 * An implementation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateTableStatementImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateTableStatementImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTableStatementImpl extends EObjectImpl implements QCreateTableStatement {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QTableFieldDef> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTableStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.CREATE_TABLE_STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QTableFieldDef> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<QTableFieldDef>(QTableFieldDef.class, this, QDdlPackage.CREATE_TABLE_STATEMENT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				if (resolve) return getTableName();
				return basicGetTableName();
			case QDdlPackage.CREATE_TABLE_STATEMENT__FIELDS:
				return getFields();
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
			case QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)newValue);
				return;
			case QDdlPackage.CREATE_TABLE_STATEMENT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends QTableFieldDef>)newValue);
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
			case QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)null);
				return;
			case QDdlPackage.CREATE_TABLE_STATEMENT__FIELDS:
				getFields().clear();
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
			case QDdlPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				return tableName != null;
			case QDdlPackage.CREATE_TABLE_STATEMENT__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateTableStatementImpl
