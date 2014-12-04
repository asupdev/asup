/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QServicePlugin#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getServicePlugin()
 * @model
 * @generated
 */
public interface QServicePlugin extends QPlugin, QServiceReference {

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.fw.core.QServiceReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServicePlugin_Services()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceReference> getServices();
} // ServicePlugin
