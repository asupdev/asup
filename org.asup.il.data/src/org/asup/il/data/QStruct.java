/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getStruct()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QStruct extends QString {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	QBufferedData getElement(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model positionRequired="true"
	 * @generated
	 */
	QBufferedData getElement(int position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<QBufferedData> getElements();

} // QStruct
