/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.db.syntax.mssql;

import org.asup.db.syntax.impl.QueryWriterImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class MsSQLQueryWriterImpl extends QueryWriterImpl {

	private MsSQLQuerySourceWriter querySourceWriter;

	public MsSQLQueryWriterImpl(){
		querySourceWriter = new MsSQLQuerySourceWriter();
	}

	@Override
	public String convertQuery(QueryStatement query) {

		return querySourceWriter.getSQL(query);
	}

}