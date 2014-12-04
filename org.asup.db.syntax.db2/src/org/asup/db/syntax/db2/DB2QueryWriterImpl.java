package org.asup.db.syntax.db2;

import org.asup.db.syntax.impl.QueryWriterImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.util.SQLSourceWriter;

public class DB2QueryWriterImpl extends QueryWriterImpl {
	private SQLSourceWriter querySourceWriter;

	public DB2QueryWriterImpl() {
		super();
		this.querySourceWriter = new DB2QuerySourceWriter();
	}
	
	@Override
	public String writeQuery(QueryStatement query) {
		return querySourceWriter.getSQL(query);
	}
}
