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
 * A representation of the model object '<em><b>Index Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QIndexColumn#getIndex <em>Index</em>}</li>
 *   <li>{@link org.asup.db.core.QIndexColumn#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QIndexColumn#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.asup.db.core.QIndexColumn#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getIndexColumn()
 * @model
 * @generated
 */
public interface QIndexColumn {
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
	 * @see org.asup.db.core.QDatabaseCorePackage#getIndexColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QIndexColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.core.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.asup.db.core.OrderingType
	 * @see #setOrdering(OrderingType)
	 * @see org.asup.db.core.QDatabaseCorePackage#getIndexColumn_Ordering()
	 * @model required="true"
	 * @generated
	 */
	OrderingType getOrdering();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QIndexColumn#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.asup.db.core.OrderingType
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(OrderingType value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see org.asup.db.core.QDatabaseCorePackage#getIndexColumn_Sequence()
	 * @model required="true"
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QIndexColumn#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QIndex#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' container reference.
	 * @see #setIndex(QIndex)
	 * @see org.asup.db.core.QDatabaseCorePackage#getIndexColumn_Index()
	 * @see org.asup.db.core.QIndex#getColumns
	 * @model opposite="columns" keys="name" required="true" transient="false"
	 * @generated
	 */
	QIndex getIndex();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QIndexColumn#getIndex <em>Index</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' container reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(QIndex value);

} // IndexField
