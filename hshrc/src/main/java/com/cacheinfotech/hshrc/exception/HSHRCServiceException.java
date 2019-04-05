/**
 * 
 */
package com.cacheinfotech.hshrc.exception;

/**
 * <code>HSHRCServiceException</code> The exception class for the Service layer
 * of our application.
 * 
 * @author vipulvj
 *
 */
public class HSHRCServiceException extends HSHRCApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HSHRCServiceException(int errorCode, String errorMessage, Throwable e) {
		super(errorCode, errorMessage, e);
	}

}
