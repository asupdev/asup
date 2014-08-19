/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.resources;

import org.asup.os.omac.QObjectNameable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QRegistry Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.resources.QOperatingSystemResourcesPackage#getResourceFactory()
 * @model abstract="true"
 * @generated
 */
public interface QResourceFactory extends QResourceProvider {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> void registerListener(Class<T> klass, QResourceListener<T> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" providerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider);

} // QRegistryManager
