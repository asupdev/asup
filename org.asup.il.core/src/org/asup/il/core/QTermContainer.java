/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QTermContainer#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getTermContainer()
 * @model abstract="true"
 * @generated
 */
public interface QTermContainer<T extends QTerm> {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getTermContainer_Terms()
	 * @model containment="true"
	 * @generated
	 */
	List<T> getTerms();

} // QTermContainer
