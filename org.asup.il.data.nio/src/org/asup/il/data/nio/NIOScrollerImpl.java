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
import org.asup.il.data.QNumeric;
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
		
		int size = _model.getSize();
		int position = size * (index - 1);
		slice(_model, position);

		_lastIndex = index;

		return _model;
	}

	@Override
	public int getLength() {
		return _dimension * _model.getLength();
	}

	@Override
	public int getSize() {
		return _dimension * _model.getSize();
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

	@Override
	public void set(int index, D value) {
		get(index).eval(value);
	}

	@Override
	public void set(QNumeric index, D value) {
		set(index.asInteger(), value);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public D[] asArray() {
		throw new UnsupportedOperationException();
	}
}