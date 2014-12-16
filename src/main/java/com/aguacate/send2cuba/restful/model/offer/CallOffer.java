package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import org.omg.CORBA.TIMEOUT;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;
import java.util.Timer;

public class CallOffer extends Offer {

    private Date initialTime;
    private Date endTime;

    public CallOffer(Date initialTime, Date endTime, BigInteger id, boolean active, boolean special, String description) {

        this.initialTime = initialTime;
        this.endTime = endTime;

        this.setId(id);
        this.setDescription(description);
        this.setActive(active);
        this.setSpecial(special);
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }
}
