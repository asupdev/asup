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

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.fw.util.QStringUtil;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.annotation.Entry;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.type.pgm.OperatingSystemRuntimeProgramException;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QActivationGroupManager;
import org.asup.os.type.pgm.QCallableProgram;
import org.asup.os.type.pgm.QOperatingSystemProgramFactory;
import org.asup.os.type.pgm.QProgram;
import org.asup.os.type.pgm.QProgramStack;
import org.asup.os.type.pgm.impl.ProgramManagerImpl;

public class BaseProgramManagerImpl extends ProgramManagerImpl {	

	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QActivationGroupManager activationGroupManager;
	@Inject
	private QStringUtil stringUtil;

	private Map<Thread, QResourceSetReader<QProgram>> programReaders = new WeakHashMap<Thread, QResourceSetReader<QProgram>>();
	private Map<Thread, QProgramStack> programStacks = new WeakHashMap<Thread, QProgramStack>();
	
	@Override
	public void callProgram(QContextID ContextID, String library, String name, QData[] params) throws OperatingSystemRuntimeProgramException {

		QJob job = jobManager.lookup(ContextID);
		
		// retrieve program stack from job
		QProgramStack programStack = getProgramStack(job);
		programStack.setDateEnter(new Date());
		programStack.setDateExit(null);
		if(programStack.isEmpty()) {
			try {
				jobManager.updateStatus(job, JobStatus.RUN);
			} catch (OperatingSystemException e) {
				throw new OperatingSystemRuntimeProgramException(null, e);
			}
		}
		
		QResourceSetReader<QProgram> programReader = programReaders.get(Thread.currentThread());
		if(programReader == null) {
			programReader = resourceFactory.getResourceReader(job, QProgram.class, Scope.LIBRARY_LIST);
			programReaders.put(Thread.currentThread(), programReader);
		}

	
		// check program
		QProgram program = programReader.lookup(library, name);
		if(program == null) {
			jobLogManager.error(job, "Program not found: "+name);
			throw new OperatingSystemRuntimeProgramException(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+"Program not found: "+name, null);
		}

		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		// retrieve program from activation group
		// TODO library as key
		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if(callableProgram == null) {
			
			// load class
			try {
				callableProgram = loadProgram(job, program);
			} 
			catch (OperatingSystemException e) {
				throw new OperatingSystemRuntimeProgramException(e.getMessage(), e);
			}

			// put on activation group
			activationGroup.getPrograms().add(callableProgram);
		} 

		// push program on stack
		programStack.push(callableProgram);
		
		// call
		try {
//			printOpenStack(job, programStack, callableProgram);
			
			// open 
			if(!callableProgram.isOpen())
				callableProgram.open();

			// assign parameters
			assignParameters(callableProgram.getQEntry(), params);
			
/*			PrintStream ps = System.out;
			ps.println("Calling program: "+callableProgram.getQProgram().getName());
			
			ps.println("\t-> entry:");
			BaseProgramMemoryPrinter memoryPrinter = new BaseProgramMemoryPrinter(ps);
			memoryPrinter.setPrefix("\t\t->");
			
			if(callableProgram.getQEntry() != null) {
				for(QData entryData: callableProgram.getQEntry()) {
					entryData.accept(memoryPrinter);
					ps.println();
				}
			}*/
			
			// call
			callableProgram.call();

			programStack.setDateExit(new Date());
			
			System.out.println(callableProgram.getQProgram().getName()+" ("+getDateDiff(programStack.getDateEnter(), programStack.getDateExit(), TimeUnit.MILLISECONDS)+"ms)");

		}
		catch(Exception e) {
			throw new OperatingSystemRuntimeProgramException(e.getMessage(), e);
		}		
		finally {
//			printCloseStack(job, programStack, callableProgram);
						
			// remove program from stack
			programStack.pop();

			// close
			if(callableProgram.isStateless())
				callableProgram.close();
			
			if(programStack.isEmpty()) {
				try {
					jobManager.updateStatus(job, JobStatus.ACTIVE);
				} catch (OperatingSystemException e) {
					new OperatingSystemRuntimeProgramException(null, e);
				}
			}			
		}
	}

