package com.aguacate.send2cuba.restful.dto;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public BigInteger getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(BigInteger companyUserId) {
        this.companyUserId = companyUserId;
    }
}
