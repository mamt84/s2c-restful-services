package com.aguacate.send2cuba.restful.rest.backend;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maikel on 11/24/2014.
 */

@RestController
@RequestMapping(value = "/company/{companyId}/business")
public class CompanyBusinessController {

    @Autowired
    CompanyBusinessService companyBusinessService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<CompanyBusinessDto> getAll(@PathVariable BigInteger companyId){
        return companyBusinessService.getByCompany(companyId);
    }


    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger save(@PathVariable BigInteger companyId){
        CompanyBusinessDto element = new CompanyBusinessDto();
        element.setCompanyId(companyId);
        return companyBusinessService.save(element);
    }

    @RequestMapping(value = "/{businessId}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody CompanyBusinessDto element){
        companyBusinessService.save(element);
    }

    @RequestMapping(value = "/{businessId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId){
        companyBusinessService.delete(businessId);
    }

    @RequestMapping(value = "/{businessId}",method = RequestMethod.GET)
    public CompanyBusinessDto get(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId){
        return companyBusinessService.get(businessId);
    }
}
