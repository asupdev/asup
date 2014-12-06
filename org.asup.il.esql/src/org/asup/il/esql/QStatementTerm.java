/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.esql.QStatementTerm#getHostVariable <em>Host Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage#getStatementTerm()
 * @model
 * @generated
 */
public interface QStatementTerm extends QESqlTerm {
	/**
	 * Returns the value of the '<em><b>Host Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Variable</em>' attribute.
	 * @see #setHostVariable(String)
	 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage#getStatementTerm_HostVariable()
	 * @model required="true"
	 * @generated
	 */
	String getHostVariable();

	/**
	 * Sets the value of the '{@link org.asup.il.esql.QStatementTerm#getHostVariable <em>Host Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Variable</em>' attribute.
	 * @see #getHostVariable()
	 * @generated
	 */
	void setHostVariable(String value);

} // QStatementTerm
