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

import java.nio.ByteBuffer;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;

public class NIOArrayImpl<D extends QBufferedData> extends NIOBufferList<D> implements QArray<D> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private D[] elements;

	public NIOArrayImpl(D[] elements, ByteBuffer buffer) {
		this.elements = elements;
		this._buffer = buffer;
	}

	@Override
	public int capacity() {
		return elements.length;
	}

	@Override
	public D get(int index) {
		return elements[index-1];
	}

	@Override
	public int length() {
		return elements.length * elements[0].length();
	}

	@Override
	public int size() {
		return elements.length * elements[0].size();
	}

	@Override
	public D[] asArray() {
		return elements;
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
}