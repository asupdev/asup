/**
 */
package org.asup.os.core.base.api;

import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Command(name = "RCVMSG")
@Program(name = "QMHRCVMS")
public class MessageReceiver {

	@Entry
	public void main() {
	}
}