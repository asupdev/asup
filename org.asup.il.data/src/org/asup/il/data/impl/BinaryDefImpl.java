/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.Boolean;

import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.data.impl.BinaryDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.asup.il.data.impl.BinaryDefImpl#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryDefImpl extends UnaryAtomicBufferedDataDefImpl<QBinary> implements QBinaryDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryType TYPE_EDEFAULT = BinaryType.BYTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BinaryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean unsigned = UNSIGNED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.BINARY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BinaryType newType) {
		BinaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.BINARY_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnsigned() {
		return unsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsigned(boolean newUnsigned) {
		boolean oldUnsigned = unsigned;
		unsigned = newUnsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.BINARY_DEF__UNSIGNED, oldUnsigned, unsigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLength() {
		
		int length = 0;
		
		switch (getType()) {
			case BYTE:
				length = 3;
				break;
			case SHORT:
				length = 5;
				break;
			case INTEGER:
				length = 10;
				break;
			case LONG:
				length = 20;
				break;
		}		
		
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.BINARY_DEF__TYPE:
				return getType();
			case QIntegratedLanguageDataPackage.BINARY_DEF__UNSIGNED:
				return isUnsigned();
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
			case QIntegratedLanguageDataPackage.BINARY_DEF__TYPE:
				setType((BinaryType)newValue);
				return;
			case QIntegratedLanguageDataPackage.BINARY_DEF__UNSIGNED:
				setUnsigned((Boolean)newValue);
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
			case QIntegratedLanguageDataPackage.BINARY_DEF__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QIntegratedLanguageDataPackage.BINARY_DEF__UNSIGNED:
				setUnsigned(UNSIGNED_EDEFAULT);
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
			case QIntegratedLanguageDataPackage.BINARY_DEF__TYPE:
				return type != TYPE_EDEFAULT;
			case QIntegratedLanguageDataPackage.BINARY_DEF__UNSIGNED:
				return unsigned != UNSIGNED_EDEFAULT;
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
		result.append(", unsigned: ");
		result.append(unsigned);
		result.append(')');
		return result.toString();
	}


	@Override
	public Class<?> getJavaClass() {
		return Byte.class;
	}

	@Override
	public Class<?> getDataClass() {
		return QBinary.class;
	}
} //BinaryDefImpl
