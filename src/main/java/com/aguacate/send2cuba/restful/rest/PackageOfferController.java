package com.aguacate.send2cuba.restful.rest;

import com.aguacate.send2cuba.restful.dto.PackageOfferDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/business")
public class PackageOfferController {

    @RequestMapping(value = "{businessId}/package-offers", method = RequestMethod.GET)
    public List<PackageOfferDto> get(@PathVariable String businessId) {
        List<PackageOfferDto> moneyOffers = new ArrayList<PackageOfferDto>();
        moneyOffers.add(new PackageOfferDto());
        return moneyOffers;
    }

    @RequestMapping(value = "{businessId}/package-offers/{offerId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger delete(@PathVariable String businessId, @PathVariable BigInteger offerId) {
        //TODO: Implement
        return  offerId;
    }

    @RequestMapping(value = "{businessId}/package-offers/{offerId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger update(@PathVariable String businessId, @PathVariable BigInteger offerId, @RequestBody PackageOfferDto moneyOffer) {
        //TODO: Implement
        return  moneyOffer.getId();
    }

    @RequestMapping(value = "{businessId}/package-offers/{offerId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger save(@PathVariable String businessId, @RequestBody PackageOfferDto moneyOffer) {
        //TODO: Implement, return Id of updated element
        return null; //new Id
    }

}
