/**
 * 
 */
package com.cacheinfotech.hshrc.session;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.ConfigurableWebApplicationContext;

/**
 * @author vipulvj
 *
 */
public class HSHRCApplicationInitializer implements ApplicationContextInitializer<ConfigurableWebApplicationContext> {

	private static final Logger LOGGER = LogManager.getLogger(HSHRCApplicationInitializer.class);

	@Override
	public void initialize(ConfigurableWebApplicationContext applicationContext) {
		LOGGER.debug("**************************************************************");
		LOGGER.debug("*                                                            *");
		LOGGER.debug("*    Starting Integration Fabric RESTful Application.        *");
		LOGGER.debug("*                                                            *");
		LOGGER.debug("**************************************************************");

	}

}
