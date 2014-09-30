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
import java.util.Arrays;
import java.util.Date;

import org.asup.il.data.DateFormat;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QDatetime;

public class NIODatetimeImpl extends NIOBufferedData implements QDatetime {

	private static final long serialVersionUID = 1L;
	
	private static byte INIT = (byte) 32;
	
	private DatetimeType _type;
	private String _format;

	private byte[] _value;

	public NIODatetimeImpl(DatetimeType type, String format,  byte[] value) {		
		
		this._type = type;
		this._format = format;
		this._value = value;
		
		// default format
		if(format == null || format.isEmpty()) {

			switch (type) {
			case DATE:
				this._format = "*ISO";
				break;
			case TIME:
				this._format = "*ISO";
				break;
			case TIME_STAMP:
				this._format = "*ISOISO";
				break;
			}
		}
	}

	@Override
	public void allocate() {
		if(getParent() == null)
			setBuffer(ByteBuffer.allocate(size()));;
		
		reset();
		
	}
	
	@Override
	public void reset() {
		if (_value != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), length(), _value, true, INIT);
		else
			Arrays.fill(getBuffer().array(), getPosition(), getPosition() + length(), INIT);
		
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), length());
	}

	@Override
	public String asString() {
		return toString();
	}

	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int length() {
		
		int length = 0;
		
		switch (_type) {
		case DATE:
			DateFormat dateFormat = DateFormat.get(_format);
			switch (dateFormat) {
			case DMY:
				length = 8;
				break;
			case EUR:
				length = 10;
				break;
			case ISO:
				length = 10;
				break;
			case JIS:
				length = 10;
				break;
			case JOBRUN:
				length = 10;
				break;
			case JUL:
				length = 6;
				break;
			case MDY:
				length = 8;
				break;
			case USA:
				length = 10;
				break;
			case YMD:
				length = 8;
				break;
			}
			break;
		case TIME:
			break;
		case TIME_STAMP:
			break;
		}
		
		return length;
	}

	@Override
	public int size() {
		return length();
	}

	@Override
	public void accept(QDataVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
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
	public void movea(QArray<?> value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movea(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(int value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
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
	public void eval(Date value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NIODatetimeImpl copy() {

		NIODatetimeImpl copy = new NIODatetimeImpl(_type, _format, _value);
		
		return copy;
	}

}
