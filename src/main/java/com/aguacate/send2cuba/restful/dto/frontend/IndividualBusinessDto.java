package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.dto.backend.PackageOfferDto;
import com.aguacate.send2cuba.restful.model.contact.PersonalContactInformation;
import com.aguacate.send2cuba.restful.model.extension.PackageOffer;
import com.aguacate.send2cuba.restful.model.user.IndividualUser;

import java.util.Date;

/**
 * Created by maikel on 11/15/2014.
 */
public class IndividualBusinessDto extends BusinessDto {

    private PersonalContactInformationDto contactInformation;

    private boolean discloseLocation;

    private Date departureDate;

    private Iterable<PackageOfferDto> packageOffers;

}
