package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.core.service.BaseService;
import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.ContactInformationDto;
import com.aguacate.send2cuba.restful.mapper.Mapper;
import com.aguacate.send2cuba.restful.model.business.Company;
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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class CompanyBusinessServiceImpl extends BaseService implements CompanyBusinessService {

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
        if(item.getId() == null)
            item.setId(new BigInteger(String.valueOf(getNextNumber(CompanyBusiness.class.toString()))));

        CompanyBusiness entity = companyBusinessMapper.mapToEntity(new CompanyBusiness(),item);
        entity.setCompany(companyRepository.findOne(item.getCompanyId()));

        ContactInformation contactInformation = new ContactInformation();
        contactInformation = contactInformationMapper.mapToEntity(contactInformation,item.getContactInformation());
        entity.setContactInformation(contactInformation);

        entity = companyBusinessRepository.save(entity);

        return entity.getId();
    }

    @Override
    public CompanyBusinessDto get(BigInteger id) {
        CompanyBusiness companyBusiness = companyBusinessRepository.findOne(id);
        CompanyBusinessDto companyBusinessDto = new CompanyBusinessDto();

        companyBusinessDto = companyBusinessMapper.mapToDto(companyBusiness,companyBusinessDto);

        if(companyBusiness.getContactInformation() != null){
            companyBusinessDto.setContactInformation(contactInformationMapper.mapToDto(companyBusiness.getContactInformation(),new ContactInformationDto()));
        }

        companyBusinessDto.setCompanyId(companyBusiness.getCompany().getId());

        return companyBusinessDto;
    }

    @Override
    public void delete(BigInteger id) {
        companyBusinessRepository.delete(id);
    }

    @Override
    public List<CompanyBusinessDto> getByCompany(BigInteger companyId) {

        List<CompanyBusiness> entities = companyBusinessRepository.findByCompanyId(companyId);
        List<CompanyBusinessDto> dtos = new ArrayList<CompanyBusinessDto>();

        for (int i = 0; i < entities.size(); i++) {
            CompanyBusiness companyBusiness = entities.get(i);
            CompanyBusinessDto dto = companyBusinessMapper.mapToDto(companyBusiness,new CompanyBusinessDto());

            dto.setCompanyId(companyBusiness.getCompany().getId());

            ContactInformation contactInformation = companyBusiness.getContactInformation();
            if(contactInformation != null) {
                ContactInformationDto contactInformationDto = contactInformationMapper.mapToDto(contactInformation, new ContactInformationDto());
                dto.setContactInformation(contactInformationDto);
            }
            dtos.add(dto);
        }
        return dtos;
    }

}
