package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.ContactInformationDto;
import com.aguacate.send2cuba.restful.mapper.Mapper;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepository;
import com.aguacate.send2cuba.restful.repository.CompanyRepository;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import com.google.common.base.Optional;
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
    public BigInteger save(CompanyBusinessDto item) {
        CompanyBusiness entity = companyBusinessMapper.mapToEntity(new CompanyBusiness(),item);
        entity.setCompany(companyRepository.findOne(item.getCompanyId()));

        ContactInformation contactInformation = new ContactInformation();
        contactInformation = contactInformationMapper.mapToEntity(contactInformation,item.getContactInformation());
        entity.setContactInformation(contactInformation);

        entity  = companyBusinessRepository.save(entity);

        return entity.getId();
    }

    @Override
    public CompanyBusinessDto get(BigInteger id) {
        CompanyBusiness companyBusiness = companyBusinessRepository.findOne(id);

        CompanyBusinessDto companyBusinessDto = new CompanyBusinessDto();
        return null;
    }

    @Override
    public void delete(BigInteger id) {
        companyBusinessRepository.delete(id);
    }

    @Override
    public List<CompanyBusinessDto> getByCompany(BigInteger companyId) {
        return null;
    }

}
