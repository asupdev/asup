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
 * A representation of the model object '<em><b>QResource Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.resources.QOperatingSystemResourcesPackage#getResourceListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QResourceListener<T extends QObjectNameable> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventRequired="true"
	 * @generated
	 */
	void handleEvent(QResourceEvent<T> event);

} // QResourceListener
