package com.aguacate.send2cuba.restful.model.user;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import org.springframework.data.mongodb.core.mapping.Document;

//TODO: Should extend some sort of property or nomenclator
//TODO: Maikel: I created a Nomenclator class but didn't like to extend Nomenclator on this class, I don't see this as a pure nomenclator

@Document
public class Permission extends PersistentEntity {

	private static final long serialVersionUID = -4689895573618714531L;
	private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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
