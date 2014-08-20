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
import org.asup.il.data.annotation.Command;
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
import org.asup.os.omac.annotation.Domain;
import org.asup.os.type.lib.QLibrary;

@Command(name = "DLTLIB")
@Program(name = "QLICLLIB")
public class LibraryDeleter {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	
	@Entry
	public void main(
			@Domain(name = QLibrary.class, restricted = false, specials = { "*CURLIB" }) 
			@DataDef(length = 10) QCharacter library,
			@DataDef(length = 10) QEnum<ASPDevice, QCharacter> aspDevice) {

		QResourceWriter<QLibrary> libraryWriter = resourceFactory.getResourceWriter(job, QLibrary.class, systemManager.getSystem().getSystemLibrary());

		try {
			
			QLibrary qLibrary = libraryWriter.lookup(library.trimR());
			if (qLibrary == null)			
				throw new OperatingSystemRuntimeException("Library not found: "	+ library);
			
			libraryWriter.delete(qLibrary);
			
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}		
	}

	public static enum ASPDevice {
		@Special(value = "*")
		TERM_STAR, 
		@Special(value = "*CURASPGRP")
		CURASPGRP, 
		@Special(value = "*SYSBAS")
		SYSBAS, OTHER
	}
}
