/**
 * 
 */
package com.cacheinfotech.hshrc.exception;

/**
 * <code>HSHRCApplicationException</code> The common exception class for our
 * application.
 * 
 * @author vipulvj
 *
 */
public class HSHRCApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorMessage;
	private int errorCode;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public HSHRCApplicationException(HSHRCErrorStatus errorCode, String errorMessage) {
		this(errorCode, errorMessage, null);
	}

	public HSHRCApplicationException(Integer errorCode, String errorMessage, Throwable e) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		// Set the cause if e is not null.
		if (e != null) {
			this.initCause(e);
		}
	}

	public HSHRCApplicationException(HSHRCErrorStatus errorCode, String errorMessage, Throwable e) {

		this.errorCode = errorCode.getErrorCode();
		this.errorMessage = errorMessage;

		// Set the cause if e is not null.
		if (e != null) {
			this.initCause(e);
		}
	}

}
