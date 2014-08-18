/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.DataType;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Compound Data Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnaryCompoundDataTermImpl<DD extends QUnaryCompoundDataDef<?>> extends UnaryDataTermImpl<DD> implements QUnaryCompoundDataTerm<DD> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryCompoundDataTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.UNARY_COMPOUND_DATA_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isQualified() {
		if(getDefinition() != null)
			return getDefinition().isQualified();
		else
			return false;
	}

	@Override
	public DataType getDataType() {
		return DataType.UNARY_COMPOUND;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void accept(QDataTermVisitor visitor) {
		
		if(visitor.visit(this)) {

			// childs
			for(QDataTerm<?> child: getDefinition().getElements()) {
				child.accept(visitor);
			}
		}
		
		visitor.endVisit(this);
	}
} //UnaryCompoundDataTermImpl
