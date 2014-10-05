/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.util.List;

import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QList;
import org.asup.il.data.QListDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.data.impl.ListDefImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.asup.il.data.impl.ListDefImpl#getInitialCapacity <em>Initial Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListDefImpl<D extends QList<?>> extends MultipleAtomicDataDefImpl<D> implements QListDef<D> {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected QUnaryAtomicDataDef<?> argument;
	/**
	 * The default value of the '{@link #getInitialCapacity() <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_CAPACITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getInitialCapacity() <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCapacity()
	 * @generated
	 * @ordered
	 */
	protected int initialCapacity = INITIAL_CAPACITY_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.LIST_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUnaryAtomicDataDef<?> getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(QUnaryAtomicDataDef<?> newArgument, NotificationChain msgs) {
		QUnaryAtomicDataDef<?> oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(QUnaryAtomicDataDef<?> newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialCapacity() {
		return initialCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCapacity(int newInitialCapacity) {
		int oldInitialCapacity = initialCapacity;
		initialCapacity = newInitialCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.LIST_DEF__INITIAL_CAPACITY, oldInitialCapacity, initialCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT:
				return basicSetArgument(null, msgs);
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
			case QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT:
				return getArgument();
			case QIntegratedLanguageDataPackage.LIST_DEF__INITIAL_CAPACITY:
				return getInitialCapacity();
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
			case QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT:
				setArgument((QUnaryAtomicDataDef<?>)newValue);
				return;
			case QIntegratedLanguageDataPackage.LIST_DEF__INITIAL_CAPACITY:
				setInitialCapacity((Integer)newValue);
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
			case QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT:
				setArgument((QUnaryAtomicDataDef<?>)null);
				return;
			case QIntegratedLanguageDataPackage.LIST_DEF__INITIAL_CAPACITY:
				setInitialCapacity(INITIAL_CAPACITY_EDEFAULT);
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
			case QIntegratedLanguageDataPackage.LIST_DEF__ARGUMENT:
				return argument != null;
			case QIntegratedLanguageDataPackage.LIST_DEF__INITIAL_CAPACITY:
				return initialCapacity != INITIAL_CAPACITY_EDEFAULT;
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
		result.append(" (initialCapacity: ");
		result.append(initialCapacity);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getDataClass() {
		return QList.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return List.class;
	}

} //ListDefImpl
