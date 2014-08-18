/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;
import java.util.List;
import org.asup.il.core.QCardinality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Data Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QMultipleDataTerm#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getMultipleDataTerm()
 * @model abstract="true"
 * @generated
 */
public interface QMultipleDataTerm<DD extends QMultipleDataDef<?>> extends QDataTerm<DD> {

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute list.
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getMultipleDataTerm_Default()
	 * @model
	 * @generated
	 */
	List<String> getDefault();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QCardinality getCardinality();
} // QMultipleDataTerm
