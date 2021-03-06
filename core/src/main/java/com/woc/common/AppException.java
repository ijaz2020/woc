package com.woc.common;

import java.io.Serializable;

public class AppException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor.
	 */
	public AppException() {
		super();
	}

	/**
	 * <p>
	 * Constructor with one Argument.
	 * </p>
	 * 
	 * @param msg
	 *            - a String Value - Exception message
	 */
	public AppException(final String msg) {
		super(msg);
	}

	/**
	 * Constructor with two Argument.
	 * 
	 * @param msg
	 *            - a String Value - Exception message
	 * @param cause
	 *            -Throwable object
	 */
	public AppException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	/**
	 * Constructor with one Argument.
	 * 
	 * @param cause
	 *            - Throwable object
	 */
	public AppException(final Throwable cause) {
		super(cause);
	}
}
