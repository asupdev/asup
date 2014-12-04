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

import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
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
import org.asup.os.type.lib.QOperatingSystemLibraryFactory;

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
			@DataDef(length = 10) QEnum<LibraryTypeEnum, QCharacter> libraryType,
			@DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<AuthorityEnum, QCharacter> authority,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<ASPNumberEnum, QBinary> aSPNumber,
			@DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice,
			@DataDef(length = 10) QEnum<CreateAuthorityEnum, QCharacter> createAuthority,
			@DataDef(length = 10) QEnum<CreateObjectAuditingEnum, QCharacter> createObjectAuditing) {
		

		QResourceWriter<QLibrary> libraryWriter = resourceFactory.getResourceWriter(job, QLibrary.class, systemManager.getSystem().getSystemLibrary());

		if (libraryWriter.exists(library.trimR()))
			throw new OperatingSystemRuntimeException("Library already exists: " + library.trimR());

		QLibrary qLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
		qLibrary.setName(library.trimR());
		
		switch (textDescription.asEnum()) {
		case BLANK:
			break;
		case OTHER:
			qLibrary.setText(textDescription.asData().trimR());
			break;
		}
		
		try {
			libraryWriter.save(qLibrary);
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}		
	}

	public static enum LibraryTypeEnum {
		@Special(value = "PROD")
		PROD, @Special(value = "TEST")
		TEST
	}

	public static enum TextDescriptionEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static enum AuthorityEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum ASPNumberEnum {
		@Special(value = "0")
		ASPDEV, OTHER
	}

	public static enum ASPDeviceEnum {
		ASP, ASPGRPPRI, SYSTEM, OTHER
	}

	public static enum CreateAuthorityEnum {
		SYSVAL, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum CreateObjectAuditingEnum {
		SYSVAL, NONE, USRPRF, CHANGE, ALL
	}
}
