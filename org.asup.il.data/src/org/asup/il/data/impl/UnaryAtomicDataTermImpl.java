/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.DataType;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Data Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnaryAtomicDataTermImpl<DD extends QUnaryAtomicDataDef<?>> extends UnaryDataTermImpl<DD> implements QUnaryAtomicDataTerm<DD> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryAtomicDataTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.UNARY_ATOMIC_DATA_TERM;
	}

	@Override
	public DataType getDataType() {
		return DataType.UNARY_ATOMIC;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void accept(QDataTermVisitor visitor) {
		visitor.visit(this);
	}
} //UnaryDataTermImpl