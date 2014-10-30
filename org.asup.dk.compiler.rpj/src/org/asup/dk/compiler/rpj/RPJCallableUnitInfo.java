package org.asup.dk.compiler.rpj;

import java.util.HashMap;
import java.util.Map;

public class RPJCallableUnitInfo {

	private Map<String, Label> labels;
	
	public RPJCallableUnitInfo() {
		reset();
	}

	public Map<String, Label> getLabels() {
		return this.labels;
	}
	
	public void reset() {
		this.labels = new HashMap<String, RPJCallableUnitInfo.Label>();
	}
	
	public static class Label {
		
		public int jumpsCount = 0;
		
	}
}
