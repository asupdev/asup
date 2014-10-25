package org.asup.dk.compiler.rpj.visitor;

import java.util.List;

import javax.inject.Inject;

import org.asup.db.data.QDatabaseDataHelper;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.rpj.RPJCallableUnitLinker;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.data.QExternalFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPhysicalFile;

public class RPJDataExternalNameVisitor extends DataTermVisitorImpl {


	private RPJCallableUnitLinker callableUnitLinker;

	@Inject
	public RPJDataExternalNameVisitor(QCompilationContext compilationContext) {
		this.callableUnitLinker = compilationContext.get(RPJCallableUnitLinker.class);
	}
	
	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if( externalFile != null) {
			completeCompoundDef(term.getDefinition(), externalFile);
		}

		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if(externalFile != null) {
			completeCompoundDef(term.getDefinition(), externalFile);
		}
		
		return false;
	}

	private void completeCompoundDef(QCompoundDataDef<?> dataDef, QExternalFile externalFile) {

		if(externalFile.getName().startsWith("*"))
			return;
		
		QFile file = callableUnitLinker.getFile(externalFile.getName());

		if(file == null)
			throw new OperatingSystemRuntimeException("File not found: "+externalFile.getName());

		if(file instanceof QPhysicalFile || file instanceof QLogicalFile) {

			QPhysicalFile physicalFile = callableUnitLinker.getPhysicalFile(file.getName());
			
			if(externalFile.getFormat() == null)
				externalFile.setFormat(physicalFile.getTableFormat());

			List<QDataTerm<?>> elements = QDatabaseDataHelper.buildDataTerm(physicalFile.getTable(), file.getName()).getDefinition().getElements();			
			dataDef.getElements().addAll(elements);
		}
		else 
			System.err.println(file);

	}
}