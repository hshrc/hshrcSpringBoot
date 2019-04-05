/**
 * 
 */
package com.cacheinfotech.hshrc.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vipulvj
 *
 */
@Getter
@Setter
public class LoginRequestVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

}
