package org.asup.dk.compiler.rpj;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QRoutine;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;

public class RPJProcedureWriter extends RPJCallableUnitWriter {

	public RPJProcedureWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {
		
		super(root, compilationContext, compilationSetup, name);
	}

	@SuppressWarnings("unchecked")
	public void writeProcedure(QProcedure procedure) {
		
		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationContext().normalizeTermName(procedure.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		
		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		// analyze callable unit
		analyzeCallableUnit(procedure);
		
		writeModuleFields(procedure.getSetupSection().getModules());

		if(procedure.getFileSection() != null) {
			writeDataSets(procedure.getFileSection().getDataSets());
			writeKeyLists(procedure.getFileSection().getKeyLists());
		}			
				
		if(procedure.getDataSection() != null)
			writeDataFields(procedure.getDataSection());

		// labels
		writeLabels(getCallableUnitInfo().getLabels().keySet());

		// main
		if(procedure.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(procedure.getMain());
			
			writeRoutine(getCompilationContext(), routine);
		}
				
	}

}
