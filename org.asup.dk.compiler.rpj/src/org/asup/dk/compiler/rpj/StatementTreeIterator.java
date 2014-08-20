/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 */
package org.asup.dk.compiler.rpj;

import java.util.Iterator;
import java.util.Stack;

import org.asup.il.flow.QBlock;
import org.asup.il.flow.QStatement;

public class StatementTreeIterator implements Iterator<QStatement> {

	private Stack<Iterator<QStatement>> blocks;  
	
	public StatementTreeIterator(QBlock block) {
		blocks = new Stack<Iterator<QStatement>>();
		if(block != null)
			blocks.push(block.getStatements().iterator());
	}
	
	@Override
	public boolean hasNext() {

		while(!blocks.isEmpty()) {
			if(blocks.peek().hasNext())
				return true;
			
			blocks.pop();
		}
			
		return false;
	}

	@Override
	public QStatement next() {
		QStatement statement = blocks.peek().next();
		if(statement instanceof QBlock)
			blocks.push(((QBlock)statement).getStatements().iterator());
		
		return statement;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}