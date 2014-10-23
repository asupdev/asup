package org.asup.db.syntax.db2;

import org.asup.db.core.QIndex;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QView;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;

public class DB2SyntaxBuilderImpl extends SyntaxBuilderImpl {

	public DB2SyntaxBuilderImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String createSchema(QSchema schema) {
		// TODO Auto-generated method stub
		return super.createSchema(schema);
	}

	@Override
	public String createTable(QTable table) {
		// TODO Auto-generated method stub
		return super.createTable(table);
	}

	@Override
	public String createView(QView view) {
		// TODO Auto-generated method stub
		return super.createView(view);
	}

	@Override
	public String createIndex(QIndex index) {
		// TODO Auto-generated method stub
		return super.createIndex(index);
	}

	@Override
	public String dropSchema(QSchema schema) {
		// TODO Auto-generated method stub
		return super.dropSchema(schema);
	}

	@Override
	public String dropTable(QTable table) {
		// TODO Auto-generated method stub
		return super.dropTable(table);
	}

	@Override
	public String dropView(QView view) {
		// TODO Auto-generated method stub
		return super.dropView(view);
	}

	@Override
	public String dropIndex(QIndex index) {
		// TODO Auto-generated method stub
		return super.dropIndex(index);
	}

	@Override
	public String deleteData(QTable table) {
		// TODO Auto-generated method stub
		return super.deleteData(table);
	}

	@Override
	public String selectData(QTable table) {
		// TODO Auto-generated method stub
		return super.selectData(table);
	}

	@Override
	public String insertData(QTable table, boolean prepare) {
		// TODO Auto-generated method stub
		return super.insertData(table, prepare);
	}

}
