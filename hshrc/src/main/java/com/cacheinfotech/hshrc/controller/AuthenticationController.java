/**
 * 
 */
package com.cacheinfotech.hshrc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cacheinfotech.hshrc.constants.URLConstants;
import com.cacheinfotech.hshrc.service.AuthenticationService;
import com.cacheinfotech.hshrc.vo.LoginRequestVO;
import com.cacheinfotech.hshrc.vo.LoginResponseVO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <code>AuthenticationController</code> This controller shall handle all the
 * requests related to login and logout
 * 
 * @author vipulvj
 */
@Controller
@RequestMapping(value = URLConstants.SECURITY)
public class AuthenticationController extends BaseController{
	@Autowired
	public AuthenticationService authenticationService;
	private static final Logger LOGGER = LogManager.getLogger(AuthenticationController.class);

	@RequestMapping(value = URLConstants.LOGIN, method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody LoginResponseVO login(@RequestBody LoginRequestVO loginRequestVO, HttpServletRequest request)
			throws Exception {
		LOGGER.info("Entering login with parameters loginRequestVO: " + loginRequestVO.toString());
		LoginResponseVO loginResponseVO = authenticationService.authenticateUser(loginRequestVO);
		LOGGER.info("Exiting login");
		return loginResponseVO;

	}
}
