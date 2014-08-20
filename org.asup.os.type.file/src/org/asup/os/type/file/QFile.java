/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.os.type.QTypedObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QFile#getRecordLength <em>Record Length</em>}</li>
 *   <li>{@link org.asup.os.type.file.QFile#getWaitFile <em>Wait File</em>}</li>
 *   <li>{@link org.asup.os.type.file.QFile#getWaitRecord <em>Wait Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile()
 * @model
 * @generated
 */
public interface QFile extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lunghezza del tracciato record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Length</em>' attribute.
	 * @see #setRecordLength(int)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile_RecordLength()
	 * @model annotation="il-data precision='5'"
	 * @generated
	 */
	int getRecordLength();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFile#getRecordLength <em>Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Length</em>' attribute.
	 * @see #getRecordLength()
	 * @generated
	 */
	void setRecordLength(int value);

	/**
	 * Returns the value of the '<em><b>Wait File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tempo di attessa allocazione file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait File</em>' attribute.
	 * @see #setWaitFile(int)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile_WaitFile()
	 * @model annotation="il-data precision='3'"
	 * @generated
	 */
	int getWaitFile();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFile#getWaitFile <em>Wait File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait File</em>' attribute.
	 * @see #getWaitFile()
	 * @generated
	 */
	void setWaitFile(int value);

	/**
	 * Returns the value of the '<em><b>Wait Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tempo di attesa per allocazione record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Record</em>' attribute.
	 * @see #setWaitRecord(int)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile_WaitRecord()
	 * @model
	 * @generated
	 */
	int getWaitRecord();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFile#getWaitRecord <em>Wait Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Record</em>' attribute.
	 * @see #getWaitRecord()
	 * @generated
	 */
	void setWaitRecord(int value);

} // QFile
