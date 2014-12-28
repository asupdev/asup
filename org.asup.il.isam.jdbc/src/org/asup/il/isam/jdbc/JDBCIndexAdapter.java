package org.asup.il.isam.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexColumn;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.constraints.IndexMember;

public class JDBCIndexAdapter implements QIndex {

	private List<QIndexColumn> columns;
	
	@SuppressWarnings("unchecked")
	public JDBCIndexAdapter(Index index) {

		this.columns = new ArrayList<QIndexColumn>();
		
		for(IndexMember indexMember: (List<IndexMember>)index.getMembers()) {
			QIndexColumn indexColumn = new JDBCIndexColumnAdapter(indexMember);
			this.columns.add(indexColumn);
		}
	}
	
	@Override
	public List<QIndexColumn> getColumns() {
		return columns;
	}

}
