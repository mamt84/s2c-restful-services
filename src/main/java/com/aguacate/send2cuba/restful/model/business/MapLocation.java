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

}
