/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.jobs.QJob;

@Program(name = "QP0LCRML")
public class DeleteObject {

	@Inject QJob job;
	
	@Entry
	public void main(@DataDef(length = 5000) QCharacter objectLink) throws IOException {
		
		/*		URI uri = URI.createURI(objectLink.trimR());
		String library = uri.scheme().toUpperCase();
		String type = uri.host();
		String name = uri.lastSegment();
		
		QSourceEntry sourceEntry = sourceManager.getObjectEntry(job, library, type, name);
		if(sourceEntry != null)
			sourceManager.removeEntry(job, sourceEntry);
		else
			throw new OperatingSystemRuntimeException("OPT1862");*/
	}
}
