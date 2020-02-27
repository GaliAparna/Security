package com.cts.swmd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {
	private static final long serialVersionUID= -8091879091924046844L;
	private final String jwtToken;
	public AppSecurityToken(String jwtToken) {
		this.jwtToken=jwtToken;
	}
	public String getToken() {
		return this.jwtToken;
	}

}
