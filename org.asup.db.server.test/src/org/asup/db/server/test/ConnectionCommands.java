package org.asup.db.server.test;

import java.util.Map.Entry;

import org.asup.db.server.store.OperatingSystem;
import org.asup.db.server.store.QStoreFactory;
import org.asup.db.server.store.QUser;
import org.asup.db.server.store.QWorkstation;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ConnectionCommands extends AbstractCommandProviderImpl {

	public void _read(CommandInterpreter interpreter) {
		
		CDOSession session = getSession();
		
		CDOView view = session.openView();
		
		CDOQuery query = view.createQuery("sql", "select * from asup_store_user");
		
		for(QUser user: query.getResult(QUser.class)) {
			System.out.println(user);
		}
		
		session.close();		
	}
	
	public void _write(CommandInterpreter interpreter) {
		
		String name = interpreter.nextArgument();
		String text = interpreter.nextArgument();
		
		QUser user =  QStoreFactory.eINSTANCE.createUser();
		user.setName(name);
		user.setText(text);
		
		QWorkstation workstation = QStoreFactory.eINSTANCE.createWorkstation();
		workstation.setModel("ASUS");
		workstation.setOperatingSystem(OperatingSystem.LINUX);
		
		user.setWorkstation(workstation);
		

		CDOSession session = getSession();
		
		CDOTransaction transaction = session.openTransaction();
		
		CDOResource resource  = transaction.getOrCreateResource("users");
		
		resource.getContents().add((EObject)user);
		
		try {
			transaction.commit();
		} 
		catch (CommitException e) {
			e.printStackTrace();
		}
		finally {
			transaction.close();
		}
		
		session.close();
	}
	
	private CDOSession getSession() {
				
		CDONet4jSession session = openSession("asup-db1:2036", "AS400A");
		session.options().getNet4jProtocol().setTimeout(60000);
		
		return session;
	}
	
	
    
	public CDONet4jSession openSession(String description, String repository) {

		// Create connector
	    IConnector connector = TCPUtil.getConnector(createClientContainer(), description);

	    // Create configuration
	    CDONet4jSessionConfiguration configuration = CDONet4jUtil.createNet4jSessionConfiguration();
//	    configuration.setSignalTimeout(60000);
	    configuration.setConnector(connector);
	    configuration.setRepositoryName(repository);
	    
	    // Open session    
	    CDONet4jSession session = configuration.openNet4jSession();
	    	    
	    for(Entry<String, Object> key: EPackage.Registry.INSTANCE.entrySet()) {
	    	session.getPackageRegistry().put(key.getKey(), key.getValue());
	    }

	    return session;
	}
	
	
	private IManagedContainer createClientContainer() {
    	
		IManagedContainer container = ContainerUtil.createContainer();
    	Net4jUtil.prepareContainer(container);

    	TCPUtil.prepareContainer(container);
    	CDONet4jUtil.prepareContainer(container);
    	
		LifecycleUtil.activate(container);
		
    	return container;
    }
}
