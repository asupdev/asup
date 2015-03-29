package org.asup.os.type.usrspc.base.api;

import javax.inject.Inject;

import org.asup.il.core.annotation.Overlay;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.usrspc.QUserSpace;


@Program(name = "QUSDLTUS")
public class UserSpaceDeleter {

	@Inject 
	private QJob job;
	@Inject
	private QResourceFactory resourceFactory;
	
	public @Entry void main(
			@DataDef(qualified = true) UserSpace userSpace,
			ErrorCode errorCode
			){
		QResourceWriter<QUserSpace> userSpaceResource = (QResourceWriter<QUserSpace>) resourceFactory.getResourceWriter(job, QUserSpace.class, userSpace.library.trimR());
		QUserSpace qUserSpace = userSpaceResource.lookup(userSpace.name.trimR());
		if (qUserSpace == null)			
			throw new OperatingSystemRuntimeException("User Space not found: "	+ userSpace.name);
		try {
			userSpaceResource.delete(qUserSpace);
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
	
	public static class UserSpace extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QCharacter library;
	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary £$01e1;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary £$01e2;
		@DataDef(length = 7)
		@Overlay(position = "9")
		public QCharacter £$01e3;
		@DataDef(length = 1)
		@Overlay(position = "16")
		public QCharacter £$01e4;
		@DataDef(length = 256)
		@Overlay(position = "17")
		public QCharacter £$01e5;
	}
	
}
