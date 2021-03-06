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
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getTermContainer()
 * @model abstract="true"
 * @generated
 */
public interface QTermContainer<T extends QTerm> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<T> getTerms();

} // QTermContainer
