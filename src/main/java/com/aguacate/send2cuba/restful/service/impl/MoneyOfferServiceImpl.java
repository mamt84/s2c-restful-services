package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.backend.MoneyOfferDto;
import com.aguacate.send2cuba.restful.mapper.MoneyOfferMapper;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import com.aguacate.send2cuba.restful.service.MoneyOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class MoneyOfferServiceImpl implements MoneyOfferService {

    @Autowired
    private CompanyBusinessRepository businessRepository;

    @Autowired
    private MoneyOfferMapper mapper;

    private CompanyBusiness findCompanyBusiness(BigInteger businessId){
        return businessRepository.findOne(businessId);
    }

    @Override
    public List<MoneyOfferDto> getAllByBusinessAndCompany(BigInteger businessId, BigInteger companyId) {
        CompanyBusiness business = findCompanyBusiness(businessId);
        return  mapper.mapCollectionToDto(business.getMoneyOffers());
    }

    @Override
    @Transactional
    public BigInteger delete(BigInteger businessId, BigInteger companyId, BigInteger itemId) {
        CompanyBusiness business = findCompanyBusiness(businessId);
        Iterator<MoneyOffer> iterator = business.getMoneyOffers().iterator();

        while(iterator.hasNext()){
            MoneyOffer offer = iterator.next();
            if(offer.getId().equals(itemId))
                iterator.remove();
        }

        businessRepository.save(business);
        return itemId;
    }

    @Override
    @Transactional
    public BigInteger saveOrUpdate(BigInteger businessId, BigInteger companyId, MoneyOfferDto item) {
        CompanyBusiness business = findCompanyBusiness(businessId);
        if(null == item.getId())
            business.getMoneyOffers().add(mapper.mapToEntity(item));
        else{
            List<MoneyOffer> list = business.getMoneyOffers();
            int index = -1;
            for (int i = 0; i < list.size(); i++)
                if(item.getId().equals(list.get(i)))
                    index = i;
            if(index != -1) {
                list.remove(index);
                list.add(index,mapper.mapToEntity(item));
            }
        }
        business = businessRepository.save(business);
        return business.getId();
    }
}
