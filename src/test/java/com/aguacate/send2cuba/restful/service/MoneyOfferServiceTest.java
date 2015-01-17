package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.core.DataBaseIntegrationTest;
import com.aguacate.send2cuba.restful.dto.backend.MoneyOfferDto;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */

public class MoneyOfferServiceTest extends DataBaseIntegrationTest {

    @Autowired
    private MoneyOfferService service;

    @Autowired
    private CompanyBusinessRepository companyBusinessRepository;

    private  CompanyBusiness saved = null;

    @Before
    public void saveCompanyBusiness(){
         saved = companyBusinessRepository.save(new CompanyBusiness());
    }

    @Test
    public void saveReadTest(){
    };

    @After
    public void deleteCompanyBusiness(){
        companyBusinessRepository.delete(saved.getId());
    }




}
