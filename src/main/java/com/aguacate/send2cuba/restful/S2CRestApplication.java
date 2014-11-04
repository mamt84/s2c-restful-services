package com.aguacate.send2cuba.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * Created by maikel on 11/2/2014.
 * The reference documentation recommends to place this class one level above the rest, in the root
 */

//@ImportResource("classpath:config.xml") // just in case we need to configure something completely undoable using annotations
@Configuration
@EnableMongoAuditing
@EnableAutoConfiguration
@ComponentScan
public class S2CRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(S2CRestApplication.class);
    }
}
