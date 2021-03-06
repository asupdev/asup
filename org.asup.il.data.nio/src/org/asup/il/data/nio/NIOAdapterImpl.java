package org.asup.il.data.nio;

import org.asup.il.data.QAdapter;

public class NIOAdapterImpl extends NIOBufferedDelegatorImpl implements QAdapter {

	private static final long serialVersionUID = 1L;

	public NIOAdapterImpl() {						
		super(null);
	}

	@Override
	public void eval(QAdapter value) {
		eval(value.getDelegate());
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		value.toString();
	}
	
	@Override
	public void eval(Object value) {
		
		if(value instanceof Byte) {
			Byte number = (Byte) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5);
			numeric.allocate();
			numeric.eval(number);
			setDelegate(numeric);

		}
		else if(value instanceof Short) {
			Short number = (Short) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5);
			numeric.allocate();
			numeric.eval(number);
			setDelegate(numeric);

		}
		else if(value instanceof Integer) {
			Integer number = (Integer) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5);
			numeric.allocate();
			numeric.eval(number);
			setDelegate(numeric);

		}
		else if(value instanceof Long) {
			Long number = (Long) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5);
			numeric.allocate();
			numeric.eval(number);
			setDelegate(numeric);

		}
		else {
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
}
