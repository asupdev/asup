package org.asup.db.core.mysql;


import org.eclipse.net4j.db.ddl.IDBField;
import org.eclipse.net4j.db.mysql.MYSQLAdapter;


public class MySQLAdapter extends MYSQLAdapter {
	
	public MySQLAdapter() {
		super();
	}

	protected String getTypeName(IDBField field) {
		
/*		System.out.println(field.getFullName()+"("+field.getType().ordinal()+")");		
		
		DBType type = field.getType();
		switch (type.ordinal()) {
		case 13:
		case 15:
			return "LONGTEXT";
		case 12:
		case 14:
		case 22:
			return "LONGBLOB";
		}*/

		return super.getTypeName(field);
	}
}
