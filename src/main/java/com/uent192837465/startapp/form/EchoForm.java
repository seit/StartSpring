package com.uent192837465.startapp.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message="ユーザ名は空文字不可です。")
	@Size(max=10)
	private String userName;

	@NotNull(message="パスワードは空文字不可です。")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
