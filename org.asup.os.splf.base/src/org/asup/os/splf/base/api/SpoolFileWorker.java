package org.asup.os.splf.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QObjectWriterFactory;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.splf.QSpoolFile;

public @ToDo @Program(name = "QSPWRKF") class SpoolFileWorker {
	
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject
	private QObjectWriterFactory objectWriterFactory;
	
	public static enum QCPFMSG {
	}

	public @Entry void main(
			@ToDo SCELTAFILEPER sceltaFilePer,
			@DataDef(qualified = true) QEnum<NOMELAVOROEnum, NOMELAVORO> nomeLavoro,
			PERIODODITEMPO periodoDiTempo,
			@DataDef(length = 10) QEnum<UNITAASPEnum, QCharacter> unitaASP,
			@DataDef(length = 1) QEnum<EMISSIONEEnum, QCharacter> emissione,
			@DataDef(length = 7) QEnum<FORMATOVIDEOEnum, QCharacter> formatoVideo,
			@DataDef(length = 10) QEnum<LIVELLODIASSISTENZAEnum, QCharacter> livelloDiAssistenza) {
		
		QResourceReader<QSpoolFile> spoolFileReader = resourceFactory.getResourceReader(job, QSpoolFile.class, job.getSystem().getSystemLibrary());
		QObjectWriter objectWriter = objectWriterFactory.createObjectWriter(job);
		
		objectWriter.initialize();
		
		QObjectIterator<QSpoolFile> spoolFileIterator = spoolFileReader.find(null);
		while(spoolFileIterator.hasNext()) {
			QSpoolFile spoolFile = spoolFileIterator.next();
			
			try {
				objectWriter.write(spoolFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		objectWriter.flush();
	}

	public static class SCELTAFILEPER extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*CURRENT")
		public QEnum<UTENTEEnum, QCharacter> utente;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<UNITADISTAMPAEnum, QCharacter> unitaDiStampa;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<TIPOMODULOEnum, QCharacter> tipoModulo;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<DATIUTENTEEnum, QCharacter> datiUtente;
		@DataDef(binaryType = BinaryType.SHORT, value = "*ALL")
		public QEnum<ASPEnum, QBinary> aSP;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<FILEINSPOOLEnum, QCharacter> fileInSpool;

		public static enum UTENTEEnum {
			CURRENT, ALL, OTHER
		}

		public static enum UNITADISTAMPAEnum {
			ALL, OUTQ, OTHER
		}

		public static enum TIPOMODULOEnum {
			ALL, STD, OTHER
		}

		public static enum DATIUTENTEEnum {
			ALL, OTHER
		}

		public static enum ASPEnum {
			@Special(value = "0")
			ALL, @Special(value = "-1")
			ASPDEV, OTHER
		}

		public static enum FILEINSPOOLEnum {
			ALL, OTHER
		}
	}

	public static class NOMELAVORO extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nomeGenerico;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<UTENTEEnum, QCharacter> utente;
		@DataDef(length = 6, value = "*ALL")
		public QEnum<NUMEROEnum, QCharacter> numero;

		public static enum UTENTEEnum {
			ALL, OTHER
		}

		public static enum NUMEROEnum {
			ALL, OTHER
		}
	}

	public static enum NOMELAVOROEnum {
		ALL, OTHER
	}

	public static class PERIODODITEMPO extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public PERIODODITEMPO.ORAEDATAINIZIALI oraEDataIniziali;
		public PERIODODITEMPO.ORAEDATAFINALI oraEDataFinali;

		public static class ORAEDATAINIZIALI extends QDataStructDelegator {
			private static final long serialVersionUID = 1L;
			@DataDef(datetimeType = DatetimeType.TIME, value = "*AVAIL")
			public QEnum<ORADIINIZIOEnum, QDatetime> oraDiInizio;
			@DataDef(datetimeType = DatetimeType.DATE, value = "*BEGIN")
			public QEnum<DATADIINIZIOEnum, QDatetime> dataDiInizio;

			public static enum ORADIINIZIOEnum {
				@Special(value = "000000")
				AVAIL, OTHER
			}

			public static enum DATADIINIZIOEnum {
				@Special(value = "0000000")
				BEGIN, OTHER
			}
		}

		public static class ORAEDATAFINALI extends QDataStructDelegator {
			private static final long serialVersionUID = 1L;
			@DataDef(datetimeType = DatetimeType.TIME, value = "*AVAIL")
			public QEnum<ORADIFINEEnum, QDatetime> oraDiFine;
			@DataDef(datetimeType = DatetimeType.DATE, value = "*END")
			public QEnum<DATADIFINEEnum, QDatetime> dataDiFine;

			public static enum ORADIFINEEnum {
				@Special(value = "235959")
				AVAIL, OTHER
			}

			public static enum DATADIFINEEnum {
				@Special(value = "0000000")
				END, OTHER
			}
		}
	}

	public static enum UNITAASPEnum {
		@Special(value = "*")
		TERM_STAR, SYSBAS, CURASPGRP, OTHER
	}

	public static enum EMISSIONEEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum FORMATOVIDEOEnum {
		INLENV, S36FMT, NORMAL
	}

	public static enum LIVELLODIASSISTENZAEnum {
		PRV, USRPRF, BASIC, INTERMED
	}
}
