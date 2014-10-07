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

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QScroller;

public class NIOScrollerImpl<D extends QBufferedData> extends NIOBufferedListImpl<D> implements QScroller<D> {

	private static final long serialVersionUID = 1L;

	private D _model;
	private int _dimension;
	private int _lastIndex;

	public NIOScrollerImpl() {
		super();
	}
	
	public NIOScrollerImpl(D model, int dimension) {
		super();
		_model = model;
		_dimension = dimension;
	}
	
	@Override
	public int count() {
		return _dimension;
	}


	@Override
	public void allocate() {
		super.allocate();

		clear();
		
		absolute(1);
	}
	
	@Override
	public int capacity() {
		return _dimension;
	}

	@Override
	public D get(int index) {

		if (_lastIndex == index)
			return _model;
		
		int size = _model.size();
		int position = size * (index - 1);
		slice(_model, position);

		_lastIndex = index;

		return _model;
	}

	@Override
	public int length() {
		return _dimension * _model.length();
	}

	@Override
	public int size() {
		return _dimension * _model.size();
	}

	@Override
	public D absolute(int position) {
		return get(position);
	}

	@Override
	public D current() {
		return _model;
	}

	@Override
	public D first() {
		return get(1);
	}

	@Override
	public D last() {
		return get(_dimension);
	}

	@Override
	public D next() {
		return get(_lastIndex+1);
	}

	@Override
	public D previous() {
		return get(_lastIndex-1);
	}

	@Override
	public String asString() {
		return toString();
	}

	@Override
	protected byte getFiller() {
		return ((NIOBufferedDataImpl)_model).getFiller();
	}

	/*
	private void shift(QDataStructure target, int position) {

		int p = 0;
		for (Field field : target.getClass().getFields()) {
			if (!QBufferedData.class.isAssignableFrom(field.getType()))
				continue;

			NIOBufferReference bufferReference;
			try {
				bufferReference = (NIOBufferReference) field.get(target);
				bufferReference._buffer = _buffer;
				bufferReference._position = p + position;

	*			p += ((QBufferedData) bufferReference).getSize();
			} catch (Exception e) {
				throw new FrameworkCoreRuntimeException(e);
			}

		}
	}
	*/
}