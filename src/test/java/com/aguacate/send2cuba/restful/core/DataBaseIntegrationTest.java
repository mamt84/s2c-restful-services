package com.aguacate.send2cuba.restful.core;

import org.springframework.boot.test.SpringApplicationConfiguration;

import com.aguacate.send2cuba.restful.MongoConfiguration;

@SpringApplicationConfiguration(classes = { MongoConfiguration.class })
public class DataBaseIntegrationTest extends BaseIntegrationTest {

}
