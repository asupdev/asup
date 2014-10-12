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

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDelegator;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QStruct;

public class NIODataStructWrapperImpl extends NIOAbstractDataStruct implements QDataDelegator<QStruct> {

	private static final long serialVersionUID = 1L;

	private QDataStructDelegator _wrapped;
	private boolean _dynamicLength;

	public NIODataStructWrapperImpl() {
		super();
	}
	
	public NIODataStructWrapperImpl(int length, QDataStructDelegator delegator) {
		super(length);
		
		this._wrapped = delegator;
		this._dynamicLength = (length == 0 ? true : false);
	}

	@Override
	public QBufferedData getElement(String name) {
		
		try {
			Field field = _wrapped.getClass().getField(name);
			if(field == null)
				return null;
			
			return (QBufferedData) field.get(_wrapped);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public QBufferedData getElement(int position) {

		try {
			Field field = _wrapped.getClass().getFields()[position-1];
			if(field == null)
				return null;
			
			return (QBufferedData) field.get(_wrapped);
			
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<QBufferedData> getElements() {
		
		List<QBufferedData> elements = new ArrayList<>();
		try {
			for (Field field: _wrapped.getClass().getFields()) {
				elements.add((QBufferedData) field.get(_wrapped));
			}
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return elements;
	}

	protected void addElement(String name, QBufferedData element) {

		try {
			Field field = _wrapped.getClass().getField(name);
			if(field == null)
				return;
			
			field.set(_wrapped, element);
	
			if (_dynamicLength)
				_length += element.size();			

		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}			
	}

	@Override
	public QData getDelegate() {
		return _wrapped;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(_wrapped);
	}
}