package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.model.business.Business;
import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;

import java.math.BigInteger;

/**
 * Created by maikel on 11/18/2014.
 */
public interface CompanyBusinessService {
    public BigInteger save(CompanyBusiness item);
    public CompanyBusiness get(BigInteger id);
}
