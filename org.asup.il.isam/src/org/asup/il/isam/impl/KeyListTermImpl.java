/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import java.util.Collection;
import java.util.List;
import org.asup.il.core.impl.TermImpl;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.il.isam.QKeyListTerm;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key List Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.isam.impl.KeyListTermImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.KeyListTermImpl#getKeyFields <em>Key Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyListTermImpl extends TermImpl implements QKeyListTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyFields() <em>Key Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keyFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyListTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageIsamPackage.Literals.KEY_LIST_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.KEY_LIST_TERM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getKeyFields() {
		if (keyFields == null) {
			keyFields = new EDataTypeUniqueEList<String>(String.class, this, QIntegratedLanguageIsamPackage.KEY_LIST_TERM__KEY_FIELDS);
		}
		return keyFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__NAME:
				return getName();
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__KEY_FIELDS:
				return getKeyFields();
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
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__NAME:
				setName((String)newValue);
				return;
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__KEY_FIELDS:
				getKeyFields().clear();
				getKeyFields().addAll((Collection<? extends String>)newValue);
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
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__KEY_FIELDS:
				getKeyFields().clear();
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
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM__KEY_FIELDS:
				return keyFields != null && !keyFields.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", keyFields: ");
		result.append(keyFields);
		result.append(')');
		return result.toString();
	}

} //KeyListTermImpl
