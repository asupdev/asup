/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QLogical File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.LogicalFileImpl#getCreationStatement <em>Creation Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalFileImpl extends DatabaseFileImpl implements QLogicalFile {
	/**
	 * The default value of the '{@link #getCreationStatement() <em>Creation Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_STATEMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreationStatement() <em>Creation Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationStatement()
	 * @generated
	 * @ordered
	 */
	protected String creationStatement = CREATION_STATEMENT_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.LOGICAL_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationStatement() {
		return creationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationStatement(String newCreationStatement) {
		String oldCreationStatement = creationStatement;
		creationStatement = newCreationStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.LOGICAL_FILE__CREATION_STATEMENT, oldCreationStatement, creationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.LOGICAL_FILE__CREATION_STATEMENT:
				return getCreationStatement();
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
			case QOperatingSystemFilePackage.LOGICAL_FILE__CREATION_STATEMENT:
				setCreationStatement((String)newValue);
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
			case QOperatingSystemFilePackage.LOGICAL_FILE__CREATION_STATEMENT:
				setCreationStatement(CREATION_STATEMENT_EDEFAULT);
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
			case QOperatingSystemFilePackage.LOGICAL_FILE__CREATION_STATEMENT:
				return CREATION_STATEMENT_EDEFAULT == null ? creationStatement != null : !CREATION_STATEMENT_EDEFAULT.equals(creationStatement);
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
		result.append(" (creationStatement: ");
		result.append(creationStatement);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return "LF";
	}
} //QLogicalFileImpl
