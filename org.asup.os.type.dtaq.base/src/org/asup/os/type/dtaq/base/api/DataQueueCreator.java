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
import org.asup.il.data.annotation.Command;
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

@Command(name = "CRTDTAQ")
@Program(name = "QMHQCRTQ", messages = { "CPF2105", "CPF2108", "CPF2109",
		"CPF2110", "CPF2113", "CPF2116", "CPF2122", "CPF2123", "CPF2130",
		"CPF2151", "CPF2152", "CPF2162", "CPF2176", "CPF2182", "CPF2185",
		"CPF2186", "CPF2283", "CPF327E", "CPF6565", "CPF9810", "CPF9820",
		"CPF9827", "CPF9830", "CPF9870", "OPT1350", "OPT1360", "OPT1460",
		"OPT1462", "OPT1463", "OPT1530", "OPT1555", "OPT1605", "OPT1640",
		"OPT1790", "OPT1795", "OPT1805", "OPT1810", "OPT1813", "OPT1815",
		"OPT1820", "OPT1821", "OPT1825", "OPT1860", "OPT1861", "OPT1862",
		"OPT1863", "OPT1872", "OPT2001", "OPT2004", "OPT2005", "OPT2006",
		"OPT2007", "OPT2008", "OPT2009", "OPT2010", "OPT2015", "OPT2028",
		"OPT2029", "OPT2040", "OPT2301", "OPT2420", "OPT2422", "OPT7740" })
public class DataQueueCreator {

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