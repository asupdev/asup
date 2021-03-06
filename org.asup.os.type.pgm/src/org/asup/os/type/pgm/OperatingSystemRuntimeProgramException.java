/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

public class OperatingSystemRuntimeProgramException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OperatingSystemRuntimeProgramException(String message) {
		super(message);
	}

	public OperatingSystemRuntimeProgramException(Throwable cause) {
		super(cause);
	}
	
	public OperatingSystemRuntimeProgramException(String message, Throwable cause) {
		super(message, cause);
	}
}
