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

import org.asup.il.data.QIndicator;

public class NIOIndicatorImpl extends NIOCharacterImpl implements QIndicator {

	private static final long serialVersionUID = 1L;
	protected static byte OFF = (byte) 32;
	protected static byte ON = (byte) 49;
	
	public NIOIndicatorImpl() {
		super(1);
	}

	@Override
	public boolean asBoolean() {
		byte byte_ = asBytes()[0];
		return byte_ != OFF && byte_ != NIODecimalImpl.ZERO;
	}

	@Override
	public boolean eq(boolean value) {
		return asBoolean() == value;
	}

	@Override
	public boolean ne(boolean value) {
		return !eq(value);
	}

	@Override
	public boolean eq(QIndicator value) {
		return eq(value.asBoolean());
	}

	@Override
	public boolean ne(QIndicator value) {
		return !eq(value);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		if(value.name().equalsIgnoreCase("ON"))
			return eq(true);
		else
			return eq(false);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return !eq(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		if(value.name().equalsIgnoreCase("ON"))
			eval(true);
		else
			eval(false);
	}

	@Override
	public boolean b() {
		return asBoolean();
	}
}
