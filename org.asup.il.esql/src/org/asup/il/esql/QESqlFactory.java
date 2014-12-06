/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql;

import java.lang.annotation.Annotation;

import java.lang.reflect.Type;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESql Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage#getESqlFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QESqlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" cursorTermRequired="true"
	 * @generated
	 */
	QCursor createCursor(QCursorTerm cursorTerm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.asup.fw.java.JavaType" typeRequired="true" annotationsDataType="org.asup.fw.java.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QCursorTerm createCursorTerm(Type type, List<Annotation> annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" statementTermRequired="true"
	 * @generated
	 */
	QStatement createStatement(QStatementTerm statementTerm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.asup.fw.java.JavaType" typeRequired="true" annotationsDataType="org.asup.fw.java.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QStatementTerm createStatementTerm(Type type, List<Annotation> annotations);

} // QESqlFactory
