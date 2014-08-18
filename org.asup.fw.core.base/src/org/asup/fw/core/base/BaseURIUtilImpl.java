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

import java.net.URI;

import org.asup.fw.core.impl.ServiceImpl;

public class BaseURIUtilImpl extends ServiceImpl implements org.asup.fw.util.QURIUtil {

	@Override
	public String getBaseName(URI uri) {
		return org.apache.commons.io.FilenameUtils.getBaseName(uri.getRawPath());
	}

}
