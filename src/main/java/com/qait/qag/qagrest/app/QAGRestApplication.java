package com.qait.qag.qagrest.app;

import org.glassfish.jersey.server.ResourceConfig;

import com.qait.qag.qagrest.exception.mappeer.ConstraintViolationExceptionMapper;

public class QAGRestApplication  extends ResourceConfig {

	public QAGRestApplication() {
		// Register ExceptionMapper for validations.
		register(ConstraintViolationExceptionMapper.class);

	}

}
