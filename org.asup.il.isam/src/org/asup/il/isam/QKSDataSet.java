/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.il.data.QData;
import org.asup.il.data.QIndicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Sequenced Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getKSDataSet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QKSDataSet<R extends QRecord> extends QDataSet<R> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(QData keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(QData keyField, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(QData keyField, QIndicator notFound, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(QData keyField, QIndicator notFound, Boolean lock, QIndicator error);

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
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(Object keyField, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(Object keyField, QIndicator notFound, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyFieldRequired="true"
	 * @generated
	 */
	boolean chain(Object keyField, QIndicator notFound, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean chain(Object[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean chain(Object[] keyList, QIndicator notFound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean chain(Object[] keyList, QIndicator notFound, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean chain(Object[] keyList, QIndicator notFound, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(QData keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(QData keyField, QIndicator endOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(QData keyField, QIndicator endOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(QData keyField, QIndicator endOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(Object keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(Object keyField, QIndicator endOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(Object keyField, QIndicator endOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean reade(Object keyField, QIndicator endOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean reade(Object[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean reade(Object[] keyList, QIndicator endOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean reade(Object[] keyList, QIndicator endOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean reade(Object[] keyList, QIndicator endOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(QData keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(QData keyField, QIndicator beginningOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(QData keyField, QIndicator beginningOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(QData keyField, QIndicator beginningOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(Object keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(Object keyField, QIndicator beginningOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(Object keyField, QIndicator beginningOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	boolean readpe(Object keyField, QIndicator beginningOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean readpe(Object[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean readpe(Object[] keyList, QIndicator beginningOfData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean readpe(Object[] keyList, QIndicator beginningOfData, Boolean lock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	boolean readpe(Object[] keyList, QIndicator beginningOfData, Boolean lock, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(QData keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(QData keyField, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(QData keyField, QIndicator found, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(QData keyField, QIndicator found, QIndicator equal, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(Object keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(Object keyField, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(Object keyField, QIndicator found, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setll(Object keyField, QIndicator found, QIndicator equal, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setll(Object[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setll(Object[] keyList, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setll(Object[] keyList, QIndicator found, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setll(Object[] keyList, QIndicator found, QIndicator equal, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(QData keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(QData keyField, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(QData keyField, QIndicator found, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(Object keyField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(Object keyField, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyFieldRequired="true"
	 * @generated
	 */
	void setgt(Object keyField, QIndicator found, QIndicator error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setgt(Object[] keyList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setgt(Object[] keyList, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyListDataType="org.asup.il.isam.KeyList" keyListRequired="true"
	 * @generated
	 */
	void setgt(Object[] keyList, QIndicator found, QIndicator error);

} // QKeySequencedDataSet
