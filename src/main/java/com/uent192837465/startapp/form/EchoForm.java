package com.uent192837465.startapp.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(max=10)
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
