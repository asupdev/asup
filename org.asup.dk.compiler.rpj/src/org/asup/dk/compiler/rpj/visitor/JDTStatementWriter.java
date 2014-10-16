/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.visitor;

import java.util.Iterator;
import java.util.Stack;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.rpj.helper.CompilationContextHelper;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QNode;
import org.asup.il.core.QTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataTerm;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QContinue;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QIteration;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QMonitor;
import org.asup.il.flow.QOnError;
import org.asup.il.flow.QProcedureExec;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.asup.il.flow.impl.StatementVisitorImpl;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.WhileStatement;

public class JDTStatementWriter extends StatementVisitorImpl {

	@Inject
	private QCompilationContext compilationContext;
	@Inject
	private QExpressionParser expressionParser;

	private AST ast;
	private Stack<Block> blocks = new Stack<>();

	public void setAST(AST ast) {
		this.ast = ast;
	}

	public Stack<Block> getBlocks() {
		return blocks;
	}

	@Override
	public void endVisit(QBlock statement) {

		// double {} on if statement
		EObject eObject = (EObject)statement;
		if(!(eObject.eContainer() instanceof QIf) &&
		   !(eObject.eContainer() instanceof QIteration))
			blocks.pop();
	}

	@Override
	public void endVisit(QFor statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@Override
	public void endVisit(QUntil statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@Override
	public void endVisit(QWhile statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QBlock statement) {

		Block block = blocks.peek();

		// double {} on if statement
		EObject eObject = (EObject)statement;
		if(!(eObject.eContainer() instanceof QIf) &&
			!(eObject.eContainer() instanceof QIteration)) {
			Block newBlock = ast.newBlock();
			block.statements().add(newBlock);
			blocks.push(newBlock);
		}

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QBreak statement) {

		Block block = blocks.peek();

		BreakStatement breakSt = ast.newBreakStatement();
		block.statements().add(breakSt);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QCall statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qCall"));

		// program name
		QTermExpression expression = expressionParser.parseTerm(statement.getProgram());
		Expression jdtExpression = buildExpression(ast, expression, String.class);
		methodInvocation.arguments().add(jdtExpression);

		// array of parameter
		ArrayCreation arrayCreation= ast.newArrayCreation();
		arrayCreation.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName(QData.class.getSimpleName()))));
		ArrayInitializer arrayInitializer = ast.newArrayInitializer();
		for (String parameter :statement.getParameters()){
			expression = expressionParser.parseTerm(parameter);
			jdtExpression = buildExpression(ast, expression, null);
			arrayInitializer.expressions().add(jdtExpression);

		}
		arrayCreation.setInitializer(arrayInitializer);
		methodInvocation.arguments().add(arrayCreation);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QCommandExec statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qCommand"));

