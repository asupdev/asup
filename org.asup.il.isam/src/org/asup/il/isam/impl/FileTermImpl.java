/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.il.core.impl.TermImpl;

import org.asup.il.isam.QFileTerm;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.il.isam.QRecordDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.isam.impl.FileTermImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.FileTermImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.FileTermImpl#isUserOpen <em>User Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileTermImpl extends TermImpl implements QFileTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected QRecordDef record;

	/**
	 * The default value of the '{@link #isUserOpen() <em>User Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserOpen() <em>User Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean userOpen = USER_OPEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageIsamPackage.Literals.FILE_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.FILE_TERM__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRecordDef getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(QRecordDef newRecord, NotificationChain msgs) {
		QRecordDef oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.FILE_TERM__RECORD, oldRecord, newRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord(QRecordDef newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageIsamPackage.FILE_TERM__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageIsamPackage.FILE_TERM__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.FILE_TERM__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserOpen() {
		return userOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserOpen(boolean newUserOpen) {
		boolean oldUserOpen = userOpen;
		userOpen = newUserOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.FILE_TERM__USER_OPEN, oldUserOpen, userOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageIsamPackage.FILE_TERM__RECORD:
				return basicSetRecord(null, msgs);
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
			case QIntegratedLanguageIsamPackage.FILE_TERM__FILE_NAME:
				return getFileName();
			case QIntegratedLanguageIsamPackage.FILE_TERM__RECORD:
				return getRecord();
			case QIntegratedLanguageIsamPackage.FILE_TERM__USER_OPEN:
				return isUserOpen();
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
			case QIntegratedLanguageIsamPackage.FILE_TERM__FILE_NAME:
				setFileName((String)newValue);
				return;
			case QIntegratedLanguageIsamPackage.FILE_TERM__RECORD:
				setRecord((QRecordDef)newValue);
				return;
			case QIntegratedLanguageIsamPackage.FILE_TERM__USER_OPEN:
				setUserOpen((Boolean)newValue);
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
			case QIntegratedLanguageIsamPackage.FILE_TERM__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.FILE_TERM__RECORD:
				setRecord((QRecordDef)null);
				return;
			case QIntegratedLanguageIsamPackage.FILE_TERM__USER_OPEN:
				setUserOpen(USER_OPEN_EDEFAULT);
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
			case QIntegratedLanguageIsamPackage.FILE_TERM__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case QIntegratedLanguageIsamPackage.FILE_TERM__RECORD:
				return record != null;
			case QIntegratedLanguageIsamPackage.FILE_TERM__USER_OPEN:
				return userOpen != USER_OPEN_EDEFAULT;
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", userOpen: ");
		result.append(userOpen);
		result.append(')');
		return result.toString();
	}

} //FileTermImpl
