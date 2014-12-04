/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf;

import org.asup.il.data.QUnaryAtomicDataDef;

import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Description Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getDataDef <em>Data Def</em>}</li>
 *   <li>{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getOutputMask <em>Output Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageDescriptionDataField()
 * @model
 * @generated
 */
public interface QMessageDescriptionDataField extends QObject {
	/**
	 * Returns the value of the '<em><b>Data Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Def</em>' containment reference.
	 * @see #setDataDef(QUnaryAtomicDataDef)
	 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageDescriptionDataField_DataDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QUnaryAtomicDataDef<?> getDataDef();

	/**
	 * Sets the value of the '{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getDataDef <em>Data Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Def</em>' containment reference.
	 * @see #getDataDef()
	 * @generated
	 */
	void setDataDef(QUnaryAtomicDataDef<?> value);

	/**
	 * Returns the value of the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Mask</em>' attribute.
	 * @see #setOutputMask(String)
	 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageDescriptionDataField_OutputMask()
	 * @model
	 * @generated
	 */
	String getOutputMask();

	/**
	 * Sets the value of the '{@link org.asup.os.type.msgf.QMessageDescriptionDataField#getOutputMask <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Mask</em>' attribute.
	 * @see #getOutputMask()
	 * @generated
	 */
	void setOutputMask(String value);

} // QMessageDescriptionDataField
