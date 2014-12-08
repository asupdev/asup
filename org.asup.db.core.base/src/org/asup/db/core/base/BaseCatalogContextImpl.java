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
package org.asup.db.core.base;

import java.lang.annotation.Annotation;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ContextImpl;

public class BaseCatalogContextImpl extends ContextImpl {

	private QContext context;
	private QContextID id;
	
	public BaseCatalogContextImpl(QContext context, final String id) {
		this.context = context;
		
		this.id = new QContextID() {

			@Override
			public String getID() {
				return id.toString();
			}
		};
	}
	
	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {
		return context.createChild();
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return context.get(clazz);
	}

	@Override
	public void inject(Object object) throws FrameworkCoreRuntimeException {
		context.inject(object);
	}

	@Override
	public Class<?> loadClass(QContextID contextID, String address) {
		return context.loadClass(contextID, address);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		context.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
		return context.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException {
		context.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
		context.set(name, object);
	}

	@Override
	public <T> T getAdapter(Object source, Class<T> target) {
		return context.getAdapter(source, target);
	}
	@Override
	public void close() throws FrameworkCoreRuntimeException {
		context.close();
	}

	@Override
	public QContextID getID() {
		return id;
	}

}
