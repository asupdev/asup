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
 * A representation of the model object '<em><b>Multiple Atomic Data Def</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getMultipleAtomicDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QMultipleAtomicDataDef<D extends QList<?>> extends QMultipleDataDef<D>, QAtomicDataDef<D> {

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QUnaryAtomicDataDef<?> getArgument();
} // QMultipleAtomicDataDef
