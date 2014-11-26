package org.asup.db.syntax.db2;

import org.asup.db.syntax.impl.QueryWriterImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.util.SQLSourceWriter;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatement;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class DB2QueryWriterImpl extends QueryWriterImpl {
	private SQLSourceWriter querySourceWriter;

	public DB2QueryWriterImpl() {
		super();
		this.querySourceWriter = new DB2QuerySourceWriter();
	}
	
	@Override
	public String convertQuery(QueryStatement query) {
		return querySourceWriter.getSQL(query);
	}
}
