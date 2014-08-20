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
package org.asup.os.type.dtaq.cdo;

import java.util.List;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.QOperatingSystemCoreFactory;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QContentLock;
import org.asup.os.core.ContentLockType;
import org.asup.os.core.QContentLocker;
import org.asup.os.core.QObjectContent;
import org.asup.os.core.cdo.impl.CDOContentLockerImpl;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.dtaq.QOperatingSystemDataQueueFactory;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueEntry;
import org.asup.os.type.dtaq.DataQueueSearchType;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.impl.DataQueueManagerImpl;


public class CDODataQueueManagerImpl extends DataQueueManagerImpl {

	private static final long TIMER_STEP = 10;
	private static final long LOCK_TIMER = 10000;

	private QResourceFactory resourceFactory;
	private QJobManager jobManager;



	private QContentLocker<QDataQueue, QDataQueueEntry> contentLocker;

	@Inject
	public CDODataQueueManagerImpl(QResourceFactory resourceFactory, QJobManager jobManager) {
		super();
		this.contentLocker = new CDOContentLockerImpl<QDataQueue, QDataQueueEntry>();
		this.resourceFactory = resourceFactory;
		this.jobManager = jobManager;
	}


	@Override
	public QDataQueue createDataQueue(QContextID ContextID, String library, String name, DataQueueType type, int maxEntryLength) throws OperatingSystemException {

		QJob job = jobManager.lookup(ContextID);

		QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue == null) {
			// Queue do not exists. Create and register.
			dataQueue = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueue();
			dataQueue.setLibrary(library);
			dataQueue.setName(name);
			dataQueue.setDataQueueType(type);
			dataQueue.setMaxEntryLength(maxEntryLength);

			QObjectContent<QDataQueueEntry> content = QOperatingSystemCoreFactory.eINSTANCE.createObjectContent();

			QContentLock writeLock = QOperatingSystemCoreFactory.eINSTANCE.createContentLock();
			writeLock.setType(ContentLockType.WRITE_LOCKED);
			content.setWriteLock(writeLock);

			QContentLock readLock = QOperatingSystemCoreFactory.eINSTANCE.createContentLock();
			readLock.setType(ContentLockType.READ_LOCKED);
			content.setReadLock(readLock);

			dataQueue.setContent(content);

			// Save queue in register
			resource.save(dataQueue);

			System.out.println(ContextID + "\t" + "Queue " + name + " created");

		} else {
			throw new OperatingSystemException("Queue " + name
					+ " already exists in library " + library);
		}

