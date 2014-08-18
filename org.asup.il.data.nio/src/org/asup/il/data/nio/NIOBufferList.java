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
import java.util.Iterator;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QList;
import org.asup.il.data.QNumeric;

public abstract class NIOBufferList<D extends QBufferedData> extends NIOBufferReference implements QList<D>, QBufferedData {


	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(_buffer, _position, size());
	}
	

	@Override
	public void clear() {
		for (QBufferedData element : this) {
			element.clear();
		}
	}

	@Override
	public void eval(Object value) {
		for (QBufferedData element : this) {
			element.eval(value);
		}
	}

	@Override
	public void eval(QBufferedData value) {
		for (QBufferedData element : this) {
			element.eval(value);
		}
	}
	
	@Override
	public D get(QNumeric index) {
		return get(index.asInteger());
	}
	
	@Override
	public void init() {

		if (_buffer != null)
			return;

		_buffer = ByteBuffer.allocate(size());
		_position = 0;

		for (QBufferedData element : this) {
			element.clear();
		}
	}
	
	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Iterator<D> iterator() {
		return new NIOListIterator<D>(this);
	}
	

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		for (QBufferedData element : this) {
			element.move(value, clear);
		}
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		for (QBufferedData element : this) {
			element.move(value, clear);
		}
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {
		for (QBufferedData element : this) {
			element.move(value, clear);
		}
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}


	@Override
	public void movea(QArray<?> value, boolean clear) {		
		NIOBufferHelper.movel(_buffer, _position, value.size(), value.asBytes(), false, (byte) 32);

	}

	@Override
	public void movel(int value) {
		movel(value, false);
	}

	@Override
	public void movel(int value, boolean clear) {
		for (QBufferedData element : this) {
			element.movel(value, clear);
		}
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		for (QBufferedData element : this) {
			element.movel(value, clear);
		}
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(String value, boolean clear) {
		for (QBufferedData element : this) {
			element.movel(value, clear);
		}
	}

	@Override
	public void reset() {
		for (QBufferedData element : this) {
			element.reset();
		}
	}

	public String toString() {
		return new String(asBytes());
	}


	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movea(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void accept(QDataVisitor visitor) {

		if(visitor.visit(this)) {
			
			Iterator<D> datas = this.iterator();
			while(datas.hasNext()) {
				datas.next().accept(visitor);
			}
		}
		
		visitor.endVisit(this);
	}
	
	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		
	}
}