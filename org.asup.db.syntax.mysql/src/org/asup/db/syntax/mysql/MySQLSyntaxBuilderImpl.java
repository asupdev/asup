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
package org.asup.db.syntax.mysql;

import org.asup.db.core.QIndex;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;

public class MySQLSyntaxBuilderImpl extends SyntaxBuilderImpl {

	@Override
	public String dropIndex(QIndex index) {
		return "ALTER TABLE "+index.getSchema().getName()+"."+index.getObject()+" DROP INDEX "+index.getName();
	}
}