/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.DataDefType;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicator Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IndicatorDefImpl extends UnaryAtomicBufferedDataDefImpl<QIndicator> implements QIndicatorDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndicatorDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.INDICATOR_DEF;
	}

	@Override
	public Class<?> getJavaClass() {		
		return Boolean.class;
	}

	@Override
	public Class<QIndicator> getDataClass() {
		return QIndicator.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.INDICATOR;
	}
} //IndicatorDefImpl
