package org.asup.os.type.pgm.asm;

import java.util.Map;

import org.asup.fw.core.impl.ServiceImpl;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.osgi.framework.Bundle;
import org.osgi.framework.hooks.weaving.WeavingHook;
import org.osgi.framework.hooks.weaving.WovenClass;
import org.osgi.framework.wiring.BundleWiring;

public class ASMProgramLoader extends ServiceImpl implements WeavingHook {

	@Override
	public void weave(WovenClass wovenClass) {

		BundleWiring bundleWiring = wovenClass.getBundleWiring();
		Bundle bundle = bundleWiring.getBundle();

		// ASUP project
		// TODO for performances reason, check a single file not directory
		if (bundle.getSymbolicName().startsWith("com.smeup.erp.gen") || bundle.getSymbolicName().startsWith("com.smeup.erp.ovr")) {
			completeClass(wovenClass);
		}
	}

	private void completeClass(WovenClass wovenClass) {

//		System.out.println("Woven: "+wovenClass);

		ClassReader cr = new ClassReader(wovenClass.getBytes());

		LabelAnalyzer labelAnalyzer = new LabelAnalyzer();
		cr.accept(labelAnalyzer, 0);

		Map<String, Label> tag2Label = labelAnalyzer.getTag2Label();
/*		for (Entry<String, Label> entry : tag2Label.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "(" + entry.getValue().info + ")");
		}*/

		ClassWriter cw = new ClassWriter(cr, 0);
		ClassAdapter ca = new JumpTransformer(cw, wovenClass.getClassName().replace(".", "/"), tag2Label);
		cr.accept(ca, 0);

		wovenClass.setBytes(cw.toByteArray());
	}
}
