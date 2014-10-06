/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QListDef#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.asup.il.data.QListDef#getInitialCapacity <em>Initial Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getListDef()
 * @model
 * @generated
 */
public interface QListDef<D extends QList<?>> extends QMultipleAtomicDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(QUnaryAtomicDataDef)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getListDef_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QUnaryAtomicDataDef<?> getArgument();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QListDef#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(QUnaryAtomicDataDef<?> value);

	/**
	 * Returns the value of the '<em><b>Initial Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Capacity</em>' attribute.
	 * @see #setInitialCapacity(int)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getListDef_InitialCapacity()
	 * @model required="true"
	 * @generated
	 */
	int getInitialCapacity();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QListDef#getInitialCapacity <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Capacity</em>' attribute.
	 * @see #getInitialCapacity()
	 * @generated
	 */
	void setInitialCapacity(int value);
} // QListDef
