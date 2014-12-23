/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cursor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCursor extends QESqlObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void fetch(QBufferedData target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void open();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openUsingDescriptor(QString descriptorName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openUsingVariable(QString variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

} // QCursor
