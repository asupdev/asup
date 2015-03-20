package org.asup.il.isam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QString;
import org.asup.il.data.impl.DataWriterImpl;

public class JDBCDataWriterImpl extends DataWriterImpl {
	
	public JDBCDataWriterImpl set(ResultSet resultSet) {
		
		super.object = resultSet;
		
		return this;		
	}

	@Override
	public boolean visit(QDataStruct data) {

		if(!(super.object instanceof ResultSet))
			return super.visit(data);

		ResultSet resultSet = (ResultSet) this.object;
		
		int c = 1;
		for(QBufferedData bufferedData: data.getElements()) {
			try {
			
				if(bufferedData instanceof QString) {
					QString string = (QString) bufferedData;
					resultSet.updateString(c, string.toString());
				}
				else if(bufferedData instanceof QDecimal) {
					QDecimal decimal = (QDecimal) bufferedData;
					resultSet.updateDouble(c, decimal.asDouble());
				}
				else {
					resultSet.updateBytes(c, bufferedData.asBytes());
				}
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}
		
		return false;
	}
}
