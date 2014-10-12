/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.util.List;

public abstract class QDataStructDelegator implements QDataStruct, QBufferedDataDelegator {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void in() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}

	private QStruct delegate;

	public void setDelegate(QStruct delegate) {
		this.delegate = delegate;		
	}

	public QStruct getDelegate() {
		return this.delegate;
	}
	
	@Override
	public String trim() {
		return delegate.trim();
	}

	@Override
	public String trimL() {
		return delegate.trimL();
	}

	@Override
	public String trimR() {
		return delegate.trimR();
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
	public byte[] asBytes() {
		return delegate.asBytes();
	}

	
	@Override
	public String asString() {
		return delegate.asString();
	}
	
	@Override
	public void clear() {
		delegate.clear();
	}

	@Override
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public QBufferedData getElement(String name) {
		return delegate.getElement(name);
	}

	@Override
	public QBufferedData getElement(int position) {
		return delegate.getElement(position);
	}

	@Override
	public void eval(String value) {
		delegate.eval(value);
	}

	@Override
	public void eval(boolean value) {
		delegate.eval(value);
	}

	@Override
	public void move(boolean value) {
		delegate.move(value);
	}

	@Override
	public void movel(boolean value) {
		delegate.movel(value);
	}

	@Override
	public void eval(QBufferedData value) {
		delegate.eval(value);
	}
	
	@Override
	public String toString() {
		return delegate.toString();
	}

	@Override
	public List<QBufferedData> getElements() {
		return delegate.getElements();
	}
	
	@Override
	public void cat(String factor1, String factor2, int space) {
		delegate.cat(factor1, factor2, space);
	}
	
	@Override
	public void cat(String factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}
	
	@Override
	public void cat(String factor1) {
		delegate.cat(factor1);
	}
	

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(String factor1, QString factor2) {
		delegate.cat(factor1, factor2);		
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		delegate.cat(factor1, factor2);		
	}

	@Override
	public void cat(QString factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1) {
		delegate.cat(factor1);		
	}

	@Override
	public boolean eq(String value) {
		return delegate.eq(value);
	}
	@Override
	public boolean ge(String value) {
		return delegate.ge(value);
	}
	@Override
	public boolean gt(String value) {
		return delegate.gt(value);
	}
	@Override
	public boolean le(String value) {
		return delegate.le(value);
	}
	@Override
	public boolean lt(String value) {
		return delegate.lt(value);
	}
	@Override
	public boolean ne(String value) {
		return delegate.ne(value);
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
	public <E extends Enum<E>> void movel(E value) {
		delegate.movel(value);		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		delegate.movel(value, clear);		
	}

	@Override
	public void accept(QDataVisitor visitor) {
		delegate.accept(visitor);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		delegate.eval(value);
	}

	@Override
	public boolean eq(QString value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ge(QString value) {
		return delegate.eq(value);
	}

	@Override
	public boolean gt(QString value) {
		return delegate.gt(value);
	}

	@Override
	public boolean le(QString value) {
		return delegate.le(value);
	}

	@Override
	public boolean lt(QString value) {
		return delegate.lt(value);
	}

	@Override
	public boolean ne(QString value) {
		return delegate.ne(value);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return delegate.eq(value);
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return delegate.ge(value);
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return delegate.gt(value);
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return delegate.le(value);
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return delegate.lt(value);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return delegate.ne(value);
	}

	@Override
	public void assign(QBufferedData value) {
		delegate.assign(value);
	}

	@Override
	public void move(Number value) {
		delegate.move(value);
	}

	@Override
	public void move(Number value, boolean clear) {
		delegate.move(value);		
	}

	@Override
	public void movel(Number value) {
		delegate.movel(value);
	}

	@Override
	public void movel(Number value, boolean clear) {
		delegate.movel(value);		
	}
}