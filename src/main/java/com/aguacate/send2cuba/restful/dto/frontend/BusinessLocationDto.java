package com.aguacate.send2cuba.restful.dto.frontend;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by maikel on 12/11/2014.
 */
public class BusinessLocationDto {

    private BigInteger businessId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private int servicesProvided;   //code to denote the different services (to display img)

}
