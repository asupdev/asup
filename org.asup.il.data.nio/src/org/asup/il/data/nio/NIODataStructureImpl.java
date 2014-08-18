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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;

public class NIODataStructureImpl extends NIOCharacterImpl implements QDataStruct {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, QBufferedData> elements;
	private boolean dynamicLength;

	public NIODataStructureImpl(int length,
			Map<String, QBufferedData> elements, boolean initialize) {
		super(length, null, initialize);
		this.elements = elements;
		this.dynamicLength = (length == 0 ? true : false);
	}

	public void addElement(String name, QBufferedData element) {

		// virtual name '/n'
		if (name == null)
			name = "/" + elements.size() + 1;

		this.elements.put(name, element);

		if (dynamicLength)
			_length += element.size();
	}

	@Override
	public QBufferedData getElement(String name) {
		return elements.get(name);
	}

	@Override
	public QBufferedData getElement(int position) {

		int i = 1;
		for (QBufferedData data : elements.values()) {

			if (i == position)
				return data;

			i++;
		}
		return null;
	}

	@Override
	public List<QBufferedData> getElements() {
		return new ArrayList<QBufferedData>(elements.values());
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.writeObject(elements);
		stream.writeBoolean(dynamicLength);
	}
	
	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		
		elements = (LinkedHashMap<String, QBufferedData>) stream.readObject();
		dynamicLength = stream.readBoolean();
		
		for(QBufferedData element: getElements()) {
			NIOBufferReference nioBufferReference = (NIOBufferReference)element;
			nioBufferReference._buffer = _buffer;
		}
	}
}