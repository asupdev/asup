package org.asup.il.isam.jdbc;

import org.asup.fw.core.QAdapterFactory;
import org.asup.fw.core.QContext;
import org.asup.il.isam.QIndex;
import org.eclipse.datatools.modelbase.sql.constraints.Index;

public class JDBCIsamAdatpterFactoryImpl implements QAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(QContext context, Object adaptable, Class<T> adapterType) {

		T adaptee = null;

		if (adaptable instanceof Index) {
			Index index = (Index) adaptable;

			if (QIndex.class.isAssignableFrom(adapterType)) {
				adaptee = (T) adaptIndexToIsamIndex(index);
			}
		}

		return adaptee;
	}

	private QIndex adaptIndexToIsamIndex(Index index) {	
		return new JDBCIndexAdapter(index);
	}

}
