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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.asup.dk.parser.antlr.Shell400Lexer;
import org.asup.dk.parser.antlr.Shell400Parser;


public class Parser_shell400 extends Parser {

	public Parser_shell400() {
		super();
	}

	
	@Override
	public Iterator<Token> tokenize(String expression) throws InvalidExpressionException {
		CharStream input = new ANTLRStringStream(expression);
		Shell400Lexer lexer = new Shell400Lexer(input);
		Shell400Parser parser = new Shell400Parser(new CommonTokenStream(lexer));
        String names[] = parser.getTokenNames();
        
		List<Token> tokens = new LinkedList<Token>();
        try {    		
    		parser.parse();
            for(int x=0; x<parser.input.index(); x++) {
            	org.antlr.runtime.Token t = parser.input.get(x);
            	Token token = new Token(names[t.getType()], t.getText());
            	tokens.add(token);
            }
		} catch (RecognitionException e) {
			throw new InvalidExpressionException(e.getMessage());
		}
		return tokens.iterator();        
	}
}
