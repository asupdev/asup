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
package org.asup.dk.compiler.rpj.writer;

import java.util.Stack;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.core.QAnnotationTest;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.flow.QIf;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;

public class JDTStatementTestWriter extends JDTStatementWriter {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	private AST ast;
	private Stack<Block> blocks = new Stack<>();

	public void setAST(AST ast) {
		this.ast = ast;
		super.setAST(ast);
	}

	public Stack<Block> getBlocks() {
		blocks = super.getBlocks();
		return blocks;
	}

	@SuppressWarnings({ "unchecked"})
	public boolean visit(QIf statement) {

		Block block = blocks.peek();

		IfStatement ifSt = ast.newIfStatement();
		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());

		Expression expression = null;

		if (CompilationContextHelper.isPrimitive(compilationUnit, condition))
			expression = buildExpression(ast, condition, Boolean.class);
		else {
			expression = buildExpression(ast, condition, Boolean.class);
		}
		// expression = buildExpression(ast, condition, null);

		ifSt.setExpression(expression);

		block.statements().add(ifSt);

		// then
		if (statement.getThen() != null) {
			Block thenBlock = null;
			if (ifSt.getThenStatement() instanceof Block)
				thenBlock = (Block) ifSt.getThenStatement();
			else {
				thenBlock = ast.newBlock();
				ifSt.setThenStatement(thenBlock);
			}

			blocks.push(thenBlock);
			statement.getThen().accept(this);
			// Annotation
			if(statement.getThen().getFacet(QAnnotationTest.class)!=null){
				JDTAssertionTestWriter assertionTestWriter = new JDTAssertionTestWriter(ast, compilationUnit, expressionParser);
				QAnnotationTest qAnnotationTest = statement.getThen().getFacet(QAnnotationTest.class);
				assertionTestWriter.writeAssertion(qAnnotationTest, thenBlock, statement.getThen().toString());
			}
			
			blocks.pop();
		}

		// else
		if (statement.getElse() != null) {
			Block elseBlock = null;
			if (ifSt.getElseStatement() instanceof Block)
				elseBlock = (Block) ifSt.getElseStatement();
			else {
				elseBlock = ast.newBlock();
				ifSt.setElseStatement(elseBlock);
			}

			// walk else
			blocks.push(elseBlock);
			statement.getElse().accept(this);
			// Annotation
			if(statement.getElse().getFacet(QAnnotationTest.class)!=null){
				JDTAssertionTestWriter assertionTestWriter = new JDTAssertionTestWriter(ast, compilationUnit, expressionParser);
				QAnnotationTest qAnnotationTest = statement.getElse().getFacet(QAnnotationTest.class);
				assertionTestWriter.writeAssertion(qAnnotationTest, elseBlock, statement.getThen().toString());
			}
			blocks.pop();
		}

		// interrupt navigation
		return false;
	}

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
	

}