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
import java.util.Map.Entry;

import org.asup.il.data.QBufferedData;

public class NIODataStructImpl extends NIOAbstractDataStruct {
	
	private static final long serialVersionUID = 1L;

	private Map<String, QBufferedData> _elements;
	private boolean _dynamicLength;
	
	public NIODataStructImpl(int length) {
		super(length, null);
		
		this._elements = new LinkedHashMap<String, QBufferedData>();
		this._dynamicLength = (length == 0 ? true : false);
	}
	
	@Override
	public QBufferedData getElement(String name) {
		return _elements.get(name);
	}

	@Override
	public QBufferedData getElement(int position) {

		int i = 1;
		for (QBufferedData data : _elements.values()) {

			if (i == position)
				return data;

			i++;
		}
		return null;
	}

	protected void addElement(String name, QBufferedData element) {

		// virtual name '/n'
		if (name == null)
			name = "/" + _elements.size() + 1;

		this._elements.put(name, element);

		if (_dynamicLength)
			_length += element.size();
	}

	@Override
	public List<QBufferedData> getElements() {
		return new ArrayList<QBufferedData>(_elements.values());
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.writeObject(_elements);
		stream.writeBoolean(_dynamicLength);
	}
	
	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		
		_elements = (LinkedHashMap<String, QBufferedData>) stream.readObject();
		_dynamicLength = stream.readBoolean();
		
		for(QBufferedData element: getElements()) {
			NIOBufferedDataImpl nioBufferChild = (NIOBufferedDataImpl)element;
			nioBufferChild.setBuffer(getBuffer());
		}
	}

	@Override
	public NIODataStructImpl copy() {

		NIODataStructImpl copy = new NIODataStructImpl(_length);
		
		for(Entry<String, QBufferedData> element: _elements.entrySet()) {
			
			NIOBufferedDataImpl copyElement = (NIOBufferedDataImpl) element.getValue().copy();
			copy.addElement(element.getKey(), copyElement);
		}
		
		return copy;		
	}
}