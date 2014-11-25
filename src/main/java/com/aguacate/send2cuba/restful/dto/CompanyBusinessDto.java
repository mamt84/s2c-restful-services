package com.aguacate.send2cuba.restful.dto;

import com.aguacate.send2cuba.restful.model.business.Company;
import com.aguacate.send2cuba.restful.model.business.MapLocation;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public class CompanyBusinessDto extends BaseDto{

    private BigInteger companyId;

    private ContactInformation contactInformation;

    private MapLocationDto mapLocation;

    private boolean discloseLocation;

}
