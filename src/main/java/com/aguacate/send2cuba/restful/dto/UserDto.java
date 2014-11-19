package com.aguacate.send2cuba.restful.dto;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.user.Role;

import java.util.Collection;

public abstract class UserDto extends BaseDto{

	private String username;

	private String password;

	private Collection<Role> roles;

}
