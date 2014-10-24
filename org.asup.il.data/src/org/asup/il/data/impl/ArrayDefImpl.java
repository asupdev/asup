/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.util.List;

import org.asup.il.data.QArray;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayDefImpl<D extends QArray<?>> extends MultipleAtomicBufferedDataDefImpl<D> implements QArrayDef<D> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.ARRAY_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return List.class;
	}

	@Override
	public Class<?> getDataClass() {
		return QArray.class;
	}
} //ArrayDefImpl
