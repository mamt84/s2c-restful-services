package com.aguacate.send2cuba.restful.core.service;

import com.aguacate.send2cuba.restful.core.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 1/20/2015.
 */
@Component
public class BaseService {

    @Autowired
    protected SequenceService sequenceService;

    protected int getNextNumber(String qualifiedClassName){
        return sequenceService.getNextNumber(qualifiedClassName);
    }
}
