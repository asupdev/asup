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
package org.asup.os.type.file.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;

@Program(name = "QDMOVERD")
public class OverrideFileExecutor {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(length = 10) QCharacter file, TypedReference<?> fileTo) {

		// TODO Intercept library special value
		QResourceReader<QFile> fileReader = resourceFactory.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		QFile qFile = fileReader.lookup(fileTo.library.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: " + fileTo);

		fileManager.overrideDatabaseFile(job, file.trimR(), qFile);

	}

}
