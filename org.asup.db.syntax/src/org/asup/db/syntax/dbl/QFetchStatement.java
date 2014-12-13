/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl;

import org.asup.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.dbl.QFetchStatement#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QFetchStatement#getInto <em>Into</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QFetchStatement#getPosition <em>Position</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QFetchStatement#getRelativePosition <em>Relative Position</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QFetchStatement#getMultipleRowClause <em>Multiple Row Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement()
 * @model
 * @generated
 */
public interface QFetchStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Name</em>' attribute.
	 * @see #setCursorName(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement_CursorName()
	 * @model required="true"
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QFetchStatement#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

	/**
	 * Returns the value of the '<em><b>Into</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into</em>' attribute.
	 * @see #setInto(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement_Into()
	 * @model required="true"
	 * @generated
	 */
	String getInto();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QFetchStatement#getInto <em>Into</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Into</em>' attribute.
	 * @see #getInto()
	 * @generated
	 */
	void setInto(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.syntax.dbl.FetchPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.asup.db.syntax.dbl.FetchPosition
	 * @see #setPosition(FetchPosition)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement_Position()
	 * @model
	 * @generated
	 */
	FetchPosition getPosition();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QFetchStatement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.asup.db.syntax.dbl.FetchPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(FetchPosition value);

	/**
	 * Returns the value of the '<em><b>Relative Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Position</em>' attribute.
	 * @see #setRelativePosition(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement_RelativePosition()
	 * @model
	 * @generated
	 */
	String getRelativePosition();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QFetchStatement#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Position</em>' attribute.
	 * @see #getRelativePosition()
	 * @generated
	 */
	void setRelativePosition(String value);

	/**
	 * Returns the value of the '<em><b>Multiple Row Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Row Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Row Clause</em>' containment reference.
	 * @see #setMultipleRowClause(QMultipleRowFetchClause)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getFetchStatement_MultipleRowClause()
	 * @model containment="true"
	 * @generated
	 */
	QMultipleRowFetchClause getMultipleRowClause();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QFetchStatement#getMultipleRowClause <em>Multiple Row Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Row Clause</em>' containment reference.
	 * @see #getMultipleRowClause()
	 * @generated
	 */
	void setMultipleRowClause(QMultipleRowFetchClause value);

} // QFetchStatement
