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

import java.util.Arrays;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QHexadecimal;

public class NIOHexadecimalImpl extends NIOBufferedDataImpl implements QHexadecimal {

	private static final long serialVersionUID = 1L;

	private int _length;
	byte[] _value;
	private static byte INIT = (byte) 32;
	
	public NIOHexadecimalImpl(int length, byte[] value) {
		this._length = length;
		this._value = value;
	}


	@Override
	public NIOHexadecimalImpl copy() {

		NIOHexadecimalImpl copy = new NIOHexadecimalImpl(_length, _value);
		
		return copy;
	}


	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int length() {
		return _length;
	}


	@Override
	public int size() {
		return length();
	}


	@Override
	public void reset() {
		if (_value != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, _value, true, INIT);
		else
			Arrays.fill(getBuffer().array(), getPosition(), getPosition() + _length, INIT);		
	}


	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), _length, INIT);		
	}


	@Override
	public void eval(Object value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void movel(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected byte getFiller() {
		// TODO Auto-generated method stub
		return 0;
	}
}
