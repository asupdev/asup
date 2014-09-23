/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroller Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QStrollerDef#getLength <em>Length</em>}</li>
 *   <li>{@link org.asup.il.data.QStrollerDef#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getStrollerDef()
 * @model
 * @generated
 */
public interface QStrollerDef<D extends QStroller<?>> extends QMultipleCompoundDataDef<D>, QBufferedDataDef<D> {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getStrollerDef_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QStrollerDef#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' attribute.
	 * @see #setOccurrences(String)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getStrollerDef_Occurrences()
	 * @model required="true"
	 * @generated
	 */
	String getOccurrences();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QStrollerDef#getOccurrences <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' attribute.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(String value);

} // QStrollerDef
