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
package org.asup.os.type.dtaq.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QContentLocker;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.dtaq.DataQueueSearchType;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueEntry;
import org.asup.os.type.dtaq.QOperatingSystemDataQueueFactory;
import org.asup.os.type.dtaq.impl.DataQueueManagerImpl;

public class BaseDataQueueManagerImpl extends DataQueueManagerImpl {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJobManager jobManager;

	private BaseFifoQueueManager dataQueueManager;
	private BaseContentLockerImpl<QDataQueue, QDataQueueEntry> contentLocker;

	@PostConstruct
	public void init() {
		dataQueueManager = new BaseFifoQueueManager();
		contentLocker = new BaseContentLockerImpl<QDataQueue, QDataQueueEntry>();
	}

	@Override
	public void writeDataQueue(QContextID ContextID, String library,
			String name, String key, String aValue)
			throws OperatingSystemException {
		try {
			dataQueueManager.writeToQueue(library, name, aValue);
		} catch (BaseFifoQueueException e) {
			throw new OperatingSystemException(e);
		}
	}

	@Override
	public String readDataQueue(QContextID ContextID, String library,
			String name, long aTimeout, String key,
			DataQueueSearchType searchType) throws OperatingSystemException {
		try {
			return dataQueueManager.readFromQueue(library, name, aTimeout);
		} catch (BaseFifoQueueException vExc) {
			throw new OperatingSystemException("Queue read error. Queue: "
					+ name + " Lib: " + library, vExc);
		}
	}

	@Override
	public String peekDataQueue(QContextID ContextID, String library,
			String name, long aTimeout, String key,
			DataQueueSearchType searchType) throws OperatingSystemException {

		try {
			return dataQueueManager.peekFromQueue(library, name, aTimeout);
		} catch (BaseFifoQueueException vExc) {
			throw new OperatingSystemException("Queue peek error. Queue: "
					+ name + " Lib: " + library, vExc);
		}
	}

	@Override
	public QDataQueue createDataQueue(QContextID ContextID, String library,
			String name, DataQueueType aType, int aMaxEntryLength)
			throws OperatingSystemException {

		QJob job = jobManager.lookup(ContextID);
		QResourceWriter<QDataQueue> resource = resourceFactory
				.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue == null) {
			// Queue do not exists. Create and register.
			dataQueue = QOperatingSystemDataQueueFactory.eINSTANCE
					.createDataQueue();
			dataQueue.setLibrary(library);
			dataQueue.setName(name);
			dataQueue.setDataQueueType(aType);
			dataQueue.setMaxEntryLength(aMaxEntryLength);

			resource.save(dataQueue);

			System.out.println(ContextID + "\t" + "Queue " + name + " created");

			// Create mem queue
			try {
				dataQueueManager.createQueue(library, name);
			} catch (BaseFifoQueueException vExc) {
				throw new OperatingSystemException(
						"Queue create error. Queue: " + name + " Lib: "
								+ library, vExc);
			}
		} else {
			throw new OperatingSystemException("Queue " + name
					+ " already exists in library " + library);
		}

		return dataQueue;
	}

	@Override
	public void clearDataQueue(QContextID ContextID, String library, String name)
			throws OperatingSystemException {
		try {
			dataQueueManager.clearQueue(library, name);
		} catch (BaseFifoQueueException vExc) {
			throw new OperatingSystemException("Queue clear error. Queue: "
					+ name + " Lib: " + library, vExc);
		}
	}

	@Override
	public void deleteDataQueue(QContextID ContextID, String library,
			String name) throws OperatingSystemException {

		QJob job = jobManager.lookup(ContextID);

		QResourceWriter<QDataQueue> resource = resourceFactory
				.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue vDtaq = resource.lookup(name);
		resource.delete(vDtaq);

		try {
			dataQueueManager.removeQueue(library, name);
		} catch (BaseFifoQueueException vExc) {
			throw new OperatingSystemException("Queue delete error. Queue: "
					+ name + " Lib: " + library, vExc);
		}

	}

	@Override
	public QContentLocker<QDataQueue, QDataQueueEntry> getContainLocker() {
		return contentLocker;
	}
}