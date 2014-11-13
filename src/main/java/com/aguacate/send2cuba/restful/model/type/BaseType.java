package com.aguacate.send2cuba.restful.model.type;

import com.aguacate.send2cuba.restful.mapper.DoNotMap;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

/**
 * Created by maikel on 11/6/2014.
 */
public abstract class BaseType extends PersistentEntity{

	@DoNotMap
	private static final long serialVersionUID = 3890272341606326295L;

    private String value;

	public BaseType() {
		super();
	}

	public BaseType(String value) {
		super();
		this.value = value;
	}

    public String getValue() {
        return value;
    }

	public void setValue(String value) {
        this.value = value;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseType other = (BaseType) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
