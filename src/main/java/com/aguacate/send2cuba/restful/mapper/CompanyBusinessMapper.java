package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 11/6/2014.
 */

@Component
public class CompanyBusinessMapper extends AbstractMapper<CompanyBusiness,CompanyBusinessDto> {

    @Override
    protected CompanyBusiness getNewEntity() {
        return new CompanyBusiness();
    }

    @Override
    protected CompanyBusinessDto getNewDto() {
        return new CompanyBusinessDto();
    }
}
