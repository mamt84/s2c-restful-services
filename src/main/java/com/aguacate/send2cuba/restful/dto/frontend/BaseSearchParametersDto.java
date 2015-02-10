package com.aguacate.send2cuba.restful.dto.frontend;


public class BaseSearchParametersDto {
	
	private boolean special;
	private String zipCode;
    
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
