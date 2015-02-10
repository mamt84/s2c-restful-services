package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class MoneyOffer extends Offer {

	private static final long serialVersionUID = -426391448146283979L;

    private String originCurrency;
    private String targetCurrency;
    private int fee;
    private int minimum;
    private int maximum;
    private boolean delivery;

    private Set<TypeDto> provinces;

    public MoneyOffer() {
    }

    public MoneyOffer(String originCurrency, String targetCurrency, int fee, int minimum, int maximum, BigDecimal price, Set<TypeDto> provinces, boolean delivery, BigInteger id, boolean active, boolean special, String description) {

        this.originCurrency = originCurrency;
        this.targetCurrency = targetCurrency;
        this.fee = fee;
        this.minimum = minimum;
        this.maximum = maximum;
        this.provinces = provinces;
        this.delivery = delivery;

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

    public Set<TypeDto> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<TypeDto> provinces) {
        this.provinces = provinces;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
