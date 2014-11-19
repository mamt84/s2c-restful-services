package com.aguacate.send2cuba.restful.dto;

import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public class CompanyBusinessDto extends BaseDto{
    private Company company;

    private ContactInformation contactInformation;

    private List<MoneyOffer> moneyOffers;

}
