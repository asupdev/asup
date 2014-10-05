package org.asup.il.data.nio;

import org.asup.il.data.QData;
import org.asup.il.data.QDataVisitor;

public abstract class NIODataImpl implements QData {

	private static final long serialVersionUID = 1L;

	public NIODataImpl() {
		// TODO Auto-generated constructor stub
	}

	public abstract QData copy();
	
	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

}
