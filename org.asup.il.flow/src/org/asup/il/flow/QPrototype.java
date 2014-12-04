/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import org.asup.il.core.QTerm;
import org.asup.il.data.QDataTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QPrototype#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.asup.il.flow.QPrototype#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getPrototype()
 * @model
 * @generated
 */
public interface QPrototype<DT extends QDataTerm<?>> extends QTerm {

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(QDataTerm)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getPrototype_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	DT getDelegate();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QPrototype#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(DT value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(QEntry)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getPrototype_Entry()
	 * @model containment="true"
	 * @generated
	 */
	QEntry getEntry();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QPrototype#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(QEntry value);
} // QPrototype
