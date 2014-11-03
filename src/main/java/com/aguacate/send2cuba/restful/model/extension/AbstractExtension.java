package com.aguacate.send2cuba.restful.model.extension;

import javax.persistence.Transient;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public class AbstractExtension<E extends PersistentEntity> extends
		PersistentEntity {

	private static final long serialVersionUID = 192571554493002464L;

	/**
	 * Object who has been added extensions to. Made transient to not to load
	 * all the extensions every time, if so try to figure out how to apply
	 * extension pattern to non-entities
	 */
	@Transient
	private E subject;

	private long subjectId;

	public E getSubject() {
		return subject;
	}

	public void setSubject(E subject) {
		this.subject = subject;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
}
