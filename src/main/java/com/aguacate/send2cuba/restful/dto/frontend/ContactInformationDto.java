package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.dto.BaseDto;

/**
 * Created by maikel on 11/16/2014.
 */
public class ContactInformationDto extends BaseDto{

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
