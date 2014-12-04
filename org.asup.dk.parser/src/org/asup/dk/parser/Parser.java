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

public abstract class Parser {
	
	public Parser() {		
	}
	
	public abstract Iterator<Token> tokenize(String expression) throws InvalidExpressionException;
	
	public static Parser buildParser(String type) throws RuntimeException {
		try {
			Parser parser = (Parser)Class.forName("org.asup.dk.parser.Parser_"+type).newInstance();
			return parser;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public Iterator<Term> termize(String expression) throws InvalidExpressionException {
				
		Iterator<Token> tokens = tokenize(expression);
		
		TermCompound level = new TermCompound(new Token("EMPTY", null), null);

		while(tokens.hasNext()) {
			Token token = tokens.next();
			
			if(token.getType().equals(TokenType.WHITE_SPACE))
				continue;

			TermCompound compound = null;
			switch (token.getType()) {
				case EXP_OPEN:
				case DIM_OPEN:
					Term work = null;
					// first term
					if(level.terms.isEmpty()) {
						work = new TermCompound(new Token("EMPTY", ""), level);
						level.addTerm(work);
					}
					else {
						work = level.terms.get(level.terms.size()-1);
					}
					// Atom -> Compound
					if(!(work instanceof TermCompound)) {
						Term t1 = new TermCompound(work.token, work.owner);
						level.terms.remove(work);
						level.addTerm(t1);
						work = t1;
					}
					level = (TermCompound)work;
					break;
				case EXP_CLOSE:				
				case DIM_CLOSE:
					level = level.owner;					
					break;
				default:
					if(token.getType().isRelation()) {
						compound =  new TermCompound(token, level);
						level.addTerm(compound);
						level = compound;
					}
					else if(token.getType().isLogical()) {
						if(token.getType().equals(TokenType.NOT)) {
							compound =  new TermCompound(token, level);
							level.addTerm(compound);
							level = compound;
						} 
						else {
							if(level.owner != null)
								level = level.owner;
							level.addTerm(new TermAtom(token, level));
						}
					}
/*					else if(token.getType().isLogical()) {
						token.toString();
//						level = level.owner;
						// exit from relation
						while(level != null) {
							level = level.owner;
							if(level.token.getType().equals(TokenType.EMPTY)) 
								break;							
						}

						compound =  new TermCompound(token, level);
						level.addTerm(compound);
						level = compound;
//						level.addTerm(new TermAtom(token, level));						
					}*/
					else
						level.addTerm(new TermAtom(token, level));
					break;
			}
		}
		return level.root().terms.iterator();
	}
}