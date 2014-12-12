package com.aguacate.send2cuba.restful.dto.backend;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;

import java.math.BigInteger;

/**
 * Created by maikel on 11/6/2014.
 */
public class CompanyBusinessDto extends BaseDto {

    private BigInteger companyId;

    private ContactInformation contactInformation;

    private MapLocationDto mapLocation;

    private boolean discloseLocation;

    public BigInteger getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public MapLocationDto getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(MapLocationDto mapLocation) {
        this.mapLocation = mapLocation;
    }

    public boolean isDiscloseLocation() {
        return discloseLocation;
    }

    public void setDiscloseLocation(boolean discloseLocation) {
        this.discloseLocation = discloseLocation;
    }
}
