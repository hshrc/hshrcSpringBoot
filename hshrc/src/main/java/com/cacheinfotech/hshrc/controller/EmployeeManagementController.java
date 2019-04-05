/**
 * 
 */
package com.cacheinfotech.hshrc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cacheinfotech.hshrc.constants.URLConstants;

/**
 * 
 * <code>EmployeeManagementController</code> This controller shall handle all
 * the requests related to Employee Management
 * 
 * @author vipulvj
 */
@Controller
@RequestMapping(value = URLConstants.EMPLOYEE)
public class EmployeeManagementController extends BaseController {

}
