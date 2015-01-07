package org.asup.il.isam.jdbc;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QString;
import org.asup.il.data.impl.DataReaderImpl;

public class JDBCDataReaderImpl extends DataReaderImpl {

	private static DecimalFormat[][] decimalFormats = new DecimalFormat[32][9]; 
	
	public JDBCDataReaderImpl set(ResultSet resultSet) {
		
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
//				bufferedData.movel(resultSet.getString(c), true);
				
				if(bufferedData instanceof QString) {
					QString string = (QString) bufferedData;
					string.eval(resultSet.getString(c));
				}
				else if(bufferedData instanceof QDecimal) {
					QDecimal decimal = (QDecimal) bufferedData;

/*					BigDecimal bigDecimal = resultSet.getBigDecimal(c);
					decimal.eval(bigDecimal);
					bufferedData.move(formatBigDecimal(bigDecimal, decimal), true);*/
					
					decimal.eval(resultSet.getDouble(c));
				}
				else {
					bufferedData.movel(resultSet.getObject(c).toString(), true);
				}
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}
		
		return false;
	}

	private String formatBigDecimal(BigDecimal bigDecimal, QDecimal decimal) {
		
		DecimalFormat decimalFormat = decimalFormats[decimal.getPrecision()][decimal.getScale()];
		if(decimalFormat == null) {
			synchronized (decimalFormats) {
				decimalFormat = decimalFormats[decimal.getPrecision()][decimal.getScale()];
				if(decimalFormat == null) {
					decimalFormat = new DecimalFormat();

					DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
					decimalFormatSymbols.setDecimalSeparator('.');

					decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
					
					decimalFormat.setMinimumIntegerDigits(decimal.getPrecision());
					decimalFormat.setMaximumIntegerDigits(decimal.getPrecision());
					decimalFormat.setMinimumFractionDigits(decimal.getScale());
					decimalFormat.setMaximumFractionDigits(decimal.getScale());
					
					decimalFormat.setGroupingUsed(false);
					
					decimalFormats[decimal.getPrecision()][decimal.getScale()] = decimalFormat;
				}
			}
		}
		
		return decimalFormat.format(bigDecimal).replace(".", "");
	}

}
