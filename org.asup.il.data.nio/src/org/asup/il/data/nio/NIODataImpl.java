package org.asup.il.data.nio;

import org.asup.il.data.QBufferedDataDelegator;
import org.asup.il.data.QData;
import org.asup.il.data.QDataVisitor;

public abstract class NIODataImpl implements QData {

	private static final long serialVersionUID = 1L;

	public NIODataImpl() {
		super();
	}

	public abstract NIODataImpl copy();

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}
	
	protected NIOBufferedDataImpl getNIOBufferedDataImpl(QData bufferedData) {
		
		NIOBufferedDataImpl nioBufferedData = null;
		
		if (bufferedData instanceof NIOBufferedDataImpl) {
			nioBufferedData = (NIOBufferedDataImpl) bufferedData;
		}
		else if (bufferedData instanceof QBufferedDataDelegator) {
			QBufferedDataDelegator dataDelegator = (QBufferedDataDelegator)bufferedData;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}
		
		return nioBufferedData;
	}
}
