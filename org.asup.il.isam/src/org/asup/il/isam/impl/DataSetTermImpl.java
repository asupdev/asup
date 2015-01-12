/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.il.core.impl.TermImpl;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataStructDef;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#isKeyedAccess <em>Keyed Access</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.asup.il.isam.impl.DataSetTermImpl#isUserOpen <em>User Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetTermImpl extends TermImpl implements QDataSetTerm {
	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.INPUT;
	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected AccessMode accessMode = ACCESS_MODE_EDEFAULT;
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
	 * The default value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected String formatName = FORMAT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isKeyedAccess() <em>Keyed Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyedAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEYED_ACCESS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isKeyedAccess() <em>Keyed Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyedAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean keyedAccess = KEYED_ACCESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected QCompoundDataTerm<QDataStructDef> record;
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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageIsamPackage.Literals.DATA_SET_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMode(AccessMode newAccessMode) {
		AccessMode oldAccessMode = accessMode;
		accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__ACCESS_MODE, oldAccessMode, accessMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatName() {
		return formatName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatName(String newFormatName) {
		String oldFormatName = formatName;
		formatName = newFormatName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__FORMAT_NAME, oldFormatName, formatName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeyedAccess() {
		return keyedAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyedAccess(boolean newKeyedAccess) {
		boolean oldKeyedAccess = keyedAccess;
		keyedAccess = newKeyedAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__KEYED_ACCESS, oldKeyedAccess, keyedAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCompoundDataTerm<QDataStructDef> getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(QCompoundDataTerm<QDataStructDef> newRecord, NotificationChain msgs) {
		QCompoundDataTerm<QDataStructDef> oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD, oldRecord, newRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord(QCompoundDataTerm<QDataStructDef> newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD, newRecord, newRecord));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageIsamPackage.DATA_SET_TERM__USER_OPEN, oldUserOpen, userOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD:
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
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__ACCESS_MODE:
				return getAccessMode();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FILE_NAME:
				return getFileName();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FORMAT_NAME:
				return getFormatName();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__KEYED_ACCESS:
				return isKeyedAccess();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__PREFIX:
				return getPrefix();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD:
				return getRecord();
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__USER_OPEN:
				return isUserOpen();
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
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__ACCESS_MODE:
				setAccessMode((AccessMode)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FILE_NAME:
				setFileName((String)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FORMAT_NAME:
				setFormatName((String)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__KEYED_ACCESS:
				setKeyedAccess((Boolean)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__PREFIX:
				setPrefix((String)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD:
				setRecord((QCompoundDataTerm<QDataStructDef>)newValue);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__USER_OPEN:
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
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__ACCESS_MODE:
				setAccessMode(ACCESS_MODE_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FORMAT_NAME:
				setFormatName(FORMAT_NAME_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__KEYED_ACCESS:
				setKeyedAccess(KEYED_ACCESS_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD:
				setRecord((QCompoundDataTerm<QDataStructDef>)null);
				return;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__USER_OPEN:
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
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__ACCESS_MODE:
				return accessMode != ACCESS_MODE_EDEFAULT;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__FORMAT_NAME:
				return FORMAT_NAME_EDEFAULT == null ? formatName != null : !FORMAT_NAME_EDEFAULT.equals(formatName);
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__KEYED_ACCESS:
				return keyedAccess != KEYED_ACCESS_EDEFAULT;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__RECORD:
				return record != null;
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM__USER_OPEN:
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
		result.append(" (accessMode: ");
		result.append(accessMode);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", formatName: ");
		result.append(formatName);
		result.append(", keyedAccess: ");
		result.append(keyedAccess);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", userOpen: ");
		result.append(userOpen);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		if(getFormatName() == null || getFormatName().isEmpty())
			return getFileName();
		else
			return getFormatName();
	}
} //DataSetTermImpl
