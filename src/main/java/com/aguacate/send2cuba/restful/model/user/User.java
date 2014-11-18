package com.aguacate.send2cuba.restful.model.user;

import java.util.Collection;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public abstract class User extends PersistentEntity {

	private static final long serialVersionUID = 4952918945790490864L;

	private String username;

	private String password;

	private Collection<Role> roles;

}
