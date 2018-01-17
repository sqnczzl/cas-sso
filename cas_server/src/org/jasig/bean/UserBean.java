package org.jasig.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -5439599050910299007L;
	private String c_pwd;


	public String getC_pwd() {
		return c_pwd;
	}

	public void setC_pwd(String c_pwd) {
		this.c_pwd = c_pwd;
	}

	public UserBean() {
		super();
	}

	@Override
	public String toString() {
		return "UserBean [c_pwd=" + c_pwd + "]";
	}
}
