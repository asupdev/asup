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

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;


public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;
	
	public NIOCharacterVaryingImpl() {
		super();
	}
	
	public NIOCharacterVaryingImpl(int length) {
		super(length);
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), getSize());
	}

	@Override
	public void eval(boolean value) {
		// TODO Auto-generated method stub
		super.eval(value);
	}

	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		super.eval(value);
	}

	@Override
	public void eval(String value) {
		// TODO Auto-generated method stub
		super.eval(value);
	}

	@Override
	public int getLength() {
		return trimR().length();
	}

	@Override
	public int getSize() {
		return super.getSize();
	}

	@Override
	public void move(boolean value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public void move(int value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}

	@Override
	public void move(QBufferedData value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}

	@Override
	public void move(String value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		// TODO Auto-generated method stub
		super.movea(value);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		// TODO Auto-generated method stub
		super.movea(value, clear);
	}

	@Override
	public void movel(boolean value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public void movel(int value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public void movel(String value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String trim() {
		// TODO Auto-generated method stub
		return super.trim();
	}

	@Override
	public String trimL() {
		// TODO Auto-generated method stub
		return super.trimL();
	}

	@Override
	public String trimR() {
		// TODO Auto-generated method stub
		return super.trimR();
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1) {
		// TODO Auto-generated method stub
		super.cat(factor1);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1) {
		// TODO Auto-generated method stub
		super.cat(factor1);
	}

	@Override
	public boolean eq(String value) {
		// TODO Auto-generated method stub
		return super.eq(value);
	}

	@Override
	public boolean ge(String value) {
		// TODO Auto-generated method stub
		return super.ge(value);
	}

	@Override
	public boolean gt(String value) {
		// TODO Auto-generated method stub
		return super.gt(value);
	}

	@Override
	public boolean le(String value) {
		// TODO Auto-generated method stub
		return super.le(value);
	}

	@Override
	public boolean lt(String value) {
		// TODO Auto-generated method stub
		return super.lt(value);
	}

	@Override
	public boolean ne(String value) {
		// TODO Auto-generated method stub
		return super.ne(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}


	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public String asString() {
		return trimR();
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		super.in();
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		super.out();
	}	
}