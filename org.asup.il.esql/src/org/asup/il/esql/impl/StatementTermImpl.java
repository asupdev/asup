/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql.impl;

import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.asup.il.esql.QStatementTerm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.esql.impl.StatementTermImpl#getHostVariable <em>Host Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementTermImpl extends ESqlTermImpl implements QStatementTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getHostVariable() <em>Host Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostVariable() <em>Host Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVariable()
	 * @generated
	 * @ordered
	 */
	protected String hostVariable = HOST_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageEmbeddedSQLPackage.Literals.STATEMENT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostVariable() {
		return hostVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostVariable(String newHostVariable) {
		String oldHostVariable = hostVariable;
		hostVariable = newHostVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM__HOST_VARIABLE, oldHostVariable, hostVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM__HOST_VARIABLE:
				return getHostVariable();
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
			case QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM__HOST_VARIABLE:
				setHostVariable((String)newValue);
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
			case QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM__HOST_VARIABLE:
				setHostVariable(HOST_VARIABLE_EDEFAULT);
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
			case QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM__HOST_VARIABLE:
				return HOST_VARIABLE_EDEFAULT == null ? hostVariable != null : !HOST_VARIABLE_EDEFAULT.equals(hostVariable);
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
		result.append(" (hostVariable: ");
		result.append(hostVariable);
		result.append(')');
		return result.toString();
	}

} //StatementTermImpl
