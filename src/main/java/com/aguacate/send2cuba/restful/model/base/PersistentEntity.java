package com.aguacate.send2cuba.restful.model.base;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;


public abstract class PersistentEntity implements Serializable, Cloneable {

	private static final long serialVersionUID = -7848669167086246023L;

	@Id
	private String id;

    //there is a suggested way with Mongo + Spring Data to do the auditing

	//@Temporal(TemporalType.TIMESTAMP) TODO: temporary to see how is with mongo
	@CreatedDate
    private Date created;

    //@Temporal(TemporalType.TIMESTAMP) TODO: temporary to see how is with mongo
    @LastModifiedDate
    private Date modified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersistentEntity other = (PersistentEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	// TODO: Define entity to dto policy, either using reflection or on each
	// entity
}
