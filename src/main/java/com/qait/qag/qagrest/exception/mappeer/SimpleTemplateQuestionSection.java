package com.qait.qag.qagrest.exception.mappeer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class SimpleTemplateQuestionSection implements Serializable {

	private static final long serialVersionUID = -5206934179197797440L;
		
	
	private Integer count;
	
	
	private List<SimpleTemplateQuestionChoice> question_opts = new ArrayList<SimpleTemplateQuestionChoice>();

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<SimpleTemplateQuestionChoice> getQuestion_opts() {
		return question_opts;
	}

	public void setQuestion_opts(List<SimpleTemplateQuestionChoice> question_opts) {
		this.question_opts = question_opts;
	}
}