/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi;

import java.util.List;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.co.osgi.QConnectorOSGIPackage#getCommunicationManager()
 * @model abstract="true"
 * @generated
 */
public interface QCommunicationManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	List<QEndPoint> find(QContextID contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model endPointIDRequired="true"
	 * @generated
	 */
	QEndPoint lookup(String endPointID);

} // QCommunicationManager
