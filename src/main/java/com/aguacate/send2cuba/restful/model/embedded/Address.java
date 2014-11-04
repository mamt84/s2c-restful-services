package com.aguacate.send2cuba.restful.model.embedded;

import java.io.Serializable;

//TODO: Might be susceptible to use extension pattern if we want to be able to store multi-country addresses
//@Embeddable TODO: maikel: check if makes sense to use this anotation alog with spring-data-mongodb
public class Address implements Serializable{

	private static final long serialVersionUID = -3310462711949420653L;

	private String address;
	
	private String city;

	private String state;

	private int zipCode;
	
	private String country;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
