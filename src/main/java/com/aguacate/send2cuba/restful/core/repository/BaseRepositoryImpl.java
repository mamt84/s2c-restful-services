package com.aguacate.send2cuba.restful.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by maikel on 1/27/2015.
 */
public class BaseRepositoryImpl {

    @Autowired
    protected MongoTemplate mongoTemplate;
}
