/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.db.core.QIndex;
import org.asup.db.core.QView;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLogical File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QLogicalFile#getIndex <em>Index</em>}</li>
 *   <li>{@link org.asup.os.type.file.QLogicalFile#getRecordLength <em>Record Length</em>}</li>
 *   <li>{@link org.asup.os.type.file.QLogicalFile#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile()
 * @model
 * @generated
 */
public interface QLogicalFile extends QFile, QFileMembered {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(QIndex)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QIndex getIndex();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QLogicalFile#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(QIndex value);

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
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile_RecordLength()
	 * @model
	 * @generated
	 */
	int getRecordLength();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QLogicalFile#getRecordLength <em>Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Length</em>' attribute.
	 * @see #getRecordLength()
	 * @generated
	 */
	void setRecordLength(int value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(QView)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile_View()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QView getView();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QLogicalFile#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(QView value);

} // QLogicalFile
