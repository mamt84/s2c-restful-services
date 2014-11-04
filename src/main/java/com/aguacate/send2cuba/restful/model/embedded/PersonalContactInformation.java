package com.aguacate.send2cuba.restful.model.embedded;


public class PersonalContactInformation extends ProviderContactInformation {

	private static final long serialVersionUID = -2851557218195956023L;

	private String firstname;

	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
