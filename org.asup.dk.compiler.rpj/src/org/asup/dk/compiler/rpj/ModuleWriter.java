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
import java.io.OutputStream;

import javax.inject.Inject;

import org.asup.dk.compiler.rpj.util.TermHelper;
import org.asup.dk.compiler.rpj.util.UnitHelper;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.os.type.pgm.impl.CallableProgramImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class ModuleWriter extends CallableUnitWriter {

	@Inject
	private QModule module;

	@SuppressWarnings("unchecked")
	public void writeModule(OutputStream outputStream, String packageName) throws IOException {
		
		CompilationUnit compilationUnit = buildCompilationUnit(outputStream, packageName);
		
		// append module
		UnitHelper.writeImport(compilationUnit, QModule.class);
		AST ast = compilationUnit.getAST();
		
		// modules
		for(String childModule: module.getSetupSection().getModules()) {
			ImportDeclaration importDeclaration = ast.newImportDeclaration();
			importDeclaration.setName(ast.newName(childModule));
			compilationUnit.imports().add(importDeclaration);
		}

		
		// Type declaration
		TypeDeclaration target = ast.newTypeDeclaration();
		target.setInterface(false);
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		target.setName(ast.newSimpleName(module.getName()));
		target.setSuperclassType(ast.newSimpleType(ast.newName(CallableProgramImpl.class.getSimpleName())));

//		writeSuppressWarning(target);		
		compilationUnit.types().add(target);

		writeSupportFields(target);
		
		writeModuleFields(target, module.getSetupSection().getModules());
		
		if(module.getFileSection() != null)
			writeDataSets(target, module.getFileSection().getDataSets());
				
		if(module.getDataSection() != null)
			writeDataFields(target, module.getDataSection());

		// main
		if(module.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("call");
			routine.setMain(module.getMain());
			writeRoutine(target, getCompilationContext(), routine);
		}

		// functions
		if(module.getFlowSection() != null) {
			
			// routines
			for(QRoutine routine: module.getFlowSection().getRoutines()) {
				writeRoutine(target, getCompilationContext(), routine);
			}
			
			// prototype
			for(QPrototype<?> prototype: module.getFlowSection().getPrototypes()) {
				writePrototype(target, getCompilationContext(), prototype);
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
			TermHelper.writeInnerTerms(compilationUnit, target, module.getDataSection().getDatas());
		
		writeOutputStream(compilationUnit, outputStream);
	}
}