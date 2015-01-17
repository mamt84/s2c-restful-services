package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.ContactInformationDto;
import com.aguacate.send2cuba.restful.mapper.DefaultMapper;
import com.aguacate.send2cuba.restful.mapper.Mapper;
import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import com.aguacate.send2cuba.restful.repository.CompanyRepository;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class CompanyBusinessServiceImpl implements CompanyBusinessService {

    @Autowired
    private CompanyBusinessRepository companyBusinessRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private Mapper<CompanyBusiness,CompanyBusinessDto> companyBusinessMapper;

    @Autowired
    private Mapper<ContactInformation,ContactInformationDto> contactInformationMapper;



    @Override
    @Transactional
    public void save(CompanyBusinessDto item) {
        CompanyBusiness entity = companyBusinessMapper.mapToEntity(new CompanyBusiness(),item);
        entity.setCompany(companyRepository.findOne(item.getCompanyId()));

        ContactInformation contactInformation = contactInformationMapper.mapToEntity(entity.getContactInformation(),new ContactInformationDto());
        entity.setContactInformation(contactInformation);
    }

    @Override
    public CompanyBusinessDto get(BigInteger id) {
        CompanyBusiness companyBusiness = companyBusinessRepository.findOne(id);

        CompanyBusinessDto companyBusinessDto = new CompanyBusinessDto();
        return null;
    }

    @Override
    public void delete(BigInteger id) {

    }

    @Override
    public List<CompanyBusinessDto> getByCompany(BigInteger companyId) {
        return null;
    }

}
