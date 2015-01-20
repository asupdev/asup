/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.il.core.QTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.isam.QFileTerm#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.asup.il.isam.QFileTerm#getRecord <em>Record</em>}</li>
 *   <li>{@link org.asup.il.isam.QFileTerm#isUserOpen <em>User Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getFileTerm()
 * @model abstract="true"
 * @generated
 */
public interface QFileTerm extends QTerm {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getFileTerm_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QFileTerm#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(QRecordDef)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getFileTerm_Record()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	QRecordDef getRecord();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QFileTerm#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(QRecordDef value);

	/**
	 * Returns the value of the '<em><b>User Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imposta il tipo di accesso al data set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Open</em>' attribute.
	 * @see #setUserOpen(boolean)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getFileTerm_UserOpen()
	 * @model required="true"
	 * @generated
	 */
	boolean isUserOpen();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QFileTerm#isUserOpen <em>User Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Open</em>' attribute.
	 * @see #isUserOpen()
	 * @generated
	 */
	void setUserOpen(boolean value);

} // QFileTerm
