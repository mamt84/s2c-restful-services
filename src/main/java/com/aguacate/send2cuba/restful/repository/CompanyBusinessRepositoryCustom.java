package com.aguacate.send2cuba.restful.repository;

import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface CompanyBusinessRepositoryCustom{
    List<CompanyBusiness> findByCompanyId(BigInteger id);
}
