package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.core.DataBaseIntegrationTest;
import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.ContactInformationDto;
import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.repository.CompanyRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * Created by maikel on 11/6/2014.
 */

public class CompanyBusinessServiceTest extends DataBaseIntegrationTest {

    @Autowired
    CompanyBusinessService  companyBusinessService;

    private BigInteger id;



    @After
    public void deleteMockCompany(){
        companyBusinessService.delete(id);
    };

    @Test
    public void saveTest(){
        CompanyBusinessDto dto = new CompanyBusinessDto();
        dto.setCompanyId(new BigInteger("888888"));

        ContactInformationDto contactInformationDto = new ContactInformationDto();
        contactInformationDto.setEmail("email");
        contactInformationDto.setPhone("7869556589");

        dto.setContactInformation(contactInformationDto);
        dto.setDiscloseLocation(true);
        dto.setFullLocation("Full Location");

        id = companyBusinessService.save(dto);

        Assert.assertNotNull(id);

    };

}
