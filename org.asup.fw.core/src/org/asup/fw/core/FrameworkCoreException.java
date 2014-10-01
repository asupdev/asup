/**
 *  Copyright (c) 2012, 2014 Sme.UP and others. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

public class FrameworkCoreException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public FrameworkCoreException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}
	public FrameworkCoreException(String message) {
		this(message, null);
	}
	public FrameworkCoreException(String message, Throwable cause) {
		super(message, cause);
	}
}
