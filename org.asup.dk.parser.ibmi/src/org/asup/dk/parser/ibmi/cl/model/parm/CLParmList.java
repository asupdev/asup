package org.asup.dk.parser.ibmi.cl.model.parm;

import java.util.LinkedList;

public class CLParmList extends CLParmAbstractComponent {
	
	private LinkedList<CLParmAbstractComponent> elements = new LinkedList<CLParmAbstractComponent>();

	public LinkedList<CLParmAbstractComponent> getElements() {
		return elements;
	}

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.LIST;
	}

}
