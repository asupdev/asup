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
package org.asup.fw.core.base;

import org.asup.fw.core.QLogger;
import org.asup.fw.core.impl.ServiceImpl;

public class BaseSystemOutLoggerImpl extends ServiceImpl implements QLogger {

	@Override
	public void info(String message) {
		System.out.println("INFO: "+message);
	}

	@Override
	public void info(String message, Throwable throwable) {
		System.out.println("INFO: "+message);
		if(throwable != null)
			throwable.printStackTrace();
	}

	@Override
	public void warning(String message) {
		System.out.println("WARNING: "+message);
	}

	@Override
	public void warning(String message, Throwable throwable) {
		System.out.println("WARNING: "+message);
		if(throwable != null)
			throwable.printStackTrace();
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: "+message);
	}

	@Override
	public void error(String message, Throwable throwable) {
		System.out.println("ERROR: "+message);
		if(throwable != null)
			throwable.printStackTrace();
	}

}