package com.aguacate.send2cuba.restful.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aguacate.send2cuba.restful.core.DataBaseIntegrationTest;
import com.aguacate.send2cuba.restful.dto.backend.TypeDto;

/**
 * Created by maikel on 11/6/2014.
 */

public class ProvinceServiceTest extends DataBaseIntegrationTest {

    @Autowired
    ProvinceService provinceService;

    //TODO: Add @Before and @After to set up and finish decent tests
    @Test
    public void saveTest(){
        TypeDto testCase1 = new TypeDto();
        testCase1.setValue("Matanzas");
        provinceService.save(testCase1);
    };


    @Test
    public void findPermissionsByNameTest(){
        TypeDto testCase1 = new TypeDto();
        testCase1.setValue("Habana");
        provinceService.save(testCase1);

        List<TypeDto> result = provinceService.findProvinceByName("Habana");
        Assert.assertNotNull(result);
        Assert.assertNotEquals(0,result.size());

    };


}
