package org.asup.il.data.nio;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QAdapter;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;

public class NIOAdapterImpl extends NIOBufferedDelegatorImpl implements QAdapter{

	private static final long serialVersionUID = 1L;

	public NIOAdapterImpl() {						
		super(null);
	}

	@Override
	public void clear() {
		_delegate.clear();
	}

	@Override
	public void eval(Object value) {

		if(value instanceof Number) {
			Number number = (Number) value;
			NIONumericImpl numeric = new NIODecimalImpl(15, 5, null);
			numeric.allocate();
			numeric.eval(number);
			_delegate = numeric;
		} else {
			String string = value.toString();
			try {
				long number = Long.parseLong(string);
				NIONumericImpl numeric = new NIODecimalImpl(15, 5, null);
				numeric.allocate();
				numeric.eval(number);
				_delegate = numeric;
			}
			catch(NumberFormatException e) {
				int stringLength = string.length();
				if(stringLength == 0)
					stringLength = 32;
				NIOCharacterImpl character = new NIOCharacterImpl(stringLength);
				character.allocate();
				character.eval(string);
				
				_delegate = character;
			}
		}
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		if(_delegate != null)
			return _delegate.isEmpty();
		else
			return true;
	}

	@Override
	public QData getDelegate() {
		return _delegate;
	}

	@Override
	public void assign(QBufferedData value) {
		if(_delegate != null)
			_delegate.assign(value);
		else
			throw new FrameworkCoreRuntimeException("Unexpceted condition: fzt76tbc3bcr47");
	}

	@Override
	public QBufferedData copy() {

		if(_delegate == null) {
			NIOAdapterImpl copy = new NIOAdapterImpl(); 
			return copy;			
		}
		else if(_delegate.equals(this)) {
			NIOAdapterImpl copy = new NIOAdapterImpl(); 
			return copy;
		}
		else {
			NIOAdapterImpl copy = new NIOAdapterImpl();
			copy._delegate = _delegate.copy(); 
			return copy;
		}
	}
}
