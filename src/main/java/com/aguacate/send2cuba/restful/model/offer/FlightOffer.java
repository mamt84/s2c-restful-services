package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class FlightOffer extends Offer {

    private String departure;
    private Set<TypeDto> provinces;

    public FlightOffer() {
    }

    public FlightOffer(String departure, Set<TypeDto> provinces, BigInteger id, boolean active, boolean special, String description) {

        this.provinces = provinces;
        this.departure = departure;

        this.setId(id);
        this.setDescription(description);
        this.setActive(active);
        this.setSpecial(special);
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Set<TypeDto> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<TypeDto> provinces) {
        this.provinces = provinces;
    }
}
