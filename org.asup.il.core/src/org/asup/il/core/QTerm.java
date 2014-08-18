/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import java.net.URI;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QTerm#getFacets <em>Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getTerm()
 * @model abstract="true"
 * @generated
 */
public interface QTerm extends QNamedNode {
	
	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.core.QFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getTerm_Facets()
	 * @model containment="true"
	 * @generated
	 */
	List<QFacet> getFacets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.fw.java.JavaURI"
	 * @generated
	 */
	URI getURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<F extends QFacet> F getFacet(Class<F> klass);

} // QTerm
