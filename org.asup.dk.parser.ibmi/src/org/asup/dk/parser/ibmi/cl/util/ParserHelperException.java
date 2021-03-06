/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.asup.dk.parser.ibmi.cl.util;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.RecognitionException;

public class ParserHelperException extends RecognitionException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public ParserHelperException(IntStream stream, String message) {
		super(stream);
		this.message = message;
	}
	
	public String toString() {
		return "ParserHelperException: " + this.message;
	}

}
