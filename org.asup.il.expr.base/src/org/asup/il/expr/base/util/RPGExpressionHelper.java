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
 *   Mattia Rocchi - Implementation
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
import org.asup.il.expr.base.antlr.rpg.RPGExprLexer;
import org.asup.il.expr.base.antlr.rpg.RPGExprParser;

public class RPGExpressionHelper implements ExpressionHelper {

	public ExpressionType getExpressionType(Tree node){

		switch (node.getType()) {

		// arithmetic
		case RPGExprLexer.PLUS:
		case RPGExprLexer.MINUS:
		case RPGExprLexer.MULT:
		case RPGExprLexer.DIV:
		case RPGExprLexer.MOD:
		case RPGExprLexer.POW:
		case RPGExprLexer.SIGN_MINUS:
		case RPGExprLexer.SIGN_PLUS:	
			return ExpressionType.ARITHMETIC;

		// logical
		case RPGExprLexer.AND:
		case RPGExprLexer.OR:
		case RPGExprLexer.NOT:
			return ExpressionType.LOGICAL;

		// relation
		case RPGExprLexer.EQ:
		case RPGExprLexer.NE:
		case RPGExprLexer.LT:
		case RPGExprLexer.LTEQ:
		case RPGExprLexer.GT:
		case RPGExprLexer.GTEQ:
			return ExpressionType.RELATIONAL;

		case RPGExprLexer.QUALIFIED:
		case RPGExprLexer.USER_FUNCTION:
		case RPGExprLexer.BI_FUNCTION:
			return ExpressionType.COMPOUND;

		case RPGExprLexer.SP_VALUE:	
		case RPGExprLexer.INDICATOR:
		case RPGExprLexer.TERM:
		case RPGExprLexer.INTEGER:
		case RPGExprLexer.FLOAT:
		case RPGExprLexer.DATETIME:
		case RPGExprLexer.BOOLEAN:
		case RPGExprLexer.STRING:
		case RPGExprLexer.HEX:
			return ExpressionType.ATOMIC;

		case RPGExprLexer.BLOCK:
			return ExpressionType.BLOCK;

		default:
			System.err.println(node.getType());
			return null;
		}
	}

	public ArithmeticOperator getArithmeticOperator(Tree node) {

		switch (node.getType()) {

		case RPGExprLexer.PLUS:
			return ArithmeticOperator.PLUS;
		case RPGExprLexer.MINUS:
			return ArithmeticOperator.MINUS;
		case RPGExprLexer.MULT:
			return ArithmeticOperator.MULT;
		case RPGExprLexer.DIV:
			return ArithmeticOperator.DIVIDE;
		case RPGExprLexer.MOD:
			return ArithmeticOperator.MODULAR;
		case RPGExprLexer.POW:
			return ArithmeticOperator.POWER;
		case RPGExprLexer.SIGN_MINUS:
				return ArithmeticOperator.SIGN_MINUS;
		case RPGExprLexer.SIGN_PLUS:
				return ArithmeticOperator.SIGN_PLUS;			
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	public LogicalOperator getLogicalOperator(Tree node) {

		switch (node.getType()) {
		case RPGExprLexer.AND:
			return LogicalOperator.AND;
		case RPGExprLexer.OR:
			return LogicalOperator.OR;
		case RPGExprLexer.NOT:
			return LogicalOperator.NOT;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	public RelationalOperator getRelationalOperator(Tree node) {

		switch (node.getType()) {
		case RPGExprLexer.EQ:
			return RelationalOperator.EQUAL;
		case RPGExprLexer.NE:
			return RelationalOperator.NOT_EQUAL;
		case RPGExprLexer.LT:
			return RelationalOperator.LESS_THAN;
		case RPGExprLexer.LTEQ:
			return RelationalOperator.LESS_THAN_EQUAL;
		case RPGExprLexer.GT:
			return RelationalOperator.GREATER_THAN;
		case RPGExprLexer.GTEQ:
			return RelationalOperator.GREATER_THAN_EQUAL;
		default:
			System.err.println(node.getType());
			return null;
		}
	}


	public boolean isFunction(Tree node) {

		switch (node.getType()) {
		case RPGExprLexer.BI_FUNCTION:
		case RPGExprLexer.USER_FUNCTION:
			return true;
		default:
			return false;
		}
	}

	public boolean isSpecial(Tree node) {

		switch (node.getType()) {
		case RPGExprLexer.BI_FUNCTION:
		case RPGExprLexer.SP_VALUE:
			return true;
		default:
			return false;
		}
	}

	public AtomicType getTermType(Tree node) {

		switch (node.getType()) {		
		case RPGExprLexer.INDICATOR:
			return AtomicType.INDICATOR;
		case RPGExprLexer.SP_VALUE:
			return AtomicType.SPECIAL;
		case RPGExprLexer.TERM:
			return AtomicType.NAME;
		case RPGExprLexer.INTEGER:
			return AtomicType.INTEGER;
		case RPGExprLexer.FLOAT:
			return AtomicType.FLOATING;
		case RPGExprLexer.DATETIME:
			return AtomicType.DATETIME;
		case RPGExprLexer.BOOLEAN:
			return AtomicType.BOOLEAN;
		case RPGExprLexer.STRING:
			return AtomicType.STRING;
		case RPGExprLexer.HEX:
			return AtomicType.HEXADECIMAL;
		default:
			return null;
		}
	}

	@Override
	public Tree parse(String expression) {
		
		RPGExprLexer lex = new RPGExprLexer(new ANTLRStringStream(expression));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		RPGExprParser parser = new RPGExprParser(tokens);

		try {
			CommonTree tree = parser.expression().getTree();
			return tree;
		} catch (RecognitionException e) {
			throw new IntegratedLanguageExpressionRuntimeException(e);
		}
	}

	@Override
	public String normalizeText(String text) {
		return text;
	}

	@Override
	public String getFunctionName(Tree node) {
		return normalizeText(node.getText());
	}
}