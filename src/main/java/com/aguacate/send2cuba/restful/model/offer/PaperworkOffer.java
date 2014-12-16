package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class PaperworkOffer extends Offer {

    private TypeDto category;

    public PaperworkOffer(TypeDto category, BigInteger id, boolean active, boolean special, String description) {
        this.category = category;
    }

    public TypeDto getCategory() {
        return category;
    }

    public void setCategory(TypeDto category) {
        this.category = category;
    }
}
