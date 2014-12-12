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
 * A representation of the model object '<em><b>Declare Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getForQuery <em>For Query</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getForStatementName <em>For Statement Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isHold <em>Hold</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isScroll <em>Scroll</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement()
 * @model
 * @generated
 */
public interface QDeclareCursorStatement extends QBindingStatement {
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
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_CursorName()
	 * @model required="true"
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

	/**
	 * Returns the value of the '<em><b>For Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Query</em>' attribute.
	 * @see #setForQuery(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_ForQuery()
	 * @model
	 * @generated
	 */
	String getForQuery();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getForQuery <em>For Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Query</em>' attribute.
	 * @see #getForQuery()
	 * @generated
	 */
	void setForQuery(String value);

	/**
	 * Returns the value of the '<em><b>For Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Statement Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Statement Name</em>' attribute.
	 * @see #setForStatementName(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_ForStatementName()
	 * @model
	 * @generated
	 */
	String getForStatementName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#getForStatementName <em>For Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Statement Name</em>' attribute.
	 * @see #getForStatementName()
	 * @generated
	 */
	void setForStatementName(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_Dynamic()
	 * @model
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(boolean)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_Hold()
	 * @model
	 * @generated
	 */
	boolean isHold();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #isHold()
	 * @generated
	 */
	void setHold(boolean value);

	/**
	 * Returns the value of the '<em><b>Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll</em>' attribute.
	 * @see #setScroll(boolean)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getDeclareCursorStatement_Scroll()
	 * @model
	 * @generated
	 */
	boolean isScroll();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement#isScroll <em>Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll</em>' attribute.
	 * @see #isScroll()
	 * @generated
	 */
	void setScroll(boolean value);

} // QDeclareCursorStatement
