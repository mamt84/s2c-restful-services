package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.mapper.CompanyBusinessMapper;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.business.MapLocation;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.feedback.Feedback;
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
    private CompanyBusinessMapper companyBusinessMapper;

    @Override
    @Transactional
    public void save(CompanyBusinessDto item) {
        CompanyBusiness companyBusiness;
        if(item.getId() == null) {
            companyBusiness = new CompanyBusiness();
            companyBusiness.setCompany(companyRepository.findOne(item.getCompanyId()));
            companyBusiness.setFeedback(new Feedback());
        }
        else {
            companyBusiness = companyBusinessRepository.findOne(item.getId());
        }
        //mapping TODO: make it not manual?
        MapLocation mapLocation = new MapLocation();
        mapLocation.setFullLocation(item.getMapLocation().getFullLocation());
        mapLocation.setLatitude(item.getMapLocation().getLatitude());
        mapLocation.setLongitude(item.getMapLocation().getLongitude());
        //TODO: set up the aproximateLocation to use it on the front end
        companyBusiness.setMapLocation(mapLocation);

        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setEmail(item.getContactInformation().getEmail());
        companyBusiness.setContactInformation(contactInformation);
        //end mapping

        companyBusinessRepository.save(companyBusiness);

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
