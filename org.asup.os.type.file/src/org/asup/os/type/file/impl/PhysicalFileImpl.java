/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.db.core.QTable;
import org.asup.os.type.file.FileType;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPhysicalFile;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QPhysical File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.PhysicalFileImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.PhysicalFileImpl#getRecordLength <em>Record Length</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.PhysicalFileImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.asup.os.type.file.impl.PhysicalFileImpl#getTableFormat <em>Table Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalFileImpl extends FileImpl implements QPhysicalFile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final FileType FILE_TYPE_EDEFAULT = FileType.SOURCE;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected FileType fileType = FILE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected QTable table;

	/**
	 * The default value of the '{@link #getTableFormat() <em>Table Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableFormat() <em>Table Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableFormat()
	 * @generated
	 * @ordered
	 */
	protected String tableFormat = TABLE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PhysicalFileImpl() {
		super();
		setAttribute("PF");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.PHYSICAL_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTable getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(QTable newTable, NotificationChain msgs) {
		QTable oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(QTable newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableFormat() {
		return tableFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableFormat(String newTableFormat) {
		String oldTableFormat = tableFormat;
		tableFormat = newTableFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE_FORMAT, oldTableFormat, tableFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE:
				return basicSetTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileType(FileType newFileType) {
		FileType oldFileType = fileType;
		fileType = newFileType == null ? FILE_TYPE_EDEFAULT : newFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.PHYSICAL_FILE__FILE_TYPE, oldFileType, fileType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.PHYSICAL_FILE__RECORD_LENGTH, oldRecordLength, recordLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PHYSICAL_FILE__FILE_TYPE:
				return getFileType();
			case QOperatingSystemFilePackage.PHYSICAL_FILE__RECORD_LENGTH:
				return getRecordLength();
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE:
				return getTable();
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE_FORMAT:
				return getTableFormat();
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
			case QOperatingSystemFilePackage.PHYSICAL_FILE__FILE_TYPE:
				setFileType((FileType)newValue);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__RECORD_LENGTH:
				setRecordLength((Integer)newValue);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE:
				setTable((QTable)newValue);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE_FORMAT:
				setTableFormat((String)newValue);
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
			case QOperatingSystemFilePackage.PHYSICAL_FILE__FILE_TYPE:
				setFileType(FILE_TYPE_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__RECORD_LENGTH:
				setRecordLength(RECORD_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE:
				setTable((QTable)null);
				return;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE_FORMAT:
				setTableFormat(TABLE_FORMAT_EDEFAULT);
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
			case QOperatingSystemFilePackage.PHYSICAL_FILE__FILE_TYPE:
				return fileType != FILE_TYPE_EDEFAULT;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__RECORD_LENGTH:
				return recordLength != RECORD_LENGTH_EDEFAULT;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE:
				return table != null;
			case QOperatingSystemFilePackage.PHYSICAL_FILE__TABLE_FORMAT:
				return TABLE_FORMAT_EDEFAULT == null ? tableFormat != null : !TABLE_FORMAT_EDEFAULT.equals(tableFormat);
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
		result.append(" (fileType: ");
		result.append(fileType);
		result.append(", recordLength: ");
		result.append(recordLength);
		result.append(", tableFormat: ");
		result.append(tableFormat);
		result.append(')');
		return result.toString();
	}

} //QPhysicalFileImpl
