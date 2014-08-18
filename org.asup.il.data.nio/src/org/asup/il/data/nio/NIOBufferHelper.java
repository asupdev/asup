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

import java.nio.ByteBuffer;
import java.util.Arrays;

public class NIOBufferHelper {

	public static byte[] readBytes(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		_prepare(buffer, position, length);

		byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);

		return bytes;
	}

	public static void movel(ByteBuffer buffer, int position, int length,
			byte[] bytes, boolean clear, byte filler) {
		assert buffer != null;

		_prepare(buffer, position, length);

		// overflow
		if (bytes.length >= buffer.remaining())
			buffer.put(bytes, 0, buffer.remaining());
		else {
			buffer.put(bytes);

			if (clear)
				Arrays.fill(buffer.array(), buffer.position(), buffer.limit(),
						filler);
		}

	}

	public static void move(ByteBuffer buffer, int position, int length,
			byte[] bytes, boolean clear, byte filler) {
		assert buffer != null;

		_prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, bytes.length - buffer.remaining(),
					buffer.remaining());
		else {

			if (clear)
				Arrays.fill(buffer.array(), buffer.position(), buffer.limit()
						- bytes.length, filler);

			buffer.position(position + buffer.remaining() - bytes.length);

			buffer.put(bytes);
		}
	}

	public static void clear(ByteBuffer buffer, int position, int length,
			byte filler) {
		assert buffer != null;

		_prepare(buffer, position, length);

		Arrays.fill(buffer.array(), position, buffer.limit(), filler);
	}

	private static void _prepare(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		if (position > 0) {
			// overflow
			if (position + length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(position + length);

			buffer.position(position);
		} else {
			buffer.position(0);
			buffer.limit(length);
		}
	}
}