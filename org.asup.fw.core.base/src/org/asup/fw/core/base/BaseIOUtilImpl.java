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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.asup.fw.core.impl.ServiceImpl;


public class BaseIOUtilImpl extends ServiceImpl implements org.asup.fw.util.QIOUtil {

	@Override
	public void copy(InputStream input, OutputStream output) throws IOException {
		org.apache.commons.io.IOUtils.copy(input, output);
	}

}
