package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.extension.MoneyOffer;

/**
 * Created by maikel on 11/15/2014.
 */
public class CompanyBusiness extends Business {

    private Company company;

    private ContactInformation contactInformation;

    private Iterable<MoneyOffer> moneyOffers;
    //the others
}
