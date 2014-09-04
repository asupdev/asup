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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.asup.dk.compiler.rpj.util.FieldHelper;
import org.asup.dk.compiler.rpj.util.TermHelper;
import org.asup.dk.compiler.rpj.util.UnitHelper;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QProgram;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.os.type.pgm.impl.CallableProgramImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class ProgramWriter extends CallableUnitWriter {

	@Inject
	private QProgram program;
	
	@SuppressWarnings("unchecked")
	public void writeProgram(OutputStream outputStream, String packageName) throws IOException {

		CompilationUnit compilationUnit = buildCompilationUnit(outputStream, packageName);
		AST ast = compilationUnit.getAST();
		
		// append program
		UnitHelper.writeImport(compilationUnit, QProgram.class);
		UnitHelper.writeImport(compilationUnit, Program.class);
		
		// modules
		List<String> modules = new ArrayList<>();
		if(program.getSetupSection()!=null){
			for(String module: program.getSetupSection().getModules()) 
				loadModules(modules, module);
			
			for(String module: modules) {
				ImportDeclaration importDeclaration = ast.newImportDeclaration();
				importDeclaration.setName(ast.newName(module));
				compilationUnit.imports().add(importDeclaration);
			}
		}

		
		// @Program(name=)
		NormalAnnotation normalAnnotation = ast.newNormalAnnotation();
		normalAnnotation.setTypeName(ast.newSimpleName(Program.class.getSimpleName()));
		MemberValuePair memberValuePair = ast.newMemberValuePair();
		memberValuePair.setName(ast.newSimpleName("name"));
		StringLiteral stringLiteral = ast.newStringLiteral();
		stringLiteral.setLiteralValue(program.getName());
		memberValuePair.setValue(stringLiteral);
		normalAnnotation.values().add(memberValuePair);

		// @Program(messages=)
		List<String> messages = program.getMessages();
		if (!messages.isEmpty()) {
			memberValuePair = ast.newMemberValuePair();
			memberValuePair.setName(ast.newSimpleName("messages"));
			ArrayInitializer arrayInit = ast.newArrayInitializer();
			for (String message : messages) {

				stringLiteral = ast.newStringLiteral();
				stringLiteral.setLiteralValue(message); 
				arrayInit.expressions().add(stringLiteral);
			}
			memberValuePair.setValue(arrayInit);
			normalAnnotation.values().add(memberValuePair);
		}

		// Type declaration
		TypeDeclaration target = ast.newTypeDeclaration();
		target.setInterface(false);
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));		
		target.setName(ast.newSimpleName(program.getName()));
		target.modifiers().add(normalAnnotation);	
		target.setSuperclassType(ast.newSimpleType(ast.newName(CallableProgramImpl.class.getSimpleName())));
		
//		writeSuppressWarning(target);
		compilationUnit.types().add(target);

		writeSupportFields(target);
		
		writeModuleFields(target, modules);
				
		if(program.getFileSection() != null)
			writeDataSets(target, program.getFileSection().getDataSets());
		
		if(program.getDataSection() != null)
			writeDataFields(target, program.getDataSection());
		
		writeEntry(target);
		
		// main
		if(program.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(program.getMain());
			writeRoutine(target, getCompilationContext(), routine);
		}

		// functions
		if(program.getFlowSection() != null) {
			
			// routines
			for(QRoutine routine: program.getFlowSection().getRoutines()) {
				writeRoutine(target, getCompilationContext(), routine);
			}
			
			// prototype
			for(QPrototype<?> prototype: program.getFlowSection().getPrototypes()) {
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

		if(program.getDataSection() != null)
			TermHelper.writeInnerTerms(compilationUnit, target, program.getDataSection().getDatas());
		
		writeOutputStream(compilationUnit, outputStream);
	}
	
	@SuppressWarnings("unchecked")
	private void writeEntry(TypeDeclaration target) {
		
		AST ast = target.getAST();
		
		QParameterList qEntry = QIntegratedLanguageFlowFactory.eINSTANCE.createParameterList();
		if(program.getSetupSection()!=null){
			for(String moduleName: program.getSetupSection().getModules()) {
				QModule module = getCompilationContext().getModule(moduleName, true);
				if(module.getFlowSection() != null) {
					for(QParameterList parameterList: module.getFlowSection().getParameterLists()) {
						if(parameterList.getName().equalsIgnoreCase("*ENTRY")) {
							qEntry = parameterList;
							break;
						}
					}
				}
				if(!qEntry.getParameters().isEmpty())
					break;
			}
		}


		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		target.bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(ast.newSimpleName("call"));
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		MarkerAnnotation entryAnnotation = ast.newMarkerAnnotation();
		entryAnnotation.setTypeName(ast.newSimpleName(Entry.class.getSimpleName()));
		methodDeclaration.modifiers().add(entryAnnotation);

		for(String parameterName: qEntry.getParameters()) {

			SingleVariableDeclaration singleVar = ast.newSingleVariableDeclaration();
			QDataTerm<?> dataTerm = getCompilationContext().getData(parameterName, true); 
			FieldHelper.writeMethodParameter(singleVar, dataTerm);
			methodDeclaration.parameters().add(singleVar);
		}

		Block block = ast.newBlock();
		methodDeclaration.setBody(block);
	}
	
	private void loadModules(Collection<String> modules, String module) {

		if(!modules.contains(module))
			modules.add(module);
		
		QModule qModule = getCompilationContext().getModule(module, true);
		for(String moduleName: qModule.getSetupSection().getModules()) 
			loadModules(modules, moduleName);
	}
}