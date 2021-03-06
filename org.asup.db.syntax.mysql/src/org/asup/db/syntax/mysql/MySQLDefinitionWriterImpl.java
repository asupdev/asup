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

import org.asup.db.syntax.base.BaseDefinitionWriterImpl;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;


public class MySQLDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	protected MySQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}
}