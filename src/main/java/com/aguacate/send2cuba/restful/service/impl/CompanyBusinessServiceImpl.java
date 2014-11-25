package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.mapper.CompanyBusinessMapper;
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
    private CompanyBusinessRepository companyBusinessRepository;

    @Autowired
    private CompanyBusinessMapper companyBusinessMapper;

    @Override
    public BigInteger saveBasicInformation(CompanyBusinessDto item) {
        return companyBusinessRepository.save(companyBusinessMapper.mapToEntity(item)).getId();
    }

    @Override
    public CompanyBusinessDto get(BigInteger id) {
        return null;
    }

}
