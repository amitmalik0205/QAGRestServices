package com.qait.qag.qagrest.exception.mappeer;

import java.io.Serializable;


public class SimpleTemplateSectionTopRight implements Serializable {

	private static final long serialVersionUID = -1905656058496661706L;
	
	
	private String choices;
	
	
	private Integer digits;
	
	
	private String label;
	
	
	private String type;

	public String getChoices() {
		return choices;
	}

	public void setChoices(String choices) {
		this.choices = choices;
	}

	public Integer getDigits() {
		return digits;
	}

	public void setDigits(Integer digits) {
		this.digits = digits;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
