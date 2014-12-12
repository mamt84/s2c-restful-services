package com.aguacate.send2cuba.restful.dto.backend;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.user.CompanyUser;

import java.math.BigInteger;

/**
 * Created by maikel on 11/6/2014.
 */
public class CompanyDto extends BaseDto {
    private String name;
    private String website;
    private BigInteger companyUserId;
}
