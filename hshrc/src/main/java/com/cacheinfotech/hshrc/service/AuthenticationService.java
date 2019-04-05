/**
 * 
 */
package com.cacheinfotech.hshrc.service;

import com.cacheinfotech.hshrc.vo.LoginRequestVO;
import com.cacheinfotech.hshrc.vo.LoginResponseVO;
import com.cacheinfotech.hshrc.vo.LogoutRequestVO;
import com.cacheinfotech.hshrc.vo.LogoutResponseVO;

/**
 * <code>AuthenticationService</code> This service shall be used to authenticate
 * the user and terminate his active session This shall have below endpoints:
 * <ol>
 * <li>authenticateUser</li>
 * <li>logoutUser</li>
 * </ol>
 * 
 * @author vipulvj
 *
 */
public interface AuthenticationService {
	/**
	 * <code>authenticateUser</code> This shall be used to authenticate the user.
	 ** 
	 * @param LoginRequestVO
	 */
	public LoginResponseVO authenticateUser(LoginRequestVO loginRequestVO);

	/**
	 * <code>logoutUser</code> This shall be used to logout the user.
	 *
	 * @param LogoutRequestVO
	 */
	public LogoutResponseVO logoutUser(LogoutRequestVO logoutRequestVO);
}
