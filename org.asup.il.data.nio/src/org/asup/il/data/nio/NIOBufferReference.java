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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QStruct;
import org.asup.il.data.QDataStructDelegator;

public class NIOBufferReference implements Serializable {
	
	protected transient ByteBuffer _buffer;
	protected int _position;

	protected ByteBuffer getBuffer() {
		return _buffer;
	}
	
	public void slice(QBufferedData target, int position) {

		if (target instanceof QDataStructDelegator) {
			QDataStructDelegator delegator = (QDataStructDelegator) target;
			QStruct delegate = delegator.getDelegate();
			setReference(delegate, position);
		}
		else if (target instanceof NIOBufferReference) {
			setReference(target, position);
		}
		else if (target instanceof NIOBufferDelegator) {
			NIOBufferDelegator bufferDelegator = (NIOBufferDelegator)target;
			setReference(bufferDelegator.getDelegate(), position);
		}
		else
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());
	}

	private void setReference(QBufferedData target, int position) {
		NIOBufferReference bufferReference = (NIOBufferReference) target;
		bufferReference._buffer = this._buffer;
		bufferReference._position = _position + position - 1;
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		
		byte[] array = _buffer.array();		
		stream.writeInt(array.length);
		stream.write(array);
		
		stream.writeInt(_position);
	}

	private void readObject(ObjectInputStream stream) throws IOException {
	
		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);

		_position = stream.readInt();

		// TODO
		if(_position == 538976288)
			_position = 0;
		
		if(_buffer == null) {		
			_buffer = ByteBuffer.allocate(length);
			_buffer.put(array);
		}
	}	
}