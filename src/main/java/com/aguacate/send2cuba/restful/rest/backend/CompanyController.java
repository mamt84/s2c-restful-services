package com.aguacate.send2cuba.restful.rest.backend;

import com.aguacate.send2cuba.restful.dto.backend.CompanyUserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 * Created by maikel on 11/24/2014.
 */

@RestController
@RequestMapping("company")
public class CompanyController {


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody CompanyUserDto element){
    }

    @RequestMapping(value = "{companyId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public CompanyUserDto get(@PathVariable BigInteger companyId){
        return new CompanyUserDto();
    }

}
