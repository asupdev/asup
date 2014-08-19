/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>QContent Lock Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.asup.os.core.OSCorePackage#getQContentLockType()
 * @model
 * @generated
 */
public enum QContentLockType implements Enumerator {
	/**
	 * The '<em><b>Read Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	READ_LOCKED(10, "ReadLocked", "R_LOCK"),

	/**
	 * The '<em><b>Write Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_LOCKED(20, "WriteLocked", "W_LOCK");

	/**
	 * The '<em><b>Read Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Locked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_LOCKED
	 * @model name="ReadLocked" literal="R_LOCK"
	 * @generated
	 * @ordered
	 */
	public static final int READ_LOCKED_VALUE = 10;

	/**
	 * The '<em><b>Write Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Locked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_LOCKED
	 * @model name="WriteLocked" literal="W_LOCK"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_LOCKED_VALUE = 20;

	/**
	 * An array of all the '<em><b>QContent Lock Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QContentLockType[] VALUES_ARRAY =
		new QContentLockType[] {
			READ_LOCKED,
			WRITE_LOCKED,
		};

	/**
	 * A public read-only list of all the '<em><b>QContent Lock Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QContentLockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>QContent Lock Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QContentLockType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QContentLockType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>QContent Lock Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QContentLockType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QContentLockType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>QContent Lock Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QContentLockType get(int value) {
		switch (value) {
			case READ_LOCKED_VALUE: return READ_LOCKED;
			case WRITE_LOCKED_VALUE: return WRITE_LOCKED;
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
	private QContentLockType(int value, String name, String literal) {
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
	
} //QContentLockType
