package com.aguacate.send2cuba.restful.model.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class ProviderContactInformation extends BasicContactInformation {

	private static final long serialVersionUID = -2454208771914917278L;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
