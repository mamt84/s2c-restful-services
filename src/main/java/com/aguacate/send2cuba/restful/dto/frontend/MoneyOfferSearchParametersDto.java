package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

import java.util.Arrays;

/**
 * Created by maikel on 12/11/2014.
 */
public class MoneyOfferSearchParametersDto {

    private String currency;
    private Integer feeFrom;
    private Integer feeTo;
    private Boolean deliver;
    private TypeDto[] provinces; //ids

}
