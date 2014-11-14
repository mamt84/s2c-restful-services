package com.aguacate.send2cuba.restful.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class BaseDto implements Serializable, Cloneable {

	private static final long serialVersionUID = 86423278314073649L;

	private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
