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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataVisitor;

public class NIODataStructureWrapperImpl extends NIOCharacterImpl implements QDataStruct {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private QDataStructDelegator delegator;
	private boolean dynamicLength;

	public NIODataStructureWrapperImpl(int length, QDataStructDelegator delegator, boolean initialize) {
		super(length, null, initialize);
		this.delegator = delegator;
		this.dynamicLength = (length == 0 ? true : false);
	}

	protected ByteBuffer getBuffer() {
		return _buffer;
	}
	
	@Override
	public QBufferedData getElement(String name) {
		
		try {
			Field field = delegator.getClass().getField(name);
			if(field == null)
				return null;
			
			return (QBufferedData) field.get(delegator);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public QBufferedData getElement(int position) {

		try {
			int i = 1;
			for (Field field: delegator.getClass().getFields()) {
	
				if (i == position)
					return (QBufferedData) field.get(delegator);
	
				i++;
			}
			return null;
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<QBufferedData> getElements() {
		
		List<QBufferedData> elements = new ArrayList<>();
		try {
			for (Field field: delegator.getClass().getFields()) {
				elements.add((QBufferedData) field.get(delegator));
			}
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return elements;
	}

	public void addElement(String name, QBufferedData element) {

		try {
			Field field = delegator.getClass().getField(name);
			if(field == null)
				return;
			
			field.set(delegator, element);
	
			if (dynamicLength)
				_length += element.size();
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}			
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.writeObject(delegator);
		stream.writeBoolean(dynamicLength);
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		
		delegator = (QDataStructDelegator) stream.readObject();
		dynamicLength = stream.readBoolean();
		
		for(QBufferedData element: getElements()) {
			NIOBufferReference nioBufferReference = (NIOBufferReference)element;
			nioBufferReference._buffer = _buffer;
		}
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(delegator);
	}
}