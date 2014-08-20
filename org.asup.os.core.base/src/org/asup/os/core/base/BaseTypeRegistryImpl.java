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
package org.asup.os.core.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceProvider;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.impl.ResourceReaderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QOperatingSystemTypeFactory;
import org.asup.os.type.QType;
import org.asup.os.type.QTypedManager;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.impl.TypeRegistryImpl;

public class BaseTypeRegistryImpl extends TypeRegistryImpl implements QResourceProvider {


	@Inject
	private QResourceFactory resourceFactory;
	
	@SuppressWarnings("unchecked")
	@Inject
	public BaseTypeRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QTypedManager.class);
		setStore((QPluginRegistry<QTypedManager<QTypedObject>>) pluginRegistry);
	}

	@PostConstruct
	public void init() {
		resourceFactory.registerProvider(QType.class, this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {
		return (QResourceReader<T>) new TypeResourceReader();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		return (QResourceSetReader<T>) new TypeResourceSetReader();
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {
		throw new OperatingSystemRuntimeException("Not writable object: "+QType.class);
	}
	
	private class TypeResourceReader extends ResourceReaderImpl<QType> {

		@Override
		public boolean exists(String name) {
			return lookup(name) != null;
		}

		@Override
		public QObjectIterator<QType> find(String nameFilter) {
			
			List<QType> types = new ArrayList<>();
			for(QTypedManager<?> typedManager: list()) {
				types.add(buildType(typedManager));
			} 
			return new TypeIterator(types.iterator());
		}

		@Override
		public QType lookup(String name) {
			return buildType(BaseTypeRegistryImpl.this.lookup(name));
		}			
	}
	
	private class TypeResourceSetReader extends TypeResourceReader implements QResourceSetReader<QType>{

		@Override
		public List<String> getContainers() {
			return null;
		}

		@Override
		public QType lookup(String library, String name) {
			return lookup(name);
		}

		@Override
		public boolean exists(String library, String name) {
			return exists(name);
		}

		@Override
		public QObjectIterator<QType> find(String library, String nameFilter) {
			return find(nameFilter);
		}
		
	}
	
	private class TypeIterator implements QObjectIterator<QType> {

		private Iterator<QType> iterator;
		
		protected TypeIterator(Iterator<QType> iterator) {
			this.iterator = iterator;
		}
		
		@Override
		public void close() {
		
		}

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public QType next() {
			return iterator.next();
		}

		@Override
		public void remove() {
		}
		
	}
		
	private QType buildType(QTypedManager<?> typedManager) {
		
		QType type = QOperatingSystemTypeFactory.eINSTANCE.createType();
		type.setName(typedManager.getName());
		type.setText(typedManager.getText());
		type.setClassName(typedManager.getTypedClass().getName());
		type.setManager(typedManager.getClass().getName());

		return type;
	}
}
