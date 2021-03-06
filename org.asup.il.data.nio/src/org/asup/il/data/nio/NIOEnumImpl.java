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

import java.lang.reflect.Field;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Special;

public class NIOEnumImpl<E extends Enum<E>, D extends QBufferedData> extends NIOBufferedDelegatorImpl implements QEnum<E, D> {

	private static final long serialVersionUID = 1L;

	private Class<E> _klass;

	public NIOEnumImpl() {
		super();
	}
	
	public NIOEnumImpl(Class<E> klass, QBufferedData delegate) {
		super(delegate);
		this._klass = klass;
	}

	@Override
	public E asEnum() {
		
		String value = toString().trim();

		for(Field field: _klass.getFields()) {
			Special special = field.getAnnotation(Special.class); 
			if(special == null) {
				if(value.equals("*"+field.getName().toUpperCase()))
					return Enum.valueOf(_klass, field.getName());
			}
			else
				if(special.value().equals(value))
					return Enum.valueOf(_klass, field.getName());
		}
		
		return Enum.valueOf(_klass, "OTHER");
	}


	@SuppressWarnings("unchecked")
	@Override
	public D asData() {
		
		return (D) getDelegate();
	}

	@SuppressWarnings("hiding")
	@Override
	public <E extends Enum<E>> void eval(E value) {

		Field field = null;
		try {
			field = value.getClass().getField(value.name());
		} 
		catch (NoSuchFieldException | SecurityException e) {
			throw new RuntimeException(e);
		}
		
		if(field == null)
			throw new RuntimeException("Unknown field "+value.name());
		
		Special special = field.getAnnotation(Special.class); 
		if(special == null)
			throw new RuntimeException("Unknown value "+field.getName());
		
		eval(special.value());
	}

	@Override
	public String getSpecialName() {
		
		return "*"+asEnum().name();

	}

	@Override
	public void eval(String value) {

		Field field = null;
		try {
			field = value.getClass().getField(value);
		} 
		catch (NoSuchFieldException | SecurityException e) {
			throw new RuntimeException(e);
		}
		
		if(field == null)
			throw new RuntimeException("Unknown field "+value);
		
		Special special = field.getAnnotation(Special.class); 
		if(special == null)
			throw new RuntimeException("Unknown value "+field.getName());
		
		eval(special.value());

	}

}