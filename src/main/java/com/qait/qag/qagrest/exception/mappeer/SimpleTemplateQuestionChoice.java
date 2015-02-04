package com.qait.qag.qagrest.exception.mappeer;

import java.io.Serializable;


public class SimpleTemplateQuestionChoice implements Serializable {

	private static final long serialVersionUID = -7404162167322017211L;
	
	
	private String label;

	
	private String choices;

	public String getChoices() {
		return choices;
	}

	public void setChoices(String choices) {
		this.choices = choices;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}	
}
