package com.qait.qag.qagrest.app;

import org.glassfish.jersey.server.ResourceConfig;

public class QAGRestApplication  extends ResourceConfig {

	public QAGRestApplication() {
		// Register ExceptionMapper for validations.
		//register(ConstraintViolationExceptionMapper.class);

	}

}
