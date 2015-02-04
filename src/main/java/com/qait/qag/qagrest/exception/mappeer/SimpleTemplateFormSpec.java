package com.qait.qag.qagrest.exception.mappeer;

import java.io.Serializable;


public class SimpleTemplateFormSpec implements Serializable {

	private static final long serialVersionUID = 199881477510904969L;

	
	private Integer formCode;
	
	
	private SimpleTemplateQuestionSection questionSection;
	
	
	private SimpleTemplateSectionTopRight sections_topright = new SimpleTemplateSectionTopRight();

	public Integer getFormCode() {
		return formCode;
	}

	public void setFormCode(Integer formCode) {
		this.formCode = formCode;
	}

	public SimpleTemplateQuestionSection getQuestionSection() {
		return questionSection;
	}

	public void setQuestionSection(SimpleTemplateQuestionSection questionSection) {
		this.questionSection = questionSection;
	}

	public SimpleTemplateSectionTopRight getSections_topright() {
		return sections_topright;
	}

	public void setSections_topright(SimpleTemplateSectionTopRight sections_topright) {
		this.sections_topright = sections_topright;
	}
}
