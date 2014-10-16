package org.asup.dk.compiler.rpj.visitor;

import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJCallableUnitAnalyzer extends StatementVisitorImpl {

	private RPJCallableUnitInfo programInfo;
	
	public RPJCallableUnitAnalyzer(RPJCallableUnitInfo programInfo) {
		this.programInfo = programInfo;
	}

	@Override
	public boolean visit(QJump statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getLabel());
		if(label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getLabel(), label);
		}
		label.jumpsCount++;
		
		return super.visit(statement);
	}

	@Override
	public boolean visit(QLabel statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getName());
		if(label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getName(), label);
		}

		return super.visit(statement);
	}

}
