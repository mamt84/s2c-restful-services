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

@RestController
@RequestMapping("company/{companyId}/business")
public class CompanyBusinessBasicInformationController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<CompanyBusinessDto> getAll(){
        return new ArrayList<CompanyBusinessDto>();
    }

    @RequestMapping(value = "{businessId}/basic-infomation", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody CompanyBusinessDto element){
    }

    @RequestMapping(value = "{businessId}/basic-infomation", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody CompanyBusinessDto element){
    }

    @RequestMapping(value = "{businessId}/basic-infomation", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable BigInteger companyId, @PathVariable BigInteger businessId){
    }

    @RequestMapping(value = "{businessId}/basic-infomation", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public CompanyBusinessDto get(){
        return new CompanyBusinessDto();
    }

}
