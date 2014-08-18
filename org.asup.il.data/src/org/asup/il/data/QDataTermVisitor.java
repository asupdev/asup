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
 * A representation of the model object '<em><b>Data Term Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTermVisitor()
 * @model abstract="true"
 * @generated
 */
public interface QDataTermVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	void endVisit(QDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	void endVisit(QMultipleAtomicDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	void endVisit(QMultipleCompoundDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	void endVisit(QUnaryAtomicDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	void endVisit(QUnaryCompoundDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	boolean visit(QDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	boolean visit(QMultipleAtomicDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	boolean visit(QMultipleCompoundDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	boolean visit(QUnaryAtomicDataTerm<?> term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model termRequired="true"
	 * @generated
	 */
	boolean visit(QUnaryCompoundDataTerm<?> term);

} // QDataTermVisitor
