package com.aguacate.send2cuba.restful.model;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/6/2014.
 */
public abstract class Nomenclator extends PersistentEntity{


    private String value;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
