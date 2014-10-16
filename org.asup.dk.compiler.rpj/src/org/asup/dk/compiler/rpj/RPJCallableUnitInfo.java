package org.asup.dk.compiler.rpj;

import java.util.HashMap;
import java.util.Map;

public class RPJCallableUnitInfo {

	private Map<String, Label> labels;
	
	public RPJCallableUnitInfo() {
		this.labels = new HashMap<String, RPJCallableUnitInfo.Label>();
	}

	public Map<String, Label> getLabels() {
		return this.labels;
	}
	
	public static class Label {
		
		public int jumpsCount = 0;
		
	}
}
