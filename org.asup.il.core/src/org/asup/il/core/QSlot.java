/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QSlot#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getSlot()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSlot extends QNameable {

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' reference.
	 * @see #setCardinality(QCardinality)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getSlot_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	QCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QSlot#getCardinality <em>Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(QCardinality value);
} // QSlot
