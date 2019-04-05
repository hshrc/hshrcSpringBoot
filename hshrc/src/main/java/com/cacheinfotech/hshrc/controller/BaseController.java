package com.cacheinfotech.hshrc.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.ServletContextAware;

import com.cacheinfotech.hshrc.constants.HSHRCConstants;
import com.cacheinfotech.hshrc.exception.HSHRCApplicationException;
import com.cacheinfotech.hshrc.exception.HSHRCErrorStatus;

public abstract class BaseController implements ServletContextAware {

	private static final Logger LOGGER = LogManager.getLogger(BaseController.class);
	private ServletContext context;

	@ExceptionHandler(HSHRCApplicationException.class)
	public void handleFabricApplicationException(HSHRCApplicationException hse, HttpServletResponse response) {
		hshrcExceptionBase(hse, response);
	}

	@ExceptionHandler(RuntimeException.class)
	public void handleRuntimeException(RuntimeException rte, HttpServletResponse response) {
		javaExceptionBase(rte, response);
	}

	public void hshrcExceptionBase(HSHRCApplicationException hse, HttpServletResponse response) {
		try {
			LOGGER.info("sending status code:  " + hse.getErrorCode());
			LOGGER.info("sending status message:  " + hse.getErrorMessage());

			response.sendError(hse.getErrorCode(), hse.getErrorMessage());
			response.addHeader(HSHRCConstants.ERROR_MESSAGE, hse.getErrorMessage());

		} catch (IOException e) {
			LOGGER.error("javaExceptionBase", e.getMessage(), e);
		}
	}

	public void javaExceptionBase(Exception fe, HttpServletResponse response) {
		fe.printStackTrace();
		try {

			LOGGER.info("sending status code:  " + HSHRCErrorStatus.OtherError.getErrorCode());
			LOGGER.info("sending status message:  "
					+ "Functionality is not available at this time. Please try again later.");

			response.sendError(HSHRCErrorStatus.OtherError.getErrorCode(),
					"Functionality is not available at this time. Please try again later.");
			response.addHeader(HSHRCConstants.ERROR_MESSAGE,
					"Functionality is not available at this time. Please try again later.");
		} catch (IOException e) {
			LOGGER.error("javaExceptionBase", e.getMessage(), e);
		}
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		context = servletContext;
	}

	public ServletContext getServletContext() {
		return context;
	}

}
