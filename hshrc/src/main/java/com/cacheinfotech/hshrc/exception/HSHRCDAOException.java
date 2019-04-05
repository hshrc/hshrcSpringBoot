/**
 * 
 */
package com.cacheinfotech.hshrc.exception;

/**
 * <code>HSHRCDAOException</code> The exception class for the DAO layer of our
 * application.
 * 
 * @author vipulvj
 *
 */
public class HSHRCDAOException extends HSHRCApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HSHRCDAOException(int errorCode, String errorMessage, Throwable e) {
		super(errorCode, errorMessage, e);
	}

}
