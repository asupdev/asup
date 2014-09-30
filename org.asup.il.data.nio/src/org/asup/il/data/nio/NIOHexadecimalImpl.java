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

import org.asup.il.data.QHexadecimal;

public class NIOHexadecimalImpl extends NIODecimalImpl implements QHexadecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NIOHexadecimalImpl(int length, byte[] value) {
		super(length, 0, value);
	}


	@Override
	public NIOHexadecimalImpl copy() {

		NIOHexadecimalImpl copy = new NIOHexadecimalImpl(_precision, _value);
		
		return copy;
	}
}
