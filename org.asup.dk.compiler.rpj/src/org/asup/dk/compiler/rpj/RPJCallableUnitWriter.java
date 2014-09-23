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

import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.rpj.visitor.JDTStatementWriter;
import org.asup.dk.compiler.rpj.visitor.StatementNormalizer;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QStatement;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QTableDataSet;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class RPJCallableUnitWriter extends RPJUnitWriter {

	public RPJCallableUnitWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {		
		super(root, compilationContext, compilationSetup, name);
	}

	
	@SuppressWarnings("unchecked")
	public void writeModuleFields(List<String> modules) {
		
		for(String module: modules) {

			String moduleName = getCompilationContext().normalizeTermName(module).toUpperCase();
			
			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);			
			writeAnnotation(field, ModuleDef.class, "name", moduleName);			
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(moduleName)));
			
			variable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(module)));
			
			getTarget().bodyDeclarations().add(field);
		}
		
	}
		
	public void writeDataFields(QDataSection dataSection) {

		// fields
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {
			
			if(dataTerm.getDefinition() == null)
				continue;
			
			dataTerm = getCompilationContext().getData(dataTerm.getName(), true);
			
			writePublicField(dataTerm, false);
		}

	}
	@SuppressWarnings("unchecked")
	public void writeDataSets(List<QDataSetTerm> dataSets) {
		
		for(QDataSetTerm dataSet: dataSets) {
	
			getCompilationContext().linkDataSet(dataSet);
			
			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", dataSet.getFileName());			
			writeAnnotation(field, FileDef.class, "userOpen", dataSet.isUserOpen());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			if(dataSet.isKeyedAccess()) 
				className = QIndexDataSet.class.getSimpleName();
			else
				className = QTableDataSet.class.getSimpleName();
			
			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(dataSetType);
			
			if(!dataSet.getName().equalsIgnoreCase("PRT198")) {
				String argument = getCompilationContext().getPhysicalFile(dataSet.getFileName()).getName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}
			else
				parType.typeArguments().add(getAST().newWildcardType());
			
			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataSet.getName())));
			getTarget().bodyDeclarations().add(field);
		}
		
	}

	@SuppressWarnings("unchecked")
	public void writeRoutine(QCompilationContext compilationContext, QRoutine routine) {
				
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(compilationContext.normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if(routine.getMain() != null) {
			
			// normalize statement
			StatementNormalizer statementNormalizer = compilationContext.make(StatementNormalizer.class);
			for(QStatement statement: routine.getMain().getStatements()) {				
				statement.accept(statementNormalizer);
			}

			// write java AST
			JDTStatementWriter statementWriter = compilationContext.make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());		

			statementWriter.getBlocks().push(block);
		
			for(QStatement statement: routine.getMain().getStatements()) {			
				statement.accept(statementWriter);
			}
			
			statementWriter.getBlocks().pop();
		}
				
	}
	
	@SuppressWarnings("unchecked")
	public void writePrototype(QCompilationContext compilationContext, QPrototype<?> prototype) {
		
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(compilationContext.normalizeTermName(prototype.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		if(prototype.getDelegate() != null) {
			Type type = prepareJavaType(prototype.getDelegate());
			methodDeclaration.setReturnType2(type);
		}
		
		if(prototype.getEntry() != null) {
			
			int p=0;
			for(QEntryParameter<?> entryParameter: prototype.getEntry().getParameters()) {

				QDataTerm<?> dataTerm = entryParameter.getDelegate();
				
				SingleVariableDeclaration singleVar = getAST().newSingleVariableDeclaration();			
				String parameterName = dataTerm.getName();
				if(parameterName == null) 
					parameterName = "arg"+p;
				singleVar.setName(getAST().newSimpleName(compilationContext.normalizeTermName(parameterName)));
				
				// primitive
				if(dataTerm.isConstant())
					singleVar.setType(getJavaPrimitive(dataTerm));
				else {
					Type type = prepareJavaType(dataTerm);
					singleVar.setType(type);
				}

				methodDeclaration.parameters().add(singleVar);
				
				p++;
			}
		}
		
		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		// write java AST
		JDTStatementWriter statementWriter = compilationContext.make(JDTStatementWriter.class);
		statementWriter.setAST(getAST());		

		statementWriter.getBlocks().push(block);

		if(prototype.getDelegate() != null) {
			ReturnStatement returnStatement = getAST().newReturnStatement();
			returnStatement.setExpression(getAST().newNullLiteral());
			block.statements().add(returnStatement);
		}
		
		statementWriter.getBlocks().pop();
				
	}

	@SuppressWarnings("unchecked")
	public void writeProcedure(TypeDeclaration target, QCompilationContext compilationContext, QProcedure procedure) {
		
		AST ast = target.getAST();

		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		target.bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(ast.newSimpleName(compilationContext.normalizeTermName(procedure.getName())));
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = ast.newBlock();
		methodDeclaration.setBody(block);

		if(procedure.getMain() != null) {
			
			// normalize statement
			StatementNormalizer statementNormalizer = compilationContext.make(StatementNormalizer.class);
			for(QStatement statement: procedure.getMain().getStatements()) {				
				statement.accept(statementNormalizer);
			}

			// write java AST
			JDTStatementWriter statementWriter = compilationContext.make(JDTStatementWriter.class);
			statementWriter.setAST(ast);		

			statementWriter.getBlocks().push(block);		
			for(QStatement statement: procedure.getMain().getStatements()) {			
				statement.accept(statementWriter);
			}			
			statementWriter.getBlocks().pop();
		}
				
	}
	
	@SuppressWarnings("unchecked")
	public void writeMain(QParameterList parameterList, String name) {
			
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		for(String parameterName: parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationContext().getData(parameterName, true);
			
			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataTerm.getName())));
			Type type = prepareJavaType(dataTerm);
			parameterVariable.setType(type);
			
			writeDataDefAnnotation(parameterVariable, dataTerm.getDefinition());
			
			methodDeclaration.parameters().add(parameterVariable);
		}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);
	}

	@SuppressWarnings("unchecked")
	public void writeEntry(QParameterList parameterList, String name) {
		
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		for(String parameterName: parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationContext().getData(parameterName, true);
			
			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataTerm.getName())));
			Type type = prepareJavaType(dataTerm);
			parameterVariable.setType(type);
			
			writeDataDefAnnotation(parameterVariable, dataTerm.getDefinition());
			
			methodDeclaration.parameters().add(parameterVariable);
		}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);
	}
}