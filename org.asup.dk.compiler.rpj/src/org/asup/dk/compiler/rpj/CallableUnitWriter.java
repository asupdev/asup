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

import java.io.OutputStream;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.rpj.util.CompilationContextHelper;
import org.asup.dk.compiler.rpj.util.FieldHelper;
import org.asup.dk.compiler.rpj.util.TermHelper;
import org.asup.dk.compiler.rpj.util.UnitHelper;
import org.asup.dk.compiler.rpj.visitor.JDTStatementWriter;
import org.asup.dk.compiler.rpj.visitor.StatementNormalizer;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStroller;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QPointer;
import org.asup.il.data.QScroller;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QStatement;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QTableDataSet;
import org.asup.os.type.pgm.rpj.RPJProgramSupport;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class CallableUnitWriter extends UnitWriter {
	
	public CompilationUnit buildCompilationUnit(OutputStream outputStream, String packageName) {
		
		AST ast = AST.newAST(AST.JLS8);
		CompilationUnit unit = ast.newCompilationUnit();

		// package
		if(packageName != null)
			UnitHelper.writePackage(unit, packageName);

		// imports
		UnitHelper.writeImport(unit, RPJProgramSupport.class);
		UnitHelper.writeImport(unit, QCharacter.class);
		UnitHelper.writeImport(unit, QDecimal.class);
		UnitHelper.writeImport(unit, QIndicator.class);
		UnitHelper.writeImport(unit, QDatetime.class);
		UnitHelper.writeImport(unit, QDataStroller.class);
		UnitHelper.writeImport(unit, QDataStruct.class);
		UnitHelper.writeImport(unit, QDataStructDelegator.class);
		UnitHelper.writeImport(unit, QScroller.class);
		UnitHelper.writeImport(unit, QPointer.class);
		UnitHelper.writeImport(unit, QBinary.class);
		UnitHelper.writeImport(unit, DataDef.class);

		return unit;
	}	
	
	@SuppressWarnings("unchecked")
	public void writeModuleFields(TypeDeclaration target, List<String> modules) {
		
		AST ast = target.getAST();
		
		for(String module: modules) {

			String moduleName = CompilationContextHelper.normalizeTermName(module).toUpperCase();
			
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);			
			FieldHelper.writeAnnotation(field, ModuleDef.class.getSimpleName(), "name", moduleName);			
			field.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			field.setType(ast.newSimpleType(ast.newName(moduleName)));
			
			variable.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(module)));
			
			target.bodyDeclarations().add(field);
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void writeDataSets(TypeDeclaration target, List<QDataSetTerm> dataSets) {
		
		AST ast = target.getAST();
		
		for(QDataSetTerm dataSet: dataSets) {
			
			// TODO
			if(!dataSet.getName().equalsIgnoreCase("PRT198")) {
				getCompilationContext().linkDataSet(dataSet);
			}
			
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);
			FieldHelper.writeAnnotation(field, FileDef.class.getSimpleName(), "name", dataSet.getFileName());			
			FieldHelper.writeAnnotation(field, FileDef.class.getSimpleName(), "userOpen", dataSet.isUserOpen());
			field.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			if(dataSet.isKeyedAccess()) 
				className = QIndexDataSet.class.getSimpleName();
			else
				className = QTableDataSet.class.getSimpleName();
			
			Type dataSetType = ast.newSimpleType(ast.newSimpleName(className));
			ParameterizedType parType = ast.newParameterizedType(dataSetType);
			
			if(!dataSet.getName().equalsIgnoreCase("PRT198")) {
				String argument = getCompilationContext().getPhysicalFile(dataSet.getFileName()).getName();
				parType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(argument)));
			}
			else
				parType.typeArguments().add(ast.newWildcardType());
			
			field.setType(parType);
			variable.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(dataSet.getName())));
			target.bodyDeclarations().add(field);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void writeRoutine(TypeDeclaration target, QCompilationContext compilationContext, QRoutine routine) {
		
		AST ast = target.getAST();

		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		target.bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = ast.newBlock();
		methodDeclaration.setBody(block);

		if(routine.getMain() != null) {
			
			// normalize statement
			StatementNormalizer statementNormalizer = compilerManager.prepareVisitor(compilationContext, StatementNormalizer.class);
			for(QStatement statement: routine.getMain().getStatements()) {				
				statement.accept(statementNormalizer);
			}

			// write java AST
			JDTStatementWriter statementWriter = compilerManager.prepareVisitor(compilationContext, JDTStatementWriter.class);
			statementWriter.setAST(ast);		

			statementWriter.getBlocks().push(block);
		
			for(QStatement statement: routine.getMain().getStatements()) {			
				statement.accept(statementWriter);
			}
			
			statementWriter.getBlocks().pop();
		}
				
	}
	
	@SuppressWarnings("unchecked")
	public void writePrototype(TypeDeclaration target, QCompilationContext compilationContext, QPrototype<?> prototype) {
		
		AST ast = target.getAST();

		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		target.bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(prototype.getName())));
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		if(prototype.getDelegate() != null)
			methodDeclaration.setReturnType2(TermHelper.getJavaType(ast, prototype.getDelegate()));
		
		if(prototype.getEntry() != null) {
			
			int p=0;
			for(QEntryParameter<?> entryParameter: prototype.getEntry().getParameters()) {

				QDataTerm<?> dataTerm = entryParameter.getDelegate();
				
				SingleVariableDeclaration singleVar = ast.newSingleVariableDeclaration();			
				String parameterName = dataTerm.getName();
				if(parameterName == null) 
					parameterName = "arg"+p;
				singleVar.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(parameterName)));
				
				// primitive
				if(dataTerm.isConstant())
					singleVar.setType(TermHelper.getJavaPrimitive(ast, dataTerm));
				else
					singleVar.setType(TermHelper.getJavaType(ast, dataTerm));

				methodDeclaration.parameters().add(singleVar);
				
				p++;
			}
		}
		
		Block block = ast.newBlock();
		methodDeclaration.setBody(block);

		// write java AST
		JDTStatementWriter statementWriter = compilerManager.prepareVisitor(compilationContext, JDTStatementWriter.class);
		statementWriter.setAST(ast);		

		statementWriter.getBlocks().push(block);

		if(prototype.getDelegate() != null) {
			ReturnStatement returnStatement = ast.newReturnStatement();
			returnStatement.setExpression(ast.newNullLiteral());
			block.statements().add(returnStatement);
		}
		
		statementWriter.getBlocks().pop();
				
	}

	@SuppressWarnings("unchecked")
	public void writeProcedure(TypeDeclaration target, QCompilationContext compilationContext, QProcedure procedure) {
		
		AST ast = target.getAST();

		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		target.bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(procedure.getName())));
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = ast.newBlock();
		methodDeclaration.setBody(block);

		if(procedure.getMain() != null) {
			
			// normalize statement
			StatementNormalizer statementNormalizer = compilerManager.prepareVisitor(compilationContext, StatementNormalizer.class);
			for(QStatement statement: procedure.getMain().getStatements()) {				
				statement.accept(statementNormalizer);
			}

			// write java AST
			JDTStatementWriter statementWriter = compilerManager.prepareVisitor(compilationContext, JDTStatementWriter.class);
			statementWriter.setAST(ast);		

			statementWriter.getBlocks().push(block);		
			for(QStatement statement: procedure.getMain().getStatements()) {			
				statement.accept(statementWriter);
			}			
			statementWriter.getBlocks().pop();
		}
				
	}
}