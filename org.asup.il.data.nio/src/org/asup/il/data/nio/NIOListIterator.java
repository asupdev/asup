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
package org.asup.il.data.nio;

import java.util.Iterator;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QList;

public class NIOListIterator<D extends QBufferedData> implements Iterator<D> {

	
	private QList<D> list;
	private int current = 0;

	protected NIOListIterator(QList<D> list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return current < list.capacity();
	}

	@Override
	public D next() {
		current++;
		return list.get(current);
	}

	@Override
	public void remove() {
		list.get(current).clear();
	}
	
}
