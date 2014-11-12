package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.MongoConfiguration;
import com.aguacate.send2cuba.restful.S2CRestApplication;
import com.aguacate.send2cuba.restful.dto.TypeDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {S2CRestApplication.class, MongoConfiguration.class})
public class ProvinceServiceTest {

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
