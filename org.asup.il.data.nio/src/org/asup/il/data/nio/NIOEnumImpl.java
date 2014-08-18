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

public class NIOEnumImpl<E extends Enum<E>, D extends QBufferedData> extends NIOBufferDelegator implements QEnum<E, D> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Class<E> klass;
	
	public NIOEnumImpl(Class<E> klass, QBufferedData delegate) {
		super(delegate);
		this.klass = klass;
	}

	@Override
	public E asEnum() {
		
		String value = toString().trim();

		for(Field field: klass.getFields()) {
			Special special = field.getAnnotation(Special.class); 
			if(special == null)
				continue;
			
			if(special.value().equals(value))
				return Enum.valueOf(klass, field.getName());
		}
		
		return Enum.valueOf(klass, "OTHER");
	}


	@SuppressWarnings("unchecked")
	@Override
	public D asData() {
		
		QBufferedData bufferedData = getDelegate(); 
		
		while(bufferedData instanceof NIOBufferDelegator) {
			NIOBufferDelegator nioBufferDelegator = (NIOBufferDelegator) bufferedData;
			bufferedData = nioBufferDelegator.getDelegate();
		}
		
		return (D) bufferedData;
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

	/*
	@Override
	public List<QEnumElementDef> getElements() {

		if(elements == null) {
			elements = new ArrayList<>();
			for(Field field: klass.getFields()) {
				Special special = field.getAnnotation(Special.class); 
				if(special == null)
					continue;
				
				QEnumElementDef enumElement = QIntegratedLanguageDataFactory.eINSTANCE.createEnumElementDef();
				enumElement.setName("*"+field.getName());
				enumElement.setText(special.text());
				enumElement.setValue(special.value());
				
				elements.add(enumElement);
			}
		}
		
		return elements;
	}*/
}
