package org.asup.os.core.e4;

import java.lang.annotation.Annotation;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.os.core.jobs.impl.JobContextImpl;

public class E4JobContextImpl extends JobContextImpl {

	private QContext delegate;
	
	protected E4JobContextImpl(QContext delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public void dispose() throws FrameworkCoreRuntimeException {
		this.delegate.dispose();
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
	public <T> T getAdapter(Object adaptable, Class<T> adapterType) {
		return this.delegate.getAdapter(adaptable, adapterType);
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
}
