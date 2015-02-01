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

    private String fullLocation;

    private String address;

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

    public String getFullLocation() {
        return fullLocation;
    }

    public void setFullLocation(String fullLocation) {
        this.fullLocation = fullLocation;
    }

    public boolean isDiscloseLocation() {
        return discloseLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDiscloseLocation(boolean discloseLocation) {
        this.discloseLocation = discloseLocation;
    }
/*
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
    */
}
