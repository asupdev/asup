/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.il.expr.base.util;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.asup.il.expr.ArithmeticOperator;
import org.asup.il.expr.AtomicType;
import org.asup.il.expr.ExpressionType;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.LogicalOperator;
import org.asup.il.expr.RelationalOperator;
import org.asup.il.expr.base.antlr.cl.CLExprLexer;
import org.asup.il.expr.base.antlr.cl.CLExprParser;

public class CLExpressionHelper implements ExpressionHelper {


	public ExpressionType getExpressionType (Tree tree){

		ExpressionType expressionType = null;

		switch (tree.getType()) {

		case CLExprLexer.PLUS:
		case CLExprLexer.MINUS:
		case CLExprLexer.MULT:
		case CLExprLexer.DIV:
		case CLExprLexer.NEGATE:
		case CLExprLexer.CAT:
		case CLExprLexer.BCAT:
		case CLExprLexer.TCAT:	
			
			expressionType = ExpressionType.ARITHMETIC;
		break;

		case CLExprLexer.OR:
		case CLExprLexer.AND:
		case CLExprLexer.NOT:
			expressionType = ExpressionType.LOGICAL;
		break;

		case CLExprLexer.EQ:
		case CLExprLexer.NE:
		case CLExprLexer.LT:
		case CLExprLexer.LTEQ:
		case CLExprLexer.GT:
		case CLExprLexer.GTEQ:
			expressionType = ExpressionType.RELATIONAL;
		break;

		case CLExprLexer.INTEGER:
		case CLExprLexer.FLOAT:
		case CLExprLexer.STRING:
		case CLExprLexer.TERM:
		case CLExprLexer.VAR:
			expressionType = ExpressionType.ATOMIC;
		break;

		case CLExprLexer.SST_FUN:
		case CLExprLexer.BINARY_FUN:
		case CLExprLexer.SWITCH_FUN:			
			expressionType = ExpressionType.COMPOUND;
		break;
		}

		return expressionType;
	}


	public AtomicType getTermType(Tree node) {
		switch (node.getType()) {

		case CLExprLexer.INTEGER:
			return AtomicType.INTEGER;

		case CLExprLexer.FLOAT:
			return AtomicType.FLOATING;

		case CLExprLexer.STRING:
			return AtomicType.STRING;

		case CLExprLexer.TERM:
			return AtomicType.NAME;

		case CLExprLexer.VAR:
			return AtomicType.NAME;

		default:
			System.err.println(node.getType());
			return null;

		}

	}

	public ArithmeticOperator getArithmeticOperator(Tree node) {

		switch (node.getType()) {

		case CLExprLexer.PLUS:
			return ArithmeticOperator.PLUS;
		case CLExprLexer.MINUS:
			return ArithmeticOperator.MINUS;
		case CLExprLexer.MULT:
			return ArithmeticOperator.MULT;
		case CLExprLexer.DIV:
			return ArithmeticOperator.DIVIDE;
		case CLExprLexer.NEGATE:
			return ArithmeticOperator.NEGATE;
		case CLExprLexer.CAT:
			return ArithmeticOperator.PLUS;
		case CLExprLexer.BCAT:
			return ArithmeticOperator.BCAT;
		case CLExprLexer.TCAT:	
			return ArithmeticOperator.TCAT;				
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	public LogicalOperator getLogicalOperator(Tree node) {

		switch (node.getType()) {
		case CLExprLexer.AND:
			return LogicalOperator.AND;
		case CLExprLexer.OR:
			return LogicalOperator.OR;
		case CLExprLexer.NOT:
			return LogicalOperator.NOT;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	public RelationalOperator getRelationalOperator(Tree node) {

		switch (node.getType()) {
		case CLExprLexer.EQ:
			return RelationalOperator.EQUAL;
		case CLExprLexer.NE:
			return RelationalOperator.NOT_EQUAL;
		case CLExprLexer.LT:
			return RelationalOperator.LESS_THAN;
		case CLExprLexer.LTEQ:
			return RelationalOperator.LESS_THAN_EQUAL;
		case CLExprLexer.GT:
			return RelationalOperator.GREATER_THAN;
		case CLExprLexer.GTEQ:
			return RelationalOperator.GREATER_THAN_EQUAL;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	@Override
	public boolean isFunction(Tree node) {
		switch (node.getType()) {

		case CLExprLexer.SST_FUN:
		case CLExprLexer.BINARY_FUN:
		case CLExprLexer.SWITCH_FUN:
			return true;

		default:
			return false;
		}
	}

	public boolean isSpecial(Tree node) {

		switch (node.getType()) {

		case CLExprLexer.SST_FUN:
		case CLExprLexer.BINARY_FUN:
		case CLExprLexer.SWITCH_FUN:
			return true;

		default:
			return false;
		}
	}

	@Override
	public Tree parse(String expression) {
		CommonTree tree;
		CLExprLexer lex = new CLExprLexer(new ANTLRStringStream(expression));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		CLExprParser parser = new CLExprParser(tokens);

		try {
			tree = parser.expression().getTree();
		} catch (RecognitionException e) {
			throw new IntegratedLanguageExpressionRuntimeException(e);
		}

		return tree;
	}

	@Override
	public String normalizeText(String text) {
		return text;
	}
}