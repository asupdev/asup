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

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;

public class NIOCharacterImpl extends NIOBufferReference implements QCharacter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static byte INIT = (byte) 32;
	private static String ENCODING = "ISO-8859-1";

	int _length;
	byte[] _value;

	public NIOCharacterImpl(int length, byte[] value, boolean initialize) {

		_length = length;
		_value = value;

		if (initialize)
			init();
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(_buffer, _position, _length);
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(_buffer, _position, _length, INIT);
	}

	@Override
	public void eval(boolean value) {
		movel(value);
	}

	@Override
	public void eval(Object value) {

		if (value == null) {
			clear();
			return;
		}

		movel(value.toString(), true);
	}

	@Override
	public void eval(QBufferedData value) {
		movel(value, true);
	}

	@Override
	public void eval(String value) {
		movel(value, true);
	}

	@Override
	public int length() {
		return _length;
	}

	@Override
	public int size() {
		return _length;
	}

	@Override
	public void init() {

		if (_buffer != null)
			return;

		_buffer = ByteBuffer.allocate(size());
		_position = 0;

		if (_value != null)
			NIOBufferHelper.movel(_buffer, _position, _length, _value, true,
					INIT);
		else
			Arrays.fill(_buffer.array(), _position, _position + _length, INIT);
	}

	@Override
	public boolean isEmpty() {
		return trim().isEmpty();
	}

	@Override
	public void move(boolean value) {
		NIOBufferHelper.move(_buffer, _position, _length, new byte[] { 49 },
				true, (byte) 49);
	}

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		NIOBufferHelper.move(_buffer, _position, _length,
				Integer.toString(value).getBytes(), clear, INIT);
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(_buffer, _position, _length, value.asBytes(),
				clear, INIT);
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {

		try {
			NIOBufferHelper.move(_buffer, _position, _length,
					value.getBytes(ENCODING), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.move(_buffer, _position, _length, value.getBytes(),
					clear, INIT);
		}
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
	public void movel(boolean value) {
		NIOBufferHelper.movel(_buffer, _position, _length, new byte[] { 49 },
				true, (byte) 49);
	}

	@Override
	public void movel(int value) {
		movel(value, true);
	}

	@Override
	public void movel(int value, boolean clear) {
		NIOBufferHelper.movel(_buffer, _position, _length,
				Integer.toString(value).getBytes(), clear, INIT);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(_buffer, _position, _length, value.asBytes(),
				clear, INIT);
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(String value, boolean clear) {
		
		if(value == null)
			value = "";
		
		try {
			NIOBufferHelper.movel(_buffer, _position, _length,
					value.getBytes(ENCODING), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(_buffer, _position, _length,
					value.getBytes(), clear, INIT);
		}
	}

	@Override
	public void reset() {
		NIOBufferHelper.movel(_buffer, _position, _length, _value, true, INIT);
	}

	@Override
	public String toString() {
		try {
			return new String(asBytes(), ENCODING);
		} catch (UnsupportedEncodingException e) {
			return new String(asBytes());
		}
	}

	@Override
	public String trim() {
		return toString().trim();
	}

	@Override
	public String trimL() {
		return trimL(toString());
	}

	@Override
	public String trimR() {
		return trimR(toString());
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(String factor1, String factor2) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cat(String factor1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(String factor1, QString factor2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(QString factor1, String factor2) {
		eval(factor1.trimR()+factor2);
	}

	@Override
	public void cat(QString factor1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eq(String value) {
		return trimR().equals(trimR(value));
	}

	@Override
	public boolean ge(String value) {
		return trimR().compareTo(trimR(value))>=0;
	}

	@Override
	public boolean gt(String value) {
		return trimR().compareTo(trimR(value))>0;
	}

	@Override
	public boolean le(String value) {
		return trimR().compareTo(trimR(value))<=0;
	}

	@Override
	public boolean lt(String value) {
		return trimR().compareTo(trimR(value))<=0;
	}

	@Override
	public boolean ne(String value) {
		return !eq(value);
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
	public void in() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void out() {
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
	public boolean eq(QString value) {
		return eq(value.asString());
	}

	@Override
	public boolean ge(QString value) {
		return ge(value.asString());
	}

	@Override
	public boolean gt(QString value) {
		return gt(value.asString());
	}

	@Override
	public boolean le(QString value) {
		return le(value.asString());
	}

	@Override
	public boolean lt(QString value) {
		return lt(value.asString());
	}

	@Override
	public boolean ne(QString value) {
		return ne(value.asString());
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
	
	private <E extends Enum<E>> String getPrimitive(E value) {
		if(value.name().equals("BLANKS"))
			return "";
		else if(value.name().equals("BLANK"))
			return "";
		else if(value.name().equals("LOVAL"))
			return "";
		return null;
	}
	
	
	public static String trimL(String str) {
		int i = 0;
		while (i < str.length()
				&& (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == 0))
			i++;
		return str.substring(i);
	}

	public static String trimR(String str) {
		int i = str.length() - 1;
		while (i >= 0
				&& (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == 0))
			i--;
		return str.substring(0, i + 1);
	}
}