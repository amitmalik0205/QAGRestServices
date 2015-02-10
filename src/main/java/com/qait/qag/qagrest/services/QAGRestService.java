package com.qait.qag.qagrest.services;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.qait.qag.formgenerator.common.util.QAGFormGeneratorUtil;
import com.qait.qag.formgenerator.generator.ITemplateFrontController;
import com.qait.qag.formgenerator.simpletemplate.domain.SimpleTemplateJsonParent;
import com.qait.qag.formgenerator.simpletemplate.dto.StudentFormDetailDto;
import com.qait.qag.formgenerator.simpletemplate.generator.SimpleTemplateFrontController;


@Path("qag-service")
public class QAGRestService {

	private static final Logger logger = Logger.getLogger(QAGRestService.class);
	

	@Path("test")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String text(StudentFormDetailDto reponse) throws IOException {
		return "Its working";
	}
	
	
	@POST
	@Path("generate-form")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response generateForm(@HeaderParam("Authorization") String key, SimpleTemplateJsonParent jsonParent) {
		
		String response = null;
		
		QAGRestResponse restResponse = new QAGRestResponse();
		
		restResponse.setCode("error");
		
		restResponse.setMessage("Error while generation the form");
		
		try {
			
			ITemplateFrontController frontController = new SimpleTemplateFrontController(jsonParent);
			
			String errors = frontController.validateFormData();
			
			if(QAGFormGeneratorUtil.checkForEmptyString(errors)) {
				
				response = frontController.startFormGeneration();
				
			}	else {
				
				restResponse.setCode("error");
				
				restResponse.setMessage(errors);
				
				return Response.ok(restResponse).build(); 
			}

		} catch (Exception e) {
			
			e.printStackTrace();		
			
			logger.fatal(QAGFormGeneratorUtil.getExceptionDescriptionString(e));					
			
			throw new WebApplicationException(Response.ok(restResponse).build());
		}
		
		if(response != null) {		
			
			restResponse.setCode("success");
			
			restResponse.setMessage(response);
			
			return Response.ok(restResponse).build();
			
		} else {
			
			return Response.ok(restResponse).build();
		}			
	}
}
