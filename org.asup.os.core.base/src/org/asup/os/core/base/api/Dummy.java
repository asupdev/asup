/**
 */
package org.asup.os.core.base.api;

import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Command(name = "DUMMY")
@Program(name = "QDUMMY")
public class Dummy {

	@Entry
	public void main() {
	}
}