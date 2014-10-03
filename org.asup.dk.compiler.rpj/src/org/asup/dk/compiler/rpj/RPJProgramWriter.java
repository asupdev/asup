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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.fw.core.annotation.Unsupported;
import org.asup.il.core.QConversion;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Program;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QProgram;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;

public class RPJProgramWriter extends RPJCallableUnitWriter {

	public RPJProgramWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		super(root, compilationContext, compilationSetup, name);
		
		writeImport(Program.class);
	}
	
	public void writeProgram(QProgram program) throws IOException {

		// modules
		List<String> modules = new ArrayList<>();
		if(program.getSetupSection()!=null){
			for(String module: program.getSetupSection().getModules()) 
				loadModules(modules, module);
			
			for(String module: modules) {
				writeImport(module);
			}
		}

		// Program annotation
		writeProgramAnnotation(program);

		writeSupportFields();
		
		writeModuleFields(modules);
				
		if(program.getFileSection() != null)
			writeDataSets(program.getFileSection().getDataSets());
		
		if(program.getDataSection() != null)
			writeDataFields(program.getDataSection());
		
		writeEntry(program.getEntry(), "qEntry");
		
		// main
		if(program.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(program.getMain());
			writeRoutine(getCompilationContext(), routine);
		}

		// functions
		if(program.getFlowSection() != null) {
			
			// routines
			for(QRoutine routine: program.getFlowSection().getRoutines()) {
				writeRoutine(getCompilationContext(), routine);
			}
			
			// prototype
			for(QPrototype<?> prototype: program.getFlowSection().getPrototypes()) {
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

		if(program.getDataSection() != null)
			for(QDataTerm<?> dataTerm: program.getDataSection().getDatas())
				writeInnerTerm(dataTerm);	
	}

	@SuppressWarnings("unchecked")
	public void writeProgramAnnotation(QProgram program) {
		QConversion conversion = program.getFacet(QConversion.class);
		if(conversion != null) {
			MarkerAnnotation conversionAnnotation = getAST().newMarkerAnnotation();
			
			switch (conversion.getStatus()) {
			case POSSIBLE:
				break;
			case SUPPORTED:
				writeImport(Supported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Supported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case TODO:
				writeImport(ToDo.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(ToDo.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case UNSUPPORTED:
				writeImport(Unsupported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Unsupported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			}
		}
		
		// @Program(name=)
		NormalAnnotation programAnnotation = getAST().newNormalAnnotation();
		programAnnotation.setTypeName(getAST().newSimpleName(Program.class.getSimpleName()));
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName("name"));
		StringLiteral stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(program.getName());
		memberValuePair.setValue(stringLiteral);
		programAnnotation.values().add(memberValuePair);

		// @Program(messages=)
		List<String> messages = program.getMessages();
		if (!messages.isEmpty()) {
			memberValuePair = getAST().newMemberValuePair();
			memberValuePair.setName(getAST().newSimpleName("messages"));
			ArrayInitializer arrayInit = getAST().newArrayInitializer();
			for (String message : messages) {

				stringLiteral = getAST().newStringLiteral();
				stringLiteral.setLiteralValue(message); 
				arrayInit.expressions().add(stringLiteral);
			}
			memberValuePair.setValue(arrayInit);
			programAnnotation.values().add(memberValuePair);
		}
	
		getTarget().modifiers().add(programAnnotation);		
	}
	
	private void loadModules(Collection<String> modules, String module) {

		if(!modules.contains(module))
			modules.add(module);
		
		QModule qModule = getCompilationContext().getModule(module, true);
		for(String moduleName: qModule.getSetupSection().getModules()) 
			loadModules(modules, moduleName);
	}
}