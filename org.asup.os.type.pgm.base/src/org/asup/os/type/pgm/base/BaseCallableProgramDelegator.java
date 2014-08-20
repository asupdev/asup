/**
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.pgm.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.type.pgm.QCallableProgramDelegator;
import org.asup.os.type.pgm.impl.CallableProgramImpl;

public class BaseCallableProgramDelegator extends CallableProgramImpl implements QCallableProgramDelegator {

	private Object delegate;

	protected Method open;
	protected Method entry;
	protected Method close;

	private boolean isOpen;
	private boolean isStateless;

	protected BaseCallableProgramDelegator(Object delegate) {
		this.delegate = delegate;
	}

	@Override
	public void open() {
		
		try {
			if(this.open != null)
				this.open.invoke(delegate, (Object[])null);
		} 
		catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage());
		} 
		finally {
			this.isOpen = true;
		}
	}

	@Override
	public void call() {		
		try {
			if(this.entry != null) {
				if(getQEntry().length>0) {
					Object[] params = (Object[])getQEntry();
					this.entry.invoke(delegate, params);
				}
				else
					this.entry.invoke(delegate, new Object[] {});
			}
			else
				this.entry.invoke(delegate, new Object[0]);
		} 
		catch (InvocationTargetException e) {
			throw new OperatingSystemRuntimeException(e.getTargetException());
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} 
	}

	@Override
	public void close() {
		
		try {
			if(this.close != null)
				this.close.invoke(delegate, (Object[])null);
		} 
		catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage());
		} 
		finally {
			this.isOpen = false;
		}
	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}

	@Override
	public boolean isStateless() {
		return isStateless;
	}

	@Override
	public Object getDelegate() {
		return delegate;
	}
}