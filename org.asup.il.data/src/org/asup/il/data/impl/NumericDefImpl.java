/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.DataDefType;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QNumericDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumericDefImpl extends UnaryAtomicBufferedDataDefImpl<QNumeric> implements QNumericDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.NUMERIC_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return Number.class;
	}

	@Override
	public Class<QNumeric> getDataClass() {
		return QNumeric.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return null;
	}
} //NumericDefImpl
