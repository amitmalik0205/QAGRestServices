package com.qait.qag.qagrest.exception.mappeer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class SimpleTemplateJsonParent implements Serializable {

	private static final long serialVersionUID = -7047894885514528204L;	
	
	@JsonIgnoreProperties
	private String responseType;
	
	private Integer templateId;
	
	private Integer clientId;

	private SimpleTemplateFormSpec formSpec;
	
	private List<SimpleTemplateInstance> instances = new ArrayList<SimpleTemplateInstance>();

	public SimpleTemplateFormSpec getFormSpec() {
		return formSpec;
	}

	public void setFormSpec(SimpleTemplateFormSpec formSpec) {
		this.formSpec = formSpec;
	}

	public List<SimpleTemplateInstance> getInstances() {
		return instances;
	}

	public void setInstances(List<SimpleTemplateInstance> instances) {
		this.instances = instances;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
}
