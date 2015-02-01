package com.aguacate.send2cuba.restful.core;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.io.Console;

/**
 * Created by maikel on 1/20/2015.
 */

@Aspect
@Component
public class IdGeneratorAdvice {

    @Before("execution(* org.springframework.data.mongodb.repository.support.SimpleMongoRepository+.save(..))")
    public void generateId(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
    }
}
