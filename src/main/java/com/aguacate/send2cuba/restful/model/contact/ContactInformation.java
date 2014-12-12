package com.aguacate.send2cuba.restful.model.contact;

import com.aguacate.send2cuba.restful.model.business.MapLocation;

import javax.xml.stream.Location;

/**
 * Created by maikel on 11/16/2014.
 */
public class ContactInformation {
    private String phone;
    private String email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
