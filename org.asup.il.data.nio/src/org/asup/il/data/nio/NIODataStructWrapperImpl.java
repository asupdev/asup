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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDelegator;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataVisitor;

public class NIODataStructWrapperImpl extends NIODataStruct implements QDataDelegator {

	private static final long serialVersionUID = 1L;

	private QDataStructDelegator _delegator;
	private boolean _dynamicLength;

	public NIODataStructWrapperImpl(int length, QDataStructDelegator delegator) {
		super(length, null);
		
		this._delegator = delegator;
		this._dynamicLength = (length == 0 ? true : false);
	}

	@Override
	public QBufferedData getElement(String name) {
		
		try {
			Field field = _delegator.getClass().getField(name);
			if(field == null)
				return null;
			
			return (QBufferedData) field.get(_delegator);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public QBufferedData getElement(int position) {

		try {
			Field field = _delegator.getClass().getFields()[position-1];
			if(field == null)
				return null;
			
			return (QBufferedData) field.get(_delegator);
			
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<QBufferedData> getElements() {
		
		List<QBufferedData> elements = new ArrayList<>();
		try {
			for (Field field: _delegator.getClass().getFields()) {
				elements.add((QBufferedData) field.get(_delegator));
			}
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return elements;
	}

	protected void addElement(String name, QBufferedData element) {

		try {
			Field field = _delegator.getClass().getField(name);
			if(field == null)
				return;
			
			field.set(_delegator, element);
	
			if (_dynamicLength)
				_length += element.size();
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}			
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.writeObject(_delegator);
		stream.writeBoolean(_dynamicLength);
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		
		_delegator = (QDataStructDelegator) stream.readObject();
		_dynamicLength = stream.readBoolean();
		
		for(QBufferedData element: getElements()) {
			NIOBufferedData nioBufferChild = (NIOBufferedData)element;
			nioBufferChild.setBuffer(getBuffer());
		}
	}

	@Override
	public QData getDelegate() {
		return _delegator;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(_delegator);
	}

	@Override
	public NIODataStructWrapperImpl copy() {
		
		NIODataStructWrapperImpl copy = new NIODataStructWrapperImpl(_length, (QDataStructDelegator) _delegator.copy());
		try {
			for (Field field: _delegator.getClass().getFields()) {
				copy.addElement(field.getName(), (QBufferedData) field.get(_delegator));
			}
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return copy;
	}
}