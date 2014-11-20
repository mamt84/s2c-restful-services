package com.aguacate.send2cuba.restful.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aguacate.send2cuba.restful.model.type.Province;

/**
 * Created by maikel on 11/6/2014.
 */
public interface ProvinceRepository extends MongoRepository<Province, BigInteger> {
	public List<Province> findByValue(String value);
}
