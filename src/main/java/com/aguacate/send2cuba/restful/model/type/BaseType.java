package com.aguacate.send2cuba.restful.model.type;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/6/2014.
 */
public abstract class BaseType extends PersistentEntity{

	private static final long serialVersionUID = 3890272341606326295L;

	private String value;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
