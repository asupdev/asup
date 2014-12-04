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
package org.asup.co.shell;

import org.asup.os.core.jobs.QJob;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.impl.ObjectWriterFactoryImpl;

public class ShellObjectWriterFactoryImpl extends ObjectWriterFactoryImpl {
			
	@Override
	public QObjectWriter createObjectWriter(QJob job) {

		QObjectWriter objectWriter = job.getJobContext().make(ShellObjectWriterImpl.class);
		return objectWriter;
	}
}
