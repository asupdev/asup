/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import java.lang.String;
import org.asup.il.core.QSpecialElement;
import org.asup.il.data.QAdapter;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBoolean;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QEnum;
import org.asup.il.data.QFloating;
import org.asup.il.data.QGraphic;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QIdentifier;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QPointer;
import org.asup.il.data.QString;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Evaluator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataEvaluatorImpl extends DataVisitorImpl implements QDataEvaluator {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private Object object = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_EVALUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataEvaluator set(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataEvaluator set(String value) {
		this.object = value;
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataEvaluator set(QSpecialElement value) {
		this.object = value.getValue();
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataEvaluator set(QBufferedData value) {
		this.object = value;
		return this;
	}
	
	@Override
	public boolean visit(QAdapter data) {
		data.eval(object);
		return false;
	}

	@Override
	public boolean visit(QBinary data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QBoolean data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QCharacter data) {
		visitStringData(data);
		return false;
	}

	@Override
	public boolean visit(QDataStruct data) {
		visitStringData(data);
		return false;
	}

	@Override
	public boolean visit(QDatetime data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QDecimal data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QEnum<?, ?> data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QFloating data) {
		visitNumericData(data);
		return false;
	}

	@Override
	public boolean visit(QGraphic data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QHexadecimal data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QIdentifier data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	@Override
	public boolean visit(QIndicator data) {
		visitStringData(data);
		return false;
	}

	@Override
	public boolean visit(QPointer data) {
		// TODO Auto-generated method stub
		return super.visit(data);
	}

	private void visitNumericData(QNumeric numeric) {
		if(object instanceof QBufferedData) {
			numeric.eval((QBufferedData)object);	
		}		
		else {
			numeric.eval(Double.parseDouble(object.toString()));
		}

	}
	
	private void visitStringData(QString string) {
		if(object instanceof QString) {
			string.eval((QString)object);	
		}		
		else if(object instanceof String) {
			string.eval((String)object);
		}
		else {
			string.eval(object.toString());
		}

	}
} //DataEvaluatorImpl
