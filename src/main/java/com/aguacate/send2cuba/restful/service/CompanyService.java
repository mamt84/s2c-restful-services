package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/18/2014.
 */
public interface CompanyService {
    public void save(CompanyDto item);
    public CompanyDto get(BigInteger id);
    public CompanyDto getByUserId(BigInteger userId);
}
