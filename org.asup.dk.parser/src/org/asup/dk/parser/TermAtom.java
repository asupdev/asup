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

public class TermAtom extends Term {

	public TermAtom(Token token, TermCompound owner) {
		super(token, owner);
	}

	public String toString() {			
		if(token.getType().equals(TokenType.STRING))
			return "\""+token.getText()+"\"";
		else
			return token.getText();
	}
	public TermCompound root() {
		if(owner != null)
			return owner.root();
		else
			return null;
	}
}
