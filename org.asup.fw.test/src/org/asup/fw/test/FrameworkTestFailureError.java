package org.asup.fw.test;

public class FrameworkTestFailureError extends AssertionError {

	private static final long serialVersionUID = 1L;

    public FrameworkTestFailureError() {
    }

    public FrameworkTestFailureError(String message) {
        super(defaultString(message));
    }

    private static String defaultString(String message) {
        return message == null ? "" : message;
    }
}
