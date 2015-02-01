package com.aguacate.send2cuba.restful.core.model;

import org.springframework.data.annotation.Id;

/**
 * Created by maikel on 1/20/2015.
 */
public class SequenceStore {
    @Id
    private String key;

    private int value;

    public SequenceStore(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public SequenceStore() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
