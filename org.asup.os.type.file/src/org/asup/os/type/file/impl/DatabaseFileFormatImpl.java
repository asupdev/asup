/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import java.util.Collection;
import java.util.List;

import org.asup.os.type.file.QDatabaseFileField;
import org.asup.os.type.file.QDatabaseFileFormat;
import org.asup.os.type.file.QFileFormatKey;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database File Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseFileFormatImpl extends FileFormatImpl<QDatabaseFileField> implements QDatabaseFileFormat {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QDatabaseFileField> fields;
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<QFileFormatKey> keys;
	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseFileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.DATABASE_FILE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QDatabaseFileField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<QDatabaseFileField>(QDatabaseFileField.class, this, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QFileFormatKey> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<QFileFormatKey>(QFileFormatKey.class, this, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS:
				return getFields();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS:
				return getKeys();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__UNIQUE:
				return isUnique();
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends QDatabaseFileField>)newValue);
				return;
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends QFileFormatKey>)newValue);
				return;
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__UNIQUE:
				setUnique((Boolean)newValue);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS:
				getFields().clear();
				return;
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS:
				getKeys().clear();
				return;
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FIELDS:
				return fields != null && !fields.isEmpty();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__KEYS:
				return keys != null && !keys.isEmpty();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isEmpty() {
		return getFields().isEmpty();
	}
} //DatabaseFileFormatImpl
