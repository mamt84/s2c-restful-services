package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.mapper.DefaultMapper;
import com.aguacate.send2cuba.restful.mapper.Mapper;
import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.business.MapLocation;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.feedback.Feedback;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import com.aguacate.send2cuba.restful.repository.CompanyRepository;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import com.aguacate.send2cuba.restful.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private Mapper<Company,CompanyDto> companyMapper;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void save(CompanyDto item) {
        companyRepository.save(companyMapper.mapToEntity(new Company(),item));
    }

    @Override
    public CompanyDto get(BigInteger id) {
        CompanyDto dto = new CompanyDto();
        Company company = companyRepository.findOne(id);
        return companyMapper.mapToDto(company, dto);
    }

    @Override
    public CompanyDto getByUserId(BigInteger userId) {
        return null;
    }
}
