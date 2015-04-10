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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.fw.util.QStringUtil;
import org.asup.il.data.QData;
import org.asup.il.data.annotation.Program;
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

	private BaseProgramCallableHelper baseCallableHelper;
	private Map<Thread, QResourceSetReader<QProgram>> programReaders ;
	private Map<String, QProgramStack> programStacks;

	@PostConstruct
	private void init() {
		this.baseCallableHelper = new BaseProgramCallableHelper(activationGroupManager);
		this.programReaders = new WeakHashMap<Thread, QResourceSetReader<QProgram>>();
		this.programStacks = new HashMap<String, QProgramStack>();
	}
	
	
	@Override
	public void callProgram(QContextID ContextID, String library, String name, QData[] params) throws OperatingSystemRuntimeProgramException {

		QJob job = jobManager.lookup(ContextID);

		QProgram program = getProgram(job, library, name);
		
		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if(callableProgram == null) {	
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		} 

		callProgram(job, callableProgram, params);
	}

	@Override
	public void callProgram(QJob job, Class<?> klass, QData[] params) throws OperatingSystemRuntimeProgramException {

		Program programAnnotation = klass.getAnnotation(Program.class);
		if(programAnnotation == null)
			throw new OperatingSystemRuntimeProgramException("Program class not callable: "+klass);
		
		QProgram program = getProgram(job, null, programAnnotation.name());
		
		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if(callableProgram == null) {	
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		} 

		callProgram(job, callableProgram, params);
		
	}
	
	@Override
	public QCallableProgram loadProgram(QJob job, QProgram program) throws OperatingSystemRuntimeProgramException {
		
		// API
		String address = null;
		if(program.getAddress() != null) 
			address = program.getAddress(); 
		// Program
		else				
			address = "asup:/omac/com.smeup.erp.gen.pgm/com.smeup.erp.gen.pgm."+program.getApplication()+"."+program.getName();

		Class<?> klass = job.getContext().loadClass(address);
		
		if(klass == null)
			throw new OperatingSystemRuntimeProgramException("Class not found: "+address);

		QCallableProgram callableProgram = baseCallableHelper.prepareCallableProgram(job, program, klass);
		
		return callableProgram;
	}

	@Override
	public QCallableProgram loadProgram(QJob job, Class<?> klass) throws OperatingSystemRuntimeProgramException {

		try {
			QProgram program = null;
			QCallableProgram callableProgram = baseCallableHelper.prepareCallableProgram(job, program, klass);
			
			return callableProgram;
			
		} catch (Exception e) {
			throw new OperatingSystemRuntimeProgramException(e);
		}
		
	}

	@Override
	public QProgramStack getProgramStack(QContextID contextID) {

		QProgramStack programStack = programStacks.get(contextID.getID());
		if(programStack == null) {
			programStack = QOperatingSystemProgramFactory.eINSTANCE.createProgramStack();
			programStacks.put(contextID.getID(), programStack);
		}
		return programStack;
	}

	@Override
	public QProgramStack getProgramStack(QContextID contextID, String jobID) {
		
		QProgramStack programStack = programStacks.get(jobID);
		
		return programStack;
	}

	@Override
	public QCallableProgram getCaller(QContextID contextID, QCallableProgram program) {
		
		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for(QCallableProgram level: programStack.list()) {
			// looking for this
			if(level.equals(program))
				return caller;
			// set caller
			caller = level;						
		}
		return null;
	}

	@Override
	public QCallableProgram getCaller(QContextID contextID, Object program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for(QCallableProgram level: programStack.list()) {
			// looking for this
			if(level.getRawProgram().equals(program))
				return caller;
			// set caller
			caller = level;						
		}
		return null;

	}

	private void callProgram(QJob job, QCallableProgram callableProgram, QData[] params) throws OperatingSystemRuntimeProgramException {

		synchronized (callableProgram) {
				
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
			
			// push program on stack
			programStack.push(callableProgram);
			
			// call
			try {
				printOpenStack(job, programStack, callableProgram);
				
				// open 
				if(!callableProgram.isOpen())
					callableProgram.open();
	
				baseCallableHelper.assignParameters(callableProgram.getQEntry(), params);
				
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
				
	//			System.out.println(callableProgram.getQProgram().getName()+" ("+getDateDiff(programStack.getDateEnter(), programStack.getDateExit(), TimeUnit.MILLISECONDS)+"ms)");
	
			}
			catch(Exception e) {
				throw new OperatingSystemRuntimeProgramException(e.getMessage(), e);
			}		
			finally {
				printCloseStack(job, programStack, callableProgram);
	
				// TODO release parameters
				
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
	}

	private QProgram getProgram(QJob job, String library, String name) {
		
		QResourceSetReader<QProgram> programReader = programReaders.get(Thread.currentThread());
		if(programReader == null) {
			programReader = programReaders.get(Thread.currentThread());
			synchronized (programReaders) {
				if(programReader == null) {
					programReader = resourceFactory.getResourceReader(job, QProgram.class, Scope.ALL);
					programReaders.put(Thread.currentThread(), programReader);
				}				
			}
		}
	
		// check program
		if(library != null && library.equalsIgnoreCase("*LIBL"))
			library = null;
		QProgram program = programReader.lookup(library, name);
		if(program == null) {
			jobLogManager.error(job, "Program not found: "+name);
			throw new OperatingSystemRuntimeProgramException(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+"Program not found: "+name, null);
		}

		return program;
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
	
	protected long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}