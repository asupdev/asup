/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QViewDef#getCreationCommand <em>Creation Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getViewDef()
 * @model
 * @generated
 */
public interface QViewDef extends QTableDef {
	/**
	 * Returns the value of the '<em><b>Creation Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Command</em>' attribute.
	 * @see #setCreationCommand(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getViewDef_CreationCommand()
	 * @model
	 * @generated
	 */
	String getCreationCommand();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QViewDef#getCreationCommand <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Creation Command</em>' attribute.
	 * @see #getCreationCommand()
	 * @generated
	 */
	void setCreationCommand(String value);

} // View
