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

public class Token {

	private TokenType type; 
	private	String	text;
	
	public Token(TokenType type, String text) {
		this.type = type;
		this.text = text;
	}
	public Token(String type, String text) {
		this(TokenType.valueOf(type), text);
	}
	public TokenType getType() {
		return type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String toString() {
		if(text == null) return getType()+"\t";
		if(type == TokenType.STRING)
			return getType()+"\t"+"'"+text+"'";
		else
			return getType()+"\t"+text;
	}
}