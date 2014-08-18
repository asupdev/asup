/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.asup.dk.parser;

public enum TokenType { 
	PLUS, MINUS, MULT, DIV, MOD, POW,
	EQ, NE, GT, GE, LT, LE,
	AND, OR, NOT,
	WHITE_SPACE, PARAM, COMMA, EXP_OPEN, EXP_CLOSE, DIM_OPEN, DIM_CLOSE, 
	EMPTY,STRING, NUMBER, INDICATOR, TOKEN, VALUE, FILLER, SPECIAL, VARIABLE;

	public boolean isOperator() {
		if(isArithmetical() || isRelation() || isLogical())
			return true;
		else
			return false;
	}
	
	public boolean isPrimitive() {
		switch (this) {
			case NUMBER:
			case STRING:
			case INDICATOR:
			case SPECIAL:
				return true;
			default:
				return false;			
		}
	}
	public OperatorType getOperatorType() {
		if(isLogical())
			return OperatorType.LOGIC;
		else if(isArithmetical())
			return OperatorType.ARITHMETIC;
		else if(isRelation())
			return OperatorType.RELATION;
		return null;
	} 
	
	public boolean isRelation() {
		if(this == EQ ||
				this == NE ||
				this == LT ||
				this == LE ||
				this == GT ||
				this == GE 
				)
				return true;
			else
				return false;		
	}
	public boolean isArithmetical() {
		if(this == PLUS ||
			this == MINUS ||
			this == MULT ||
			this == DIV ||
			this == MOD ||
			this == POW)
			return true;
		else
			return false;
	}
	public boolean isLogical() {
		if(this == AND ||
			this == OR ||
			this == NOT)
			return true;
		else
			return false;
	}
}
