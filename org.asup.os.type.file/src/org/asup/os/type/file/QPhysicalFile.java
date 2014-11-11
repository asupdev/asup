/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.db.core.QTable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QPhysical File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QPhysicalFile#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.asup.os.type.file.QPhysicalFile#getRecordLength <em>Record Length</em>}</li>
 *   <li>{@link org.asup.os.type.file.QPhysicalFile#getTable <em>Table</em>}</li>
 *   <li>{@link org.asup.os.type.file.QPhysicalFile#getTableFormat <em>Table Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPhysicalFile()
 * @model
 * @generated
 */
public interface QPhysicalFile extends QFile, QFileMembered {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(QTable)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPhysicalFile_Table()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QTable getTable();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QPhysicalFile#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(QTable value);

	/**
	 * Returns the value of the '<em><b>Table Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Format</em>' attribute.
	 * @see #setTableFormat(String)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPhysicalFile_TableFormat()
	 * @model
	 * @generated
	 */
	String getTableFormat();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QPhysicalFile#getTableFormat <em>Table Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Format</em>' attribute.
	 * @see #getTableFormat()
	 * @generated
	 */
	void setTableFormat(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.os.type.file.FileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see org.asup.os.type.file.FileType
	 * @see #setFileType(FileType)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPhysicalFile_FileType()
	 * @model required="true"
	 * @generated
	 */
	FileType getFileType();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QPhysicalFile#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see org.asup.os.type.file.FileType
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(FileType value);

	/**
	 * Returns the value of the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Length</em>' attribute.
	 * @see #setRecordLength(int)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPhysicalFile_RecordLength()
	 * @model
	 * @generated
	 */
	int getRecordLength();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QPhysicalFile#getRecordLength <em>Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Length</em>' attribute.
	 * @see #getRecordLength()
	 * @generated
	 */
	void setRecordLength(int value);

} // QPhysicalFile
