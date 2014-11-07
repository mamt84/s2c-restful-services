package com.aguacate.send2cuba.restful.model.user;

import org.springframework.data.mongodb.core.mapping.Document;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

@Document
public class Permission extends PersistentEntity {

	private static final long serialVersionUID = -4689895573618714531L;

	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                '}';
    }
}
