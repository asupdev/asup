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
import java.nio.ByteBuffer;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;

public class NIOArrayImpl<D extends QBufferedData> extends NIOBufferedList<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	private D _model;
	
	@SuppressWarnings({ "unchecked"})
	public NIOArrayImpl(D model, int dimension) {
		
		this._model = model;
		this._elements = (D[])Array.newInstance(model.getClass(), dimension);	
	}

	@Override
	public void allocate() {
		if(getParent() == null)
			setBuffer(ByteBuffer.allocate(size()));
		
		reset();		
	}
	
	@Override
	public int capacity() {
		return _elements.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {
		
		D element = _elements[index-1];
		if(element == null) {
			element = (D) _model.copy();
			int position = getPosition() + _model.size() * (index - 1);
			slice(element, position);
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

	@SuppressWarnings("unchecked")
	@Override
	public NIOArrayImpl<D> copy() {

		NIOArrayImpl<D> copy = new NIOArrayImpl<D>((D) _model.copy(), _elements.length);
		
		return copy;
	}
}