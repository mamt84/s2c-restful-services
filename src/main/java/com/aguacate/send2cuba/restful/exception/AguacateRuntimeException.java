package com.aguacate.send2cuba.restful.exception;

public class AguacateRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -4465089320002452821L;

	public AguacateRuntimeException() {

	}

	public AguacateRuntimeException(String message) {
		super(message);
	}

	public AguacateRuntimeException(Throwable cause) {
		super(cause);
	}

	public AguacateRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public AguacateRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
