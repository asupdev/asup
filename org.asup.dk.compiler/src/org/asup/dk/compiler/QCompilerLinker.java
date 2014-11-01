/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.il.core.QFacet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.dk.compiler.QCompilerPackage#getCompilerLinker()
 * @model
 * @generated
 */
public interface QCompilerLinker extends QFacet {
	/**
	 * Returns the value of the '<em><b>Linked Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Class</em>' attribute.
	 * @see #setLinkedClass(Class)
	 * @see org.asup.dk.compiler.QCompilerPackage#getCompilerLinker_LinkedClass()
	 * @model transient="true"
	 * @generated
	 */
	Class<?> getLinkedClass();

	/**
	 * Sets the value of the '{@link org.asup.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Class</em>' attribute.
	 * @see #getLinkedClass()
	 * @generated
	 */
	void setLinkedClass(Class<?> value);

} // QCompilerLinker
