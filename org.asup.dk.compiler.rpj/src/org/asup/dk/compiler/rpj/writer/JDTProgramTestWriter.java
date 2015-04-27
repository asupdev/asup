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
package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.fw.core.annotation.Unsupported;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.QTestManager;
import org.asup.il.core.QAnnotationTest;
import org.asup.il.core.QConversion;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Program;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QProgram;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class JDTProgramTestWriter extends JDTCallableUnitWriter {

	private QExpressionParser expressionParser;

	public JDTProgramTestWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
	}
	
	public void writeProgramTest(QProgram programTest) throws IOException {
		System.out.println(programTest);
		expressionParser = getCompilationUnit().getContext().get(QExpressionParser.class);

		refactCallableUnit(programTest);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(programTest);

		// modules
		List<String> modules = new ArrayList<>();
		if (programTest.getSetupSection() != null) {
			for (String module : programTest.getSetupSection().getModules())
				loadModules(modules, module);

			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QCompilerLinker compilerLinker = flowModule.getFacet(QCompilerLinker.class);
				if (compilerLinker != null)
					writeImport(compilerLinker.getLinkedClass());
				else
					writeImport(module);
			}
		}

		// Program annotation
		writeProgramAnnotation(programTest);

		writeSupportFields(callableUnitInfo);

		writeSupportProgramTestFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (programTest.getDataSection() != null)
			writeDataFields(programTest.getDataSection());

		if (programTest.getFileSection() != null) {
			writeDataSets(programTest.getFileSection().getDataSets());
			writeKeyLists(programTest.getFileSection().getKeyLists());
			writeCursors(programTest.getFileSection().getCursors());
			writeStatements(programTest.getFileSection().getStatements());
			writeDisplays(programTest.getFileSection().getDisplays());
			writePrinters(programTest.getFileSection().getPrinters());

		}

//		writeInit();

		writeEntry(programTest, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (programTest.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(programTest.getMain());
			writeRoutine(routine, programTest.getDataSection());
		}

		// functions
		if (programTest.getFlowSection() != null) {

			// routines
			for (QRoutine routine : programTest.getFlowSection().getRoutines()) {
				System.out.println("\t" + routine);
				writeRoutine(routine, null);
			}

			// prototype
			for (QPrototype<?> prototype : programTest.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (programTest.getDataSection() != null) {
			for (QDataTerm<?> dataTerm : programTest.getDataSection().getDatas()) {
				writeInnerTerm(dataTerm);
			}
		}
		
	}


	public void writeEntry(QProgram program, List<String> modules) throws IOException {

		if (program.getEntry() != null) {
			writeEntry(program.getEntry(), "qEntry");
		} else {
			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QParameterList parameterList = null;
				for (QParameterList pl : flowModule.getFlowSection().getParameterLists()) {
					if (pl.getName().equals("*ENTRY")) {
						parameterList = pl;
						break;
					}
				}

				if (parameterList != null) {
					writeEntry(parameterList, "qEntry");
					break;
				}
			}
		}
	}

	// TODO probabilmente questo non è il punto corretto
	@SuppressWarnings("unchecked")
	public void writeSupportProgramTestFields(RPJCallableUnitInfo callableUnitInfo) {
		
		writeImport(QTestManager.class);
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		
		writeAnnotation(field, Inject.class);

		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(getAST().newSimpleType(getAST().newName(QTestAsserter.class.getSimpleName())));
		variable.setName(getAST().newSimpleName("testAsserter"));
		getTarget().bodyDeclarations().add(field);
		
	}
	
	
	// TODO probabilmente questo non è il punto corretto
	@SuppressWarnings("unchecked")
	public void writeRoutine(QRoutine routine, QDataSection dataSection) {

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
		
		// TODO è corretto qui???
		if(dataSection!=null){
			for(QDataTerm<?> dataTerm : dataSection.getDatas()){
				if(dataTerm.getFacet(QAnnotationTest.class)!=null){
					QAnnotationTest qAnnotationTest = dataTerm.getFacet(QAnnotationTest.class);
					writeAssertion(qAnnotationTest, block);
				}
			}
		}
		
		if (routine.getMain() instanceof QBlock) {
			QBlock qBlock = (QBlock) routine.getMain();
			for (org.asup.il.flow.QStatement qStatement : qBlock.getStatements()){
				qStatement.accept(statementWriter);
				if(qStatement.getFacet(QAnnotationTest.class)!=null){
					QAnnotationTest qAnnotationTest = qStatement.getFacet(QAnnotationTest.class);
					writeAssertion(qAnnotationTest, block);
				}
			}
			
		} else
			routine.getMain().accept(statementWriter);

		statementWriter.getBlocks().pop();

	}
	
	@SuppressWarnings("unchecked")
	public void writeProgramAnnotation(QProgram program) {
		QConversion conversion = program.getFacet(QConversion.class);
		if (conversion != null) {
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

		getTarget().modifiers().add(0, programAnnotation);
	}
	
	
	// TODO non credo sia qui il punto giusto
	@SuppressWarnings("unchecked")
	private void writeAssertion(QAnnotationTest qAnnotationTest, Block target) {

		QPredicateExpression expression = expressionParser.parsePredicate(qAnnotationTest.getExpression());
		QRelationalExpression relationalExpression = null;
		if (expression instanceof QRelationalExpression) {
			relationalExpression = (QRelationalExpression) expression;
		} else 
			return;
		
		
		MethodInvocation methodInvocation = getAST().newMethodInvocation();
		methodInvocation.setExpression(getAST().newSimpleName("testAsserter"));

		switch (relationalExpression.getOperator()) {
		case EQUAL:
			methodInvocation.setName(getAST().newSimpleName("assertEquals"));
			break;
		case GREATER_THAN:
			break;
		case GREATER_THAN_EQUAL:
			break;
		case LESS_THAN:
			break;
		case LESS_THAN_EQUAL:
			break;
		case NOT_EQUAL:
			break;
	}
		
		StringLiteral literal = getAST().newStringLiteral();
		literal.setLiteralValue(qAnnotationTest.getMessage());
		methodInvocation.arguments().add(literal);
	
		Expression jdtExpression = buildExpression(getAST(), relationalExpression.getLeftOperand(), null);
		methodInvocation.arguments().add(jdtExpression);

		jdtExpression = buildExpression(getAST(), relationalExpression.getRightOperand(), null);
		methodInvocation.arguments().add(jdtExpression);
		
		ExpressionStatement assertStatement = getAST().newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
	}

		// TODO bisognerebbe farne una classe
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

	private void loadModules(Collection<String> modules, String module) {

		if (!modules.contains(module))
			modules.add(module);

		QModule qModule = getCompilationUnit().getModule(module, true);
		for (String moduleName : qModule.getSetupSection().getModules())
			loadModules(modules, moduleName);
	}
}