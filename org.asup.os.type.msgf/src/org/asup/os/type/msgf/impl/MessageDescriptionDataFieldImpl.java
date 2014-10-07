/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf.impl;

import org.asup.il.data.QUnaryAtomicDataDef;

import org.asup.os.omac.impl.ObjectImpl;

import org.asup.os.type.msgf.QMessageDescriptionDataField;
import org.asup.os.type.msgf.QOperatingSystemMessageFilePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Description Data Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl#getDataDef <em>Data Def</em>}</li>
 *   <li>{@link org.asup.os.type.msgf.impl.MessageDescriptionDataFieldImpl#getOutputMask <em>Output Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDescriptionDataFieldImpl extends ObjectImpl implements QMessageDescriptionDataField {
	/**
	 * The cached value of the '{@link #getDataDef() <em>Data Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDef()
	 * @generated
	 * @ordered
	 */
	protected QUnaryAtomicDataDef<?> dataDef;

	/**
	 * The default value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected String outputMask = OUTPUT_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDescriptionDataFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_DESCRIPTION_DATA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUnaryAtomicDataDef<?> getDataDef() {
		return dataDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDef(QUnaryAtomicDataDef<?> newDataDef, NotificationChain msgs) {
		QUnaryAtomicDataDef<?> oldDataDef = dataDef;
		dataDef = newDataDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF, oldDataDef, newDataDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDef(QUnaryAtomicDataDef<?> newDataDef) {
		if (newDataDef != dataDef) {
			NotificationChain msgs = null;
			if (dataDef != null)
				msgs = ((InternalEObject)dataDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF, null, msgs);
			if (newDataDef != null)
				msgs = ((InternalEObject)newDataDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF, null, msgs);
			msgs = basicSetDataDef(newDataDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF, newDataDef, newDataDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputMask() {
		return outputMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMask(String newOutputMask) {
		String oldOutputMask = outputMask;
		outputMask = newOutputMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK, oldOutputMask, outputMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF:
				return basicSetDataDef(null, msgs);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF:
				return getDataDef();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK:
				return getOutputMask();
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF:
				setDataDef((QUnaryAtomicDataDef<?>)newValue);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK:
				setOutputMask((String)newValue);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF:
				setDataDef((QUnaryAtomicDataDef<?>)null);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK:
				setOutputMask(OUTPUT_MASK_EDEFAULT);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__DATA_DEF:
				return dataDef != null;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD__OUTPUT_MASK:
				return OUTPUT_MASK_EDEFAULT == null ? outputMask != null : !OUTPUT_MASK_EDEFAULT.equals(outputMask);
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
		result.append(" (outputMask: ");
		result.append(outputMask);
		result.append(')');
		return result.toString();
	}

} //MessageDescriptionDataFieldImpl
