/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import java.util.List;

import org.asup.il.data.QDataTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Trashcan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.dk.compiler.QCompilationTrashcan#getDataTerms <em>Data Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationTrashcan()
 * @model
 * @generated
 */
public interface QCompilationTrashcan {
	/**
	 * Returns the value of the '<em><b>Data Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.data.QDataTerm}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Terms</em>' containment reference list.
	 * @see org.asup.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationTrashcan_DataTerms()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataTerm<?>> getDataTerms();

} // QCompilationTrashcan
