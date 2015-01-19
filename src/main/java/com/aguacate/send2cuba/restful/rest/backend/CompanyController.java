package com.aguacate.send2cuba.restful.rest.backend;

import com.aguacate.send2cuba.restful.dto.CompanyDto;
import com.aguacate.send2cuba.restful.service.CompanyBusinessService;
import com.aguacate.send2cuba.restful.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 * Created by maikel on 11/24/2014.
 */

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/{companyId}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable BigInteger companyId, @RequestBody CompanyDto element){
        companyService.save(element);
    }

    @RequestMapping(value = "/{companyId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public CompanyDto get(@PathVariable BigInteger companyId){
        return companyService.get(companyId);
    }

}
