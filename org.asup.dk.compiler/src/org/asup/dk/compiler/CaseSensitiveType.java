/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Case Sensitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.asup.dk.compiler.QDevelopmentKitCompilerPackage#getCaseSensitiveType()
 * @model
 * @generated
 */
public enum CaseSensitiveType implements Enumerator {
	/**
	 * The '<em><b>Lower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER(10, "Lower", "L"),

	/**
	 * The '<em><b>Upper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER(20, "Upper", "U"),

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(30, "Ignore", "I");

	/**
	 * The '<em><b>Lower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER
	 * @model name="Lower" literal="L"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_VALUE = 10;

	/**
	 * The '<em><b>Upper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER
	 * @model name="Upper" literal="U"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_VALUE = 20;

	/**
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ignore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model name="Ignore" literal="I"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 30;

	/**
	 * An array of all the '<em><b>Case Sensitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CaseSensitiveType[] VALUES_ARRAY =
		new CaseSensitiveType[] {
			LOWER,
			UPPER,
			IGNORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Case Sensitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CaseSensitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Case Sensitive Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseSensitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaseSensitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Sensitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseSensitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CaseSensitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Case Sensitive Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseSensitiveType get(int value) {
		switch (value) {
			case LOWER_VALUE: return LOWER;
			case UPPER_VALUE: return UPPER;
			case IGNORE_VALUE: return IGNORE;
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
	private CaseSensitiveType(int value, String name, String literal) {
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
	
} //CaseSensitiveType
