package com.aguacate.send2cuba.restful.dto;

import com.aguacate.send2cuba.restful.model.type.Province;

import java.math.BigInteger;
import java.util.Set;

/**
 * Created by maikel on 11/12/2014.
 */
public class MoneyOfferDto extends BaseOfferDto {

    private String originCurrency;
    private String targetCurrency;
    private int fee;
    private int minimum;
    private int maximum;
    private int price;

    private Set<TypeDto> provinces;

    public MoneyOfferDto() {
    }

    public MoneyOfferDto(String originCurrency, String targetCurrency, int fee, int minimum, int maximum, int price, Set<TypeDto> provinces, BigInteger id, boolean active, boolean special, String description) {
        this.originCurrency = originCurrency;
        this.targetCurrency = targetCurrency;
        this.fee = fee;
        this.minimum = minimum;
        this.maximum = maximum;
        this.price = price;
        this.provinces = provinces;
        this.setId(id);
        this.setDescription(description);
        this.setActive(active);
        this.setSpecial(special);
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<TypeDto> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<TypeDto> provinces) {
        this.provinces = provinces;
    }
}
