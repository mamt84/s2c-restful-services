package com.aguacate.send2cuba.restful.dto;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/15/2014.
 */
public class MapLocationDto extends PersistentEntity{

    /**
     * These attributes are to store the full Location, and latitude and longitude in separate fields
     */
    private String fullLocation;
    private Double latitude;
    private Double longitude;

}
