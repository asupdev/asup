/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.fw.core.QContext;
import org.asup.il.core.QNamedNode;
import org.asup.il.data.QDataTerm;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.isam.QDataSetTerm;
import org.asup.os.type.file.QPhysicalFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.dk.compiler.QCompilerPackage#getCompilationContext()
 * @model abstract="true"
 * @generated
 */
public interface QCompilationContext extends QContext {

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	QCallableUnit getUnitContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataSetRequired="true"
	 * @generated
	 */
	void linkDataSet(QDataSetTerm dataSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QPhysicalFile getPhysicalFile(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QDataSetTerm getDataSet(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QDataTerm<?> getData(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QModule getModule(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QPrototype<?> getPrototype(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QRoutine getRoutine(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QNamedNode getNamedNode(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QProcedure getProcedure(String name, boolean deep);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" namedNodeRequired="true"
	 * @generated
	 */
	String getQualifiedName(QNamedNode namedNode);
} // QCompilationContext
