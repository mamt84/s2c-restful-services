package com.aguacate.send2cuba.restful.dto.backend;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.dto.frontend.ContactInformationDto;
import com.aguacate.send2cuba.restful.model.contact.ContactInformation;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public class CompanyBusinessDto extends BaseDto {

    private BigInteger companyId;

    private ContactInformationDto contactInformation;

    private MapLocationDto mapLocation;

    private boolean discloseLocation;

    private List<MoneyOfferDto> moneyOffers;

    private List<PackageOfferDto> packageOffers;


    public BigInteger getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    public ContactInformationDto getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformationDto contactInformation) {
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

    public List<MoneyOfferDto> getMoneyOffers() {
        return moneyOffers;
    }

    public void setMoneyOffers(List<MoneyOfferDto> moneyOffers) {
        this.moneyOffers = moneyOffers;
    }

    public List<PackageOfferDto> getPackageOffers() {
        return packageOffers;
    }

    public void setPackageOffers(List<PackageOfferDto> packageOffers) {
        this.packageOffers = packageOffers;
    }
}
