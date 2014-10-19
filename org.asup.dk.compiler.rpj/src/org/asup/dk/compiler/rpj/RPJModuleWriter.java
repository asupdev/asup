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
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;

public class RPJModuleWriter extends RPJCallableUnitWriter {

	public RPJModuleWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);
		
		writeImport(QModule.class);
	}
	
	public void writeModule(QModule module) throws IOException {
		
		// analyze callable unit
		analyzeCallableUnit(module);
		
		// modules
		for(String childModule: module.getSetupSection().getModules()) {
			writeImport(childModule);
		}
		
		writeSupportFields();
		
		writeModuleFields(module.getSetupSection().getModules());		
		
		if(module.getFileSection() != null) {
			writeDataSets(module.getFileSection().getDataSets());
			
			writeKeyLists(module.getFileSection().getKeyLists());
		}
				
		if(module.getDataSection() != null)
			writeDataFields(module.getDataSection());

		// labels
		writeLabels(getCallableUnitInfo().getLabels().keySet());
		
		// main
		if(module.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("call");
			routine.setMain(module.getMain());
			
			writeRoutine(getCompilationContext(), routine);
		}

		// functions
		if(module.getFlowSection() != null) {
			
			// routines
			for(QRoutine routine: module.getFlowSection().getRoutines()) {
				writeRoutine(getCompilationContext(), routine);
			}
			
			// prototype
			for(QPrototype<?> prototype: module.getFlowSection().getPrototypes()) {
				writePrototype(getCompilationContext(), prototype);
			}
			
			// procedures
/*			for(QProcedure procedure: module.getFlowSection().getProcedures()) {
	
				// TODO insert master context
				QCompilationContext compilationContext = compilerManager.createChildContext(getCompilationContext(), procedure);
				compilationContext.set(org.asup.il.flow.QProcedure.class, procedure);
				
				writeProcedure(target, compilationContext, procedure);
			}*/
		}

		if(module.getDataSection() != null)
			for(QDataTerm<?> dataTerm: module.getDataSection().getDatas())
				writeInnerTerm(dataTerm);		
	}
}