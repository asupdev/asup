package org.asup.db.core.base;

import java.lang.annotation.Annotation;

import org.asup.db.core.impl.ConnectionContextImpl;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;

public class BaseConnectionContextImpl extends ConnectionContextImpl {

	private QContext context;
	
	public BaseConnectionContextImpl(QContext context) {
		this.context = context;
	}
	
	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {
		return context.createChild();
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return context.get(clazz);
	}

	@Override
	public void inject(Object object) throws FrameworkCoreRuntimeException {
		context.inject(object);
	}

	@Override
	public Class<?> loadClass(QContextID contextID, String address) {
		return context.loadClass(contextID, address);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		context.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
		return context.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException {
		context.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
		context.set(name, object);
	}

	@Override
	public <T> T getAdapter(Object source, Class<T> target) {
		return context.getAdapter(source, target);
	}
	@Override
	public void close() throws FrameworkCoreRuntimeException {
		context.close();
	}

}
