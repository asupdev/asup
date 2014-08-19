/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type;

import org.asup.fw.core.QPluginRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QType Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.QOperatingSystemTypePackage#getTypeRegistry()
 * @model abstract="true"
 * @generated
 */
public interface QTypeRegistry extends QPluginRegistry<QTypedManager<QTypedObject>> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typedClassRequired="true"
	 * @generated
	 */
	<T extends QTypedObject> QTypedManager<T> lookup(Class<T> typedClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typedObjectRequired="true"
	 * @generated
	 */
	<T extends QTypedObject> QTypedManager<T> lookup(T typedObject);

} // QTypeRegistry
