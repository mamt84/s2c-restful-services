package com.aguacate.send2cuba.restful.rest;

import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/business")
public class MoneyOfferController {

    @RequestMapping(value = "{businessId}/money-offers", method = RequestMethod.GET)
    public List<MoneyOfferDto> get(@PathVariable String businessId) {
        List<MoneyOfferDto> moneyOffers = new ArrayList<MoneyOfferDto>();
        moneyOffers.add(new MoneyOfferDto());
        return moneyOffers;
    }

    @RequestMapping(value = "{businessId}/money-offers/{offerId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger delete(@PathVariable String businessId, @PathVariable BigInteger offerId) {
        //TODO: Implement
        return  offerId;
    }

    @RequestMapping(value = "{businessId}/money-offers/{offerId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger update(@PathVariable String businessId, @PathVariable BigInteger offerId, @RequestBody MoneyOfferDto moneyOffer) {
        //TODO: Implement
        return  moneyOffer.getId();
    }

    @RequestMapping(value = "{businessId}/money-offers/{offerId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public BigInteger save(@PathVariable String businessId, @RequestBody MoneyOfferDto offer) {
        //TODO: Implement, return Id of updated element
        return null; //new Id
    }

}
