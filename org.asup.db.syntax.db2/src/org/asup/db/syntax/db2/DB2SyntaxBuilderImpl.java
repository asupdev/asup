package org.asup.db.syntax.db2;

import org.asup.db.core.*;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;

public class DB2SyntaxBuilderImpl extends SyntaxBuilderImpl {
	
	private final Quoter quoter = new Quoter("\"");

	@Override
	public String createSchema(QSchema schema) {
		return "CREATE SCHEMA "+ quoter.quote(schema.getName());
	}
	
	@Override
	public String dropSchema(QSchema schema) {
		return "DROP SCHEMA " + quoter.quote(schema.getName()) + " RESTRICT";		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createTable(QTable table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(table.getFullName()+" (");

		boolean pkey = false;
		String pkey_name = null;
		
		boolean first = true;
		for(QTableColumn field: table.getColumns()) {

			if(!first)
				result.append(", ");
			
			switch (field.getDataType()) {
				case IDENTITY:
					result.append(field.getName()+" INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");					
					pkey = true;
					pkey_name = field.getName();
					break;
				case CHARACTER:
					result.append(field.getName()+" CHAR("+field.getPrecision()+")");
					break;
				case VARCHAR:
					result.append(field.getName()+" VARCHAR("+field.getPrecision()+")");
					break;
				case DECIMAL:
					if(field.getScale() != 0)
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+", "+field.getScale()+")");
					else
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+",  0)");
					break;
				case TEXT:
					result.append(field.getName()+" BLOB");
					break;
				default:
					result.append(field.getName()+" "+field.getDataType().getName() .toUpperCase());
			}			
			first = false;
		}
		if(pkey)
			result.append(", PRIMARY KEY ("+pkey_name+")");
		result.append(")");
		return result.toString();
	}
	@Override
	public String dropTable(QTable table) {
		return "DROP TABLE " + quoter.quoteFullName(table.getSchema(),  table.getName()) ;		
	}

	@Override
	public String createIndex(QIndex index) {
		return db2CreateIndes(new QuotedIndex(index, quoter));
	}

	private String db2CreateIndes(QuotedIndex index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if(index.isUnique()) {
			result.append("UNIQUE ");			
		}
		result.append("INDEX "+index.getFullName());
		result.append(" ON "+index.getSchema().getName()+"."+index.getObject()+" (");

		boolean first = true;
		
		for(QIndexColumn field: index.getColumns()) {			
			
			if(!first)
				result.append(", ");

			result.append(field.getName());
			
			if(field.getOrdering() == OrderingType.DESCEND) 
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String dropIndex(QIndex index) {
		return "DROP INDEX " + quoter.quoteFullName(index.getSchema(), index.getName());
	}
	
	@Override
	public String createView(QView view) {
		// TODO Auto-generated method stub
		return super.createView(view);
	}

	@Override
	public String dropView(QView view) {
		// TODO Auto-generated method stub
		return super.dropView(view);
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
