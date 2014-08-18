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

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataVisitor;

public class NIOBufferDelegator implements QBufferedData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private QBufferedData delegate;
	
	protected NIOBufferDelegator(QBufferedData delegate) {
		this.delegate = delegate;
	}
	
	protected QBufferedData getDelegate() {
		return delegate;
	}
	@Override
	public String toString() {
		return delegate.toString();
	}
	
	@Override
	public void eval(QBufferedData value) {
		delegate.eval(value);
	}

	@Override
	public int length() {
		return delegate.length();
	}

	@Override
	public int size() {
		return delegate.size();
	}

	@Override
	public void reset() {
		delegate.reset();		
	}

	@Override
	public byte[] asBytes() {
		return delegate.asBytes();
	}

	@Override
	public void clear() {
		delegate.clear();		
	}

	@Override
	public void eval(Object value) {
		delegate.eval(value);
	}

	@Override
	public void init() {
		delegate.init();		
	}

	@Override
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public void move(String value) {
		delegate.move(value);		
	}

	@Override
	public void move(String value, boolean clear) {
		delegate.move(value, clear);		
	}

	@Override
	public void move(int value) {
		delegate.move(value);		
	}

	@Override
	public void move(int value, boolean clear) {
		delegate.move(value, clear);		
	}

	@Override
	public void move(QBufferedData value) {
		delegate.move(value);		
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		delegate.move(value, clear);		
	}

	@Override
	public void movea(QArray<?> value) {
		delegate.movea(value);		
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		delegate.movea(value, clear);		
	}

	@Override
	public void movel(String value) {
		delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		delegate.movel(value, clear);		
	}

	@Override
	public void movel(int value) {
		delegate.movel(value);		
	}

	@Override
	public void movel(int value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		delegate.movel(value);				
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		delegate.movel(value, clear);		
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		delegate.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		delegate.movea(value);
	}

	@Override
	public <E extends Enum<E>> void movea(E value, boolean clear) {
		delegate.movea(value, clear);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		delegate.movel(value);		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		delegate.movel(value, clear);		
	}

	@Override
	public String asString() {
		return delegate.asString();
	}

	@Override
	public void accept(QDataVisitor visitor) {
		delegate.accept(visitor);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		delegate.eval(value);
	}
}
