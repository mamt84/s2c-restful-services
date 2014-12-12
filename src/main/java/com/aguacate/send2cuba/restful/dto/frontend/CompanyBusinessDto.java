package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.dto.backend.MoneyOfferDto;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;

import java.util.List;

/**
 * Created by maikel on 11/15/2014.
 */
public class CompanyBusinessDto extends BusinessDto {

    private CompanyDto company;

    private ContactInformationDto contactInformation;

    private List<MoneyOfferDto> moneyOffers;

}
