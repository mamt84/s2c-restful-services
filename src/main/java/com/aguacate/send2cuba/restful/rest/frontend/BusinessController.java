package com.aguacate.send2cuba.restful.rest.frontend;

import com.aguacate.send2cuba.restful.dto.backend.CompanyBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.BusinessLocationDto;
import com.aguacate.send2cuba.restful.dto.frontend.IndividualBusinessDto;
import com.aguacate.send2cuba.restful.dto.frontend.MoneyOfferSearchParametersDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class BusinessController {

    @RequestMapping(value = "company-business/{businessId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<CompanyBusinessDto> getCompanyBusiness(@PathVariable String businessId) {
        return null;
    }

    @RequestMapping(value = "individual-business/{businessId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<IndividualBusinessDto> getIndividualBusiness(@PathVariable String businessId) {
        return null;
    }

}
