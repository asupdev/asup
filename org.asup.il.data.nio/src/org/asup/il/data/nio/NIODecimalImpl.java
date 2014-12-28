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

import org.asup.il.data.QDecimal;

public class NIODecimalImpl extends NIONumericImpl implements QDecimal {

	private static final long serialVersionUID = 1L;
	private static byte INIT = (byte) 48;

	private int _precision;
	private int _scale;

	public NIODecimalImpl() {
		super();
	}
	
	public NIODecimalImpl(int precision, int scale) {
		super();
		_precision = precision;
		_scale = scale;
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public int getLength() {
		return _precision;
	}

	@Override
	public int getSize() {
		return _precision;
	}

	@Override
	public int getPrecision() {
		return _precision;
	}

	@Override
	public int getScale() {
		return _scale;
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
	public boolean isSigned() {
		return true;
	}	

	@Override
	public Number readNumber() {
		return Double.parseDouble(new String(asBytes()));
	}

	@Override
	public void writeNumber(Number number) {
		move(number.toString(), true);
	}

	@Override
	public int compareNumber(Number value) {
		// TODO Auto-generated method stub
		return 0;
	}
}