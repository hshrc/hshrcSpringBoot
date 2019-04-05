/**
 * 
 */
package com.cacheinfotech.hshrc.exception;

/**
 * <code>HSHRCErrorStatus</code> The error status code of our application
 * 
 * @author vipulvj
 *
 */
public enum HSHRCErrorStatus {

	InvalidUseridPassword(40301), PasswordExpired(40302), AccountLocked(40303), NotAuthorized(40305),
	InvalidUserSession(40306), OtherError(60000), InvalidJSONDataInRequest(40309);

	private int errorCode;

	private HSHRCErrorStatus(int ec) {
		errorCode = ec;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
