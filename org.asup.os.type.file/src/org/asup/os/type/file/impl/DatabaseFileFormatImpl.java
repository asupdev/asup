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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database File Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.DatabaseFileFormatImpl#getFormatKeys <em>Format Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseFileFormatImpl extends FileFormatImpl<QDatabaseFileField> implements QDatabaseFileFormat {
	/**
	 * The cached value of the '{@link #getFormatKeys() <em>Format Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<QFileFormatKey> formatKeys;

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
	 * This is specialized for the more specific element type known in this context.
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
	public List<QFileFormatKey> getFormatKeys() {
		if (formatKeys == null) {
			formatKeys = new EObjectContainmentEList<QFileFormatKey>(QFileFormatKey.class, this, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS);
		}
		return formatKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS:
				return ((InternalEList<?>)getFormatKeys()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS:
				return getFormatKeys();
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS:
				getFormatKeys().clear();
				getFormatKeys().addAll((Collection<? extends QFileFormatKey>)newValue);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS:
				getFormatKeys().clear();
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEYS:
				return formatKeys != null && !formatKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseFileFormatImpl
