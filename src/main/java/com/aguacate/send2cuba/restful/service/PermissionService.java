package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.PermissionDto;
import com.aguacate.send2cuba.restful.model.user.Permission;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface PermissionService {
    public List<PermissionDto> findPermissionsByName(String name);
    public void save(PermissionDto permissionDto);
}