		return dataQueue;
	}

	@Override
	public void writeDataQueue(QContextID ContextID, String library, String name, String key, String value) throws OperatingSystemException {
		QJob job = jobManager.lookup(ContextID);
		QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);

		if (dataQueue != null){

			if (dataQueue.getDataQueueType().equals(DataQueueType.KEYED)) {
				if (key == null || key.length() == 0) {
					throw new OperatingSystemException("Queue write error: key not defined while writing in keyed queue " + library + "/" + name);
				}
			}

			// Try to lock queue content (no wait for lock)
			boolean locked = contentLocker.tryLock(job, dataQueue, LOCK_TIMER, ContentLockType.WRITE_LOCKED);

			if (locked) {
				// create entry
				QDataQueueEntry entry = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueueEntry();
				entry.setValue(value);

				if (dataQueue.getDataQueueType().equals(DataQueueType.KEYED)){
					// Keyed queue
					entry.setKey(key);
				}

				// Register entry in queue (always in first position: LIFO, FIFO and KEYED policy will be managed on reading)
				dataQueue.getContent().getEntries().add(0, entry);


				// Save queue in register
				resource.save(dataQueue);

				// Free write lock
				contentLocker.unlock(job, dataQueue, ContentLockType.WRITE_LOCKED);

			} else {
				throw new OperatingSystemException("Queue write error: content write locked");
			}
		}
	}

	@Override
	public String readDataQueue(QContextID ContextID, String library,
			String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException {

		return readQueue(ContextID, library, name, timeout, key, searchType, true);
	}

	@Override
	public void clearDataQueue(QContextID ContextID, String library, String name)
			throws OperatingSystemException {

		QJob job = jobManager.lookup(ContextID);
		QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue != null){
			dataQueue.getContent().getEntries().clear();

			//Clears locks
			if (getContainLocker().isLocked(job, dataQueue, ContentLockType.READ_LOCKED) == false) {
				getContainLocker().unlock(job, dataQueue, ContentLockType.READ_LOCKED);
			}
			if (getContainLocker().isLocked(job, dataQueue, ContentLockType.WRITE_LOCKED) == false){
				getContainLocker().unlock(job, dataQueue, ContentLockType.WRITE_LOCKED);
			}
		}
		else{
			throw new OperatingSystemException("Queue do not exist. Queue: " + name + " Lib: " + library, null);
		}
	}

	@Override
	public String peekDataQueue(QContextID ContextID, String library,
			String name, long timeout, String key, DataQueueSearchType searchType) throws OperatingSystemException {

		return readQueue(ContextID, library, name, timeout, key, searchType, false);

	}

	@Override
	public void deleteDataQueue(QContextID ContextID, String library, String name)
			throws OperatingSystemException {
		QJob job = jobManager.lookup(ContextID);
		QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue != null) {
			resource.delete(dataQueue);
		}
	}

	@Override
	public QContentLocker<QDataQueue, QDataQueueEntry> getContainLocker() {
		// TODO Auto-generated method stub
		return contentLocker;
	}

	private String readQueue(QContextID ContextID, String library,
			String name, long timeout, String key, DataQueueSearchType searchType, boolean deleteElement) throws OperatingSystemException {

		String result = null;

		QJob job = jobManager.lookup(ContextID);
		QResourceWriter<QDataQueue> resource = resourceFactory.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);

		if (dataQueue != null){

			if (dataQueue.getDataQueueType() == DataQueueType.FIFO)	{
				//Read FIFO Queue
				result = readFifoLifo(job, dataQueue, timeout, deleteElement);

			} else if (dataQueue.getDataQueueType() == DataQueueType.LIFO){
				//Read LIFO Queue
				result = readFifoLifo(job, dataQueue, timeout, deleteElement);
			}
			else {
				//Read KEYED queue
				result = readKeyed(job, dataQueue, timeout, deleteElement, key, searchType);
			}
		} else {
			throw new OperatingSystemException("Queue " + library + "/" + name + " do not exist");
		}

		return result;
	}


	private String readFifoLifo(QJob job, QDataQueue dataQueue, long timeout, boolean deleteElement) {

		String result = null;


		if (timeout == 0 && contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED) == false) {

			// If queue is not locked by others, read queue without wait time
			contentLocker.lock(job, dataQueue, ContentLockType.READ_LOCKED);

			if (dataQueue.getContent().getEntries().isEmpty() == false) {

				int pointer = 0;
				if (dataQueue.getDataQueueType() == DataQueueType.FIFO) {
					pointer = dataQueue.getContent().getEntries().size();
				}

				QDataQueueEntry dataQueueEntry = dataQueue.getContent().getEntries().get(pointer);
				result = dataQueueEntry.getValue();

				//delete element
				if (deleteElement)
					dataQueue.getContent().getEntries().remove(dataQueueEntry);
			}
			contentLocker.unlock(job, dataQueue, ContentLockType.READ_LOCKED);

		}
		else if (timeout > 0 || timeout == -1) {

			// Wait for a valid entry for timeout msec or until an entry is written in the queue (timeout == -1)
			long timer = timeout == -1?Long.MAX_VALUE:timeout;

			//Queue contain already locked by others: wait for unlock

			Object syncObj = new Object();

			while(contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED)){
				synchronized (syncObj) {
					try {
						syncObj.wait(TIMER_STEP);
						timer = timer-TIMER_STEP;
						if (timer < 0) break;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			if (timer >0 && contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED) == false) {

				// Lock queue contain reading
				contentLocker.lock(job, dataQueue, ContentLockType.READ_LOCKED);

				while(dataQueue.getContent().getEntries().isEmpty()){
					synchronized (syncObj) {
						try {
							syncObj.wait(TIMER_STEP);
							timer = timer-TIMER_STEP;
							if (timer < 0) break;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

				if (dataQueue.getContent().getEntries().isEmpty() == false) {

					int pointer = 0;
					if (dataQueue.getDataQueueType() == DataQueueType.FIFO) {
						pointer = dataQueue.getContent().getEntries().size()-1;
					}

					QDataQueueEntry dataQueueEntry = dataQueue.getContent().getEntries().get(pointer);
					result = dataQueueEntry.getValue();

					//delete element
					if (deleteElement)
						dataQueue.getContent().getEntries().remove(dataQueueEntry);
				}

				// Unlock queue contain reading
				contentLocker.unlock(job, dataQueue, ContentLockType.READ_LOCKED);
			}
		}
		return result;
	}


	/**
	 * The comparison criteria between the keys of messages on the data queue and the key data parameter. When the system searches for the requested key,
	 * the entries are searched in ascending order from the lowest value key to the highest value key until a match is found.
	 * If there are entries with duplicate keys, the entry that was put on the queue first is received. (FIFO on duplicate keys)

	 	Valid values are:

	 	GT	Greater than
	 	LT	Less than
	 	NE	Not equal
		EQ	Equal
		GE	Greater than or equal
		LE	Less than or equal

		This parameter is ignored if the length of key data is zero. A value of blanks is recommended if the length of key data is zero.

		EXAMPLE:

		assume a keyed data queue contains these three entries:

		Physical Entry	3-Character Key
		1				GGG
		2				XXX
		3				AAA

		If a key order of LE is specified with key data of XXX, entry 3 would be received (is the first item that match the search rule in FIFO order).
		If the same values were specified on a subsequent request, entry 1 would be received

	 * @param job
	 * @param dataQueue
	 * @param timeout
	 * @param deleteElement
	 * @param key
	 * @param searchType
	 * @return
	 */
	private String readKeyed(QJob job, QDataQueue dataQueue, long timeout, boolean deleteElement, String key, DataQueueSearchType searchType) {

		String result = null;

		if (timeout == 0 && contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED) == false) {

			// Read queue without wait time

			contentLocker.lock(job, dataQueue, ContentLockType.READ_LOCKED);

			List<QDataQueueEntry> entries = dataQueue.getContent().getEntries();
			QDataQueueEntry dataQueueEntry = null;

			for (int i = entries.size()-1; i >= 0; i--) {
				dataQueueEntry = dataQueue.getContent().getEntries().get(i);
				if (matchKey(dataQueueEntry, key, searchType)) {
					result = dataQueueEntry.getValue();

					//delete element
					if (deleteElement)
						entries.remove(dataQueueEntry);

					break;
				}
			}

			contentLocker.unlock(job, dataQueue, ContentLockType.READ_LOCKED);

		}
		else if (timeout > 0 || timeout == -1) {

			// Wait for a valid entry for timeout msec or until an entry is written in the queue (timeout == -1)
			long timer = timeout == -1?Long.MAX_VALUE:timeout;

			//Queue contain already locked: wait for unlock
			while(contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED)){
				try {
					wait(TIMER_STEP);
					timer = timer-TIMER_STEP;
					if (timer < 0) break;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (timer >0 && contentLocker.isLockedByOther(job, dataQueue, ContentLockType.READ_LOCKED) == false) {

				// Lock queue contain reading
				contentLocker.lock(job, dataQueue, ContentLockType.READ_LOCKED);

				List<QDataQueueEntry> entries = dataQueue.getContent().getEntries();
				QDataQueueEntry dataQueueEntry = null;

				boolean iterate = true;

				while(iterate) {

					for (int i = entries.size()-1; i >= 0; i--) {
						dataQueueEntry = dataQueue.getContent().getEntries().get(i);
						if (matchKey(dataQueueEntry, key, searchType)) {
							result = dataQueueEntry.getValue();

							//delete element
							if (deleteElement)
								entries.remove(dataQueueEntry);

							// Iteration exit condition: item found
							iterate = false;
							break;
						}
					}

					if (iterate) {
						try {
							wait(TIMER_STEP);
							timer = timer-TIMER_STEP;
							if (timer < 0) {
								// Iteration exit condition: timeout elapsed
								iterate = false;
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

				// Unlock queue contain reading
				contentLocker.unlock(job, dataQueue, ContentLockType.READ_LOCKED);
			}
		}
		return result;

	}


	private boolean matchKey(QDataQueueEntry dataQueueEntry, String searchedKey, DataQueueSearchType searchType) {

		boolean match = false;

		String entryKey = dataQueueEntry.getKey();

		switch (searchType.getValue()) {

		case DataQueueSearchType.EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) == 0?true:false;
			break;

		case DataQueueSearchType.NOT_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) != 0?true:false;
			break;

		case DataQueueSearchType.GREATER_THAN_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) > 0?true:false;
			break;

		case DataQueueSearchType.LESS_THAN_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) < 0?true:false;
			break;

		case DataQueueSearchType.GREATER_THAN_OR_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) >= 0?true:false;
			break;

		case DataQueueSearchType.LESS_THAN_OR_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) <= 0?true:false;
			break;

		default:
			match = false;
			break;
		}

		return match;
	}
}
