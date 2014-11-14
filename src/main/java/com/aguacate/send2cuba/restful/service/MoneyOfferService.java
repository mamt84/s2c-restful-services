package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.BaseOfferDto;
import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;
import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.model.extension.MoneyOffer;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface MoneyOfferService {

    public List<MoneyOfferDto> getAllByBusiness(Long businessId);

    public Long delete(Long businessId, Long itemId);

    public Long saveOrUpdate(Long businessId, MoneyOfferDto item);

}
