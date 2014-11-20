package com.aguacate.send2cuba.restful.repository;

import com.aguacate.send2cuba.restful.core.DataBaseIntegrationTest;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maikel on 11/19/2014.
 */
public class CompanyBusinessRepositoryTest extends DataBaseIntegrationTest{

    @Autowired
    private CompanyBusinessRepository companyBusinessRepository;

    CompanyBusiness companyBusiness;

    @Before
    public void setUp(){
        companyBusiness = companyBusinessRepository.save(new CompanyBusiness());
    }

    @Test
    public void saveAndUpdateBusiness(){

        CompanyBusiness retrieved = companyBusinessRepository.findOne(companyBusiness.getId());
        List<MoneyOffer> moneyOffers = new ArrayList<MoneyOffer>();
        moneyOffers.add(new MoneyOffer());

        retrieved.setMoneyOffers(moneyOffers);
        companyBusinessRepository.save(retrieved);

        retrieved = companyBusinessRepository.findOne(retrieved.getId());
        Assert.assertEquals(retrieved.getMoneyOffers().size(),1);

        retrieved.getMoneyOffers().clear();
        retrieved = companyBusinessRepository.save(retrieved);

        Assert.assertEquals(retrieved.getMoneyOffers().size(),0);
    }

    @After
    public void finalize(){
        companyBusinessRepository.delete(companyBusiness.getId());
    }

}
