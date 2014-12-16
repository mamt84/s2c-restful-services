package com.aguacate.send2cuba.restful.model.offer;

import java.math.BigInteger;
import java.util.Date;

public class CarOffer extends Offer {

    private Date initialDate;
    private Date endDate;

    public CarOffer(Date initialDate, Date endDate, BigInteger id, boolean active, boolean special, String description) {

        this.initialDate = initialDate;
        this.endDate = endDate;

        this.setId(id);
        this.setDescription(description);
        this.setActive(active);
        this.setSpecial(special);
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
