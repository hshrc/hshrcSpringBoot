/**
 * 
 */
package com.cacheinfotech.hshrc.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cacheinfotech.hshrc.service.AuthenticationService;
import com.cacheinfotech.hshrc.vo.LoginRequestVO;
import com.cacheinfotech.hshrc.vo.LoginResponseVO;
import com.cacheinfotech.hshrc.vo.LogoutRequestVO;
import com.cacheinfotech.hshrc.vo.LogoutResponseVO;

/**
 * @author vipulvj
 *
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	private static final Logger LOGGER = LogManager.getLogger(AuthenticationServiceImpl.class);

	@Override
	public LoginResponseVO authenticateUser(LoginRequestVO loginRequestVO) {
		LOGGER.info(
				"Entering authenticateUser of AuthenticationServiceImpl with parameters: " + loginRequestVO.toString());
		LOGGER.info("Exiting authenticateUser of AuthenticationServiceImpl");
		return null;
	}

	@Override
	public LogoutResponseVO logoutUser(LogoutRequestVO logoutRequestVO) {
		LOGGER.info("Entering logoutUser of AuthenticationServiceImpl with parameters: " + logoutRequestVO.toString());
		LOGGER.info("Exiting logoutUser of AuthenticationServiceImpl");
		return null;
	}

}
