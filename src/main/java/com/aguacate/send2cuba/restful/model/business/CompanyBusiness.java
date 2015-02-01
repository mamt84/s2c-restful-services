package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.offer.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by maikel on 11/15/2014.
 */
public class CompanyBusiness extends Business {

    @DBRef(lazy = false)
    private Company company;

    private ContactInformation contactInformation;

    private List<MoneyOffer> moneyOffers;
    private boolean moneyOffersActive;

    private List<PackageOffer> packageOffers;
    private boolean packageOffersActive;

    private List<PaperworkOffer> papeworkOffers;
    private boolean papeworkOffersActive;

    private List<CallOffer> callOffers;
    private boolean callOffersActive;

    private List<FlightOffer> flightOffers;
    private boolean flightOffersActive;

    private List<CarOffer> carOffers;
    private boolean carOffersActive;


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<MoneyOffer> getMoneyOffers() {
        return moneyOffers;
    }

    public void setMoneyOffers(List<MoneyOffer> moneyOffers) {
        this.moneyOffers = moneyOffers;
    }

    public boolean isMoneyOffersActive() {
        return moneyOffersActive;
    }

    public void setMoneyOffersActive(boolean moneyOffersActive) {
        this.moneyOffersActive = moneyOffersActive;
    }

    public List<PackageOffer> getPackageOffers() {
        return packageOffers;
    }

    public void setPackageOffers(List<PackageOffer> packageOffers) {
        this.packageOffers = packageOffers;
    }

    public boolean isPackageOffersActive() {
        return packageOffersActive;
    }

    public void setPackageOffersActive(boolean packageOffersActive) {
        this.packageOffersActive = packageOffersActive;
    }

    public List<PaperworkOffer> getPapeworkOffers() {
        return papeworkOffers;
    }

    public void setPapeworkOffers(List<PaperworkOffer> papeworkOffers) {
        this.papeworkOffers = papeworkOffers;
    }

    public boolean isPapeworkOffersActive() {
        return papeworkOffersActive;
    }

    public void setPapeworkOffersActive(boolean papeworkOffersActive) {
        this.papeworkOffersActive = papeworkOffersActive;
    }

    public List<CallOffer> getCallOffers() {
        return callOffers;
    }

    public void setCallOffers(List<CallOffer> callOffers) {
        this.callOffers = callOffers;
    }

    public boolean isCallOffersActive() {
        return callOffersActive;
    }

    public void setCallOffersActive(boolean callOffersActive) {
        this.callOffersActive = callOffersActive;
    }

    public List<FlightOffer> getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(List<FlightOffer> flightOffers) {
        this.flightOffers = flightOffers;
    }

    public boolean isFlightOffersActive() {
        return flightOffersActive;
    }

    public void setFlightOffersActive(boolean flightOffersActive) {
        this.flightOffersActive = flightOffersActive;
    }

    public List<CarOffer> getCarOffers() {
        return carOffers;
    }

    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    public boolean isCarOffersActive() {
        return carOffersActive;
    }

    public void setCarOffersActive(boolean carOffersActive) {
        this.carOffersActive = carOffersActive;
    }
}
