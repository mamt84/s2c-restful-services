package com.aguacate.send2cuba.restful.repository;

import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.model.type.Province;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface CompanyBusinessRepository extends MongoRepository<CompanyBusiness, BigInteger> {
}
