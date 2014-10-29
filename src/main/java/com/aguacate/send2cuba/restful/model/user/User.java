package com.aguacate.send2cuba.restful.model.user;

import java.util.Collection;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public abstract class User extends PersistentEntity {

	private static final long serialVersionUID = 4952918945790490864L;

	private String username;

	private String password;

	private Collection<Role> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
}
