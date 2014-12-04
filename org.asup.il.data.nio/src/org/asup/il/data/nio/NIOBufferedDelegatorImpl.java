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
import org.asup.il.data.QBufferedDataDelegator;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataVisitor;

public abstract class NIOBufferedDelegatorImpl extends NIODataImpl implements QBufferedData, QBufferedDataDelegator {

	private static final long serialVersionUID = 1L;
	
	private QBufferedData _delegate;

	public NIOBufferedDelegatorImpl() {
		super();
	}
	
	protected NIOBufferedDelegatorImpl(QBufferedData delegate) {
		super();
		this._delegate = delegate;
	}
	
	@Override
	public void accept(QDataVisitor visitor) {
		_delegate.accept(visitor);
	}
	

	@Override
	public byte[] asBytes() {
		return _delegate.asBytes();
	}

	@Override
	public void assign(QBufferedData value) {
		if(_delegate != null)
			_delegate.assign(value);
		else
			throw new FrameworkCoreRuntimeException("Unexpceted condition: fzt76tbc3bcr47");
	}
	
	@Override
	public String asString() {
		return _delegate.asString();
	}
	@Override
	public void clear() {
		_delegate.clear();		
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
	public <E extends Enum<E>> boolean eq(E value) {
		return _delegate.eq(value);
	}

	@Override
	public boolean eq(QDataEvaluator  value) {
		return _delegate.eq(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		_delegate.eval(value);
	}

	@Override
	public void eval(QBufferedData value) {
		_delegate.eval(value);
	}

	@Override
	public void eval(QDataEvaluator value) {
		_delegate.eval(value);		
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return _delegate.ge(value);
	}

	@Override
	public boolean ge(QDataEvaluator  value) {
		return _delegate.ge(value);
	}

	@Override
	public QBufferedData getDelegate() {
		return _delegate;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return _delegate.gt(value);
	}

	@Override
	public boolean gt(QDataEvaluator  value) {
		return _delegate.gt(value);
	}

	@Override
	public boolean isEmpty() {
		return _delegate.isEmpty();
	}

	@Override
	public boolean isNull() {
		if(_delegate == null)
			return true;
		
		// TODO
		return ((NIOBufferedDataImpl) _delegate).getBuffer() == null;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return _delegate.le(value);
	}

	@Override
	public boolean le(QDataEvaluator  value) {
		return _delegate.le(value);
	}

	@Override
	public int length() {
		return _delegate.length();
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return _delegate.lt(value);
	}

	@Override
	public boolean lt(QDataEvaluator  value) {
		return _delegate.lt(value);
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
	public void move(int value) {
		_delegate.move(value);		
	}

	@Override
	public void move(int value, boolean clear) {
		_delegate.move(value, clear);		
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
	public void move(QBufferedData value) {
		_delegate.move(value);		
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		_delegate.move(value, clear);		
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
	public void movea(QArray<?> value) {
		_delegate.movea(value);		
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		_delegate.movea(value, clear);		
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
	public void movel(int value) {
		_delegate.movel(value);		
	}

	@Override
	public void movel(int value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(Number value) {
		_delegate.movel(value);		
	}

	@Override
	public void movel(Number value, boolean clear) {
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
	public void movel(String value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		_delegate.movel(value, clear);		
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return _delegate.ne(value);
	}

	@Override
	public boolean ne(QDataEvaluator  value) {
		return _delegate.ne(value);
	}

	protected void setDelegate(QBufferedData delegate) {
		this._delegate = delegate;
	}

	@Override
	public int size() {
		return _delegate.size();
	}

	@Override
	public String toString() {
		return _delegate.toString();
	}
	

	@Override
	public void move(QDataEvaluator value) {
		_delegate.move(value);		
	}

	@Override
	public void move(QDataEvaluator value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void movel(QDataEvaluator value) {
		_delegate.movel(value);		
	}

	@Override
	public void movel(QDataEvaluator value, boolean clear) {
		_delegate.movel(value, clear);		
	}
}