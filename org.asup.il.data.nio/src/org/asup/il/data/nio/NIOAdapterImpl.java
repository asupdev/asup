package org.asup.il.data.nio;

import org.asup.il.data.QAdapter;

public class NIOAdapterImpl extends NIOBufferedDelegatorImpl implements QAdapter {

	private static final long serialVersionUID = 1L;

	public NIOAdapterImpl() {						
		super(null);
	}

	@Override
	public void eval(Object value) {

		if(value instanceof Number) {
			Number number = (Number) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5);
			numeric.allocate();
			numeric.eval(number);
			setDelegate(numeric);
		} else {
			String string = value.toString();
			try {
				long number = Long.parseLong(string);
				NIONumericImpl numeric = new NIODecimalImpl(15, 5);
				numeric.allocate();
				numeric.eval(number);
				setDelegate(numeric);
			}
			catch(NumberFormatException e) {
				int stringLength = string.length();
				if(stringLength == 0)
					stringLength = 32;
				NIOCharacterImpl character = new NIOCharacterImpl(stringLength);
				character.allocate();
				character.eval(string);
				
				setDelegate(character);
			}
		}
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}
}
