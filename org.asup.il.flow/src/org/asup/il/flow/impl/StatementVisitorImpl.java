/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow.impl;

import java.lang.reflect.Method;

import org.asup.il.core.QNode;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QContinue;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QProcedureExec;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QIntegratedLanguageFlowPackage;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QMonitor;
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QStatementVisitor;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StatementVisitorImpl extends MinimalEObjectImpl.Container implements QStatementVisitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.STATEMENT_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QBlock statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QBreak statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QCall statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QCommandExec statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QContinue statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QEval statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QFor statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QProcedureExec statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QIf statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QJump statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QLabel statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QMethodExec statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QMonitor statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QReturn statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QRoutineExec statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QSQLExec statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QStatement statement) {
		
		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("endVisit", (Class<QNode>) statement.getClass());
			if(method == null) {
				System.out.println(statement);
			}
			method.invoke(this, new Object[] {statement});
		}
		catch (Exception e) {
			System.out.println(statement);
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QUntil statement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void endVisit(QWhile statement) {		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QBlock statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QBreak statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QCall statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QCommandExec statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QContinue statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QEval statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QFor statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QProcedureExec statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QStatement statement) {
		
		try {
			@SuppressWarnings("unchecked")
			Method method = getMethod("visit", (Class<QNode>) statement.getClass());
			if(method == null) {
				System.out.println(statement);
				return false;
			}
			return (boolean) method.invoke(this, new Object[] {statement});
		}
		catch (Exception e) {
			System.out.println(statement);
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QUntil statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QWhile statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QIf statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QJump statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QLabel statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QMethodExec statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QMonitor statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QReturn statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QRoutineExec statement) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean visit(QSQLExec statement) {
		return true;
	}

	protected Method getMethod(String name, Class<QNode> c) {
		Method m = null;

		Class<?>[] interfaces = c.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			try {
				m = getClass().getMethod(name, new Class[] {interfaces[i]});
				break;
			} 
			catch (NoSuchMethodException e) {}
		}
		return m;
	}
} //StatementVisitorImpl
