/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.QOperatingSystemTypePackage#getTypeManager()
 * @model abstract="true"
 * @generated
 */
public interface QTypeManager extends QTypedManager<QType> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QType lookupByDomain(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<T extends QTypedObject> QType lookupByClass(Class<T> klass);
} // QTypeManager
