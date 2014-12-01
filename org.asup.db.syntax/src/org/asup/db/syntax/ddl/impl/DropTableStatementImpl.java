/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.ddl.DropRange;
import org.asup.db.syntax.ddl.QDdlPackage;
import org.asup.db.syntax.ddl.QDropTableStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.DropTableStatementImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.DropTableStatementImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropTableStatementImpl extends EObjectImpl implements QDropTableStatement {
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
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final DropRange RANGE_EDEFAULT = DropRange.RESTRICT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected DropRange range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropTableStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.DROP_TABLE_STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(DropRange newRange) {
		DropRange oldRange = range;
		range = newRange == null ? RANGE_EDEFAULT : newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.DROP_TABLE_STATEMENT__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME:
				if (resolve) return getTableName();
				return basicGetTableName();
			case QDdlPackage.DROP_TABLE_STATEMENT__RANGE:
				return getRange();
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
			case QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)newValue);
				return;
			case QDdlPackage.DROP_TABLE_STATEMENT__RANGE:
				setRange((DropRange)newValue);
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
			case QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)null);
				return;
			case QDdlPackage.DROP_TABLE_STATEMENT__RANGE:
				setRange(RANGE_EDEFAULT);
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
			case QDdlPackage.DROP_TABLE_STATEMENT__TABLE_NAME:
				return tableName != null;
			case QDdlPackage.DROP_TABLE_STATEMENT__RANGE:
				return range != RANGE_EDEFAULT;
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
		result.append(" (range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //DropTableStatementImpl
