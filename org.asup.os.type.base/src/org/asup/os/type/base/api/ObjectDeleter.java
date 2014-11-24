/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedObject;

@Program(name = "QLIDLOBJ")
public class ObjectDeleter {

	@Inject 
	private QJob job;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJobLogManager jobLogManager;
	
	@Entry
	public <T extends QTypedObject> void main(Object object,
					 @DataDef(length = 7) QCharacter objectType) {
		
		String library = object.library.trimR();
		String name = object.name.trimR();
		try {
			@SuppressWarnings("unchecked")
			QResourceWriter<T> resource = (QResourceWriter<T>) resourceFactory.getResourceWriter(job, typeRegistry.lookup(objectType.trimR()).getTypedClass(), library);
			T qObject = resource.lookup(name);
			if (qObject == null)			
				throw new OperatingSystemRuntimeException("Object not found: "	+ name);
			
			resource.delete(qObject);
			jobLogManager.info(job, "Object " +object.name.trimR()+ " on type " + objectType.trimR() +" deleted");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
	
	public static class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QCharacter name;
		
		@DataDef(length = 10)
		public QCharacter library;
	}
}
