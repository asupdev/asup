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
package org.asup.os.core.cdo.impl;

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.net4j.util.collection.CloseableIterator;

public class CDOObjectIterator<T extends QObjectNameable> implements QObjectIterator<T> {

	private CloseableIterator<T> iterator;
	private QResourceEvent<T> resourceEvent;
	
	public CDOObjectIterator(CloseableIterator<T> iterator, QResourceEvent<T> resourceEvent) {
		this.iterator = iterator;
		this.resourceEvent = resourceEvent;
	}

	@Override
	public void close() {
		iterator.close();
	}

	@Override
	public boolean hasNext() {
		try {
			return iterator.hasNext();
		}
		catch(Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public T next() {
		T object = iterator.next();
		
		if(object != null)
			resourceEvent.getResource().fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);
		
		return object;
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
