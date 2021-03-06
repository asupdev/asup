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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.asup.il.data.QBufferedData;

public class NIODataStructImpl extends NIOAbstractDataStruct {
	
	private static final long serialVersionUID = 1L;

	private Map<String, QBufferedData> _elements;
	private boolean _dynamicLength;

	public NIODataStructImpl() {
		super();
	}
	
	public NIODataStructImpl(int length) {
		super(length);
		
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

	protected void addElement(String name, QBufferedData element, int position) {

		// virtual name '/n'
		if (name == null) {
			System.err.println("Unexpected condition: 61n67v8sh2756nv56");
			name = "/" + _elements.size() + 1;
		}

		this._elements.put(name, element);

		if (_dynamicLength) {
			if(position+element.getSize() >= _length)
				_length = position+element.getSize();
			else
				System.err.println("Unexpected condition: mzt47gafdg7n0tcw");
		}
	}

	@Override
	public List<QBufferedData> getElements() {
		return new ArrayList<QBufferedData>(_elements.values());
	}
}