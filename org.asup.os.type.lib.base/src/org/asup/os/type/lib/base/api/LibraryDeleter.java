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

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.lib.QLibrary;

@Program(name = "QLICLLIB")
public class LibraryDeleter {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	
	public @Entry void main(@DataDef(length = 10) QCharacter library,
			@DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice) {

		QResourceWriter<QLibrary> libraryWriter = resourceFactory.getResourceWriter(job, QLibrary.class, systemManager.getSystem().getSystemLibrary());

		try {
			
			QLibrary qLibrary = libraryWriter.lookup(library.trimR());
			if (qLibrary == null)			
				throw new OperatingSystemRuntimeException("Library not found: "	+ library);
			
			// TODO iterate contents
			libraryWriter.delete(qLibrary);
			
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}		
	}

	public static enum ASPDeviceEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
