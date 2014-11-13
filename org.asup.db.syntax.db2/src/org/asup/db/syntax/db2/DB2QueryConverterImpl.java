package org.asup.db.syntax.db2;

import org.asup.db.syntax.impl.QueryConverterImpl;
import org.eclipse.datatools.modelbase.sql.query.util.SQLSourceWriter;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class DB2QueryConverterImpl extends QueryConverterImpl {
	private SQLSourceWriter querySourceWriter;

	public DB2QueryConverterImpl() {
		super();
		this.querySourceWriter = new DB2QuerySourceWriter();
	}
	
	@Override
	public String convertQuery(SQLQueryParseResult query) {
		return querySourceWriter.getSQL(query.getQueryStatement());
	}
}
