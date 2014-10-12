package org.asup.il.data.nio;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.inject.Named;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.annotation.ServiceRegistration;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.annotation.DataDef;
import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

@SuppressWarnings("restriction")
public class NIODataObjectSupplier extends ServiceImpl {
	
	public NIODataObjectSupplier() {
		// TODO Auto-generated constructor stub
	}

	@ServiceRegistration
	public void completeRegistration(
			@Named("org.asup.fw.core.service.name") String name,
			@Named("org.asup.fw.core.service.object") Object service,
			@Named("org.asup.fw.core.service.properties") Dictionary<String, Object> properties,
			@Named("org.asup.fw.core.service.remoteExport") boolean remoteExport) {

		Dictionary<String, Object> supplierProperties = new Hashtable<String, Object>();
		supplierProperties.put("dependency.injection.annotation", DataDef.class.getCanonicalName());
		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
		bundleContext.registerService(ExtendedObjectSupplier.class, new InternalSupplier(), supplierProperties);
	}
	
	public class InternalSupplier extends ExtendedObjectSupplier {

		@Override
		public Object get(IObjectDescriptor descriptor, IRequestor requestor,
				boolean track, boolean group) {
			// TODO Auto-generated method stub
			
			System.out.println(requestor.getRequestingObject());
			
			return null;
		}
		
	}
}
