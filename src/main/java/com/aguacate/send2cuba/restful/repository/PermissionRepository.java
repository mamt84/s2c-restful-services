package com.aguacate.send2cuba.restful.repository;

import com.aguacate.send2cuba.restful.model.user.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface PermissionRepository extends MongoRepository<Permission, Long> {
    public List<Permission> findByName(String name);
}
