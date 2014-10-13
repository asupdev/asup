/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import java.io.IOException;
import java.io.OutputStream;
import org.asup.fw.core.QService;
import org.asup.il.data.QCompoundDataTerm;
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
	 * @model required="true" jobRequired="true" structureRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationContext createCompilationContext(QJob job, QCompoundDataTerm<?> structure, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" moduleRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationContext createCompilationContext(QJob job, QModule module, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" programRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationContext createCompilationContext(QJob job, QProgram program, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" contextRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeProgram(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" contextRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeStruct(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" contextRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeStub(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" contextRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeModule(QCompilationContext context, QCompilationSetup setup, OutputStream output) throws IOException;

} // QCompilerManager
