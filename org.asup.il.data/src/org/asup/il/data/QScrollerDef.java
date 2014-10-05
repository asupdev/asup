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
 * A representation of the model object '<em><b>Scroller Data Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QScrollerDef#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getScrollerDef()
 * @model
 * @generated
 */
public interface QScrollerDef<D extends QScroller<QBufferedData>> extends QMultipleAtomicBufferedDataDef<D> {

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getScrollerDef_Dimension()
	 * @model required="true"
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QScrollerDef#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);
} // QScrollerDataDef
