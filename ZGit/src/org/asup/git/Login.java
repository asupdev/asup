package org.asup.git;

import javax.swing.*;

public class Login {

	public static Coppia<String, String> login() {
		JTextField user = new JTextField();
		user.setColumns(15);
		JPasswordField password = new JPasswordField(10);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage(new Object[] { "User:", user, "Password:",
				password });
		optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		JDialog dialog = optionPane.createDialog(null, "Login");
		dialog.setVisible(true);
		if (userConfirmedAction((Integer) optionPane.getValue())) {
			return new Coppia<String, String>(user.getText(), new String(
					password.getPassword()));
		}
		return null;
	}

	private static boolean userConfirmedAction(Integer value) {
		return value != null && value.intValue() != JOptionPane.CANCEL_OPTION
				&& value.intValue() != JOptionPane.CLOSED_OPTION;
	}
}
