package org.asup.dk.parser.ibmi.cl.model.parm;

public class CLParmStringOperator extends CLParmAbstractComponent {
	
	public enum CLParmStringOperatorType {
		CAT,
		BCAT,
		TCAT
	}
	
	private CLParmStringOperator operatorType = null;
	private CLParmAbstractComponent firstValue = null;
	private CLParmAbstractComponent secondValue = null;
	

	@Override
	public CLParmComponentType getComponentType() {
		return CLParmComponentType.STR_OPERATOR;
	}

	public CLParmStringOperator getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(CLParmStringOperator operatorType) {
		this.operatorType = operatorType;
	}

	public CLParmAbstractComponent getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(CLParmAbstractComponent firstValue) {
		this.firstValue = firstValue;
	}

	public CLParmAbstractComponent getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(CLParmAbstractComponent secondValue) {
		this.secondValue = secondValue;
	}
}
