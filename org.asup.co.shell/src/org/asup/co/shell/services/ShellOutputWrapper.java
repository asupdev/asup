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
package org.asup.co.shell.services;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.asup.co.shell.impl.OutputWrapperImpl;

public class ShellOutputWrapper extends OutputWrapperImpl {
	
	private Map<String, Writer> writers = new HashMap<String, Writer>();

	@Override
	public void flush(String jobID) throws IOException {
		if (writers.containsKey(jobID)) {
			writers.get(jobID).flush();
		}
	}

	@Override
	public void write(String jobID, String value) throws IOException {
		if (writers.containsKey(jobID)) {
			writers.get(jobID).write(value);
		}
	}

	@Override
	public void register(String jobID, Writer writer) {
		writers.put(jobID, writer);
	}

	@Override
	public void unregister(String jobID) {
		writers.remove(jobID);
	}
	
	@Override
	public boolean contains(String jobID) {		
		return writers.containsKey(jobID);
	}

}
