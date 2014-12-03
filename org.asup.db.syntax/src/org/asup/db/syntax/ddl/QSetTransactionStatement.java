/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl;

import org.asup.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Transaction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QSetTransactionStatement#getIsolationLevel <em>Isolation Level</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QSetTransactionStatement#getRwOperation <em>Rw Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getSetTransactionStatement()
 * @model
 * @generated
 */
public interface QSetTransactionStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Isolation Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.syntax.ddl.IsolationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolation Level</em>' attribute.
	 * @see org.asup.db.syntax.ddl.IsolationLevel
	 * @see #setIsolationLevel(IsolationLevel)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getSetTransactionStatement_IsolationLevel()
	 * @model
	 * @generated
	 */
	IsolationLevel getIsolationLevel();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QSetTransactionStatement#getIsolationLevel <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolation Level</em>' attribute.
	 * @see org.asup.db.syntax.ddl.IsolationLevel
	 * @see #getIsolationLevel()
	 * @generated
	 */
	void setIsolationLevel(IsolationLevel value);

	/**
	 * Returns the value of the '<em><b>Rw Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.syntax.ddl.RWOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rw Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Operation</em>' attribute.
	 * @see org.asup.db.syntax.ddl.RWOperation
	 * @see #setRwOperation(RWOperation)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getSetTransactionStatement_RwOperation()
	 * @model
	 * @generated
	 */
	RWOperation getRwOperation();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QSetTransactionStatement#getRwOperation <em>Rw Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Operation</em>' attribute.
	 * @see org.asup.db.syntax.ddl.RWOperation
	 * @see #getRwOperation()
	 * @generated
	 */
	void setRwOperation(RWOperation value);

} // QSetTransactionStatement
