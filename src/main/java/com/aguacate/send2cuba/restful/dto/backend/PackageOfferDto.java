package com.aguacate.send2cuba.restful.dto.backend;

import java.math.BigInteger;
import java.util.Set;

public class PackageOfferDto extends BaseOfferDto {

    private int minimumWeight;
    private int maximumWeight;
    private Integer maxSize;
    private boolean delivery;
    private TypeDto category;

    private Set<TypeDto> provinces;

    public PackageOfferDto() {
    }

    public PackageOfferDto(Set<TypeDto> provinces, boolean delivery, Integer maxSize, int maximumWeight, int minimumWeight, TypeDto category, BigInteger id, boolean active, boolean special, String description) {
        this.provinces = provinces;
        this.delivery = delivery;
        this.maxSize = maxSize;
        this.maximumWeight = maximumWeight;
        this.minimumWeight = minimumWeight;
        this.category = category;

        this.setId(id);
        this.setDescription(description);
        this.setActive(active);
        this.setSpecial(special);
    }

    public int getMinimumWeight() {
        return minimumWeight;
    }

    public void setMinimumWeight(int minimumWeight) {
        this.minimumWeight = minimumWeight;
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Set<TypeDto> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<TypeDto> provinces) {
        this.provinces = provinces;
    }

    public TypeDto getCategory() {
        return category;
    }

    public void setCategory(TypeDto category) {
        this.category = category;
    }

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
}
