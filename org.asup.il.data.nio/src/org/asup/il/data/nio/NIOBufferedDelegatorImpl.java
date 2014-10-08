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

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDelegator;
import org.asup.il.data.QDataVisitor;

public abstract class NIOBufferedDelegatorImpl extends NIODataImpl implements QBufferedData, QDataDelegator {

	private static final long serialVersionUID = 1L;
	
	private QBufferedData _delegate;

	public NIOBufferedDelegatorImpl() {
		super();
	}
	
	protected NIOBufferedDelegatorImpl(QBufferedData delegate) {
		super();
		this._delegate = delegate;
	}
	
	protected void setDelegate(QBufferedData delegate) {
		this._delegate = delegate;
	}
	
	@Override
	public NIODataImpl copy() {

		try {			
			NIOBufferedDelegatorImpl copy = null;
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			QBufferedData temp = _delegate;
			_delegate = null;
			oos.writeObject(this);
			_delegate = temp;
			oos.close();
					
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDelegatorImpl) ois.readObject();
			ois.close();
			if(_delegate != null)
				copy._delegate = getNIOBufferedDataImpl(_delegate).copy();
			
			return copy;
		}
		catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void assign(QBufferedData value) {
		if(_delegate != null)
			_delegate.assign(value);
		else
			throw new FrameworkCoreRuntimeException("Unexpceted condition: fzt76tbc3bcr47");
	}
	@Override
	public QData getDelegate() {
		return _delegate;
	}
	
	@Override
	public String toString() {
		return _delegate.toString();
	}
	
	@Override
	public void eval(QBufferedData value) {
		_delegate.eval(value);
	}

	@Override
	public int length() {
		return _delegate.length();
	}

	@Override
	public int size() {
		return _delegate.size();
	}

	@Override
	public byte[] asBytes() {
		return _delegate.asBytes();
	}

	@Override
	public void clear() {
		_delegate.clear();		
	}

	@Override
	public void eval(Object value) {
		_delegate.eval(value);
	}

	@Override
	public boolean isEmpty() {
		return _delegate.isEmpty();
	}

	@Override
	public void move(String value) {
		_delegate.move(value);		
	}

	@Override
	public void move(String value, boolean clear) {
		_delegate.move(value, clear);		
	}

	@Override
	public void move(int value) {
		_delegate.move(value);		
	}

	@Override
	public void move(int value, boolean clear) {
		_delegate.move(value, clear);		
	}

	@Override
	public void move(QBufferedData value) {
		_delegate.move(value);		
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		_delegate.move(value, clear);		
	}

	@Override
	public void movea(QArray<?> value) {
		_delegate.movea(value);		
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		_delegate.movea(value, clear);		
	}

	@Override
	public void movel(String value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		_delegate.movel(value, clear);		
	}

	@Override
	public void movel(int value) {
		_delegate.movel(value);		
	}

	@Override
	public void movel(int value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		_delegate.movel(value);				
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		_delegate.movel(value, clear);		
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		_delegate.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		_delegate.movel(value);		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		_delegate.movel(value, clear);		
	}

	@Override
	public String asString() {
		return _delegate.asString();
	}

	@Override
	public void accept(QDataVisitor visitor) {
		_delegate.accept(visitor);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		_delegate.eval(value);
	}

	@Override
	public void move(Number value) {
		_delegate.move(value);		
	}

	@Override
	public void move(Number value, boolean clear) {
		_delegate.move(value, clear);		
	}
	@Override
	public void movel(Number value) {
		_delegate.movel(value);		
	}

	@Override
	public void movel(Number value, boolean clear) {
		_delegate.movel(value, clear);		
	}
}
