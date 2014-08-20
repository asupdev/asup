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

import org.asup.fw.test.annotation.TestStarted;
import org.asup.fw.test.base.BaseAssertImpl;
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

public class KeyedQueueTest extends BaseAssertImpl{

	@Inject private QDataQueueManager dataQueueManager;
	@Inject private QResourceFactory resourceFactory;
	@Inject private QCommandManager commandManager;
	@Inject private QJob job;


	@TestStarted
	public void runTest() {
		doTest1();
		doTest2();
	}

	/**
	 * Tests:
	 *
	 * 1) Reading by key
	 * 2) Reading by key with multiple value for single key
	 */
	public void doTest1(){

		String testLib = "TSTLIB";
		String keyedDtaq = "KEY_DTAQ";

		try
		{
			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
				String cmd = "CRTLIB LIB(" + testLib + ")";
				QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null);
				commandManager.executeCommand(job, callableCommand);
			}

			// Create Keyed Queue
			if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
				dataQueueManager.createDataQueue(job, testLib, keyedDtaq, DataQueueType.KEYED, 32000);
				assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
			} else {
				dataQueueManager.clearDataQueue(job, testLib, keyedDtaq);
			}

			// Test Data
			String key1 = "TEST_KEY_1";
			String key2 = "TEST_KEY_2";
			String writeVal1 = "A - TEST DTAQ 1";
			String writeVal2 = "B - TEST DTAQ 2";
			String writeVal3 = "C - TEST DTAQ 3";

			// Write in queue

			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key1, writeVal1);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key1, writeVal2);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key1, writeVal3);

			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key2, writeVal1);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key2, writeVal2);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key2, writeVal3);

			// Read in shuffle order
			String[] readedKey1 = new String[3];
			String[] readedKey2 = new String[3];
			readedKey1[0] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
			readedKey2[0] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);
			readedKey1[1] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
			readedKey1[2] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
			readedKey2[1] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);
			readedKey2[2] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);

			assertTrue("Read multiple key1 value from keyed DTAQ as FIFO",
								writeVal1.equals(readedKey1[0])
										&&
								writeVal2.equals(readedKey1[1])
										&&
								writeVal3.equals(readedKey1[2])
										);

			assertTrue("Read multiple key2 value from keyed DTAQ as FIFO",
								writeVal1.equals(readedKey2[0])
										&&
								writeVal2.equals(readedKey2[1])
										&&
								writeVal3.equals(readedKey2[2])
										);

			// Clear and delete TestQueue
			dataQueueManager.clearDataQueue(job, testLib, keyedDtaq);
			dataQueueManager.deleteDataQueue(job, testLib, keyedDtaq);
			assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);

		} catch(OperatingSystemException exc) {
			fail(exc.getMessage());
		}
	}

	/**
	 * Tests:
	 *
	 * 1) Reading by key with different search type
	 */
	public void doTest2(){

		String testLib = "TSTLIB";
		String keyedDtaq = "KEY_DTAQ";

		try
		{
			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
				String cmd = "CRTLIB LIB(" + testLib + ")";
				
				resourceFactory.getResourceWriter(job, QLibrary.class, null).save(null);
				
				QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null);
				commandManager.executeCommand(job, callableCommand);
			}

			// Create Keyed Queue
			if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
				dataQueueManager.createDataQueue(job, testLib, keyedDtaq, DataQueueType.KEYED, 32000);
				assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
			} else {
				dataQueueManager.clearDataQueue(job, testLib, keyedDtaq);
			}

			// Test Data
			String key1 = "A";
			String key2 = "C";
			String key3 = "E";
			String writeVal1 = "VALUE 1";
			String writeVal2 = "VALUE 2";
			String writeVal3 = "VALUE 3";
			String writeVal4 = "VALUE 4";

			// Write in queue

			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key1, writeVal1);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key2, writeVal2);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key3, writeVal3);
			dataQueueManager.writeDataQueue(job, testLib, keyedDtaq, key3, writeVal4);

			/*
			 * Queue state:
			 *
			 * A - VALUE 1
			 * C - VALUE 2
			 * E - VALUE 3
			 * E - VALUE 4
			 *
			 */

			// Read
			String[] readedKey1 = new String[3];

			// key=C e GE --> Expected VALUE 2
			readedKey1[0] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, "C", DataQueueSearchType.GREATER_THAN_OR_EQUAL);
			assertEquals("GREATER_THEN_OR_EQUAL read from keyed DTAQ", writeVal2, readedKey1[0]);

			// key=D e LE --> Expected VALUE 1
			readedKey1[1] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, "D", DataQueueSearchType.LESS_THAN_OR_EQUAL);
			assertEquals("LESS_THEN_OR_EQUAL read from keyed DTAQ", writeVal1, readedKey1[1]);

			// key=E e EQ --> Expected VALUE 3
			readedKey1[2] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, "2", DataQueueSearchType.NOT_EQUAL);
			assertEquals("EQUAL read from keyed DTAQ", writeVal3, readedKey1[2]);

			// key=E e NE --> Expected VALUE 4
			readedKey1[2] = dataQueueManager.readDataQueue(job, testLib, keyedDtaq, -1, "2", DataQueueSearchType.NOT_EQUAL);
			assertEquals("EQUAL read from keyed DTAQ", writeVal4, readedKey1[2]);

			// Clear and delete TestQueue
			dataQueueManager.clearDataQueue(job, testLib, keyedDtaq);
			dataQueueManager.deleteDataQueue(job, testLib, keyedDtaq);
			assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);

		} catch(OperatingSystemException exc) {
			fail(exc.getMessage());
		}
	}



	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name){
		QResourceReader<?>  resourceReader = resourceFactory.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}
}