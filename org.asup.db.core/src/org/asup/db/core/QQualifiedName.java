/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QQualifiedName#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.asup.db.core.QQualifiedName#getTable <em>Table</em>}</li>
 *   <li>{@link org.asup.db.core.QQualifiedName#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QQualifiedName {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getQualifiedName_Schema()
	 * @model
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QQualifiedName#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getQualifiedName_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QQualifiedName#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute.
	 * @see #setMember(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getQualifiedName_Member()
	 * @model
	 * @generated
	 */
	String getMember();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QQualifiedName#getMember <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' attribute.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(String value);

} // QQualifiedName
