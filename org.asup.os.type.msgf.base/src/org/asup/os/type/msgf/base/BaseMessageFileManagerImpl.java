/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.msgf.base;

import java.util.regex.Matcher;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.msgf.MessageException;
import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.impl.MessageFileManagerImpl;

public class BaseMessageFileManagerImpl extends MessageFileManagerImpl {

	@Inject
	private QResourceFactory resourceFactory;
	
	@Inject
	private QJob job;
	
	private QResourceReader<QMessageFile> messageFileReader = null;
	
	@PostConstruct
	public void init() {
		messageFileReader = resourceFactory.getResourceReader(job, QMessageFile.class, Scope.ALL);
	}
	
	@Override
	public <E extends Enum<E>> MessageException prepareException(
			QContextID contextID, Enum<E> messageName,
			Object[] variables) {
		
		QMessageFile qMessageFile = messageFileReader.lookup(messageName.getClass().getSimpleName());
				
		QMessageDescription messageDescription = null;
		if(qMessageFile != null)
			messageDescription = qMessageFile.lookup(messageName);
		
		String messageText = "Invalid message file: "+messageName;
		String name = messageName.toString();
		int severity = 0;
		
		if(messageDescription!=null){
			messageText = messageDescription.getMessageText();
			name = messageDescription.getName();
			severity = messageDescription.getSeverity();
		}

		// TODO
		if(variables[0] != null && variables.length > 0){
			messageText = messageText.replaceFirst("&1", Matcher.quoteReplacement(variables[0].toString()));
		}

		MessageException messageException = new MessageException(name,messageText,severity);
		
//		MessageException messageException = new MessageException(messageDescription.getName(), 
//																 messageText,
//																 messageDescription.getSeverity());
		
		return messageException;
		
	}

	@Override
	public void overrideMessageFile(QJob job, String fileFrom, QMessageFile fileTo) throws OperatingSystemRuntimeException {

		try {			
			BaseMessageFileOverrideMap overrideMessageFileMap = getMessageFileOverride(job);
			overrideMessageFileMap.registerFile(fileFrom, fileTo);
			
		} catch (FrameworkCoreException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public QMessageFile getOverrideMessageFile(QJob job, String fileName) throws OperatingSystemRuntimeException {
		
		try {
			
			BaseMessageFileOverrideMap overrideFileMap = getMessageFileOverride(job);
			
			QMessageFile qMessageFile = overrideFileMap.getFile(fileName);

			return qMessageFile;
			
		} catch (FrameworkCoreException e) {
			throw new OperatingSystemRuntimeException(e);
		}
		
	}

	private BaseMessageFileOverrideMap getMessageFileOverride(QJob job) throws FrameworkCoreException {
		BaseMessageFileOverrideMap overrideMessageFileMap = job.getContext().get(BaseMessageFileOverrideMap.class);
		if(overrideMessageFileMap == null) {
			overrideMessageFileMap = new BaseMessageFileOverrideMap();
			job.getContext().set(BaseMessageFileOverrideMap.class, overrideMessageFileMap);
		}
		return overrideMessageFileMap;
	}
	
}