	@SuppressWarnings("unchecked")
	private void assignParameters(QData[] paramsTo, QData[] paramsFrom) throws OperatingSystemRuntimeProgramException {
		
		int paramsLength = 0;
		
		if(paramsTo != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;
		
		// assign data pointers 
		for(int i=0; i<paramsLength; i++) {
			
			if(paramsFrom[i] == null)
				continue;

			if(paramsTo[i] instanceof QBufferedData && paramsFrom[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData)paramsTo[i];

				if(QArray.class.isAssignableFrom(paramsFrom[i].getClass())) {
					bufferedData.movea((QArray<QBufferedData>) paramsFrom[i]);
				}
				else
					bufferedData.movel((QBufferedData)paramsFrom[i]);				
			}
			else
				paramsTo[i].eval(paramsFrom);
		}
	}
	
	@Override
	public QCallableProgram loadProgram(QContextID contextID, QProgram program) throws OperatingSystemException {


		QJob qJob = jobManager.lookup(contextID);
		
		// API
		String address = null;
		if(program.getAddress() != null) 
			address = program.getAddress(); 
		// Program
		else				
			address = "asup:/omac/"+program.getLibrary()+"/"+program.getApplication()+".pgm."+program.getName();

		Class<?> klass = qJob.getJobContext().loadClass(qJob, address);
		
		if(klass == null)
			throw new OperatingSystemException("Class not found: "+address);

		try {
			
			QActivationGroup activationGroup = activationGroupManager.lookup(qJob, program.getActivationGroup());
			if(activationGroup == null) 
				activationGroup = activationGroupManager.create(qJob, program.getName(), true);

			QCallableProgram callableProgram = prepareCallableProgram(qJob, activationGroup, klass);
			
			if(callableProgram.getQProgram() == null)
				callableProgram.setQProgram(program);
			
			return callableProgram;
			
		} catch (Exception e) {
			throw new OperatingSystemException(e);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private QCallableProgram prepareCallableProgram(QJob job, QActivationGroup activationGroup, Class<?> klass) {

		QCallableProgram callableProgram = null;

		BaseProgramInjector programInjector = job.getJobContext().make(BaseProgramInjector.class);
		
		if(QCallableProgram.class.isAssignableFrom(klass)) {			
			callableProgram = programInjector.makeCallableProgram(job, activationGroup, (Class<QCallableProgram>) klass);

/*			
			BaseCallableProgramDelegator delegator = new BaseCallableProgramDelegator(callableProgram);

			// search @Entry
			for(Method method: klass.getMethods()) {
				if(method.isAnnotationPresent(Entry.class)) {
					delegator.entry = method;
					
					QData[] entry = programInjector.buildEntry(job, method);
					delegator.setQEntry(entry);        

					break;
				}
			}			
			callableProgram = delegator;
*/

		}
		else {
			
			Object delegate = activationGroup.getFrameworkContext().make(klass);
			BaseCallableProgramDelegator delegator = new BaseCallableProgramDelegator(delegate);

			// search @Entry
			for(Method method: klass.getMethods()) {
				if(method.isAnnotationPresent(Entry.class)) {
					delegator.entry = method;
					
					QData[] entry = programInjector.buildEntry(job, method);
					delegator.setQEntry(entry);        

					break;
				}
			}		
	
			callableProgram = delegator;
		}

		
		return callableProgram;
	}


	@Override
	public QProgramStack getProgramStack(QContextID contextID) {

		QProgramStack programStack = programStacks.get(Thread.currentThread());
		if(programStack == null) {
			programStack = QOperatingSystemProgramFactory.eINSTANCE.createProgramStack();
			programStacks.put(Thread.currentThread(), programStack);
		}
		return programStack;
	}

	@Override
	public QCallableProgram getCaller(QContextID contextID, QCallableProgram context) {
		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for(QCallableProgram level: programStack.list()) {
			// looking for this
			if(level.equals(context))
				return caller;
			// set caller
			caller = level;						
		}
		return null;
	}
		
	protected void printOpenStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "-> "+callableProgram.getQProgram().getName()+" (";
		for(QData param: callableProgram.getQEntry()) {
			if(param != null)
				text += param.toString()+"|";
			else
				text += "|";
			
		}
		text += ")";
		text.toString();
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+stringUtil.appendChars(text, "\t", programStack.size(), true));
	}
	
	protected void printCloseStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "<- "+callableProgram.getQProgram().getName()+" (";
		for(QData param: callableProgram.getQEntry()) {
			text += param.toString()+"|";
		}
		text += ")";
		text += callableProgram.isStateless() ? "(LR)" : "(RT)";
		text.toString();
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+stringUtil.appendChars(text, "\t", programStack.size(), true));		
	}
	
	private long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}