/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.il.data.DataDefType;
import org.asup.il.data.impl.UnaryCompoundDataDefImpl;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.il.isam.QRecord;
import org.asup.il.isam.QRecordDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.isam.impl.RecordDefImpl#getExternalName <em>External Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordDefImpl extends UnaryCompoundDataDefImpl<QRecord> implements QRecordDef {
	/**
	 * The default value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected String externalName = EXTERNAL_NAME_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageIsamPackage.Literals.RECORD_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalName() {
		return externalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalName(String newExternalName) {
		String oldExternalName = externalName;
		externalName = newExternalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.RECORD_DEF__EXTERNAL_NAME, oldExternalName, externalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageIsamPackage.RECORD_DEF__EXTERNAL_NAME:
				return getExternalName();
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
			case QIntegratedLanguageIsamPackage.RECORD_DEF__EXTERNAL_NAME:
				setExternalName((String)newValue);
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
			case QIntegratedLanguageIsamPackage.RECORD_DEF__EXTERNAL_NAME:
				setExternalName(EXTERNAL_NAME_EDEFAULT);
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
			case QIntegratedLanguageIsamPackage.RECORD_DEF__EXTERNAL_NAME:
				return EXTERNAL_NAME_EDEFAULT == null ? externalName != null : !EXTERNAL_NAME_EDEFAULT.equals(externalName);
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
		result.append(" (externalName: ");
		result.append(externalName);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<QRecord> getDataClass() {
		return QRecord.class;
	}

	@Override
	public Class<?> getJavaClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.STRUCT;
	}

} //RecordDefImpl
