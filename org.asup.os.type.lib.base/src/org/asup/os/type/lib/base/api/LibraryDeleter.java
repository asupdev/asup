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
package org.asup.os.type.lib.base.api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedManager;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QPhysicalFile;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QLibraryManager;

@Program(name = "QLICLLIB")
public class LibraryDeleter {

	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QTypeRegistry typeRegistry;

	public @Entry void main(@DataDef(length = 10) QCharacter library, @DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice) {

		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);

		try {
			QLibrary qLibrary = libraryWriter.lookup(library.trimR());
			if (qLibrary == null)
				throw new OperatingSystemRuntimeException("Library not found: " + library);

			for (QTypedManager<? extends QTypedObject> typedManager : typeRegistry.list()) {

				if(QFile.class.isAssignableFrom(typedManager.getTypedClass()))
					deleteFileType(typedManager, qLibrary.getName());
				else
					deleteType(typedManager, qLibrary.getName());

			}

			// TODO iterate contents
			libraryWriter.delete(qLibrary);

		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}


	private <T extends QTypedObject> void deleteType(QTypedManager<T> typedManager, String library) throws OperatingSystemException {

		QResourceWriter<T> typeWriter = typedManager.getResourceWriter(job, library);

		QObjectIterator<T> typedObjects = typeWriter.find(null);
		while (typedObjects.hasNext()) {
			T typedObject = typedObjects.next();
			typeWriter.delete(typedObject);
		}

	}
	
	private <T extends QTypedObject> void deleteFileType(QTypedManager<T> typedManager, String library) throws OperatingSystemException {

		QResourceWriter<T> typeWriter = typedManager.getResourceWriter(job, library);

		List<T> physicalFiles = new ArrayList<T>();
		
		QObjectIterator<T> typedObjects = typeWriter.find(null);
		while (typedObjects.hasNext()) {
			T typedObject = typedObjects.next();
			
			if(typedObject instanceof QPhysicalFile) 
				physicalFiles.add(typedObject);
			else			
				typeWriter.delete(typedObject);
		}

		
		for(T physicalFile: physicalFiles) 
			typeWriter.delete(physicalFile);
	}

	public static enum ASPDeviceEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
