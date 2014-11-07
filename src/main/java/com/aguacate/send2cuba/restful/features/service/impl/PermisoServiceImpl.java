package com.aguacate.send2cuba.restful.features.service.impl;

import com.aguacate.send2cuba.restful.features.dto.PermissionDto;
import com.aguacate.send2cuba.restful.features.repository.PermissionRepository;
import com.aguacate.send2cuba.restful.features.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class PermisoServiceImpl implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public List<PermissionDto> findPermissionsByName(String name) {
        return null;
    }

    public PermissionRepository getPermissionRepository() {
        return permissionRepository;
    }

    public void setPermissionRepository(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }
}
