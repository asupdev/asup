/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl.impl;

import org.asup.db.syntax.dbl.QCloseStatement;
import org.asup.db.syntax.dbl.QDblPackage;

import org.asup.db.syntax.impl.BindingStatementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Close Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.dbl.impl.CloseStatementImpl#getCursor <em>Cursor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloseStatementImpl extends BindingStatementImpl implements QCloseStatement {
	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected String cursor = CURSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDblPackage.Literals.CLOSE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(String newCursor) {
		String oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDblPackage.CLOSE_STATEMENT__CURSOR, oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDblPackage.CLOSE_STATEMENT__CURSOR:
				return getCursor();
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
			case QDblPackage.CLOSE_STATEMENT__CURSOR:
				setCursor((String)newValue);
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
			case QDblPackage.CLOSE_STATEMENT__CURSOR:
				setCursor(CURSOR_EDEFAULT);
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
			case QDblPackage.CLOSE_STATEMENT__CURSOR:
				return CURSOR_EDEFAULT == null ? cursor != null : !CURSOR_EDEFAULT.equals(cursor);
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
		result.append(" (cursor: ");
		result.append(cursor);
		result.append(')');
		return result.toString();
	}

} //CloseStatementImpl
