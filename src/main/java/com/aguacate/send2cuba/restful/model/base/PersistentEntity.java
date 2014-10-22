package com.aguacate.send2cuba.restful.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public abstract class PersistentEntity implements Serializable, Cloneable {

	private static final long serialVersionUID = -7848669167086246023L;

	@Id
	private long id;

    //there is a suggested way with Mongo + Spring Data to do the auditing
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	// TODO: Define entity to dto policy, either using reflection or on each
	// entity
}
