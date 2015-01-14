/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.il.data.DataDefType;
import org.asup.il.data.impl.UnaryCompoundDataDefImpl;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.il.isam.QRecord;
import org.asup.il.isam.QRecordDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RecordDefImpl extends UnaryCompoundDataDefImpl<QRecord> implements QRecordDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageIsamPackage.Literals.RECORD_DEF;
	}

	@Override
	public Class<QRecord> getDataClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getJavaClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.STRUCT;
	}

} //RecordDefImpl
