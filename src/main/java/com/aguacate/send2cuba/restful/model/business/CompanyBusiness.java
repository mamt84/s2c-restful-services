package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.contact.ContactInformation;
import com.aguacate.send2cuba.restful.model.offer.MoneyOffer;
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

}
