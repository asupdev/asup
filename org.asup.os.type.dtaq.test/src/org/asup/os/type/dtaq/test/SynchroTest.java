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
import org.asup.os.core.ContentLockType;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommandManager;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueManager;
import org.asup.os.type.lib.QLibrary;

public class SynchroTest {

	@Inject private QDataQueueManager dataQueueManager;
	@Inject private QResourceFactory resourceFactory;
	@Inject private QCommandManager commandManager;
	@Inject private QJobManager jobManager;
	@Inject private QTestAsserter testAsserter;
	@Inject private QJob job;

	private Object lockWaitObj = new Object();

	@TestStarted
	public void runTest() throws OperatingSystemException {
		doTestReadOK();
		doTestReadKO();
	}

	/**
	 * Test reading from a locked by other queue, with lock that expire before timeout
	 * @throws OperatingSystemException 
	 */
	public void doTestReadOK() throws OperatingSystemException{

		String testLib = "QTEMP";
		String fifoDtaq = "FIFO_DTAQ";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
			commandManager.executeCommand(job, callableCommand);
		}

		// Assert: create queues (if none, else clear existent)
		if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
			dataQueueManager.createDataQueue(job, testLib, fifoDtaq, DataQueueType.FIFO, 32000);
			testAsserter.assertTrue("Create FIFO DTAQ " + testLib + "/" + fifoDtaq, checkObj(job, QDataQueue.class, testLib, fifoDtaq));
		} else {
			dataQueueManager.clearDataQueue(job, testLib, fifoDtaq);
		}


		String writeVal = "TEST DTAQ 1";

		// Write test data in DTAQ
		dataQueueManager.writeDataQueue(job, testLib, fifoDtaq, null, writeVal);

		// Start timed read lock (10 secs)
		long delay = 10000;
		TimedLock call = new TimedLock(testLib, fifoDtaq, delay);
		Thread t = new Thread(call);
		t.start();

		synchronized (lockWaitObj) {
			try {
				lockWaitObj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Read from queue waiting for 20 secs
		long waitFor = 20000;
		long startTime = System.currentTimeMillis();
		String readVal = dataQueueManager.readDataQueue(job, testLib, fifoDtaq, waitFor, null, null);
		long endTime = System.currentTimeMillis();

		testAsserter.assertTrue("Wait unlock when reading", (endTime-startTime) < waitFor && (endTime-startTime) > delay);
		testAsserter.assertEquals("Read from queue with wait for data", writeVal, readVal);

		// Delete queues
		dataQueueManager.deleteDataQueue(job, testLib, fifoDtaq);
		testAsserter.assertTrue("Delete FIFO DTAQ " + testLib + "/" + fifoDtaq, checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);
	}

	/**
	 * Test reading from a locked by other queue, with lock that expire before timeout
	 * @throws OperatingSystemException 
	 */
	public void doTestReadKO() throws OperatingSystemException{

		String testLib = "TSTLIB";
		String fifoDtaq_1 = "FIFO_DTAQ_1";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false){
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
			commandManager.executeCommand(job, callableCommand);
		}

		// Assert: create queues (if none, else clear existent)
		if (checkObj(job, QDataQueue.class, testLib, fifoDtaq_1) == false) {
			dataQueueManager.createDataQueue(job, testLib, fifoDtaq_1, DataQueueType.FIFO, 32000);
			testAsserter.assertTrue("Create FIFO DTAQ " + testLib + "/" + fifoDtaq_1, checkObj(job, QDataQueue.class, testLib, fifoDtaq_1));
		} else {
			dataQueueManager.clearDataQueue(job, testLib, fifoDtaq_1);
		}


		String writeVal = "TEST DTAQ 1";

		// Wite test data in DTAQ
		dataQueueManager.writeDataQueue(job, testLib, fifoDtaq_1, null, writeVal);

		// Start timed read lock (20 secs)
		long delay = 20000;
		TimedLock call = new TimedLock(testLib, fifoDtaq_1, delay);
		Thread t = new Thread(call);
		t.start();

		synchronized (lockWaitObj) {
			try {
				lockWaitObj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Read from queue waiting for 10 secs
		long waitFor = 10000;
		long startTime = System.currentTimeMillis();
		String readVal = dataQueueManager.readDataQueue(job, testLib, fifoDtaq_1, waitFor, null, null);
		long endTime = System.currentTimeMillis();

		
		testAsserter.assertTrue("Wait until timeout occour", (endTime-startTime) > waitFor && (endTime-startTime) < delay);
		testAsserter.assertNull("Read null from queue (cause timout)", readVal);

		// Delete queues
		dataQueueManager.deleteDataQueue(job, testLib, fifoDtaq_1);
		testAsserter.assertTrue("Delete FIFO DTAQ " + testLib + "/" + fifoDtaq_1, checkObj(job, QDataQueue.class, testLib, fifoDtaq_1) == false);
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name){
		QResourceReader<?>  resourceReader = resourceFactory.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}

	private class TimedLock implements Runnable
	{
		//DataQueueManager dataQueueManager;
		String lib;
		String queue;
		long delay;

		Object lockTimerObj = new Object();

		TimedLock(String lib, String queue, long delay){
			this.lib = lib;
			this.queue = queue;
			this.delay = delay;
		}

	   public void run() {

		   // Create new job
		   QJob childJob;
			try {
				childJob = jobManager.create(job);
			} catch (OperatingSystemException e) {
				e.printStackTrace();
				return;
			}


		   // Get the queue
		   QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(childJob, QDataQueue.class, lib);
		   QDataQueue dataQueue = resource.lookup(queue);

		   // Lock it for reading
		   dataQueueManager.getContentLocker().lock(childJob, dataQueue, ContentLockType.READ_LOCKED);

		   //Notify lock success to caller class
		   synchronized(lockWaitObj){
			   lockWaitObj.notify();
		   }

		   // Wait delay
		   try {
			   synchronized (lockTimerObj) {
					lockTimerObj.wait(delay);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		    }

		   // Unlock
		   dataQueueManager.getContentLocker().unlock(childJob, dataQueue, ContentLockType.READ_LOCKED);
	   }

	}
}
