package com.aguacate.send2cuba.restful.repository.impl;

import com.aguacate.send2cuba.restful.core.repository.BaseRepositoryImpl;
import com.aguacate.send2cuba.restful.model.business.CompanyBusiness;
import com.aguacate.send2cuba.restful.repository.CompanyBusinessRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 1/27/2015.
 */
public class CompanyBusinessRepositoryImpl extends BaseRepositoryImpl implements CompanyBusinessRepositoryCustom{


    @Override
    public List<CompanyBusiness> findByCompanyId(BigInteger id) {
        Query query = new Query(Criteria.where("company.$id").is("888888"));
        return mongoTemplate.find(query,CompanyBusiness.class);
    }
}
