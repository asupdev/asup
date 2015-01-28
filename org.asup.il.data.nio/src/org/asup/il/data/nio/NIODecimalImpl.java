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
import org.asup.il.data.nio.jtopen.AS400ZonedDecimal;

public class NIODecimalImpl extends NIONumericImpl implements QDecimal {

	private static final long serialVersionUID = 1L;
	
	private static final byte INIT = (byte) 48;
	protected static final byte ZERO = (byte) 48;

	private static final AS400ZonedDecimal definitions[][] = new AS400ZonedDecimal[50][50];

	private AS400ZonedDecimal zoned = null;
	
//	private int _precision;
//	private int _scale;

	public NIODecimalImpl() {
		super();
	}

	public NIODecimalImpl(int precision, int scale) {
		super();
//		_precision = precision;
//		_scale = scale;
		
		
		zoned = getDecimal(precision, scale);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public int getLength() {
		return getPrecision();
	}

	@Override
	public int getSize() {
		return zoned.getByteLength();
	}

	@Override
	public int getPrecision() {
		return zoned.getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return zoned.getNumberOfDecimalPositions();
	}

	@Override
	public boolean isSigned() {
		return true;
	}

	@Override
	public Number readNumber() {

		AS400ZonedDecimal zoned = getDecimal(getPrecision(), getScale());

		double result = 0;
		try {
			result = zoned.toDouble(asBytes());
		} catch (Exception e) {
			// TODO
//			System.err.println("Unexpected condition vv6666eqw5rqvcrqv: " + e);
		}

		return result;
	}

	@Override
	public void eval(BigInteger value) {
		
		AS400ZonedDecimal zoned = getDecimal(getPrecision(), getScale());

		byte[] bytes = zoned.toBytes(value.doubleValue());
		if(bytes.length < getLength())
			bytes.toString();
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), bytes, true, INIT);
	}

	@Override
	public void eval(BigDecimal value) {
		
		AS400ZonedDecimal zoned = getDecimal(getPrecision(), getScale());

		byte[] bytes = zoned.toBytes(value.doubleValue());
		if(bytes.length < getLength())
			bytes.toString();
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), bytes, true, INIT);
	}

	@Override
	public void writeNumber(Number number) {
		
		AS400ZonedDecimal zoned = getDecimal(getPrecision(), getScale());

		byte[] bytes = zoned.toBytes(number.doubleValue());
		if(bytes.length < getLength())
			bytes.toString();
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), bytes, true, INIT);
	}

	@Override
	public int compareNumber(Number value) {

		double d1 = 0;
		try {
			d1 = asDouble();
		} catch (NumberFormatException e) {

		}
		double d2 = value.doubleValue();

		return Double.compare(d1, d2);
	}

	private AS400ZonedDecimal getDecimal(int precision, int scale) {

		try {
			AS400ZonedDecimal decimal = definitions[precision - 1][scale];

			if (decimal == null) {

				synchronized (definitions) {
					decimal = definitions[precision - 1][scale];
					if (decimal == null) {
						decimal = new AS400ZonedDecimal(precision, scale);
						decimal.setUseDouble(true);
						definitions[precision - 1][scale] = decimal;
					}
				}
			}

			return decimal;
		} catch (Exception e) {
			e.toString();
			return null;
		}
	}
}