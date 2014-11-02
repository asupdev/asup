/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.lib;

import org.asup.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLibrary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.lib.QLibrary#getParentLibrary <em>Parent Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.lib.QOperatingSystemLibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface QLibrary extends QTypedObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2014 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Parent Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Library</em>' attribute.
	 * @see #setParentLibrary(String)
	 * @see org.asup.os.type.lib.QOperatingSystemLibraryPackage#getLibrary_ParentLibrary()
	 * @model
	 * @generated
	 */
	String getParentLibrary();

	/**
	 * Sets the value of the '{@link org.asup.os.type.lib.QLibrary#getParentLibrary <em>Parent Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Library</em>' attribute.
	 * @see #getParentLibrary()
	 * @generated
	 */
	void setParentLibrary(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRootLibrary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isChildLibrary();
} // QLibrary
