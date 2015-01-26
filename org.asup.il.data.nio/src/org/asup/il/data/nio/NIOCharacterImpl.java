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
import java.util.Arrays;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;

public class NIOCharacterImpl extends NIOBufferedDataImpl implements QCharacter {

	private static final long serialVersionUID = 1L;
	private static final byte INIT = (byte) 32;
	protected static final String ENCODING = "ISO-8859-1";

	protected int _length;

	public NIOCharacterImpl() {
		super();
	}
	
	public NIOCharacterImpl(int length) {	
		super();
		_length = length;
	}

	@Override
	public void eval(boolean value) {
		movel(value);
	}

	@Override
	public void eval(String value) {
		movel(value, true);
	}

	@Override
	public void eval(byte value) {		
		NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] {value}, true, INIT);
	}

	@Override
	public int getLength() {
		return _length;
	}

	@Override
	public int getSize() {
		return _length;
	}

	@Override
	public void move(boolean value) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _length, new byte[] { 49 }, true, (byte) 49);
	}
	
	@Override
	public void move(String value, boolean clear) {

		try {
			NIOBufferHelper.move(getBuffer(), getPosition(), _length, value.getBytes(ENCODING), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.move(getBuffer(), getPosition(), _length, value.getBytes(), clear, INIT);
		}
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
	public void movel(boolean value) {
		if(value)
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] { NIOIndicatorImpl.ON }, true, NIOIndicatorImpl.OFF);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] { NIOIndicatorImpl.OFF }, true, NIOIndicatorImpl.OFF);
	}

	@Override
	public void movel(String value, boolean clear) {
		
		if(value == null)
			value = "";
		
		try {
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, value.getBytes(ENCODING), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, value.getBytes(), clear, INIT);
		}
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
		return asString().trim();
	}

	@Override
	public String trimL() {
		return trimL(asString());
	}

	@Override
	public String trimR() {
		return trimR(asString());
	}


	/* cat */
	@Override
	public void cat(QString factor1) {
		eval(trimR()+factor1.asString());			
	}
	
	@Override
	public void cat(String factor1) {
		eval(trimR()+factor1);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		eval(factor1+factor2.asString());
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		eval(factor1.trimR()+factor2.asString());
	}

	@Override
	public void cat(QString factor1, String factor2) {
		eval(factor1.asString()+factor2);
	}

	@Override
	public void cat(String factor1, String factor2) {
		eval(factor1+factor2);
	}

	
	@Override
	public void cat(QString factor1, Number space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(String factor1, Number space) {
		// TODO Auto-generated method stub
		factor1.toString();		
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}
	
	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		// TODO Auto-generated method stub
		factor1.toString();
	}

	@Override
	public boolean eq(String value) {
		return trimR().equals(trimR(value));
	}

	@Override
	public boolean eq(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean ge(String value) {
		return trimR().compareTo(trimR(value))>=0;
	}

	@Override
	public boolean eq(byte value) {
		return Arrays.equals(asBytes(), new byte[] {value});
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
	public boolean ne(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
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
	public <E extends Enum<E>> void movel(E value) {
		movel(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		movel(getPrimitive(value), clear);		
	}

	@Override
	public String asString() {
		try {
			return new String(asBytes(), ENCODING);
		} catch (UnsupportedEncodingException e) {
			return new String(asBytes());
		}
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
		else if(value.name().equals("HIVAL"))
			return "1";
		else if(value.name().equals("LOVAL"))
			return "";
		else if(value.name().equals("ON"))
			return "1";
		else if(value.name().equals("OFF"))
			return " ";
		
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

	@Override
	public void eval(QBufferedData value) {
		movel(value, true);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public void xlate(QString from, QString to, QString target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xlate(String from, String to, QString target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xlate(byte from, String to, QString target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ge(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}
}