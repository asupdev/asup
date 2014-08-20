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

import org.asup.il.data.QBinary;
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
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QOperatingSystemLibraryFactory;

@Command(name = "CRTLIB")
@Program(name = "QLICRLIB")
public class LibraryCreator {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	
	@Entry
	public void main(
			@DataDef(length = 10) QCharacter library,
			@DataDef(length = 10) QEnum<LibraryType, QCharacter> libraryType,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QEnum<Authority, QCharacter> authority,
			QEnum<ASPNumber, QBinary> aspNumber,
			@DataDef(length = 10) QEnum<ASPDevice, QCharacter> aspDevice,
			@DataDef(length = 10) QEnum<CreateAuthority, QCharacter> createAuthority,
			@DataDef(length = 10) QEnum<CreateObjectAuditing, QCharacter> createObjectAuditing) {
		

		QResourceWriter<QLibrary> libraryWriter = resourceFactory.getResourceWriter(job, QLibrary.class, systemManager.getSystem().getSystemLibrary());

		if (libraryWriter.exists(library.trimR()))
			throw new OperatingSystemRuntimeException("Library already exists: " + library.trimR());

		QLibrary qLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
		qLibrary.setName(library.trimR());
		qLibrary.setText(textDescription.trimR());

		try {
			libraryWriter.save(qLibrary);
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}		
	}

	public static enum LibraryType {
		@Special(value = "PROD")
		PROD, @Special(value = "TEST")
		TEST
	}

	public static enum Authority {
		@Special(value = "*LIBCRTAUT")
		LIBCRTAUT, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE, OTHER
	}

	public static enum ASPNumber {
		@Special(value = "0")
		ASPDEV, OTHER
	}

	public static enum ASPDevice {
		@Special(value = "*ASP")
		ASP, @Special(value = "*ASPGRPPRI")
		ASPGRPPRI, @Special(value = "*SYSTEM")
		SYSTEM, OTHER
	}

	public static enum CreateAuthority {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE, OTHER
	}

	public static enum CreateObjectAuditing {
		@Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL
	}
}
