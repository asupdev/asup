/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.os.type.dtaq.base.api;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QPointer;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.dtaq.QDataQueueManager;

@Program(name = "QSNDDTAQ")
public class BaseDataQueueSender {

	@Inject
	private QDataQueueManager dataQueueManager;
	
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(length = 10) QCharacter name,
			@DataDef(length = 10) QCharacter library,
			@DataDef(precision = 5, packed = true) QDecimal dataLength,
			QPointer data) {
		try {
			dataQueueManager.writeDataQueue(job, library.trimR(), name.trimR(), null, data.getTarget().asString());
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
} // QSNDDTAQImpl
