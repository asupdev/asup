/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.fw.core.QService;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProgram;
import org.asup.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.dk.compiler.QCompilerPackage#getCompilerManager()
 * @model abstract="true"
 * @generated
 */
public interface QCompilerManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" masterRequired="true" procedureRequired="true"
	 * @generated
	 */
	QCompilationContext createChildContext(QCompilationContext master, QProcedure procedure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" moduleRequired="true"
	 * @generated
	 */
	QCompilationContext createCompilationContext(QJob job, QModule module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" programRequired="true"
	 * @generated
	 */
	QCompilationContext createCompilationContext(QJob job, QProgram program);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" visitorRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> T prepareVisitor(QCompilationContext context, Class<T> visitor);

} // QCompilerManager
