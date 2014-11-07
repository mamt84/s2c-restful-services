package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.PermissionDto;
import com.aguacate.send2cuba.restful.model.mapper.PermissionMapper;
import com.aguacate.send2cuba.restful.repository.PermissionRepository;
import com.aguacate.send2cuba.restful.service.PermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public List<PermissionDto> findPermissionsByName(String name) {
        return getPermissionMapper().mapCollectionToDto(permissionRepository.findByName(name));
    }

    @Override
    public void save(PermissionDto permissionDto) {
        permissionRepository.save(getPermissionMapper().mapToEntity(permissionDto));
    }

    PermissionMapper getPermissionMapper(){
        return new PermissionMapper();
    };

    public PermissionRepository getPermissionRepository() {
        return permissionRepository;
    }

    public void setPermissionRepository(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }
}
