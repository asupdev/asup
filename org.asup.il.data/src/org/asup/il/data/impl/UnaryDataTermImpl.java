/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.Boolean;
import java.lang.String;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QUnaryDataDef;
import org.asup.il.data.QUnaryDataTerm;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Data Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.data.impl.UnaryDataTermImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.asup.il.data.impl.UnaryDataTermImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnaryDataTermImpl<DD extends QUnaryDataDef<?>> extends DataTermImpl<DD> implements QUnaryDataTerm<DD> {
	
	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryDataTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.UNARY_DATA_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetDefinition(DD newDefinition, NotificationChain msgs) {
		return super.basicSetDefinition(newDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.UNARY_DATA_TERM__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.UNARY_DATA_TERM__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__DEFAULT:
				return getDefault();
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__MANDATORY:
				return isMandatory();
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
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__DEFAULT:
				setDefault((String)newValue);
				return;
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__MANDATORY:
				setMandatory((Boolean)newValue);
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
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
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
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case QIntegratedLanguageDataPackage.UNARY_DATA_TERM__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void accept(QDataTermVisitor visitor) {
		visitor.visit(this);
	}
} //UnaryDataTermImpl
