/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eval Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getEvalOperator()
 * @model
 * @generated
 */
public enum EvalOperator implements Enumerator {
	/**
	 * The '<em><b>Assign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGN(10, "Assign", "="),

	/**
	 * The '<em><b>Plus Assign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_ASSIGN(20, "PlusAssign", "+="),

	/**
	 * The '<em><b>Minus Assign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_ASSIGN(30, "MinusAssign", "-="),

	/**
	 * The '<em><b>Times Assign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMES_ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	TIMES_ASSIGN(40, "TimesAssign", "*="),

	/**
	 * The '<em><b>Divide Assign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDE_ASSIGN(50, "DivideAssign", "/=");

	/**
	 * The '<em><b>Assign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGN
	 * @model name="Assign" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_VALUE = 10;

	/**
	 * The '<em><b>Plus Assign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus Assign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_ASSIGN
	 * @model name="PlusAssign" literal="+="
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_ASSIGN_VALUE = 20;

	/**
	 * The '<em><b>Minus Assign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus Assign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_ASSIGN
	 * @model name="MinusAssign" literal="-="
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_ASSIGN_VALUE = 30;

	/**
	 * The '<em><b>Times Assign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Times Assign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMES_ASSIGN
	 * @model name="TimesAssign" literal="*="
	 * @generated
	 * @ordered
	 */
	public static final int TIMES_ASSIGN_VALUE = 40;

	/**
	 * The '<em><b>Divide Assign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divide Assign</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_ASSIGN
	 * @model name="DivideAssign" literal="/="
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDE_ASSIGN_VALUE = 50;

	/**
	 * An array of all the '<em><b>Eval Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvalOperator[] VALUES_ARRAY =
		new EvalOperator[] {
			ASSIGN,
			PLUS_ASSIGN,
			MINUS_ASSIGN,
			TIMES_ASSIGN,
			DIVIDE_ASSIGN,
		};

	/**
	 * A public read-only list of all the '<em><b>Eval Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eval Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvalOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvalOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eval Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvalOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvalOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eval Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvalOperator get(int value) {
		switch (value) {
			case ASSIGN_VALUE: return ASSIGN;
			case PLUS_ASSIGN_VALUE: return PLUS_ASSIGN;
			case MINUS_ASSIGN_VALUE: return MINUS_ASSIGN;
			case TIMES_ASSIGN_VALUE: return TIMES_ASSIGN;
			case DIVIDE_ASSIGN_VALUE: return DIVIDE_ASSIGN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvalOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EvalOperator
