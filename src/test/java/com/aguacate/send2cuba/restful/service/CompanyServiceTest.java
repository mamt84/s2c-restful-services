package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.core.DataBaseIntegrationTest;
import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.repository.CompanyRepository;
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

public class CompanyServiceTest extends DataBaseIntegrationTest {

    @Autowired
    CompanyService companyService;

    @Autowired
    CompanyRepository companyRepository;

    @Before
    public void createMockCompany(){
        Company entity = new Company();
        entity.setId(new BigInteger("999999"));
        entity.setName("CUBAMAX");
        entity.setWebsite("http://www.cubamaxtravel.com");

        companyRepository.save(entity);
    };

    @After
    public void deleteMockCompany(){
        companyRepository.delete(new BigInteger("999999"));
    };

    @Test
    public void saveTest(){
        CompanyDto entity = new CompanyDto();
        entity.setName("Test2");
        entity.setWebsite("Website2");

        companyService.save(entity);

        Company fromDB = companyRepository.findOne(new BigInteger("999999"));

        Assert.assertEquals(entity.getName(),fromDB.getName());

    };
/*
    @Test
    public void saveInitialCompany(){
        Company entity = new Company();
        entity.setId(new BigInteger("888888"));
        entity.setName("CUBAMAX");
        entity.setWebsite("http://www.cubamaxtravel.com");

        companyRepository.save(entity);
    };
    */

}
