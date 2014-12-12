package com.aguacate.send2cuba.restful.dto.frontend;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.business.MapLocation;
import com.aguacate.send2cuba.restful.model.feedback.Feedback;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigInteger;

/**
 * Created by maikel on 11/15/2014.
 */
public class BusinessDto{

    private BigInteger id;
    private FeedbackDto feedback;


}
