/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getIndexDataSet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIndexDataSet<DS extends QDataStruct> extends QDataSet<DS> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyListDataType="org.asup.il.isam.KeyValue" keyListRequired="true"
	 * @generated
	 */
	boolean chain(QBufferedData[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(Object keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyValue" keyListRequired="true"
	 * @generated
	 */
	boolean reade(QBufferedData[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true"
	 * @generated
	 */
	void reade(Object key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyValue" keyListRequired="true"
	 * @generated
	 */
	boolean readpe(QBufferedData[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true"
	 * @generated
	 */
	void readpe(Object key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyValue" keyListRequired="true"
	 * @generated
	 */
	void setll(QBufferedData[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true"
	 * @generated
	 */
	void setll(Object key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void setll(E key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyValue" keyListRequired="true"
	 * @generated
	 */
	void setgt(QBufferedData[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true"
	 * @generated
	 */
	void setgt(Object key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> void setgt(E key);

} // QIndexDataSet
