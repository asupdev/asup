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
 * A representation of the model object '<em><b>Unary Atomic Data Term</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryAtomicDataTerm()
 * @model
 * @generated
 */
public interface QUnaryAtomicDataTerm<DD extends QUnaryAtomicDataDef<?>> extends QUnaryDataTerm<DD>, QAtomicDataTerm<DD> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isRestricted();

} // QUnaryAtomicDataTerm
