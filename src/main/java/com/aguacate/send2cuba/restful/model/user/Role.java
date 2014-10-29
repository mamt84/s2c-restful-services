package com.aguacate.send2cuba.restful.model.user;

import java.util.Collection;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public class Role extends PersistentEntity {

	private static final long serialVersionUID = 345169512756558949L;

	private Collection<Permission> permissions;

	public Collection<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Collection<Permission> permissions) {
		this.permissions = permissions;
	}

	public Role() {
		super();
		// Initialize collection, might not be necessary if given as a
		// dependency
	}
}
