package org.asup.os.core.jdt;

import java.util.Iterator;

import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;

public class JDTObjectIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T> {

	private Class<T> klass;
	private Iterator<T> iterator;
	private String namePrefix;
	private T nextObject = null;
	private QResourceEvent<T> resourceEvent;
	
	public JDTObjectIteratorImpl(Class<T> klass, Iterator<T> iterator, String namePrefix, QResourceEvent<T> resourceEvent) {
		this.klass = klass;
		this.iterator = iterator;
		this.resourceEvent = resourceEvent;
		this.namePrefix = namePrefix;
		doNext();
	}
	
	@Override
	public void close() {
		this.iterator = null;
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
		while(iterator.hasNext()) {
			T eObject = iterator.next();
			if(klass.isInstance(eObject)) {
				T tempObject = klass.cast(eObject);
				if(namePrefix == null) {
					nextObject = tempObject;
					break;
				}
				else if(namePrefix.endsWith("*")) {
					
					if(tempObject.getName().startsWith(namePrefix.substring(0, namePrefix.length()-1))) {
						nextObject = tempObject;
						break;
					}
				}
				else if(tempObject.getName().equals(namePrefix)) {
					nextObject = tempObject;
					break;
				}
			}
		}
	}
}
