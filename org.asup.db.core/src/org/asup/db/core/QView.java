/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QView#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.asup.db.core.QView#getCreationPlugin <em>Creation Plugin</em>}</li>
 *   <li>{@link org.asup.db.core.QView#getCreationCommand <em>Creation Command</em>}</li>
 *   <li>{@link org.asup.db.core.QView#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QView#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getView()
 * @model
 * @generated
 */
public interface QView extends QDatabaseObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QSchema#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(QSchema)
	 * @see org.asup.db.core.QDatabaseCorePackage#getView_Schema()
	 * @see org.asup.db.core.QSchema#getViews
	 * @model opposite="views" transient="false"
	 * @generated
	 */
	QSchema getSchema();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QView#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(QSchema value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullName();

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
	 * @see org.asup.db.core.QDatabaseCorePackage#getView_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.asup.db.core.QDatabaseCorePackage#getView_CreationCommand()
	 * @model
	 * @generated
	 */
	String getCreationCommand();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QView#getCreationCommand <em>Creation Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Command</em>' attribute.
	 * @see #getCreationCommand()
	 * @generated
	 */
	void setCreationCommand(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QViewColumn}.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QViewColumn#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getView_Columns()
	 * @see org.asup.db.core.QViewColumn#getView
	 * @model opposite="view" containment="true"
	 * @generated
	 */
	List<QViewColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Creation Plugin</b></em>' attribute.
	 * The default value is <code>"IBMI"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Plugin</em>' attribute.
	 * @see #setCreationPlugin(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getView_CreationPlugin()
	 * @model default="IBMI"
	 * @generated
	 */
	String getCreationPlugin();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QView#getCreationPlugin <em>Creation Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Plugin</em>' attribute.
	 * @see #getCreationPlugin()
	 * @generated
	 */
	void setCreationPlugin(String value);

} // View
