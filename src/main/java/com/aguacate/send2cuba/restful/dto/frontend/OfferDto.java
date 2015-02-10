package com.aguacate.send2cuba.restful.dto.frontend;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by alejomo on 01/17/2015.
 */
public class OfferDto{

	private String ownerName;
	private String ownerLocation;
	private BigDecimal price;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getOwnerLocation() {
		return ownerLocation;
	}
	public void setOwnerLocation(String ownerLocation) {
		this.ownerLocation = ownerLocation;
	}
	
}
