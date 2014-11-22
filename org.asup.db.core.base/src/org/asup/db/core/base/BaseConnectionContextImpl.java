package org.asup.db.core.base;

import java.lang.annotation.Annotation;

import org.asup.db.core.impl.ConnectionContextImpl;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;

public class BaseConnectionContextImpl extends ConnectionContextImpl {

	private QContext delegate;
	
	public BaseConnectionContextImpl(QContext delegate) {
		this.delegate = delegate;
	}
	

	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {
		return this.delegate.createChild();
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return this.delegate.get(clazz);
	}

	@Override
	public void inject(Object object) throws FrameworkCoreRuntimeException {
		this.delegate.inject(object);
	}

	@Override
	public Class<?> loadClass(QContextID contextID, String address) {
		return this.delegate.loadClass(contextID, address);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		this.delegate.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
		return this.delegate.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException {
		this.delegate.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
		this.delegate.set(name, object);
	}

	@Override
	public <T> T getAdapter(Object source, Class<T> target) {
		return this.delegate.getAdapter(source, target);
	}
}
