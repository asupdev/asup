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

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.core.QAnnotationTest;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QRelationalExpression;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.StringLiteral;

public class JDTAssertionTestWriter {

	private QCompilationUnit compilationUnit;
	private QExpressionParser expressionParser;

	private AST ast;
	
	public JDTAssertionTestWriter(AST ast, QCompilationUnit compilationUnit, QExpressionParser expressionParser) {
		this.ast = ast;
		this.expressionParser = expressionParser;
		this.compilationUnit = compilationUnit;
	}

	@SuppressWarnings("unchecked")
	public void writeAssertion(QAnnotationTest qAnnotationTest, Block target, String message) {

		QPredicateExpression expression = expressionParser.parsePredicate(qAnnotationTest.getExpression());
		QRelationalExpression relationalExpression = null;
		if (expression instanceof QRelationalExpression) {
			relationalExpression = (QRelationalExpression) expression;
		} else 
			return;
		
		
		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("testAsserter"));

		switch (relationalExpression.getOperator()) {
		case EQUAL:
			methodInvocation.setName(ast.newSimpleName("assertEquals"));
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
		
		Expression leftExpression = buildExpression(ast, relationalExpression.getLeftOperand(), null);
		Expression rightExpression = buildExpression(ast, relationalExpression.getRightOperand(), null);
		
		// message 
		
		StringLiteral literal = ast.newStringLiteral();
		if(qAnnotationTest.getMessage().isEmpty()){
			if(message.isEmpty()){
				literal.setLiteralValue("Init " + leftExpression);
			}else{
				// normalize
				literal.setLiteralValue(normalizeMessage(message));
			}
		}else{
			literal.setLiteralValue(qAnnotationTest.getMessage());
		}

		methodInvocation.arguments().add(literal);
		methodInvocation.arguments().add(leftExpression);
		methodInvocation.arguments().add(rightExpression);
		
		ExpressionStatement assertStatement = ast.newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
	}

		// TODO bisognerebbe farne una classe
	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {
	
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);
	
		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
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

	private String normalizeMessage(String message) {
		String newMessage = "";
		int pos =message.indexOf("("); 
		if(pos == -1){
			return message;
		}
		newMessage = message.substring(pos);
		return newMessage;
	}

}
