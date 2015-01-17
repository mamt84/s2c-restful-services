package com.aguacate.send2cuba.restful.dto.backend;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/15/2014.
 */
public class MapLocationDto extends PersistentEntity{

    private String fullLocation;
    private Double latitude;
    private Double longitude;

    public String getFullLocation() {
        return fullLocation;
    }

    public void setFullLocation(String fullLocation) {
        this.fullLocation = fullLocation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
