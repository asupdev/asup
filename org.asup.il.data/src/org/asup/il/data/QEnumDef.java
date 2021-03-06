/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.Enum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QEnumDef#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.asup.il.data.QEnumDef#getKlass <em>Klass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getEnumDef()
 * @model abstract="true" EBounds="org.asup.fw.java.JavaEnum"
 * @generated
 */
public interface QEnumDef<E extends Enum<E>, D extends QBufferedData> extends QUnaryAtomicDataDef<D> {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(QBufferedDataDef)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getEnumDef_Delegate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QBufferedDataDef<D> getDelegate();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QEnumDef#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(QBufferedDataDef<D> value);

	/**
	 * Returns the value of the '<em><b>Klass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klass</em>' attribute.
	 * @see #setKlass(Class)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getEnumDef_Klass()
	 * @model required="true"
	 * @generated
	 */
	Class<E> getKlass();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QEnumDef#getKlass <em>Klass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klass</em>' attribute.
	 * @see #getKlass()
	 * @generated
	 */
	void setKlass(Class<E> value);

} // QEnumDef
