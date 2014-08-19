/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QOutput Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.output.QOperatingSystemOutputPackage#getOutputManager()
 * @model abstract="true"
 * @generated
 */
public interface QOutputManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true"
	 * @generated
	 */
	QObjectWriter getDefaultWriter(QContextID contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" nameRequired="true"
	 * @generated
	 */
	QObjectWriter getObjectWriter(QContextID contextID, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" writerRequired="true"
	 * @generated
	 */
	void registerWriter(QContextID contextID, String name, QObjectWriter writer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true"
	 * @generated
	 */
	void setDefaultWriter(QContextID contextID, String name);

} // QOutputManager
