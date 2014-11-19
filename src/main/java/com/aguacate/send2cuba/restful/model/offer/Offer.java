package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Offer extends PersistentEntity {

	private static final long serialVersionUID = -2010632110634176528L;

	private String description;

	private boolean special;

	private boolean active;

	private BigDecimal price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
