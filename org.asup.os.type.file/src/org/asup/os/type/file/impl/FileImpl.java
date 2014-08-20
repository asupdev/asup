/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.impl.TypedObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.FileImpl#getRecordLength <em>Record Length</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.FileImpl#getWaitFile <em>Wait File</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.FileImpl#getWaitRecord <em>Wait Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends TypedObjectImpl implements QFile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRecordLength() <em>Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLength()
	 * @generated
	 * @ordered
	 */
	protected static final int RECORD_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecordLength() <em>Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLength()
	 * @generated
	 * @ordered
	 */
	protected int recordLength = RECORD_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitFile() <em>Wait File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitFile()
	 * @generated
	 * @ordered
	 */
	protected static final int WAIT_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWaitFile() <em>Wait File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitFile()
	 * @generated
	 * @ordered
	 */
	protected int waitFile = WAIT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitRecord() <em>Wait Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitRecord()
	 * @generated
	 * @ordered
	 */
	protected static final int WAIT_RECORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWaitRecord() <em>Wait Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitRecord()
	 * @generated
	 * @ordered
	 */
	protected int waitRecord = WAIT_RECORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordLength() {
		return recordLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordLength(int newRecordLength) {
		int oldRecordLength = recordLength;
		recordLength = newRecordLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE__RECORD_LENGTH, oldRecordLength, recordLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRecordNumber() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWaitFile() {
		return waitFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitFile(int newWaitFile) {
		int oldWaitFile = waitFile;
		waitFile = newWaitFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE__WAIT_FILE, oldWaitFile, waitFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWaitRecord() {
		return waitRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitRecord(int newWaitRecord) {
		int oldWaitRecord = waitRecord;
		waitRecord = newWaitRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE__WAIT_RECORD, oldWaitRecord, waitRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE__RECORD_LENGTH:
				return getRecordLength();
			case QOperatingSystemFilePackage.FILE__WAIT_FILE:
				return getWaitFile();
			case QOperatingSystemFilePackage.FILE__WAIT_RECORD:
				return getWaitRecord();
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
			case QOperatingSystemFilePackage.FILE__RECORD_LENGTH:
				setRecordLength((Integer)newValue);
				return;
			case QOperatingSystemFilePackage.FILE__WAIT_FILE:
				setWaitFile((Integer)newValue);
				return;
			case QOperatingSystemFilePackage.FILE__WAIT_RECORD:
				setWaitRecord((Integer)newValue);
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
			case QOperatingSystemFilePackage.FILE__RECORD_LENGTH:
				setRecordLength(RECORD_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE__WAIT_FILE:
				setWaitFile(WAIT_FILE_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE__WAIT_RECORD:
				setWaitRecord(WAIT_RECORD_EDEFAULT);
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
			case QOperatingSystemFilePackage.FILE__RECORD_LENGTH:
				return recordLength != RECORD_LENGTH_EDEFAULT;
			case QOperatingSystemFilePackage.FILE__WAIT_FILE:
				return waitFile != WAIT_FILE_EDEFAULT;
			case QOperatingSystemFilePackage.FILE__WAIT_RECORD:
				return waitRecord != WAIT_RECORD_EDEFAULT;
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
		result.append(" (recordLength: ");
		result.append(recordLength);
		result.append(", waitFile: ");
		result.append(waitFile);
		result.append(", waitRecord: ");
		result.append(waitRecord);
		result.append(')');
		return result.toString();
	}

} //QFileImpl
