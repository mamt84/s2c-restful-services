package com.aguacate.send2cuba.restful.rest.backend;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maikel on 11/24/2014.
 */

public class CompanyBusinessController {

    public List<CompanyBusinessDto> getAll(@PathVariable BigInteger companyId){
        return new ArrayList<CompanyBusinessDto>();
    }

    public void save(@PathVariable BigInteger companyId, @RequestBody CompanyBusinessDto element){
    }

    public void update(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId, @RequestBody CompanyBusinessDto element){
    }

    public void delete(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId){
    }

    public CompanyBusinessDto get(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId){
        return new CompanyBusinessDto();
    }
}
