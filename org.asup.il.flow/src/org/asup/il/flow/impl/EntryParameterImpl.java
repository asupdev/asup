/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow.impl;

import org.asup.il.core.impl.NamedNodeImpl;
import org.asup.il.data.QDataTerm;
import org.asup.il.flow.PassingType;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QIntegratedLanguageFlowPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.flow.impl.EntryParameterImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.asup.il.flow.impl.EntryParameterImpl#getPassingType <em>Passing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryParameterImpl<DT extends QDataTerm<?>> extends NamedNodeImpl implements QEntryParameter<DT> {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected DT delegate;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPassingType() <em>Passing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingType()
	 * @generated
	 * @ordered
	 */
	protected static final PassingType PASSING_TYPE_EDEFAULT = PassingType.BY_REFERENCE;

	/**
	 * The cached value of the '{@link #getPassingType() <em>Passing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingType()
	 * @generated
	 * @ordered
	 */
	protected PassingType passingType = PASSING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.ENTRY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DT getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegate(DT newDelegate, NotificationChain msgs) {
		DT oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE, oldDelegate, newDelegate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(DT newDelegate) {
		if (newDelegate != delegate) {
			NotificationChain msgs = null;
			if (delegate != null)
				msgs = ((InternalEObject)delegate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE, null, msgs);
			if (newDelegate != null)
				msgs = ((InternalEObject)newDelegate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE, null, msgs);
			msgs = basicSetDelegate(newDelegate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE, newDelegate, newDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassingType getPassingType() {
		return passingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassingType(PassingType newPassingType) {
		PassingType oldPassingType = passingType;
		passingType = newPassingType == null ? PASSING_TYPE_EDEFAULT : newPassingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__PASSING_TYPE, oldPassingType, passingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE:
				return basicSetDelegate(null, msgs);
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
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE:
				return getDelegate();
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__PASSING_TYPE:
				return getPassingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE:
				setDelegate((DT)newValue);
				return;
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__PASSING_TYPE:
				setPassingType((PassingType)newValue);
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
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE:
				setDelegate((DT)null);
				return;
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__PASSING_TYPE:
				setPassingType(PASSING_TYPE_EDEFAULT);
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
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__DELEGATE:
				return delegate != null;
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER__PASSING_TYPE:
				return passingType != PASSING_TYPE_EDEFAULT;
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
		result.append(" (passingType: ");
		result.append(passingType);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		return getDelegate().getName();
	}

} //EntryParameterImpl
