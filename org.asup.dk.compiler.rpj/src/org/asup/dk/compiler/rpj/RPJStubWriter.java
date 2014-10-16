/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 */
package org.asup.dk.compiler.rpj;

import java.io.IOException;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.data.QDataTerm;
import org.asup.il.flow.QProgram;

public class RPJStubWriter extends RPJProgramWriter {

	public RPJStubWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);		
	}
	
	public void writeSkeleton(QProgram program) throws IOException {

		// Program annotation
		writeProgramAnnotation(program);

		writeMain(program.getEntry(), "main");
		
		if(program.getDataSection() != null)
			for(QDataTerm<?> dataTerm: program.getDataSection().getDatas())
				writeInnerTerm(dataTerm);	
	}

}