		// command statement
		StringLiteral stringLiteral = ast.newStringLiteral();
		stringLiteral.setLiteralValue(statement.getStatement());
		methodInvocation.arguments().add(stringLiteral);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QContinue statement) {

		Block block = blocks.peek();

		ContinueStatement continueSt = ast.newContinueStatement();
		block.statements().add(continueSt);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QEval statement) {
		
		Block block = blocks.peek();

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());
		MethodInvocation methodInvocation = buildAssignmentMethod(assignmentExpression);	

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QIf statement) {
		
		Block block = blocks.peek();

		IfStatement ifSt = ast.newIfStatement();
		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());

		Expression expression = null;
		
		if(CompilationContextHelper.isPrimitive(compilationContext, condition))
 			expression = buildExpression(ast, condition, Boolean.class);
		else
			expression = buildExpression(ast, condition, null);

		ifSt.setExpression(expression);

		block.statements().add(ifSt);

		// then
		Block thenBlock = null;
		if(ifSt.getThenStatement() instanceof Block)
			thenBlock = (Block) ifSt.getThenStatement();
		else {
			thenBlock = ast.newBlock();
			ifSt.setThenStatement(thenBlock);
		}

		// walk then
		blocks.push(thenBlock);
		statement.getThen().accept(this);
		blocks.pop();

		// else
		if(statement.getElse() != null) {
			Block elseBlock = null;
			if(ifSt.getElseStatement() instanceof Block)
				elseBlock = (Block) ifSt.getElseStatement();
			else {
				elseBlock = ast.newBlock();
				ifSt.setElseStatement(elseBlock);
			}

			// walk else
			blocks.push(elseBlock);
			statement.getElse().accept(this);
			blocks.pop();
		}

		// interrupt navigation
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QFor statement) {

		Block block = blocks.peek();

		ForStatement forSt = ast.newForStatement();

		// initialization
		QAssignmentExpression assignment = expressionParser.parseAssignment(statement.getInitialization());
		forSt.initializers().add(buildAssignmentMethod(assignment));
		
		// condition
		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());			
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationContext, condition));
		forSt.setExpression(expression);
		
		// increment
		QAssignmentExpression increment = expressionParser.parseAssignment(statement.getIncrement());
		forSt.updaters().add(buildAssignmentMethod(increment));
		
		block.statements().add(forSt);

		// body
		Block bodyBlock = ast.newBlock();
		forSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QProcedureExec statement) {
		
		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		QPrototype<?> prototype = compilationContext.getPrototype(statement.getProcedure(), true);
		if(prototype == null) 
			throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure: "+statement.getProcedure());
		
		methodInvocation.setName(ast.newSimpleName(compilationContext.normalizeTermName(prototype.getName())));

		if(prototype.isChild() && prototype.getParent() != compilationContext.getRoot()) {
			QNode parent = prototype.getParent();
			if(parent instanceof QNamedNode) {
				String qualifiedParent = compilationContext.getQualifiedName((QNamedNode) parent); 
				methodInvocation.setExpression(buildExpression(ast, expressionParser.parseTerm(qualifiedParent), null));
			}
			else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure: "+statement.getProcedure());
		}

		// entry
		if(prototype.getEntry() != null) {
			Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();		
			
			for(String parameter: statement.getParameters()){
				QTermExpression expression = expressionParser.parseTerm(parameter);
				if(entryParameters.hasNext()) {
					QEntryParameter<?> entryParameter = entryParameters.next();
					QTerm parameterDelegate = entryParameter.getDelegate(); 
					
					if(parameterDelegate instanceof QDataTerm) {
						QDataTerm<?> dataTerm = (QDataTerm<?>)parameterDelegate;
						
						if(dataTerm.isConstant()) {
							Expression jdtExpression = buildExpression(ast, expression, dataTerm.getDefinition().getJavaClass());
							methodInvocation.arguments().add(jdtExpression);
						}
						else {
							Expression jdtExpression = buildExpression(ast, expression, dataTerm.getDefinition().getDataClass());
							methodInvocation.arguments().add(jdtExpression);
						}
					}
					else if(parameterDelegate instanceof QDataSetTerm) {
						Expression jdtExpression = buildExpression(ast, expression, QDataSet.class);
						methodInvocation.arguments().add(jdtExpression);
					}
				}
				else
					throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: "+statement.getProcedure());
			}
		}
		
		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QJump statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qJump"));
		
		Name labelName = ast.newName(new String[] {"TAG", statement.getLabel()});
		methodInvocation.arguments().add(0,labelName);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QLabel statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qLabel"));

		Name labelName = ast.newName(new String[] {"TAG", statement.getName()});
		methodInvocation.arguments().add(0,labelName);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QMethodExec statement) {

		try {
			Block block = blocks.peek();

			MethodInvocation methodInvocation = ast.newMethodInvocation();
			methodInvocation.setName(ast.newSimpleName(compilationContext.normalizeTermName(statement.getMethod())));

			if(statement.getObject()!=null)
				methodInvocation.setExpression(buildExpression(ast, expressionParser.parseTerm(statement.getObject()), null));

			if(statement.getParameters()!=null){
				for(String parameter:statement.getParameters()) {					
					
					QTermExpression expression = expressionParser.parseTerm(parameter);
					Expression jdtExpression = buildExpression(ast, expression, null);
					methodInvocation.arguments().add(jdtExpression);

				}
			}

			ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);

			return super.visit(statement);
		}
		catch(Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QMonitor statement) {

		Block block = blocks.peek();

		// -> try
		TryStatement tryStatement = ast.newTryStatement();
		blocks.push(tryStatement.getBody());
		for(QStatement child: statement.getBody().getStatements()) {
			child.accept(this);
		}

		
		// catch
		CatchClause catchClause = ast.newCatchClause();
		SingleVariableDeclaration exceptionDeclaration = ast.newSingleVariableDeclaration();
		exceptionDeclaration.setName(ast.newSimpleName("e"));
		Type exception = ast.newSimpleType(ast.newSimpleName(OperatingSystemRuntimeException.class.getSimpleName()));
		exceptionDeclaration.setType(exception);
		catchClause.setException(exceptionDeclaration);
		tryStatement.catchClauses().add(catchClause);

		// -> catch
		blocks.push(catchClause.getBody());

		// switch
		SwitchStatement switchStatement = ast.newSwitchStatement();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("e"));
		methodInvocation.setName(ast.newSimpleName("toString"));
		switchStatement.setExpression(methodInvocation);

		blocks.peek().statements().add(switchStatement);

		for(QOnError error: statement.getOnErrors()) {
			if (error.getBody() != null) {

				// Case
				SwitchCase switchCase = ast.newSwitchCase();
				StringLiteral caseLiteral = ast.newStringLiteral();
				if(error.getError() != null)
					caseLiteral.setLiteralValue(error.getError());
				else
					caseLiteral.setLiteralValue("*ALL");
				
				switchCase.setExpression(caseLiteral);
				switchStatement.statements().add(switchCase);

				// Case body

				// -> Case
				Block caseBlock = ast.newBlock();
				blocks.push(caseBlock);

				for(QStatement child: error.getBody().getStatements()) {
					child.accept(this);
				}

				// copy case block to switch statement
				for (int i = 0; i < caseBlock.statements().size(); i++) {
					switchStatement.statements().add(caseBlock.statements().remove(i));
				}

				// <- case
				blocks.pop();

				// Case break
				BreakStatement switchBreak = ast.newBreakStatement();
				switchStatement.statements().add(switchBreak);
			}
		}

		// <-catch
		blocks.pop();

		// <-try
		blocks.pop();

		block.statements().add(tryStatement);

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QReturn statement) {

		Block block = blocks.peek();

		ReturnStatement returnSt = ast.newReturnStatement();
		block.statements().add(returnSt);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QSQLExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QUntil statement) {

		Block block = blocks.peek();

		DoStatement doSt = ast.newDoStatement();
		
		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());			
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationContext, condition));
		doSt.setExpression(expression);
		
		block.statements().add(doSt);

		// body
		Block bodyBlock = ast.newBlock();
		doSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QWhile statement) {

		if(statement.getCondition() == null)
			statement.setCondition("true");
		
		Block block = blocks.peek();

		WhileStatement whileSt = ast.newWhileStatement();

		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationContext, condition));
		whileSt.setExpression(expression);

		block.statements().add(whileSt);

		// body
		Block bodyBlock = ast.newBlock();
		whileSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {

		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);

		JDTExpressionStringBuilder builder = compilationContext.make(JDTExpressionStringBuilder.class);
		builder.setTarget(target);
		expression.accept(builder);
		String value = builder.getResult();
		
		parser.setSource(value.toCharArray());
		ASTNode node = parser.createAST(null);
		if(node.getLength()==0) 
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: "+value);


		Expression jdtExpression = (Expression) node;

		return (Expression) ASTNode.copySubtree(ast, jdtExpression);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QRoutineExec statement) {
		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		QNamedNode routine = compilationContext.getRoutine(statement.getRoutine(), true);
		if(routine == null) 
			throw new IntegratedLanguageExpressionRuntimeException("Invalid routine: "+statement.getRoutine());
		
		methodInvocation.setName(ast.newSimpleName(compilationContext.normalizeTermName(routine.getName())));

		if(routine.isChild() && routine.getParent() != compilationContext.getRoot()) {
			QNode parent = routine.getParent();
			if(parent instanceof QNamedNode) {
				String qualifiedParent = compilationContext.getQualifiedName((QNamedNode) parent); 
				methodInvocation.setExpression(buildExpression(ast, expressionParser.parseTerm(qualifiedParent), null));
			}
			else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid routine: "+statement.getRoutine());
		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}
	

	@SuppressWarnings("unchecked")
	private MethodInvocation buildAssignmentMethod(QAssignmentExpression assignmentExpression) {
	
		MethodInvocation methodInvocation = ast.newMethodInvocation();

		Expression expression = buildExpression(ast, assignmentExpression.getLeftOperand(), null);
		methodInvocation.setExpression(expression);

		int p=0;
		switch (assignmentExpression.getOperator()) {
		case ASSIGN:
			methodInvocation.setName(ast.newSimpleName("eval"));
			break;
		case DIVIDE_ASSIGN:
			methodInvocation.setName(ast.newSimpleName("divide"));
//			methodInvocation.arguments().add(p, "/");
//			p++;
			break;
		case MINUS_ASSIGN:
			methodInvocation.setName(ast.newSimpleName("minus"));
//			methodInvocation.arguments().add(p, "-");
//			p++;
			break;
		case PLUS_ASSIGN:
			methodInvocation.setName(ast.newSimpleName("plus"));
//			methodInvocation.arguments().add(p, "+");
//			p++;
			break;
		case TIMES_ASSIGN:
			methodInvocation.setName(ast.newSimpleName("mult"));
//			methodInvocation.arguments().add(p, "*");
//			p++;
			break;
		case POWER_ASSIGN:
			methodInvocation.setName(ast.newSimpleName("power"));
//			methodInvocation.arguments().add(p, "^");
//			p++;
			break;
		}

		expression = buildExpression(ast, assignmentExpression.getRightOperand(), null);

		methodInvocation.arguments().add(p, expression);

		return methodInvocation;
	}
}