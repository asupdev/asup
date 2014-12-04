/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProgram;
import org.asup.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.dk.compiler.QCompilerPackage#getUnitConverter()
 * @model abstract="true"
 * @generated
 */
public interface QUnitConverter extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaException" jobRequired="true" moduleRequired="true"
	 * @generated
	 */
	QModule convertModule(QJob job, org.asup.os.type.module.QModule module) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaException" jobRequired="true" programRequired="true"
	 * @generated
	 */
	QProgram convertProgram(QJob job, org.asup.os.type.pgm.QProgram program) throws Exception;

} // QUnitConverter
