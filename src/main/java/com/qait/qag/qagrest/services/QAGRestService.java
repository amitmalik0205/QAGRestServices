package com.qait.qag.qagrest.services;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.qait.qag.formgenerator.common.util.QAGFormGeneratorUtil;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateFormSpec;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateInstance;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateJsonParent;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateQuestionChoice;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateQuestionSection;
import com.qait.qag.qagrest.exception.mappeer.SimpleTemplateSectionTopRight;


@Path("qag-service")
public class QAGRestService {

	private static final Logger logger = Logger.getLogger(QAGRestService.class);
	
	Integer digits = null;
	
	@Path("test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String text() throws IOException {
		return "Its working";
	}
	
	
	@POST
	@Path("generate-form")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response generateForm(SimpleTemplateJsonParent jsonParent) {
		
		String response = null;
		
		try {
			
			//ITemplateFrontController frontController = new SimpleTemplateFrontController(jsonParent);
			
			//response = frontController.startFormGeneration();

		} catch (Exception e) {
			e.printStackTrace();		
			logger.fatal(QAGFormGeneratorUtil.getExceptionDescriptionString(e));
			throw new WebApplicationException(Response.ok("Error while generation the form").build());
		}
		
		if(response != null) {			
			return Response.ok(response).build();
		} else {
			
			return Response.ok("Error while generation the form").build();
		}			
	}
}
