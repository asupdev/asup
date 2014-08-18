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

import org.asup.il.data.QBinary;

public class NIOBinaryImpl extends NIODecimalImpl implements QBinary {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NIOBinaryImpl(int precision, int scale, byte[] value, boolean initialize) {
		super(precision, scale, value, initialize);
	}

}
