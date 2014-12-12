package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/18/2014.
 */
public interface CompanyBusinessService {
    public void save(CompanyBusinessDto item);
    public CompanyBusinessDto get(BigInteger id);
    public void delete(BigInteger id);
    public List<CompanyBusinessDto> getByCompany(BigInteger companyId);


}
