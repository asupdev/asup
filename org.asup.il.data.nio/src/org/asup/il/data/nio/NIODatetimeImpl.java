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

import java.util.Date;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QDatetime;

public class NIODatetimeImpl extends NIOBufferReference implements QDatetime {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NIODatetimeImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] asBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 26;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(QDataVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		// TODO Auto-generated method stub
		
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
	public void movea(QArray<?> value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
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
	public void movel(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(String value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(int value, boolean clear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(QBufferedData value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
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
	public void eval(Date value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		
	}

}
