/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QViewDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.ViewDefImpl#getCreationCommand <em>Creation Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewDefImpl extends TableDefImpl implements QViewDef {
	/**
	 * The default value of the '{@link #getCreationCommand() <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCreationCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationCommand() <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCreationCommand()
	 * @generated
	 * @ordered
	 */
	protected String creationCommand = CREATION_COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.VIEW_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationCommand() {
		return creationCommand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationCommand(String newCreationCommand) {
		String oldCreationCommand = creationCommand;
		creationCommand = newCreationCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW_DEF__CREATION_COMMAND, oldCreationCommand, creationCommand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW_DEF__CREATION_COMMAND:
				return getCreationCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW_DEF__CREATION_COMMAND:
				setCreationCommand((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW_DEF__CREATION_COMMAND:
				setCreationCommand(CREATION_COMMAND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW_DEF__CREATION_COMMAND:
				return CREATION_COMMAND_EDEFAULT == null ? creationCommand != null : !CREATION_COMMAND_EDEFAULT.equals(creationCommand);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (creationCommand: ");
		result.append(creationCommand);
		result.append(')');
		return result.toString();
	}

} // ViewDefImpl
