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

import org.asup.il.expr.AtomicType;
import org.asup.il.expr.QArithmeticExpression;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QBlockExpression;
import org.asup.il.expr.QBooleanExpression;
import org.asup.il.expr.QCompoundTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QLogicalExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.expr.impl.ExpressionVisitorImpl;

public class RPJExpressionStringBuilder extends ExpressionVisitorImpl {

	String result = "";

	public String getResult() {
		return result;
	}
	
	public RPJExpressionStringBuilder reset() {
		result = "";
		return this;
	}

	@Override
	public boolean visit(QBooleanExpression expression) {
		expression.getOperand().accept(this);
		return false;
	}

	@Override
	public boolean visit(QLogicalExpression expression) {

		switch (expression.getOperator()) {
		case AND:
			expression.getLeftOperand().accept(this);
			result += " and ";
			break;
		case NOT:
			result += " not ";
			expression.getLeftOperand().accept(this);
			break;
		case OR:
			expression.getLeftOperand().accept(this);
			result += " or ";
			break;
		}
		
		if(expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);
		
		return false;
	}

	@Override
	public boolean visit(QRelationalExpression expression) {
		
		expression.getLeftOperand().accept(this);
		
		switch (expression.getOperator()) {
		case EQUAL:
			result += " = ";
			break;
		case GREATER_THAN:
			result += " > ";
			break;
		case GREATER_THAN_EQUAL:
			result += " >= ";
			break;
		case LESS_THAN:
			result += " < ";
			break;
		case LESS_THAN_EQUAL:
			result += " >= ";
			break;
		case NOT_EQUAL:
			result += " <> ";
			break;
		}
		
		if(expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);
		
		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		expression.getLeftOperand().accept(this);
		
		switch (expression.getOperator()) {
		case BCAT:
			result += "|>";
			break;
		case TCAT:
			result += ">|";
			break;
		case DIVIDE:
			result += "/";
			break;
		case MINUS:
			result += "-";
			break;
		case MODULAR:
			result += "%";
			break;
		case MULT:
			result += "*";
			break;
		case NEGATE:
			result += "-";
			break;
		case PLUS:
			result += "+";
			break;
		case POWER:
			result += "**";
			break;
		}
		
		if(expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);
		
		return false;

	}

	@Override
	public boolean visit(QAssignmentExpression expression) {
		
		expression.getLeftOperand().accept(this);
		
		switch (expression.getOperator()) {
		case ASSIGN:
			result += " = ";
			break;
		case DIVIDE_ASSIGN:
			result += " /= ";
			break;
		case MINUS_ASSIGN:
		result += " -= ";
			break;
		case PLUS_ASSIGN:
			result += " += ";
			break;
		case POWER_ASSIGN:
			result += " **= ";
			break;
		case TIMES_ASSIGN:
			result += " *= ";
			break;
		default:
			break;
		}
		
		if(expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);
		
		return false;

	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {
		
		if(expression.getType() == AtomicType.STRING)
			result += "'"+expression.getValue()+"'";
		else
			result += expression.getValue();
		
		if(expression.isFunction())
			result += "()";
		
		return false;
	}

	@Override
	public boolean visit(QBlockExpression expression) {
		
		result += "(";
		expression.getExpression().accept(this);
		result += ")";

		return false;
	}

	@Override
	public boolean visit(QCompoundTermExpression expression) {
		

		if(expression.isFunction()) {
			result += " "+expression.getValue();
			
			if(!expression.getElements().isEmpty()) {
				boolean first = true;
				result += "(";
				for(QExpression child: expression.getElements()) {
					if(!first)
						result += ": ";
					child.accept(this);
					first = false;
				}
				result += ")";
			}
		}
		else {
			
			result += " "+expression.getValue();

			// TODO
			if(!result.contains(".")) {
				for(QExpression child: expression.getElements()) {
					result += ".";
					child.accept(this);
				}
			}
		}

		return false;
	}
}	