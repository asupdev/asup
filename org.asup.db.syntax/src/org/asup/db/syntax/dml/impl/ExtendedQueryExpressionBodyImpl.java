/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dml.impl;

import org.asup.db.syntax.dml.QDmlPackage;
import org.asup.db.syntax.dml.QExtendedQueryExpressionBody;

import org.eclipse.datatools.modelbase.sql.query.impl.QueryExpressionBodyImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Query Expression Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl#getRowOptimizeLimit <em>Row Optimize Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedQueryExpressionBodyImpl extends QueryExpressionBodyImpl implements QExtendedQueryExpressionBody {
	/**
	 * The default value of the '{@link #getRowOptimizeLimit() <em>Row Optimize Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowOptimizeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_OPTIMIZE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowOptimizeLimit() <em>Row Optimize Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowOptimizeLimit()
	 * @generated
	 * @ordered
	 */
	protected int rowOptimizeLimit = ROW_OPTIMIZE_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedQueryExpressionBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDmlPackage.Literals.EXTENDED_QUERY_EXPRESSION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowOptimizeLimit() {
		return rowOptimizeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowOptimizeLimit(int newRowOptimizeLimit) {
		int oldRowOptimizeLimit = rowOptimizeLimit;
		rowOptimizeLimit = newRowOptimizeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDmlPackage.EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT, oldRowOptimizeLimit, rowOptimizeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDmlPackage.EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT:
				return getRowOptimizeLimit();
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
			case QDmlPackage.EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT:
				setRowOptimizeLimit((Integer)newValue);
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
			case QDmlPackage.EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT:
				setRowOptimizeLimit(ROW_OPTIMIZE_LIMIT_EDEFAULT);
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
			case QDmlPackage.EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT:
				return rowOptimizeLimit != ROW_OPTIMIZE_LIMIT_EDEFAULT;
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
		result.append(" (rowOptimizeLimit: ");
		result.append(rowOptimizeLimit);
		result.append(')');
		return result.toString();
	}

} //ExtendedQueryExpressionBodyImpl
