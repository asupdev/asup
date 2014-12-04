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

public class TermCompound extends Term {

	public List<Term> terms = null;
	
	public TermCompound(Token token, TermCompound owner) {
		super(token, owner);
		this.terms = new LinkedList<Term>();
	}
	public void addTerm(Term term) {
		if(!terms.isEmpty())  {
			Term p =  terms.get(terms.size()-1);
			term.previous = p;
			p.next = term;
		}
		terms.add(term);
	}
	public String toString() {		
		String s = token.toString()+"(";
		Iterator<Term> ts = terms.iterator();
		while(ts.hasNext()) {
			s += ts.next().toString();
			if(ts.hasNext())
				s += ",";
		}
		return s+")";
	}
	public TermCompound root() {
		if(owner != null)
			return owner.root();
		else
			return this;
	}
}
