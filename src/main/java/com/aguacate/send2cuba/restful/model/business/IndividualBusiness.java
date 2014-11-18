package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.contact.PersonalContactInformation;
import com.aguacate.send2cuba.restful.model.extension.PackageOffer;
import com.aguacate.send2cuba.restful.model.user.IndividualUser;
import com.aguacate.send2cuba.restful.model.user.User;

import java.util.Date;

/**
 * Created by maikel on 11/15/2014.
 */
public class IndividualBusiness extends Business {

    private PersonalContactInformation contactInformation;

    private boolean discloseLocation;

    private Date departureDate;

    private Iterable<PackageOffer> packageOffers;

    private IndividualUser user;
}
