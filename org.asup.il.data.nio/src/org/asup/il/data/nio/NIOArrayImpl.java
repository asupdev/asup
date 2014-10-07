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

import java.lang.reflect.Array;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;

public class NIOArrayImpl<D extends QBufferedData> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	private NIOBufferedDataImpl _model;
	
	public NIOArrayImpl() {
		super();
	}
	
	@SuppressWarnings({ "unchecked"})
	public NIOArrayImpl(NIOBufferedDataImpl model, int dimension) {
		super();
		this._model = model;
		this._elements = (D[])Array.newInstance(model.getClass(), dimension);	
	}
	
	@Override
	public int capacity() {
		return _elements.length;
	}
	@Override
	public int count() {
		return capacity();
	}


	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {
		
		D element = _elements[index-1];
		if(element == null) {
			element = (D) _model.copy();
			int position = _model.size() * (index - 1);
			slice(element, position);
			_elements[index-1] = element;
		}
		return element;
	}

	@Override
	public int length() {
		return _elements.length * _model.length();
	}

	@Override
	public int size() {
		return _elements.length * _model.size();
	}

	@Override
	public D[] asArray() {
		return _elements;
	}

	@Override
	public String asString() {
		return toString();
	}

	@Override
	public void sorta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(QArray<?> value) {
		
		movea(value, true);		
	}

	@Override
	protected byte getFiller() {
		return ((NIOBufferedDataImpl)_model).getFiller();
	}
}