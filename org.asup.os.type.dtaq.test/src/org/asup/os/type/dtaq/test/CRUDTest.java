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
package org.asup.os.type.dtaq.test;

import javax.inject.Inject;

import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;
import org.asup.os.type.dtaq.DataQueueSearchType;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueManager;
import org.asup.os.type.lib.QLibrary;


public class CRUDTest {

	@Inject private QDataQueueManager dataQueueManager;
	@Inject private QResourceFactory resourceFactory;
	@Inject private QCommandManager commandManager;
	@Inject private QTestAsserter testAsserter;
	@Inject private QJob job;

	@TestStarted
	public void doTest() throws OperatingSystemException{

		String testLib = "TSTLIB";
		String fifoDtaq = "FIFO_DTAQ";
		String lifoDtaq = "LIFO_DTAQ";
		String keyedDtaq = "KEY_DTAQ";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
			commandManager.executeCommand(job, callableCommand);
		}

		// Assert: create queues (if none else clear existent)
		if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
			dataQueueManager.createDataQueue(job, testLib, fifoDtaq, DataQueueType.FIFO, 32000);
			testAsserter.assertTrue("Create FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq));
		} else {
			dataQueueManager.clearDataQueue(job, testLib, fifoDtaq);
		}

		if (checkObj(job, QDataQueue.class, testLib, lifoDtaq) == false) {
			dataQueueManager.createDataQueue(job, testLib, lifoDtaq, DataQueueType.LIFO, 32000);
			testAsserter.assertTrue("Create LIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, lifoDtaq));
		} else {
			dataQueueManager.clearDataQueue(job, testLib, lifoDtaq);
		}


		if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
			dataQueueManager.createDataQueue(job, testLib, keyedDtaq, DataQueueType.KEYED, 32000);
			testAsserter.assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
		} else {
			dataQueueManager.clearDataQueue(job, testLib, keyedDtaq);
		}

		String writeVal1 = "TEST DTAQ 1";
		String writeVal2 = "TEST DTAQ 2";

		// Write and read FIFO

		dataQueueManager.writeDataQueue(job, testLib, fifoDtaq, null, writeVal1);
		dataQueueManager.writeDataQueue(job, testLib, fifoDtaq, null, writeVal2);
		String readVal1 = dataQueueManager.readDataQueue(job, testLib, fifoDtaq, -1, null, null);
		String readVal2 = dataQueueManager.readDataQueue(job, testLib, fifoDtaq, -1, null, null);
		testAsserter.assertEquals("Read first DTAQ FIFO", writeVal1, readVal1);
		testAsserter.assertEquals("Read second DTAQ FIFO", writeVal2, readVal2);

		// Write and read LIFO

		dataQueueManager.writeDataQueue(job, testLib, lifoDtaq, null, writeVal1);
		dataQueueManager.writeDataQueue(job, testLib, lifoDtaq, null, writeVal2);
		readVal1 = dataQueueManager.readDataQueue(job, testLib, lifoDtaq, -1, null, null);
		readVal2 = dataQueueManager.readDataQueue(job, testLib, lifoDtaq, -1, null, null);

		testAsserter.assertEquals("Read DTAQ LIFO", writeVal2, readVal1);
		testAsserter.assertEquals("Read DTAQ LIFO", writeVal1, readVal2);

		// Write and read KEYED

		String key = "TSTKEY";

		dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key, writeVal1);
		dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key, writeVal2);
		readVal1 = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key, DataQueueSearchType.EQUAL);
		readVal2 = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key, DataQueueSearchType.EQUAL);
		testAsserter.assertEquals("Read DTAQ KEYED", writeVal1, readVal1);
		testAsserter.assertEquals("Read DTAQ KEYED", writeVal2, readVal2);

		// Delete queues
		dataQueueManager.deleteDataQueue(job, testLib, fifoDtaq);
		testAsserter.assertTrue("Delete FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);

		dataQueueManager.deleteDataQueue(job, testLib, lifoDtaq);
		testAsserter.assertTrue("Delete LIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, lifoDtaq) == false);

		dataQueueManager.deleteDataQueue(job, testLib, keyedDtaq);
		testAsserter.assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name){
		QResourceReader<?>  resourceReader = resourceFactory.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}
}
