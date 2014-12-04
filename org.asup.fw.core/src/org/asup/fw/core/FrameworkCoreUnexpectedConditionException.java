/**
 * Copyright (c) 2011-2012 SME.up. * All rights reserved.   
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 */

package org.asup.fw.core;

public class FrameworkCoreUnexpectedConditionException extends FrameworkCoreRuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FrameworkCoreUnexpectedConditionException(Throwable cause) {
		super(cause.getMessage(), cause.getCause());
	}
	public FrameworkCoreUnexpectedConditionException(String message) {
		super(message, null);
	}
}
