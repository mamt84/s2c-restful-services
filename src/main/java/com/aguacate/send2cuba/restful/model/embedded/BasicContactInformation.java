package com.aguacate.send2cuba.restful.model.embedded;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BasicContactInformation implements Serializable {

	private static final long serialVersionUID = 2047450246844052964L;

	private String phoneNumber;

	private String email;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
