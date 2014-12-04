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

public abstract class Term {
	
	public Token token = null;
	public TermCompound owner = null;
	public Term previous = null;
	public Term next = null;
	
	public Term(Token token, TermCompound owner) {
		this.token = token;
		this.owner = owner;
	}
	public abstract TermCompound root();
}
