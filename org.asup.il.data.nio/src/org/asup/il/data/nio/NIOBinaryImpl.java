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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBufferedData;

public class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
	private static byte FILLER = (byte) 0;
	
	private BinaryType _type;
	private boolean _unsigned;
	
	public NIOBinaryImpl() {
		super();
	}
	
	public NIOBinaryImpl(BinaryType type, boolean unsigned) {
		super();
		this._type = type;
		this._unsigned = unsigned;
	}

	@Override
	protected byte getFiller() {
		return FILLER;
	}

	@Override
	public boolean isSigned() {
		return !_unsigned;
	}

	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		value.toString();
	}


	@Override
	public int getLength() {
		switch (_type) {
		case BYTE:
			return 1;
		case SHORT:
			return 2;			
		case INTEGER:
			return 4;
		case LONG:
			return 8;
		}
		
		throw new FrameworkCoreRuntimeException("Unexpected condition");
	}


	@Override
	public int getSize() {
		return getLength();
	}
	
	@Override
	public Number readNumber() {

		ByteBuffer byteBuffer = getBuffer();
		int position = getPosition();
		
		NIOBufferHelper.prepare(byteBuffer, position, getSize());
		switch (_type) {
		case BYTE:
			return byteBuffer.get(position);
		case SHORT:
			return byteBuffer.getShort(position); 
		case INTEGER:
			return byteBuffer.getInt(position);
		case LONG:
			return byteBuffer.getLong(position);
		}

		throw new FrameworkCoreRuntimeException("Unexpected condition");		
	}
	
	@Override
	public void writeNumber(Number number) {
		
		ByteBuffer buffer = getBuffer();
		int position = getPosition();
		
		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			buffer.put(getPosition(), (byte) number.intValue());
			return;
		case SHORT:
			buffer.putShort(getPosition(), number.shortValue());
			return;
		case INTEGER:		
			buffer.putInt(getPosition(), number.intValue());
			return;
		case LONG:
			buffer.putLong(getPosition(), number.longValue());
			return;
		}

		throw new FrameworkCoreRuntimeException("Unexpected condition");				
	}

	@Override
	public int compareNumber(Number value) {

		switch (_type) {
		case BYTE:
			return ((Byte)getBuffer().get(getPosition())).compareTo((Byte) value);
		case SHORT:
			return ((Short)getBuffer().getShort(getPosition())).compareTo((Short) value); 
		case INTEGER:
			return ((Integer)getBuffer().getInt(getPosition())).compareTo((Integer) value);
		case LONG:
			return ((Long)getBuffer().getLong(getPosition())).compareTo((Long) value);
		}

		throw new FrameworkCoreRuntimeException("Unexpected condition");		
	}

	@Override
	public double asDouble() {
		return asInteger();
	}

	@Override
	public void eval(double value) {
		eval((int)value);
	}

	@Override
	public void eval(BigInteger value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(BigDecimal value) {
		// TODO Auto-generated method stub
		
	}
}