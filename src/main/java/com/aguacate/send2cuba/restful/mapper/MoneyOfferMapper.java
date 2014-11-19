package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 11/6/2014.
 */

@Component
public class MoneyOfferMapper extends AbstractMapper<MoneyOffer,MoneyOfferDto> {

    @Override
    protected MoneyOffer getNewEntity() {
        return new MoneyOffer();
    }

    @Override
    protected MoneyOfferDto getNewDto() {
        return new MoneyOfferDto();
    }
}
