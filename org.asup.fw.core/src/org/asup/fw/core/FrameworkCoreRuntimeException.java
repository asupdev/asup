/**
 * Copyright (c) 2011-2012 SME.up. * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 */

package org.asup.fw.core;

public class FrameworkCoreRuntimeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FrameworkCoreRuntimeException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}
	public FrameworkCoreRuntimeException(String message) {
		this(message, null);
	}
	public FrameworkCoreRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
