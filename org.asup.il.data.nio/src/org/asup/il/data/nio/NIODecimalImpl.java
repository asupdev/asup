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
import java.util.Arrays;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QNumeric;

public class NIODecimalImpl extends NIOBufferedData implements QDecimal {

	private static final long serialVersionUID = 1L;

	private static byte INIT = (byte) 48;

	protected int _precision;
	protected int _scale;

	protected byte[] _value;

	public NIODecimalImpl(int precision, int scale, byte[] value) {
		
		_precision = precision;
		_scale = scale;
		_value = value;
	}

	@Override
	public void allocate() {
		if(getParent() == null)
			setBuffer(ByteBuffer.allocate(size()));;
		
		reset();
		
	}
	
	public int getScale() {
		return _scale;
	}

	@Override
	public int asInteger() {
		
//		return NIODecimalHelper.decimalToBigInteger(_buffer.array(), _position, _precision).intValue();
		
		String s = asString();
		if(s.trim().isEmpty())
			return 0;
		
		return (int) Float.parseFloat(s);
	}

	@Override
	public long asLong() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short asShort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _precision, value.getBytes(), clear, INIT);
	}

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _precision, Integer.toString(value).getBytes(), clear, INIT);
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _precision, value.asBytes(),
				clear, INIT);
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		for (int i = 1; i <= value.capacity(); i++) {
			movel(value.get(i), clear);
		}
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), _precision, value.toString().getBytes(), clear, INIT);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), _precision, value.asBytes(), clear, INIT);
	}

	@Override
	public void movel(int value) {
		movel(value, false);
	}

	@Override
	public void movel(int value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), _precision, Integer.toString(value).getBytes(), clear, INIT);
	}

	@Override
	public int length() {
		return _precision;
	}

	@Override
	public int size() {
		return _precision;
	}

	@Override
	public void reset() {
		
		if (_value != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), _precision, _value, true, INIT);
		else
			Arrays.fill(getBuffer().array(), getPosition(), getPosition() + _precision, INIT);
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), _precision);
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), _precision, INIT);		
	}

	@Override
	public void eval(int value) {
		move(value, true);
	}

	@Override
	public void eval(long value) {
		move((int) value, true);
	}

	@Override
	public void eval(short value) {
		move(value, true);
	}

	@Override
	public void eval(Object value) {
		
//		NIODecimalHelper.toDecimal(Integer.parseInt(value.toString()), _buffer.array(), _position, _precision, _precision, false);
		
		move(value.toString(), true);
	}

	@Override
	public void eval(BigInteger value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eval(BigDecimal value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eval(QBufferedData value) {
		move(value, true);
	}
	
	@Override
	public String toString() {
		return Integer.toString(asInteger());		
	}

	@Override
	public boolean isSigned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eq(Number value) {
		return asInteger() == value.intValue();
	}

	@Override
	public boolean ge(Number value) {
		return asInteger() >= value.intValue();
	}

	@Override
	public boolean gt(Number value) {
		return asInteger() > value.intValue();
	}

	@Override		// TODO Auto-generated method stub
	public boolean le(Number value) {

		return asInteger() <= value.intValue();
	}

	@Override
	public boolean lt(Number value) {
		return asInteger() < value.intValue();
	}

	@Override
	public boolean ne(Number value) {
		return asInteger() != value.intValue();
	}
	

	@Override
	public <E extends Enum<E>> void move(E value) {
		move(getPrimitive(value));		
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		move(getPrimitive(value), clear);		
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		value.toString();
	}

	@Override
	public <E extends Enum<E>> void movea(E value, boolean clear) {
		value.toString();
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		movel(getPrimitive(value));		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		movel(getPrimitive(value), clear);		
	}

	@Override
	public String asString() {
		return toString();
	}

	@Override
	public void divide(short value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(long value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(QNumeric value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(QNumeric value) {
		eval(value.asInteger());
	}

	@Override
	public void minus(short value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minus(long value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minus(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minus(QNumeric value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult(short value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult(long value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult(QNumeric value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plus(short value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plus(long value) {
		eval(asInteger()+value);		
	}

	@Override
	public void plus(int value) {
		eval(asInteger()+value);
	}

	@Override
	public void plus(QNumeric value) {
		eval(asInteger()+value.asInteger());		
	}

	@Override
	public void power(short value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void power(long value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void power(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void power(QNumeric value) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		eval(getPrimitive(value));		
	}

	@Override
	public boolean eq(QNumeric value) {
		return eq(value.asInteger());
	}

	@Override
	public boolean ge(QNumeric value) {
		return ge(value.asInteger());
	}

	@Override
	public boolean gt(QNumeric value) {
		return gt(value.asInteger());
	}

	@Override
	public boolean le(QNumeric value) {
		return le(value.asInteger());
	}

	@Override
	public boolean lt(QNumeric value) {
		return lt(value.asInteger());
	}

	@Override
	public boolean ne(QNumeric value) {
		return ne(value.asInteger());
	}
	
	
	private <E extends Enum<E>> int getPrimitive(E value) {
		if(value.name().equals("ZEROS"))
			return 0;
		else if(value.name().equals("ZERO"))
			return 0;
		else if(value.name().equals("LOVAL"))
			return 0;
		return 0;
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return eq(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return ge(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return gt(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return le(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return lt(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return ne(getPrimitive(value));
	}

	@Override
	public NIODecimalImpl copy() {
		
		NIODecimalImpl copy = new NIODecimalImpl(_precision, _scale, _value);
		
		return copy;
	}
}