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

import java.util.Collection;
import java.util.List;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.rpj.helper.EnumHelper;
import org.asup.dk.compiler.rpj.visitor.JDTStatementWriter;
import org.asup.dk.compiler.rpj.visitor.RPJCallableUnitAnalyzer;
import org.asup.dk.compiler.rpj.visitor.RPJExpressionNormalizer;
import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.fw.core.annotation.Unsupported;
import org.asup.il.core.QConversion;
import org.asup.il.core.QTerm;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QStatement;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIndexDataSet;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QTableDataSet;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class RPJCallableUnitWriter extends RPJUnitWriter {

	public RPJCallableUnitWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {		
		super(root, compilationContext, compilationSetup, name);
	}
	
	public void analyzeCallableUnit(QCallableUnit callableUnit) {
		// analyze statement
		RPJCallableUnitAnalyzer callableUnitAnalyzer = new RPJCallableUnitAnalyzer(getCallableUnitInfo());
		
		// main
		if(callableUnit.getMain() != null) {
			for(QStatement statement: callableUnit.getMain().getStatements()) {				
				statement.accept(callableUnitAnalyzer);
			}
		}
		
		// flow section
		if(callableUnit.getFlowSection() != null) {
			
			// routines
			for(QRoutine routine: callableUnit.getFlowSection().getRoutines()) {
				for(QStatement statement: routine.getMain().getStatements()) {				
					statement.accept(callableUnitAnalyzer);
				}		
			}
		}

	}
	
	
	@SuppressWarnings("unchecked")
	public void writeLabels(Collection<String> labels) {
		
		if(labels.isEmpty())
			return;
		
		EnumDeclaration enumType = getAST().newEnumDeclaration();
		enumType.setName(getAST().newSimpleName("TAG"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;
		
		for (String label: labels) {

			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(EnumHelper.normalizeEnumName(label)));
			
			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}
	
	@SuppressWarnings("unchecked")
	public void writeMessages(Collection<String> messages) {
			
		EnumDeclaration enumType = getAST().newEnumDeclaration();
		enumType.setName(getAST().newSimpleName("QCPFMSG"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;
		
		for (String message: messages) {
			if(message.equalsIgnoreCase("CPF0000"))
				continue;
			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(EnumHelper.normalizeEnumName(message)));
			
			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
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
			
			dataTerm = getCompilationContext().getDataTerm(dataTerm.getName(), true);
			
			writePublicField(dataTerm, false);			
		}

	}
	@SuppressWarnings("unchecked")
	public void writeDataSets(List<QDataSetTerm> dataSets) {
		
		writeImport(QDataSet.class);
		
		for(QDataSetTerm dataSet: dataSets) {
	
			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "fileName", dataSet.getFileName());			
			writeAnnotation(field, FileDef.class, "userOpen", dataSet.isUserOpen());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			if(dataSet.isKeyedAccess()) { 
				writeImport(QIndexDataSet.class);
				className = QIndexDataSet.class.getSimpleName();
			}
			else {
				writeImport(QTableDataSet.class);
				className = QTableDataSet.class.getSimpleName();
			}
			
			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(dataSetType);

			String argument = dataSet.getFileName();
			parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			
			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataSet.getName())));
			getTarget().bodyDeclarations().add(field);
		}
		
	}
	
	public void writeKeyLists(List<QKeyListTerm> keyLists) {
		
		writeImport(QBufferedData.class);
		
		for(QKeyListTerm keyList: keyLists) {
			writeKeyList(keyList);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void writeKeyList(QKeyListTerm keyList) {
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(keyList.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);		
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Type bufferedType = getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()));		
		field.setType(getAST().newArrayType(bufferedType));

		// array of bufferedData
		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()))));

		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		for (String keyField: keyList.getKeyFields()){
			arrayInitializer.expressions().add(getAST().newSimpleName(getCompilationContext().normalizeTermName(keyField)));
		}
		arrayCreation.setInitializer(arrayInitializer);

		variable.setInitializer(arrayCreation);
		
		getTarget().bodyDeclarations().add(field);
	}
	
	@SuppressWarnings("unchecked")
	public void writeRoutine(QCompilationContext compilationContext, QRoutine routine) {
				
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(compilationContext.normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

//		writeSuppressWarning(methodDeclaration);
		
		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if(routine.getMain() != null) {
			
			// normalize statement
			RPJExpressionNormalizer expressionNormalizer = compilationContext.make(RPJExpressionNormalizer.class);
			for(QStatement statement: routine.getMain().getStatements()) {
				statement.accept(expressionNormalizer);
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

//		writeSuppressWarning(methodDeclaration);
		
		if(prototype.getDelegate() != null) {
			Type type = prepareJavaType(prototype.getDelegate());
			methodDeclaration.setReturnType2(type);
		}
		
		if(prototype.getEntry() != null) {
			
			int p=0;
			for(QEntryParameter<?> entryParameter: prototype.getEntry().getParameters()) {

				QTerm parameterDelegate = entryParameter.getDelegate();
				
				SingleVariableDeclaration singleVar = getAST().newSingleVariableDeclaration();			
				String parameterName = parameterDelegate.getName();
				if(parameterName == null) 
					parameterName = "arg"+p;
				singleVar.setName(getAST().newSimpleName(compilationContext.normalizeTermName(parameterName)));
				
				if(parameterDelegate instanceof QDataTerm) {
					QDataTerm<?> dataTerm = (QDataTerm<?>)parameterDelegate;

					// primitive
					if(dataTerm.isConstant())
						singleVar.setType(getJavaPrimitive(dataTerm));
					else {
						Type type = prepareJavaType(dataTerm);
						singleVar.setType(type);
					}
				}
				else if(parameterDelegate instanceof QDataSetTerm) {
					
					Type dataSet = getAST().newSimpleType(getAST().newSimpleName(QDataSet.class.getSimpleName()));
					ParameterizedType parType = getAST().newParameterizedType(dataSet);
					parType.typeArguments().add(getAST().newWildcardType());
					
					singleVar.setType(parType);	
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
	public void writeMain(QParameterList parameterList, String name) {
			
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

//		writeSuppressWarning(methodDeclaration);
		
		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		for(String parameterName: parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationContext().getDataTerm(parameterName, true);
			
			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(dataTerm.getName())));
			Type type = prepareJavaType(dataTerm);
			parameterVariable.setType(type);
			
			QConversion conversion = dataTerm.getFacet(QConversion.class);
			if(conversion != null) {
				MarkerAnnotation conversionAnnotation = getAST().newMarkerAnnotation();
				
				switch (conversion.getStatus()) {
				case POSSIBLE:
					break;
				case SUPPORTED:
					writeImport(Supported.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(Supported.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				case TODO:
					writeImport(ToDo.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(ToDo.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				case UNSUPPORTED:
					writeImport(Unsupported.class);
					conversionAnnotation.setTypeName(getAST().newSimpleName(Unsupported.class.getSimpleName()));
					parameterVariable.modifiers().add(conversionAnnotation);
					break;
				}
			}
			
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
			QDataTerm<?> dataTerm = getCompilationContext().getDataTerm(parameterName, true);
			
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