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
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueManager;
import org.asup.os.type.lib.QLibrary;

public class WaitTest extends BaseAssertImpl {


	@Inject private QDataQueueManager dataQueueManager;
	@Inject private QResourceFactory resourceFactory;
	@Inject private QCommandManager commandManager;
	@Inject private QJob job;

	@TestStarted
	public void doTest(){

		String testLib = "QTEMP";
		String fifoDtaq = "FIFO_DTAQ";

		try
		{
			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
				String cmd = "CRTLIB LIB(" + testLib + ") TEXT('TEMPORARY LIB: '"+job.getJobID()+"')";
				QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
				commandManager.executeCommand(job, callableCommand);
			}

			// Assert: create queues (if none, else clear existent)
			if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
				dataQueueManager.createDataQueue(job, testLib, fifoDtaq, DataQueueType.FIFO, 32000);
				assertTrue("Create FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq));
			} else {
				dataQueueManager.clearDataQueue(job, testLib, fifoDtaq);
			}


			String writeVal = "TEST DTAQ 1";

			// Write in queue with a delay of 5 sec
			DelayedWrite call = new DelayedWrite(testLib, fifoDtaq, null, writeVal, 5000);
			Thread t = new Thread(call);
			t.start();

			// Read from queue waiting for 20 secs
			long waitFor = 20000;
			long startTime = System.currentTimeMillis();
			String readVal = dataQueueManager.readDataQueue(job, testLib, fifoDtaq, waitFor, null, null);
			long endTime = System.currentTimeMillis();

			assertTrue("Interrupt wait before timeout if data available", (endTime-startTime) < waitFor);
			assertEquals("Read from queue with wait for data", writeVal, readVal);

			// Delete queues
			dataQueueManager.deleteDataQueue(job, testLib, fifoDtaq);
			assertTrue("Delete FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);

		} catch(OperatingSystemException exc) {
			fail(exc.getMessage());
		}
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name){
		QResourceReader<?>  resourceReader = resourceFactory.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}



	private class DelayedWrite implements Runnable
	{
		//DataQueueManager dataQueueManager;
		String lib;
		String queue;
		String key;
		String value;
		long delay;

		Object lockObj = new Object();

		DelayedWrite(String lib, String queue, String key, String value, long delay){
			this.lib = lib;
			this.queue = queue;
			this.key = key;
			this.value = value;
			this.delay = delay;
		}

	   public void run()
	   {
		   try {
			synchronized (lockObj) {
				lockObj.wait(delay);
			}

			dataQueueManager.writeDataQueue(job, lib, queue, key, value);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (OperatingSystemException e) {
				fail(e.getMessage());
			}
	   }
	}

	}
