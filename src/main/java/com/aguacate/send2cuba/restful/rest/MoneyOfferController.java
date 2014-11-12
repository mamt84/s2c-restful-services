package com.aguacate.send2cuba.restful.rest;

import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;
import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.model.extension.MoneyOffer;
import com.aguacate.send2cuba.restful.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/business")
public class MoneyOfferController {

    @RequestMapping("{businessId}/money-offers")
	public List<MoneyOfferDto> getMoneyOfferByBusiness(@PathVariable String businessId) {
		List<MoneyOfferDto> moneyOffers = new ArrayList<MoneyOfferDto>();
        moneyOffers.add(new MoneyOfferDto());
	    return  moneyOffers;
    }

}
