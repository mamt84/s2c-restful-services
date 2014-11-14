package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.BaseOfferDto;
import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;
import com.aguacate.send2cuba.restful.service.MoneyOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class MoneyOfferServiceImpl implements MoneyOfferService {

    @Override
    public List<MoneyOfferDto> getAllByBusiness(Long businessId) {
        return null;
    }

    @Override
    public Long delete(Long businessId, Long itemId) {
        return null;
    }

    @Override
    public Long saveOrUpdate(Long businessId, MoneyOfferDto item) {
        return null;
    }
}
