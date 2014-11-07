package com.aguacate.send2cuba.restful.model.base;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;


public abstract class PersistentEntity implements Serializable, Cloneable {

	private static final long serialVersionUID = -7848669167086246023L;

	@Id
	private Long id;

    //there is a suggested way with Mongo + Spring Data to do the auditing

	//@Temporal(TemporalType.TIMESTAMP) TODO: temporary to see how is with mongo
	@CreatedDate
    private Date created;

    //@Temporal(TemporalType.TIMESTAMP) TODO: temporary to see how is with mongo
    @LastModifiedDate
    private Date modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

	// TODO: Define entity to dto policy, either using reflection or on each
	// entity
}
