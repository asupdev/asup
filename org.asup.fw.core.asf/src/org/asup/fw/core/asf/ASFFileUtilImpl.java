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
package org.asup.fw.core.asf;

import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.util.QFileUtil;

public class ASFFileUtilImpl extends ServiceImpl implements QFileUtil {
	
	@Override
	public String getBaseName(String name) {
		return org.apache.commons.io.FilenameUtils.getBaseName(name);
	}

}
