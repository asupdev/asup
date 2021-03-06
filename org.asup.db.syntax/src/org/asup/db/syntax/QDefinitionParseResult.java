/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Parser Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.asup.db.syntax.QDefinitionParseResult#getErrorList <em>Error List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult()
 * @model
 * @generated
 */
public interface QDefinitionParseResult {
	/**
	 * Returns the value of the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Statement</em>' reference.
	 * @see #setDefinitionStatement(QDefinitionStatement)
	 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult_DefinitionStatement()
	 * @model
	 * @generated
	 */
	QDefinitionStatement getDefinitionStatement();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Statement</em>' reference.
	 * @see #getDefinitionStatement()
	 * @generated
	 */
	void setDefinitionStatement(QDefinitionStatement value);

	/**
	 * Returns the value of the '<em><b>Error List</b></em>' reference list.
	 * The list contents are of type {@link org.asup.db.syntax.QDefinitionParseError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' reference list.
	 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult_ErrorList()
	 * @model
	 * @generated
	 */
	List<QDefinitionParseError> getErrorList();

} // QDefinitionParserResult
