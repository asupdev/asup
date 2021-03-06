/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.io.Serializable;
import java.lang.String;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QDataDef#getFormulas <em>Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataDef()
 * @model abstract="true"
 * @generated NOT
 */
public interface QDataDef<D extends QData> extends Serializable {

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' attribute list.
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataDef_Formulas()
	 * @model
	 * @generated
	 */
	List<String> getFormulas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Class<D> getDataClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DataDefType getDataDefType();
} // QDataDef
