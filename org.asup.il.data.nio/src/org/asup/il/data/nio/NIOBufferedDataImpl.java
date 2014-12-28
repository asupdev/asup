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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataVisitor;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;

	private NIOBufferedDataImpl _parent;
	private int _position;

	private transient ByteBuffer _buffer;

	public NIOBufferedDataImpl() {
		super();
	}

	protected abstract byte getFiller();

	@Override
	public NIOBufferedDataImpl copy() {

		try {

			NIOBufferedDataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			// remove buffer and parent reference
			// TODO synchronize
			NIOBufferedDataImpl tempParent = _parent;
			ByteBuffer tempBuffer = _buffer;
			int tempPosition = _position;
			_parent = null;
			_buffer = null;
			_position = 0;
			oos.writeObject(this);
			_parent = tempParent;
			_buffer = tempBuffer;
			_position = tempPosition;
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void allocate() {

		// TODO synchronize
		if (_parent != null || _buffer != null)
			throw new FrameworkCoreRuntimeException("Unexpected condition: dmn8432m75n030");

		_parent = null;
		_buffer = ByteBuffer.allocate(getSize());

		// TODO performances
		clear();
	}

	public void slice(QBufferedData target, int position) {

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);

		if (nioBufferedData == null)
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());

		// TODO synchronize
		if (nioBufferedData._buffer != null)
			throw new FrameworkCoreRuntimeException("Unexpected condition: dmn8432m75n031");

		nioBufferedData._parent = this;
		nioBufferedData._buffer = null;
		nioBufferedData._position = position;

		// System.out.println(nioBufferedData._position);
	}

	@Override
	public void assign(QBufferedData target) {

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);

		if (nioBufferedData == null)
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());

		// TODO synchronize
		if (_parent != null)
			System.err.println("Unexpected condition: zsdg789zgsm07");

		nioBufferedData._parent = null;
		nioBufferedData._buffer = getBuffer();
		nioBufferedData._position = getPosition();
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), getSize(), getFiller());
	}

	@Override
	public boolean isEmpty() {

		byte[] bytes = asBytes();
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] != getFiller())
				return false;
		}
		return true;
	}

	@Override
	public boolean isNull() {
		return getBuffer() == null;
	}

	public ByteBuffer getBuffer() {

		// TODO synchronize
		if (_buffer != null)
			return _buffer;
		else if (_parent != null)
			return _parent.getBuffer();
		else
			return null;
	}

	public int getPosition() {

		// TODO synchronize
		if (_parent != null)
			return _parent.getPosition() + _position;
		else {
			return _position;
		}
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {

		// TODO synchronize
		byte[] array = null;
		if (_buffer != null)
			array = _buffer.array();
		else
			array = new byte[0];

		stream.writeInt(array.length);
		stream.write(array);
		stream.writeObject(_parent);
		stream.writeInt(_position);
	}

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {

		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);
		Object object = stream.readObject();
		_parent = (NIOBufferedDataImpl) object;
		_position = stream.readInt();

		// TODO
		if (_position == 538976288) {
			System.err.println("Unexpected condition: xm74tx045m07");
			_position = 0;
		}

		if (length > 0) {
			_buffer = ByteBuffer.allocate(length);
			_buffer.put(array);
		}
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), getSize());
	}

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		move(Integer.toString(value), clear);
	}

	@Override
	public void move(Number value) {
		move(value, false);
	}

	@Override
	public void move(Number value, boolean clear) {
		move(value.toString(), clear);
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void move(String value) {
		move(value, false);
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
	public void movel(int value) {
		movel(value, false);
	}

	@Override
	public void movel(int value, boolean clear) {
		movel(Integer.toString(value), clear);
	}

	@Override
	public void movel(Number value) {
		movel(value, false);
	}

	@Override
	public void movel(Number value, boolean clear) {
		movel(value.toString(), clear);
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
	}

	@Override
	public String toString() {
		return new String(asBytes());
	}

	@Override
	public String asString() {
		return toString();
	}

	@Override
	public boolean eq(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eval(QDataEvaluator value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean ge(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gt(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lt(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ne(QDataEvaluator value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(QDataEvaluator value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(QDataEvaluator value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void movel(QDataEvaluator value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void movel(QDataEvaluator value, boolean clear) {
		// TODO Auto-generated method stub

	}
}