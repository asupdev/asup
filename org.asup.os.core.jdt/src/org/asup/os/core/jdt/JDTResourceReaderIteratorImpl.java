/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 * 
 */
package org.asup.os.core.jdt;

import java.util.Stack;

import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;

public class JDTResourceReaderIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T>{
	
	private Stack<QResourceReader<T>> readers;
	private QObjectIterator<T> currentIterator;
	private String namePrefix;
	private T nextObject = null;
	private QResourceEvent<T> resourceEvent;
	
	public JDTResourceReaderIteratorImpl(Stack<QResourceReader<T>> readers, String namePrefix, QResourceEvent<T> resourceEvent) {
		this.readers = readers;
		this.namePrefix = namePrefix;
		this.resourceEvent = resourceEvent;
		this.currentIterator = readers.pop().find(namePrefix);
		doNext();
	}
	
	@Override
	public void close() {
		this.currentIterator = null;
		this.readers = null;
	}

	@Override
	public boolean hasNext() {
		return nextObject != null;
	}

	@Override
	public T next() {
		T object = nextObject;
		doNext();
		
		if(object != null)
			resourceEvent.getResource().fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);
		return object;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();		
	}

	private void doNext() {
		nextObject = null;
		if(currentIterator == null)
			return;

		if(currentIterator.hasNext()) {
			nextObject = currentIterator.next();
			return;
		}
		
		while(!readers.empty()) {
			currentIterator = readers.pop().find(namePrefix);
			while(currentIterator.hasNext()) {
				nextObject = currentIterator.next();
				return;
			}
		}
	}
}