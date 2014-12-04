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
 * A representation of the model object '<em><b>Table Column Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QTableColumnDef#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.asup.db.core.QTableColumnDef#isDefault <em>Default</em>}</li>
 *   <li>{@link org.asup.db.core.QTableColumnDef#getLength <em>Length</em>}</li>
 *   <li>{@link org.asup.db.core.QTableColumnDef#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QTableColumnDef#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.asup.db.core.QTableColumnDef#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef()
 * @model
 * @generated
 */
public interface QTableColumnDef extends QDatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.core.DatabaseDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.asup.db.core.DatabaseDataType
	 * @see #setDataType(DatabaseDataType)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_DataType()
	 * @model required="true"
	 * @generated
	 */
	DatabaseDataType getDataType();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.asup.db.core.DatabaseDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DatabaseDataType value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see org.asup.db.core.QDatabaseCorePackage#getTableColumnDef_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QTableColumnDef#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

} // QTableColumnDef
