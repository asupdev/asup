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
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.type.dtaq.QDataQueueManager;

@Program(name = "QRCVDTAQ")
public class BaseDataQueueReceiver {

	@Inject
	public QDataQueueManager dataQueueManager;
	@Inject
	public QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(length = 10) QCharacter name, @DataDef(length = 10) QCharacter library, @DataDef(precision = 5, packed = true) QDecimal length, QPointer data,
			@DataDef(precision = 5, packed = true) QDecimal wait) {

		try {

			// content
			String content = dataQueueManager.readDataQueue(job, library.trimR(), name.trimR(), wait.asInteger() * 1000 * 100, null, null);

			if (content != null)
				data.getTarget().movel(content, false);
			else
				data.clear();

			// length
			length.eval(data.getTarget().getLength());

		} catch (OperatingSystemException e) {
			e.printStackTrace();
		}
	}
}