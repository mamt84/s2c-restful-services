package com.aguacate.send2cuba.restful.dto;

/**
 * Created by maikel on 11/12/2014.
 */
public class BaseOfferDto extends BaseDto{
    private boolean active;
    private boolean special;
    private String description;

    public BaseOfferDto() {
    }

    public BaseOfferDto(boolean active, boolean special, String description) {
        this.active = active;
        this.special = special;
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
