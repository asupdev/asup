/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.il.data.QDataStruct;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getTableDataSet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTableDataSet<DS extends QDataStruct> extends QDataSet<DS> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" relativeRecordNumberRequired="true"
	 * @generated
	 */
	boolean chain(int relativeRecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setgt(int relativeRecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model relativeRecordNumberRequired="true"
	 * @generated
	 */
	void setll(int relativeRecordNumber);

} // QTableDataSet
