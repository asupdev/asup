/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.DataTermType;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Compound Data Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultipleCompoundDataTermImpl<DD extends QMultipleCompoundDataDef<?>> extends MultipleDataTermImpl<DD> implements QMultipleCompoundDataTerm<DD> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleCompoundDataTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.MULTIPLE_COMPOUND_DATA_TERM;
	}

	@Override
	public DataTermType getDataTermType() {
		return DataTermType.MULTIPLE_COMPOUND;
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
} //MultipleCompoundDataTermImpl