package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/15/2014.
 */
public class MapLocation extends PersistentEntity{

    /**
     * These attributes are to store the full Location, and latitude and longitude in separate fields
     */
    private String fullLocation;
    private Double latitude;
    private Double longitude;

    /**
     * These attributes are to store the display location
     * It should be calculated by the system
     */
    private String approximateLocation;  //it could be the zipcode
    private Double approximateLocationLatitude;
    private Double approximateLocationLongitude;


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

    public String getApproximateLocation() {
        return approximateLocation;
    }

    public void setApproximateLocation(String approximateLocation) {
        this.approximateLocation = approximateLocation;
    }

    public Double getApproximateLocationLatitude() {
        return approximateLocationLatitude;
    }

    public void setApproximateLocationLatitude(Double approximateLocationLatitude) {
        this.approximateLocationLatitude = approximateLocationLatitude;
    }

    public Double getApproximateLocationLongitude() {
        return approximateLocationLongitude;
    }

    public void setApproximateLocationLongitude(Double approximateLocationLongitude) {
        this.approximateLocationLongitude = approximateLocationLongitude;
    }
}
