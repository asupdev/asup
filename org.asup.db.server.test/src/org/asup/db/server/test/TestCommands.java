package org.asup.db.server.test;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map.Entry;

import org.asup.db.server.store.OperatingSystem;
import org.asup.db.server.store.QStoreFactory;
import org.asup.db.server.store.QUser;
import org.asup.db.server.store.QWorkstation;
import org.asup.os.type.cmd.CommandOrder;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandContainer;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestCommands extends AbstractCommandProviderImpl {
	
	public void _writeCommands(CommandInterpreter interpreter) {
		String fileName = interpreter.nextArgument();
		
		if (fileName == null || "".equals(fileName.trim())) {
			System.out.println("Occorre immettere il nome del file della cartella ASUP-INF");
			return;
		}
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());

		URL url = bundle.getEntry("/ASUP-INF/"+fileName+".xmi");

		System.out.println(url);
		
		QCommandContainer commandContainer = load(url);

		CDOSession session = getSession();
		
		for(QCommand command: commandContainer.getCommands(CommandOrder.NAME)) {
			System.out.println("Command name: " + command.getName());
			
			CDOObject cdoObject = CDOUtil.getCDOObject((EObject)command);
			System.out.println("Command id:   " + cdoObject.cdoID());
			
			CDOTransaction transaction = session.openTransaction();
			CDOResource resource  = transaction.getOrCreateResource("commands");
			
			try {
				resource.getContents().add((EObject)command);
				transaction.commit();
			} 
			catch (CommitException e) {
				e.printStackTrace();
			}
			finally {
				transaction.close();
			}
		}		
		
		session.close();
	}
	
	public void _readCommands(CommandInterpreter interpreter) {
		CDOSession session = getSession();
		
		CDOView view = session.openView();
		
		CDOQuery query = view.createQuery("sql", "SELECT * FROM ASUP_OS_TYPE_CMD_COMMAND");
		
		for(QCommand command: query.getResult(QCommand.class)) {
			CDOObject cdoObject = CDOUtil.getCDOObject((EObject)command);
			System.out.println(cdoObject.cdoID());

			System.out.println(command);
		}
		
		session.close();		
	}
	
	private QCommandContainer load(URL url) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(url.toString()));
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		EObject eObject = resource.getContents().get(0);
		
		return (QCommandContainer) eObject;
	}

	public void _read(CommandInterpreter interpreter) {
		CDOSession session = getSession();
		
		CDOView view = session.openView();
		CDOQuery query = view.createQuery("sql", "SELECT * FROM ASUP_STORE_USER");
		
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
