package com.aguacate.send2cuba.restful.repository;

import com.aguacate.send2cuba.restful.model.type.Province;
import com.aguacate.send2cuba.restful.model.user.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface ProvinceRepository extends MongoRepository<Province, Long> {
    public List<Province> findByValue(String value);
}
