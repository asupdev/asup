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
 * A representation of the model object '<em><b>View Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QViewColumn#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getViewColumn()
 * @model
 * @generated
 */
public interface QViewColumn extends QColumn {

	/**
	 * Returns the value of the '<em><b>View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QView#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' container reference.
	 * @see #setView(QView)
	 * @see org.asup.db.core.QDatabaseCorePackage#getViewColumn_View()
	 * @see org.asup.db.core.QView#getColumns
	 * @model opposite="columns" keys="name" required="true" transient="false"
	 * @generated
	 */
	QView getView();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QViewColumn#getView <em>View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' container reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(QView value);
} // ViewField
