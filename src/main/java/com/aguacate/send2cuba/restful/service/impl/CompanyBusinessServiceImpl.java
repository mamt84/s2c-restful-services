package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class CompanyBusinessServiceImpl implements CompanyBusinessService {

    @Autowired
    CompanyBusinessRepository companyBusinessRepository;

    @Override
    public BigInteger save(CompanyBusiness item) {
        return null;
    }

    @Override
    public CompanyBusiness get(BigInteger id) {
        return null;
    }
}
