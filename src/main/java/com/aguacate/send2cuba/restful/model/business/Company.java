package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.user.CompanyUser;
import com.aguacate.send2cuba.restful.model.user.User;

/**
 * Created by maikel on 11/15/2014.
 */
public class Company extends PersistentEntity{
    private String name;
    private String website;
    private CompanyUser companyUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CompanyUser getCompanyUser() {
        return companyUser;
    }

    public void setCompanyUser(CompanyUser companyUser) {
        this.companyUser = companyUser;
    }
}
