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
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProgram;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.file.QFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.dk.compiler.QDevelopmentKitCompilerPackage#getCompilerManager()
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
	QCompilationUnit createChildCompilationUnit(QCompilationUnit master, QProcedure procedure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" fileRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QFile file, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" moduleRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QModule module, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" programRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QProgram program, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model compilationUnitRequired="true"
	 * @generated
	 */
	void linkCompilationUnit(QCompilationUnit compilationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeDatabaseFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeDisplayFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeModule(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writePrinterFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeProgram(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" compilationUnitRequired="true" outputDataType="org.asup.fw.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeStub(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

} // QCompilerManager
