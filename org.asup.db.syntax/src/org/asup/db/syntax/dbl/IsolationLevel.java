/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Isolation Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.dbl.QDblPackage#getIsolationLevel()
 * @model
 * @generated
 */
public enum IsolationLevel implements Enumerator {
	/**
	 * The '<em><b>SERIALIZABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIALIZABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SERIALIZABLE(0, "SERIALIZABLE", "SERIALIZABLE"),

	/**
	 * The '<em><b>NO COMMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COMMIT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_COMMIT(1, "NO_COMMIT", "NO_COMMIT"),

	/**
	 * The '<em><b>READ UNCOMMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_UNCOMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	READ_UNCOMMITTED(2, "READ_UNCOMMITTED", "READ_UNCOMMITTED"),

	/**
	 * The '<em><b>READ COMMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_COMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	READ_COMMITTED(3, "READ_COMMITTED", "READ_COMMITTED"),

	/**
	 * The '<em><b>REPEATABLE READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE_READ_VALUE
	 * @generated
	 * @ordered
	 */
	REPEATABLE_READ(4, "REPEATABLE_READ", "REPEATABLE_READ");

	/**
	 * The '<em><b>SERIALIZABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERIALIZABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIALIZABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERIALIZABLE_VALUE = 0;

	/**
	 * The '<em><b>NO COMMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO COMMIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_COMMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_COMMIT_VALUE = 1;

	/**
	 * The '<em><b>READ UNCOMMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ UNCOMMITTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_UNCOMMITTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_UNCOMMITTED_VALUE = 2;

	/**
	 * The '<em><b>READ COMMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ COMMITTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_COMMITTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_COMMITTED_VALUE = 3;

	/**
	 * The '<em><b>REPEATABLE READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPEATABLE READ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPEATABLE_READ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Isolation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IsolationLevel[] VALUES_ARRAY =
		new IsolationLevel[] {
			SERIALIZABLE,
			NO_COMMIT,
			READ_UNCOMMITTED,
			READ_COMMITTED,
			REPEATABLE_READ,
		};

	/**
	 * A public read-only list of all the '<em><b>Isolation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IsolationLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Isolation Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IsolationLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IsolationLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Isolation Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IsolationLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IsolationLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Isolation Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IsolationLevel get(int value) {
		switch (value) {
			case SERIALIZABLE_VALUE: return SERIALIZABLE;
			case NO_COMMIT_VALUE: return NO_COMMIT;
			case READ_UNCOMMITTED_VALUE: return READ_UNCOMMITTED;
			case READ_COMMITTED_VALUE: return READ_COMMITTED;
			case REPEATABLE_READ_VALUE: return REPEATABLE_READ;
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
	private IsolationLevel(int value, String name, String literal) {
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
	
} //IsolationLevel