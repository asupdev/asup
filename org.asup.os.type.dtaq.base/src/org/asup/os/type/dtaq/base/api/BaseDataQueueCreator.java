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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueueManager;
import org.asup.os.type.dtaq.base.data.DataQueue;
import org.asup.os.type.dtaq.base.data.QueueSize;
import org.asup.os.type.dtaq.base.data.RemoteDataQueue;

@Program(name = "QMHQCRTQ")
public class BaseDataQueueCreator {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef() DataQueue dataQueue,
			@DataDef(length = 1) QCharacter type,
			@DataDef() QBinary maximumEntryLength,
			@DataDef(length = 1) QCharacter forceToAuxiliaryStorage,
			@DataDef(length = 1) QCharacter sequence,
			@DataDef() QBinary keyLength,
			@DataDef(length = 1) QCharacter includeSenderID,
			@DataDef() QueueSize queueSize,
			@DataDef(length = 1) QCharacter automaticReclaim,
			@DataDef() RemoteDataQueue remoteDataQueue,
			@DataDef(length = 8) QCharacter remoteLocation,
			@DataDef(length = 18) QCharacter relationalDatabase,
			@DataDef(length = 10) QCharacter aPPCDeviceDescription,
			@DataDef(length = 8) QCharacter localLocation,
			@DataDef(length = 8) QCharacter mode,
			@DataDef(length = 8) QCharacter remoteNetworkIdentifier,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter authority) {

		// create queue
		try {
			dataQueueManager.createDataQueue(job, dataQueue.library.trimR(),
										     dataQueue.name.trimR(), 
										     DataQueueType.FIFO,
										     maximumEntryLength.asInteger());
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}