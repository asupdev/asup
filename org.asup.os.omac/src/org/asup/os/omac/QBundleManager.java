/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac;

import org.asup.fw.core.QContextID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMAC Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.omac.QOperatingSystemOmacPackage#getBundleManager()
 * @model abstract="true"
 * @generated
 */
public interface QBundleManager extends QManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" bundleNameRequired="true"
	 * @generated
	 */
	boolean isRegisterable(QContextID contextID, String bundleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" bundleNameRequired="true" visitorRequired="true"
	 * @generated
	 */
	void visit(QContextID contextID, String bundleName, QBundleVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" bundleNameRequired="true"
	 * @generated
	 */
	void register(QContextID contextID, String bundleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" symbolicNameRequired="true"
	 * @generated
	 */
	void unregister(QContextID contextID, String symbolicName);

} // QOMACManager
