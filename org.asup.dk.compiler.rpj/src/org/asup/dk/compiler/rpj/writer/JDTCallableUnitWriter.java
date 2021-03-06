/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi 			 - Initial API and implementation 
 *   Giuliano Giancristofaro - Implementation
 */
package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.fw.core.annotation.Unsupported;
import org.asup.il.core.QConversion;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QRemap;
import org.asup.il.core.QTerm;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Entry;
import org.asup.il.esql.CursorType;
import org.asup.il.esql.QCursor;
import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QStatement;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.esql.annotation.CursorDef;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QUnit;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QDisplay;
import org.asup.il.isam.QDisplayTerm;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QPrint;
import org.asup.il.isam.QPrintTerm;
import org.asup.il.isam.QRRDataSet;
import org.asup.il.isam.QSMDataSet;
import org.asup.il.isam.annotation.FileDef;
import org.asup.os.type.pgm.rpj.RPJServiceSupport;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class JDTCallableUnitWriter extends JDTUnitWriter {

	private QExpressionParser expressionParser;

	public JDTCallableUnitWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		expressionParser = getCompilationUnit().getContext().get(QExpressionParser.class);
	}

	@SuppressWarnings("unchecked")
	public void writeLabels(Collection<String> labels) {

		if (labels.isEmpty())
			return;

		EnumDeclaration enumType = getAST().newEnumDeclaration();
		enumType.setName(getAST().newSimpleName("TAG"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		for (String label : labels) {

			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(normalizeEnumName(label)));

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

		for (String message : messages) {
			if (message.equalsIgnoreCase("CPF0000"))
				continue;
			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(normalizeEnumName(message)));

			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}

	@SuppressWarnings("unchecked")
	public void writeModuleFields(List<String> modules, boolean public_) {

		for (String module : modules) {

			String moduleName = getCompilationUnit().normalizeTermName(module).toUpperCase();

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);

			// writeAnnotation(field, ModuleDef.class, "name", moduleName);
			writeAnnotation(field, Inject.class);
			// writeAnnotation(field, Named.class, "value", moduleName);

			if (public_)
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			else
				field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));

			field.setType(getAST().newSimpleType(getAST().newName(moduleName)));

			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(module)));

			getTarget().bodyDeclarations().add(field);
		}

	}

	public void writeDataFields(QDataSection dataSection) {

		// fields
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {

			if (dataTerm.getDefinition() == null)
				continue;

			dataTerm = getCompilationUnit().getDataTerm(dataTerm.getName(), true);
			writePublicField(dataTerm, false);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDataSets(List<QDataSetTerm> dataSets) throws IOException {

		writeImport(QDataSet.class);

		for (QDataSetTerm dataSet : dataSets) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", dataSet.getFileName());
			writeAnnotation(field, FileDef.class, "userOpen", dataSet.isUserOpen());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = dataSet.getFacet(QCompilerLinker.class);

			if (dataSet.isKeyedAccess()) {
				writeImport(QKSDataSet.class);
				className = QKSDataSet.class.getSimpleName();
			} else {

				try {
					if (dataSet.getRecord().getElements().size() > 1 && dataSet.getRecord().getElements().get(0).getName().equalsIgnoreCase("SRCSEQ")) {

						writeImport(QSMDataSet.class);
						className = QSMDataSet.class.getSimpleName();

					} else {
						writeImport(QRRDataSet.class);
						className = QRRDataSet.class.getSimpleName();
					}
				} catch (NullPointerException e) {
					writeImport(QRRDataSet.class);
					className = QRRDataSet.class.getSimpleName();
				}

			}

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(dataSetType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = dataSet.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataSet.getName())));

			getTarget().bodyDeclarations().add(field);

			if (compilerLinker == null && dataSet.getRecord() != null)
				writeInnerRecord(dataSet.getFileName(), dataSet.getRecord());
		}

	}

	public void writeKeyLists(List<QKeyListTerm> keyLists) {

		writeImport(QBufferedData.class);

		for (QKeyListTerm keyList : keyLists) {
			if(!CompilationContextHelper.containsArray(expressionParser, keyList))
				writeKeyList(keyList);
		}
	}

	@SuppressWarnings("unchecked")
	public void writeKeyList(QKeyListTerm keyList) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(keyList.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Type bufferedType = getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()));
		field.setType(getAST().newArrayType(bufferedType));

		// array of bufferedData
		ArrayCreation arrayCreation = getAST().newArrayCreation();
		arrayCreation.setType(getAST().newArrayType(getAST().newSimpleType(getAST().newSimpleName(QBufferedData.class.getSimpleName()))));

		ArrayInitializer arrayInitializer = getAST().newArrayInitializer();
		for (String keyField : keyList.getKeyFields()) {

			QExpression expression = expressionParser.parseExpression(keyField);
			Expression jdtExpression = buildExpression(getAST(), expression, null);
			arrayInitializer.expressions().add(jdtExpression);
		}
		arrayCreation.setInitializer(arrayInitializer);

		variable.setInitializer(arrayCreation);

		getTarget().bodyDeclarations().add(field);
	}

	@SuppressWarnings("unchecked")
	public void writeCursors(List<QCursorTerm> cursors) {

		writeImport(QCursor.class);
		writeImport(CursorType.class);

		for (QCursorTerm cursorTerm : cursors) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			if (cursorTerm.isHold())
				writeAnnotation(field, CursorDef.class, "hold", cursorTerm.isHold());
			writeAnnotation(field, CursorDef.class, "type", cursorTerm.getCursorType());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(QCursor.class.getSimpleName()));
			field.setType(dataSetType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(cursorTerm.getName())));
			getTarget().bodyDeclarations().add(field);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeStatements(List<QStatementTerm> statements) {

		writeImport(QStatement.class);

		for (QStatementTerm statementTerm : statements) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			Type dataSetType = getAST().newSimpleType(getAST().newSimpleName(QStatement.class.getSimpleName()));
			field.setType(dataSetType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(statementTerm.getName())));
			getTarget().bodyDeclarations().add(field);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeDisplays(List<QDisplayTerm> displays) throws IOException {

		writeImport(QDisplay.class);

		for (QDisplayTerm display : displays) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", display.getFileName());
			writeAnnotation(field, FileDef.class, "userOpen", display.isUserOpen());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = display.getFacet(QCompilerLinker.class);

			writeImport(QDisplay.class);
			className = QDisplay.class.getSimpleName();

			Type displayType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(displayType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = display.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(display.getName())));

			getTarget().bodyDeclarations().add(field);

			if (compilerLinker == null && display.getRecord() != null)
				writeInnerRecord(display.getFileName(), display.getRecord());
		}

	}

	@SuppressWarnings("unchecked")
	public void writePrinters(List<QPrintTerm> printers) throws IOException {

		writeImport(QPrint.class);

		for (QPrintTerm printer : printers) {

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, FileDef.class, "name", printer.getFileName());
			writeAnnotation(field, FileDef.class, "userOpen", printer.isUserOpen());
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

			String className = null;
			QCompilerLinker compilerLinker = printer.getFacet(QCompilerLinker.class);

			writeImport(QPrint.class);
			className = QPrint.class.getSimpleName();

			Type printerType = getAST().newSimpleType(getAST().newSimpleName(className));
			ParameterizedType parType = getAST().newParameterizedType(printerType);

			if (compilerLinker != null) {
				writeImport(compilerLinker.getLinkedClass());
				parType.typeArguments().add(getAST().newSimpleType(getAST().newName(compilerLinker.getLinkedClass().getSimpleName())));
			} else {
				String argument = printer.getFileName();
				parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));
			}

			field.setType(parType);
			variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(printer.getName())));

			getTarget().bodyDeclarations().add(field);

			if (compilerLinker == null && printer.getRecord() != null)
				writeInnerRecord(printer.getFileName(), printer.getRecord());
		}

	}

	@SuppressWarnings("unchecked")
	public void writeRoutine(QRoutine routine) {

		if (routine.getName().startsWith("*ENTRY") || routine.getName().startsWith("*EXIT"))
			return;

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (routine.getMain() == null)
			return;

		// write java AST
		JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
		statementWriter.setAST(getAST());

		statementWriter.getBlocks().push(block);

		if (routine.getMain() instanceof QBlock) {
			QBlock qBlock = (QBlock) routine.getMain();
			for (org.asup.il.flow.QStatement qStatement : qBlock.getStatements())
				qStatement.accept(statementWriter);
		} else
			routine.getMain().accept(statementWriter);

		statementWriter.getBlocks().pop();

	}

	@SuppressWarnings("unchecked")
	public void writePrototype(QPrototype<?> prototype) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(prototype.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		if (prototype.getDelegate() != null) {
			Type type = getJavaType(prototype.getDelegate());
			methodDeclaration.setReturnType2(type);
		}

		if (prototype.getEntry() != null) {

			int p = 0;
			for (QEntryParameter<?> entryParameter : prototype.getEntry().getParameters()) {

				QTerm parameterDelegate = entryParameter.getDelegate();

				SingleVariableDeclaration singleVar = getAST().newSingleVariableDeclaration();
				String parameterName = parameterDelegate.getName();
				if (parameterName == null)
					parameterName = "arg" + p;
				singleVar.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(parameterName)));

				if (parameterDelegate instanceof QDataTerm) {
					QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;

					// primitive
					if (dataTerm.isConstant())
						singleVar.setType(getJavaPrimitive(dataTerm));
					else {
						Type type = getJavaType(dataTerm);
						singleVar.setType(type);
					}
				} else if (parameterDelegate instanceof QDataSetTerm) {

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
		JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
		statementWriter.setAST(getAST());

		statementWriter.getBlocks().push(block);

		if (prototype.getDelegate() != null) {
			ReturnStatement returnStatement = getAST().newReturnStatement();

			// returnStatement.setExpression(getAST().newNullLiteral());
			// block.statements().add(returnStatement);
			block.statements().add(getReturnStatement(returnStatement, prototype, methodDeclaration));
		}

		statementWriter.getBlocks().pop();

	}

	@SuppressWarnings("unchecked")
	public void writeMain(QParameterList parameterList, String name) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		for (String parameterName : parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataTerm.getName())));
			Type type = getJavaType(dataTerm);
			parameterVariable.setType(type);

			QConversion conversion = dataTerm.getFacet(QConversion.class);
			if (conversion != null) {
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
	public void writeInit() {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName("qInit"));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(PostConstruct.class.getSimpleName()));
		writeImport(PostConstruct.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		// redefined record dataSet
		if (getCompilationUnit().getRoot() instanceof QCallableUnit) {

			// getCompilationUnit().refresh();

			QCallableUnit callableUnit = (QCallableUnit) getCompilationUnit().getRoot();
			if (callableUnit.getFileSection() != null) {
				for (QDataSetTerm dataSetTerm : callableUnit.getFileSection().getDataSets()) {

					if (dataSetTerm.getRecord() == null)
						continue;

					QTerm primaryRecord = CompilationContextHelper.getPrimaryRecord(callableUnit, dataSetTerm);
					if(!dataSetTerm.equals(primaryRecord)) {
						
						System.out.println(primaryRecord);
						
						MethodInvocation methodInvocation = getAST().newMethodInvocation();
						methodInvocation.setName(getAST().newSimpleName("assign"));
						methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName(primaryRecord)));
						
						methodInvocation.arguments().add(buildExpression(getCompilationUnit().getQualifiedName(dataSetTerm)+".get()"));
						ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
						block.statements().add(expressionStatement);
						
					}
					
					// remap
					for (QDataTerm<?> element : dataSetTerm.getRecord().getElements()) {
						QRemap remap = element.getFacet(QRemap.class);
						if (remap == null)
							continue;

						MethodInvocation methodInvocation = getAST().newMethodInvocation();
						methodInvocation.setName(getAST().newSimpleName("assign"));

						QDataTerm<?> remapDataTerm = getCompilationUnit().getDataTerm(remap.getName(), true);
						if (remapDataTerm == null)
							throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + remap);

						if (getCompilationUnit().equalsTermName(element.getName(), remapDataTerm.getName()))
							continue;

						if (remap.getIndex() == null || remap.getIndex().isEmpty())
							methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName(remapDataTerm)));
						else
							methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName(remapDataTerm) + ".get(" + Integer.parseInt(remap.getIndex()) + ")"));

						methodInvocation.arguments().add(buildExpression(getCompilationUnit().getQualifiedName(element)));
						ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
						block.statements().add(expressionStatement);

					}
				}
			}
		}

		QRoutine qInzsr = getCompilationUnit().getRoutine("*INZSR", true);
		if (qInzsr != null) {

			if (qInzsr.getParent() == getCompilationUnit().getRoot()) {
				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setExpression(getAST().newThisExpression());
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			} else {
				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName((QNamedNode) qInzsr.getParent())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}
		} else {

			qInzsr = getCompilationUnit().getRoutine("£MU_INZSR", true);
			if (qInzsr != null) {

				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(qInzsr.getName())));
				methodInvocation.setExpression(buildExpression(getCompilationUnit().getQualifiedName((QNamedNode) qInzsr.getParent())));
				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);
			}
		}

		// £INIZI
		QRoutine £inizi = getCompilationUnit().getRoutine("£INIZI", false);
		if (£inizi != null) {
			MethodInvocation methodInvocation = getAST().newMethodInvocation();
			methodInvocation = getAST().newMethodInvocation();
			methodInvocation.setExpression(getAST().newThisExpression());
			methodInvocation.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(£inizi.getName())));
			ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);
		}

	}

	@SuppressWarnings("unchecked")
	public void writeEntry(QParameterList parameterList, String name) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(name));

		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		for (String parameterName : parameterList.getParameters()) {
			QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

			SingleVariableDeclaration parameterVariable = getAST().newSingleVariableDeclaration();
			parameterVariable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(dataTerm.getName())));
			Type type = getJavaType(dataTerm);
			parameterVariable.setType(type);

			writeDataDefAnnotation(parameterVariable, dataTerm.getDefinition());

			methodDeclaration.parameters().add(parameterVariable);
		}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		for (String parameterName : parameterList.getParameters()) {

			MethodInvocation methodInvocation = getAST().newMethodInvocation();
			methodInvocation.setName(getAST().newSimpleName("assign"));

			methodInvocation.setExpression(getAST().newSimpleName(getCompilationUnit().normalizeTermName(parameterName)));

			QDataTerm<?> dataTerm = getCompilationUnit().getDataTerm(parameterName, true);

			String qualifiedName = getCompilationUnit().getQualifiedName(dataTerm);
			String[] fieldNames = qualifiedName.split("\\.");
			if (fieldNames.length > 1) {
				methodInvocation.arguments().add(buildExpression(qualifiedName));
			} else {
				FieldAccess targetAccess = getAST().newFieldAccess();
				targetAccess.setExpression(getAST().newThisExpression());

				for (int i = 0; i < fieldNames.length; i++) {

					targetAccess.setName(getAST().newSimpleName(fieldNames[i]));

					if (i < fieldNames.length - 1) {
						FieldAccess childAccess = getAST().newFieldAccess();
						childAccess.setExpression(targetAccess);
						targetAccess = childAccess;

					}
				}
				methodInvocation.arguments().add(targetAccess);
			}

			ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);
		}

		QRoutine routine = getCompilationUnit().getRoutine("*ENTRY", false);
		if (routine != null) {
			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());

			statementWriter.getBlocks().push(block);

			if (routine.getMain() instanceof QBlock) {
				QBlock qBlock = (QBlock) routine.getMain();
				for (org.asup.il.flow.QStatement qStatement : qBlock.getStatements())
					qStatement.accept(statementWriter);
			} else
				routine.getMain().accept(statementWriter);

			statementWriter.getBlocks().pop();
		}

		// this.main
		MethodInvocation mainInvocation = getAST().newMethodInvocation();
		mainInvocation.setExpression(getAST().newThisExpression());
		mainInvocation.setName(getAST().newSimpleName("main"));

		ExpressionStatement mainStatement = getAST().newExpressionStatement(mainInvocation);
		block.statements().add(mainStatement);

		routine = getCompilationUnit().getRoutine("*EXIT", false);
		if (routine != null) {
			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());

			statementWriter.getBlocks().push(block);

			if (routine.getMain() instanceof QBlock) {
				QBlock qBlock = (QBlock) routine.getMain();
				for (org.asup.il.flow.QStatement qStatement : qBlock.getStatements())
					qStatement.accept(statementWriter);
			} else
				routine.getMain().accept(statementWriter);

			statementWriter.getBlocks().pop();
		}

	}

	public void refactCallableUnit(QCallableUnit callableUnit) {

		refactUnit(callableUnit);

		// main
		if (callableUnit.getFlowSection() != null) {
			for (QUnit unit : callableUnit.getFlowSection().getRoutines()) {
				refactUnit(unit);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private ReturnStatement getReturnStatement(ReturnStatement returnStatement, QPrototype<?> prototype, MethodDeclaration methodDeclaration) {

		String namePrototype = getCompilationUnit().normalizeTermName(prototype.getName());
		MethodInvocation methodInvocation = getAST().newMethodInvocation();
		switch (namePrototype) {
		case "p_rxatt":
			writeImport(RPJServiceSupport.class);
			methodInvocation.setExpression(getAST().newName("qJAX"));
			methodInvocation.setName(getAST().newSimpleName(namePrototype));
			for (Object entryParameter : methodDeclaration.parameters()) {
				SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) entryParameter;
				methodInvocation.arguments().add(getAST().newSimpleName(singleVariableDeclaration.getName().toString()));
			}

			returnStatement.setExpression(methodInvocation);
			break;
		case "p_rxsos":
			writeImport(RPJServiceSupport.class);
			methodInvocation.setExpression(getAST().newName("qJAX"));
			methodInvocation.setName(getAST().newSimpleName(namePrototype));
			for (Object entryParameter : methodDeclaration.parameters()) {
				SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) entryParameter;
				methodInvocation.arguments().add(getAST().newSimpleName(singleVariableDeclaration.getName().toString()));
			}

			returnStatement.setExpression(methodInvocation);
			break;
		case "p_rxlate":
			writeImport(RPJServiceSupport.class);
			methodInvocation.setExpression(getAST().newName("qJAX"));
			methodInvocation.setName(getAST().newSimpleName(namePrototype));
			for (Object entryParameter : methodDeclaration.parameters()) {
				SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) entryParameter;
				methodInvocation.arguments().add(getAST().newSimpleName(singleVariableDeclaration.getName().toString()));
			}

			returnStatement.setExpression(methodInvocation);
			break;
		default:
			returnStatement.setExpression(getAST().newNullLiteral());
		}

		return returnStatement;
	}

	private Expression buildExpression(String expression) {

		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);

		parser.setSource(expression.toCharArray());
		ASTNode node = parser.createAST(null);
		if (node.getLength() == 0)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: " + expression);

		Expression jdtExpression = (Expression) node;

		return (Expression) ASTNode.copySubtree(getAST(), jdtExpression);
	}

	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {

		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);

		JDTExpressionStringBuilder builder = getCompilationUnit().getContext().make(JDTExpressionStringBuilder.class);
		builder.setTarget(target);
		expression.accept(builder);
		String value = builder.getResult();

		parser.setSource(value.toCharArray());
		ASTNode node = parser.createAST(null);
		if (node.getLength() == 0)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: " + value);

		Expression jdtExpression = (Expression) node;

		return (Expression) ASTNode.copySubtree(ast, jdtExpression);
	}
}