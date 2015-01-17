package com.aguacate.send2cuba.restful.rest.frontend;

import com.aguacate.send2cuba.restful.dto.frontend.BusinessLocationDto;
import com.aguacate.send2cuba.restful.dto.backend.MoneyOfferDto;
import com.aguacate.send2cuba.restful.dto.frontend.MoneyOfferSearchParametersDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

public class SearchOfferController {

    public List<BusinessLocationDto> get(@PathVariable String zipcode, @RequestBody MoneyOfferSearchParametersDto moneyOfferParameters) {
        return null;
    }

    //rest of the search
}
