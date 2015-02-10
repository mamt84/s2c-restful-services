package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

/**
 * Created by alejomo on 01/17/2015.
 */
public class PackageOfferSearchParametersDto extends BaseSearchParametersDto {

	private int minimumPrice;
	private int maximumPrice;
    private int minimumWeight;
    private TypeDto category;
    
    private boolean delivery;
    private TypeDto[] provinces;
        
	public boolean isDelivery() {
		return delivery;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	public TypeDto[] getProvinces() {
		return provinces;
	}
	public void setProvinces(TypeDto[] provinces) {
		this.provinces = provinces;
	}
	public int getMinimumPrice() {
		return minimumPrice;
	}
	public void setMinimumPrice(int minimumPrice) {
		this.minimumPrice = minimumPrice;
	}
	public int getMaximumPrice() {
		return maximumPrice;
	}
	public void setMaximumPrice(int maximumPrice) {
		this.maximumPrice = maximumPrice;
	}
	public int getMinimumWeight() {
		return minimumWeight;
	}
	public void setMinimumWeight(int minimumWeight) {
		this.minimumWeight = minimumWeight;
	}
	public TypeDto getCategory() {
		return category;
	}
	public void setCategory(TypeDto category) {
		this.category = category;
	}

}
